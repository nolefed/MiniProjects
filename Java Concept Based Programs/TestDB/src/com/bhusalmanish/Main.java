package com.bhusalmanish;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        try ( Connection conn= DriverManager.getConnection("jdbc:sqlite:C:\\Users\\nole\\" +
                "Desktop\\TestDB\\testjava.db");                                               // resources would be closed that is connection
                                                                                                // would be closed when try block is exited, we do not need to close it
              Statement statement = conn.createStatement()){
               statement.execute("CREATE TABLE contacts (name TEXT, phone INTEGER, email TEXT)");
        }
        catch(SQLException e){
            System.out.println("something went wrong:" + e.getMessage());
        }
    }
}
