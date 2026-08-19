package com.xworkz.msk.dao;

import com.xworkz.msk.entity.FeedBackEntity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FeedBackDaoImpl implements FeedBackDao {
    @Override
    public boolean save(FeedBackEntity feedBackEntity) {
        System.out.println("running save in FeedBackDaoImpl");
        System.out.println("feedBackEntity = " + feedBackEntity);
        boolean result=false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        Connection connection=null;
        try {
            connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/feedback_db","root","root");
            PreparedStatement preparedStatement = connection.prepareStatement("insert into feedback values(?, ?, ?, ?)");
            preparedStatement.setString(1, feedBackEntity.getEmail());
            preparedStatement.setString(2, feedBackEntity.getName());
            preparedStatement.setString(3, feedBackEntity.getMobile());
            preparedStatement.setString(4, feedBackEntity.getComment());

            int rowsAffected = preparedStatement.executeUpdate();
            if(rowsAffected>0)
            {
                result=true;
            }

        } catch (SQLException e) {
            result=false;
            e.printStackTrace();
        }

        finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return result;
    }
}
