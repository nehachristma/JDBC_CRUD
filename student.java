package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;


public class student {
	
	public void createDatabase(){
	}	
		public void createTable() {
//			try{
//				String url="jdbc:mysql://localhost:3306/db";
//				String userName="root";
//				String password="simba";
//				
//				Connection conn= DriverManager.getConnection(url , userName, password);
//				//create statement
//				Statement stm=conn.createStatement();
//
//				//execute-query
//				String query="create table student(sid int(3),sname varchar(200),semail varchar(200))";
//				
//				 stm.execute(query);
//				
//				System.out.println("table created successfully ");
//				
//				conn.close();
//				} catch(Exception e) {
//				e.printStackTrace();
//			}
		}
	public void createData(){
		try{
			String url="jdbc:mysql://localhost:3306/";
			String database="db";
			String userName="root";
			String password="simba";
			
			Connection conn= DriverManager.getConnection(url+database , userName, password);
		

			//execute-query
			 String query = "insert into student (sid, sname, semail) VALUES (?,?,?)";
			
			//create statement
			PreparedStatement pstm = conn.prepareStatement(query);
			pstm.setInt(1,12);
			pstm.setString(2, "Sneha");
			pstm.setString(3, "sneha@gmail.com");
			
			
			
			 pstm.execute();
			
			System.out.println("data Inserted successfully ");
			
			conn.close();
			} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void readData(){
		try{
			String url="jdbc:mysql://localhost:3306/";
			String database="db";
			String userName="root";
			String password="simba";
			
			Connection conn= DriverManager.getConnection(url+database , userName, password);
		

			//execute-query
			 String query = "Select * from student";
			
			//create statement
			Statement stm = conn.createStatement();	
			 ResultSet rs = stm.executeQuery(query);
			while(rs.next()){
				System.out.println("id "+rs.getInt(1));
				System.out.println("Name "+rs.getString(2));
				System.out.println("Email "+rs.getString(3));
			}
			System.out.println("Read data successfully ");
			
			conn.close();
			} catch(Exception e) {
			e.printStackTrace();
		}
}
	public void UpdateData(){
		
		try{
			String url="jdbc:mysql://localhost:3306/";
			String database="db";
			String userName="root";
			String password="simba";
			
			Connection conn= DriverManager.getConnection(url+database , userName, password);
		

			//execute-query
			 String query = "UPDATE student set sid = ? where sname = ? ";
			
			//create statement
			PreparedStatement pstm = conn.prepareStatement(query);
			pstm.setInt(1,13);
			pstm.setString(2, "Sneha");
		
		
			 pstm.execute();
			
			System.out.println("data Updated successfully ");
			
			conn.close();
			} 
			catch(Exception e) {
			e.printStackTrace();
		}
}
	public void deleteData(){
		
		try{
			String url="jdbc:mysql://localhost:3306/";
			String database="db";
			String userName="root";
			String password="simba";
			
			Connection conn= DriverManager.getConnection(url+database , userName, password);
		

			//execute-query
			 String query = "Delete from student where sname = ? ";
			
			//create statement
			PreparedStatement pstm = conn.prepareStatement(query);
//			pstm.setInt(1,13);
			pstm.setString(1, "Sourabh");
		
		
			 pstm.execute();
			
			System.out.println("data Deleted successfully ");
			
			conn.close();
			} 
			catch(Exception e) {
			e.printStackTrace();
		}

	}
	
}



