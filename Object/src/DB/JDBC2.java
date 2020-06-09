package DB;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC2 {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		/* data.txt���� ������ �б� �ڵ��ۼ� */
		InputStream in = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		PreparedStatement stmt= null;
		
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/java";
		String id = "root";
		String pw = "1234";
		Connection con = DriverManager.getConnection(url, id, pw);
		StringBuffer query = new StringBuffer();
		query.append("INSERT INTO STUDENT VALUES (?,?,?)");
		stmt = con.prepareStatement(query.toString());
		try {
			in = new FileInputStream("c:/dev/data.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		isr = new InputStreamReader(in);
		br = new BufferedReader(isr);
		String data = "";
		String[] arr = new String[3]; 
		try {
			while ((data = br.readLine()) != null) {
			
					arr =data.split(",");
					
					stmt.setString(1, arr[0]/* �ڵ��ۼ� */);
					stmt.setString(2, arr[1]/* �ڵ��ۼ� */);
					stmt.setString(3, arr[2]/* �ڵ��ۼ� */);
					stmt.executeUpdate();
					System.out.println(data);
				}
		} catch (IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			/* SQL - insert �ڵ��ۼ� */
			
				
			
			
		
			
	
			
			
			
			
	}/* data.txt���� �о�� �������� ����ŭ �ݺ� */

}
