package servlets;

import db.ConnectionPool;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;


public class Servlet extends HttpServlet {

    public static DataSource dataSource;

    /**
     * El método init se llama solo una vez, cuando se llama por primera vez el servlet
     */
    public void init() {
        System.out.println("init");
        dataSource = new ConnectionPool().dataSource;
    }

    /**
     * Es el método principal, el que maneja las solicitudes provenientes del cliente (navegador)
     * y escribe la respuesta formateada al cliente.
     *
     * Cada vez que el servidor recibe una solicitud de un servlet, el servidor genera un nuevo hilo y llama al servicio.
     * El método service () verifica el tipo de solicitud HTTP (GET, POST, PUT, DELETE, etc.)
     * y llama a los métodos doGet, doPost, doPut, doDelete, etc., según corresponda.
     *
     * El método service () es llamado por el contenedor y el método service invoca los métodos
     * doGet, doPost, doPut, doDelete, etc., según corresponda.
     *
     * Por lo tanto, no tiene nada que ver con el método service (), pero anula doGet () o doPost ()
     * según el tipo de solicitud que reciba del cliente.
     *
     * @param req
     * @param resp
     */
    public void service(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("service");
    }

    /**
     * Una solicitud POST es el resultado de un formulario HTML que enumera específicamente POST como METHOD.
     *
     * @param request
     * @param response
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("doPost");
        Connection conn = null;

        try {
            // Obtener connexion
            conn = dataSource.getConnection();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * Una solicitud GET es el resultado de una solicitud normal de una URL o de un formulario HTML
     * que no tiene METHOD especificado
     *
     * @param request
     * @param response
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("doGet");
    }


    /**
     * El método destroy () se llama solo una vez al final del ciclo de vida de un servlet.
     * Este método le da a su servlet la oportunidad de cerrar conexiones de base de datos,
     * detener subprocesos en segundo plano, escribir listas de cookies o conteos de visitas al disco y
     * realizar otras actividades de limpieza.
     */
    public void destroy() {
        System.out.println("destroy");
    }
}
