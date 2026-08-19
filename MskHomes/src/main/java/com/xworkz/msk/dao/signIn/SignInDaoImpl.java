package com.xworkz.msk.dao.signIn;

import com.xworkz.msk.entity.SignInEntity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SignInDaoImpl implements SignInDao{
    @Override
    public boolean save(SignInEntity signInEntity) {
        System.out.println("running save() in SignInDaoImpl,data saved");
        System.out.println("signInEntity = " + signInEntity);

        boolean result=false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/signIn_db","root","root");
            PreparedStatement prepareStatement = connection.prepareStatement("INSERT INTO signIn(username, password) VALUES(?,?)");
            prepareStatement.setString(1,signInEntity.getUsername());
            prepareStatement.setString(2,signInEntity.getPassword());

            int rowsAffected=prepareStatement.executeUpdate();

                if(rowsAffected>0)
                {
                    result=true;
                }
        } catch (SQLException e) {
            result=false;
            e.printStackTrace();
        }

        finally
        {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return result;
    }
}
