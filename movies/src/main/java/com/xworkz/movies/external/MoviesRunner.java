package com.xworkz.movies.external;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MoviesRunner {
    public static void main(String[] args) {
        try {
            String url="jdbc:mysql://localhost:3306/Show_Room";
            String userName="root";
            String password="root";
            String query="insert into bike_info values(?,?,?)";
            Connection connection =DriverManager.getConnection(url,userName,password);
            PreparedStatement pr =connection.prepareStatement(query);
            pr.setInt(1,112);
            pr.setString(2,"ranga");
            pr.setString(3,"sira");

            int rows=pr.executeUpdate();
            if (rows==1){
                System.out.println(" its connected");
            }else {
                System.out.println("its not connected");
            }

        }catch (SQLException e){
            e.printStackTrace();
      }
        }
    }

