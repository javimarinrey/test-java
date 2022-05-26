package db;

//////////////////////////////////////////////////////////////////////////////////
//
// Ejemplo de BasicJDBC.  Este programa utiliza el controlador JDBC nativo de
// Developer Kit para Java para crear una tabla simple y procesar una consulta
// que visualice los datos de dicha tabla.
//
// Sintaxis de mandato:
//    BasicJDBC
//
//////////////////////////////////////////////////////////////////////////////////
//
// Este fuente es un ejemplo del controlador JDBC nativo.
// IBM le otorga una licencia no exclusiva para utilizarlo como un ejemplo
// a partir del cual puede generar funciones similares adaptadas
// a sus necesidades específicas.
//
// IBM suministra este código de ejemplo solo con fines ilustrativos.
// solamente. Los ejemplos no se han probado minuciosamente bajo todas
// condiciones. IBM, por lo tanto, no puede garantizar ni dar por sentada la
// fiabilidad, capacidad de servicio o funcionamiento de estos programas.
//
// Todos los programas que contiene este ejemplo se suministran "TAL CUAL",
// sin garantías de ningún tipo.  Las garantías implícitas de
// comercialización y adecuación a un propósito determinado
// se rechazan explícitamente.
//
// IBM Developer Kit para Java
// (C) Copyright IBM Corp. 2001
// Reservados todos los derechos.
// US Government Users Restricted Rights -
// Use, duplication, or disclosure restricted
// by GSA ADP Schedule Contract with IBM Corp.
//
//////////////////////////////////////////////////////////////////////////////////

// Incluir las clases Java que deban utilizarse. En esta aplicación
// se utilizan muchas clases del paquete java.sql y también se utiliza
// la clase java.util.Properties como parte del proceso de obtención
// de una conexión con la base de datos.
import java.sql.*;
import java.util.Properties;

// Crear una clase pública para encapsular el programa.
public class BasicJDBC {

    // La conexión es una variable privada del objeto.
    private Connection connection = null;

    // Cualquier clase que deba ser un "punto de entrada" para ejecutar
    // un programa debe tener un método main. El método main
    // es donde empieza el proceso cuando se llama al programa.
    public static void main(java.lang.String[] args) {

        // Crear un objeto de tipo BasicJDBC. Esto
        // es fundamental en la programación orientada a objetos. Una vez
        // creado un objeto, llamar a diversos métodos de
        // ese objeto para realizar el trabajo.
        // En este caso, al llamar al constructor del objeto
        // se crea una conexión de base de datos que los otros
        // métodos utilizan para realizar el trabajo en la base de datos.
        BasicJDBC test = new BasicJDBC();

        // Llamar al método rebuildTable. Este método asegura que
        // la tabla utilizada en este programa existe y tiene el aspecto
        // correcto. El valor de retorno es un booleano para indicar
        // si la reconstrucción de la tabla se ha completado
        // satisfactoriamente. Si no es así, visualizar un mensaje
        // y salir del programa.
        if (!test.rebuildTable()) {
            System.out.println("Se produjo una anomalía al configurar " +
                    " para ejecutar la prueba.");
            System.out.println("La prueba no continuará.");
            System.exit(0);
        }

        // A continuación, se llama al método para ejecutar la consulta. Este método
        // procesa una sentencia SQL select con respecto a la tabla que
        // se creó en el método rebuildTable. La salida de
        // esa consulta va a la salida estándar de visualización.
        test.runQuery();

        // Por último, se llama al método cleanup. Este método
        // garantiza que la conexión de base de datos en la que el objeto
        // ha estado a la espera se ha cerrado.
        test.cleanup();
    }


    /**
     Este es el constructor de la prueba básica JDBC. Crea una conexión
     de base de datos que se almacena en una variable de instancia que se usará en
     posteriores llamadas de método.
     **/
    public BasicJDBC() {

        // Una forma de crear una conexión de base de datos es pasar un URL
        // y un objeto java Properties al DriverManager. El siguiente
        // código construye un objeto Properties que contiene el ID de usuario y
        // la contraseña. Estos datos se emplean para establecer conexión
        // con la base de datos.
        Properties properties = new Properties ();
        properties.put("user", "root");
        properties.put("password", "");

        // Utilizar un bloque try/catch para capturar todas las excepciones que
        // puedan surgir del código siguiente.
        try {
            // DriverManager debe saber que existe un controlador JDBC disponible
            // para manejar una petición de conexión de usuario. La siguiente línea hace
            // que el controlador JDBC nativo se cargue y registre con DriverManager.
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Crear el objeto Connection de base de datos que este programa utiliza
            // en las demás llamadas de método que se realicen. El código que sigue
            // especifica que debe establecerse una conexión con la base de datos local
            // y que dicha conexión debe ajustarse a las propiedades configuradas
            // anteriormente (es decir, debe utilizar el ID de usuario
            // y la contraseña especificados).
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", properties);

        } catch (Exception e) {
            // Si falla alguna de las líneas del bloque try/catch, el control pasa
            // a la siguiente línea de código. Una aplicación robusta intenta manejar
            // el problema o proporcionar más detalles. En este programa, se visualiza
            // el mensaje de error de la excepción, y la aplicación permite
            // el retorno del programa.
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }


    /**
     Garantiza que la tabla qgpl.basicjdbc tiene el aspecto deseado al principio de
     a prueba.

     @returns boolean    Devuelve true si la tabla se ha reconstruido satisfactoriamente;
     Devuelve false si se ha producido alguna anomalía.
     **/
    public boolean rebuildTable() {
        // Reiniciar todas las funciones de un bloque try/catch para que se realice
        // un intento de manejar los errores que puedan producirse dentro de este
        // método.
        try {

            // Se utilizan objetos Statement para procesar sentencias SQL en la
            // base de datos. El objeto Connection se utiliza para crear un
            // objeto Statement.
            Statement s = connection.createStatement();

            try {
                // Construir la tabla de prueba desde cero. Procesar una sentencia update
                // que intenta suprimir la tabla si existe actualmente.
                s.executeUpdate("drop table actor");
            } catch (SQLException e) {
                // No realizar nada si se produjo una excepción. Presuponer
                // que el problema es que la tabla que se ha eliminado no
                // existe y que se puede crear a continuación.
            }

            // Utilizar el objeto sentencia para crear la tabla.
            s.executeUpdate("create table actor(id int, name char(15))");

            // Utilizar el objeto sentencia para llenar la tabla con algunos
            // datos.
            s.executeUpdate("insert into actor values(1, 'Frank Johnson')");
            s.executeUpdate("insert into actor values(2, 'Neil Schwartz')");
            s.executeUpdate("insert into actor values(3, 'Ben Rodman')");
            s.executeUpdate("insert into actor values(4, 'Dan Gloore')");

            // Cerrar la sentencia SQL para indicar a la base de datos que ya no es
            // necesaria.
            s.close();

            // Si todo el método se ha procesado satisfactoriamente, devolver true. En este punto,
            // la tabla se ha creado o renovado correctamente.
            return true;

        } catch (SQLException sqle) {
            // Si ha fallado alguna de las sentencias SQL (que no sea la eliminación de la tabla
            // manejada en el bloque try/catch interno), el mensaje de error
            // se visualiza y se devuelve false al llamador, para indicar que la tabla
            // no puede completarse.
            System.out.println("Error in rebuildTable: " + sqle.getMessage());
            return false;
        }
    }



    /**
     Ejecuta una consulta a la tabla de muestra y los resultados se visualizan en
     la salida estándar.
     **/
    public void runQuery() {
        // Reiniciar todas las funciones de un bloque try/catch para que se realice
        // un intento de manejar los errores que puedan producirse dentro de este
        // método.
        try {
            // Crear un objeto Statement.
            Statement s = connection.createStatement();

            // Usar el objeto Statement para ejecutar una consulta SQL. Las consultas devuelven
            // objetos ResultSet que se utilizan para observar los datos que la consulta
            // proporciona.
            ResultSet rs = s.executeQuery("select * from actor");

            // Visualizar el principio de la 'tabla' e inicializar el contador del
            // número de filas devueltas.
            System.out.println("--------------------");
            int i = 0;

            // El método next de ResultSet se utiliza para procesar las filas de un
            // ResultSet. Hay que llamar al método next una vez antes de que
            // los primeros datos estén disponibles para verlos. Siempre que next devuelva
            // true, existe otra fila de datos que puede utilizarse.
            while (rs.next()) {

                // Obtener ambas columnas de la tabla para cada fila y escribir una fila en
                // nuestra tabla en pantalla con los datos. Luego, incrementar la cuenta
                // de filas que se han procesado.
                System.out.println("| " + rs.getInt(1) + " | " + rs.getString(2) + "|");
                i++;
            }

            // Colocar un borde al final de la tabla y visualizar el número de filas
            // como salida.
            System.out.println("--------------------");
            System.out.println("Se han devuelto " + i + " filas.");
            System.out.println("Salida completada.");

        } catch (SQLException e) {
            // Visualizar más información acerca de las excepciones SQL
            // generadas como salida.
            System.out.println("Excepción SQLException: ");
            System.out.println("Mensaje:....." + e.getMessage());
            System.out.println("SQLState:...." + e.getSQLState());
            System.out.println("Código proveedor:." + e.getErrorCode());
            e.printStackTrace();
        }
    }


    /**
     El siguiente método garantiza que se liberen los recursos JDBC que aún
     están asignados.
     **/
    public void cleanup() {
        try {
            if (connection != null)
                connection.close();
        } catch (Exception e) {
            System.out.println("Excepción capturada: ");
            e.printStackTrace();
        }
    }
}