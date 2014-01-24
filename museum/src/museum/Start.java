/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package museum;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Observable;

/**
 *
 * @author nikos
 */
public class Start extends Observable{
   public static void main(String[] args) {

		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;

		try { 
			Class.forName("com.mysql.jdbc.Driver").newInstance(); 
			//String connectionURL="jdbc:mysql://localhost:3306/new_schema";
			//String connectionUser="root";
			//String connectionPass="mou12sta10ka91lis!";
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/im?zeroDateTimeBehavior=convertToNull","root","N!k0s");
			stmt=conn.createStatement();
			rs=stmt.executeQuery("select * from im.foto");

			while(rs.next())
			{
                                int totalPosts = rs.getInt("id");
				String userName = rs.getString("onoma");
				String password = rs.getString("image");
                                int tP;
                            tP = rs.getInt("pass");
				
				System.out.println(userName + "\t\t" + password + "\t\t" + totalPosts+ "\t\t" + tP);

			}

		}
		catch (Exception e) { 
			e.printStackTrace(); 
		}

		finally {
			try { if(rs != null) rs.close(); } catch (SQLException e) { e.printStackTrace(); }
			try { if(stmt != null) stmt.close(); } catch (SQLException e) { e.printStackTrace(); }
			try { if(conn != null) conn.close(); } catch (SQLException e) { e.printStackTrace(); }
		}

		try {
			//Home frame = new Home();
			//frame.setVisible(true);
			new Home().setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} 
}
