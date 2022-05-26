package db;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;

public class ConnectionPool {

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String JDBC_DB_URL = "jdbc:mysql://localhost/test";
    static final String JDBC_USER = "root";
    static final String JDBC_PASS = "root";

    public DataSource dataSource;


    public ConnectionPool(){
        inicializaDataSource();
    }

    private void inicializaDataSource(){
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName(JDBC_DRIVER);
        basicDataSource.setUsername(JDBC_USER);
        basicDataSource.setPassword(JDBC_PASS);
        basicDataSource.setUrl(JDBC_DB_URL);
        dataSource = basicDataSource;
    }
}
