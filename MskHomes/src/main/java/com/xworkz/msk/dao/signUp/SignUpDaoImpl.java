package com.xworkz.msk.dao.signUp;

import com.xworkz.msk.entity.SignUpEntity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SignUpDaoImpl implements SignUpDao {
    @Override
    public boolean save(SignUpEntity signUpEntity) {
        System.out.println("running save() in SignUpDaoImpl, data saved");
        System.out.println("signUpEntity = " + signUpEntity);

        boolean result=false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }

        Connection connection=null;

        try {
            connection= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/signUp_db","root","root");
            PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO signUp VALUES(?,?,?,?)");
            preparedStatement.setString(1,signUpEntity.getUsername());
            preparedStatement.setString(2,signUpEntity.getEmail());
            preparedStatement.setString(3,signUpEntity.getPassword());
            preparedStatement.setString(4,signUpEntity.getConfirmPassword());

            int rowsAffected=preparedStatement.executeUpdate();

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
