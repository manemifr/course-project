package com.payou;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class JoueurImpl implements IDao<Joueur> {
	
	@Override
	public boolean create(Joueur j) {
	Connection conn = null;
	
	try {
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tennis?allowPublicKeyRetrieval=true&useSSL=false&useLegacyDatetimeCode=false&serverTimezone=Europe/Paris","root","babapaye1979");
		conn.setAutoCommit(false);
		Statement statement = conn.createStatement();
		PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO joueur VALUES(null,?,?,?)");
		preparedStatement.setString(1, j.getNom());
		preparedStatement.setString(2, j.getPrenom());
		preparedStatement.setString(3, j.getSexe());
		preparedStatement.execute();
		return true;
	}catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
    finally {
        try {
            if (conn!=null) {
                conn.close();
            }
        }catch (SQLException e) {
            e.printStackTrace();
            
        }
    }
	}

	@Override
	public Joueur read(Joueur o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Joueur o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Joueur o) {
		// TODO Auto-generated method stub
		return false;
	}}
        
	
	


