package org.example.exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DemoDatabase {
    void connectDB() throws Exception {
        // try-resources
        try (
                Connection conn = DriverManager.getConnection("");
                PreparedStatement prepStmt = conn.prepareStatement("select * from some_table");
                ResultSet rs = prepStmt.executeQuery();
        ) {

            while (rs.next()) {

            }

        } catch (Exception e) {

        }
    }
}
