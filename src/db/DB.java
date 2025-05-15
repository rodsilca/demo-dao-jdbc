package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DB {

    private static Connection coon = null;

    public static Connection getConnection(){
        if (coon==null){
            try {
                Properties props = loadProperties();
                String url = props.getProperty("dburl");
                coon = DriverManager.getConnection(url,props);
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
        return coon;
    }

    public static void closeConnection(){
        try{
            if (coon!=null){
                coon.close();
            }
        }
        catch (SQLException e){
            throw new DbException(e.getMessage());
        }
    }


    private static Properties loadProperties(){
        try(FileInputStream fs = new FileInputStream("db.properties")){
            Properties props = new Properties();
            props.load(fs);

            return props;
        }
        catch (IOException e){
            throw new DbException(e.getMessage());
        }
    }
    public static void closeStatement(Statement st ){
        if (st!=null){
            try {
                st.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

    public static void closeResulSet(ResultSet rs ){
        if (rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

}
