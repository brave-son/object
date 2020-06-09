package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC1 {
	public static void main(String[] args) throws ReflectiveOperationException, SQLException {
		String url = "jdbc:mysql://localhost:3306/java";
		String id = "root";
		String pw = "1234";
		Connection con = null; // DB 연결
		PreparedStatement stmt = null; // Query 실행
		ResultSet rs = null; // 조회 Query 결과 저장
		// 쿼리 작성
		StringBuffer query = new StringBuffer();
		query.append("SELECT ID, NAME, GENDER, KIND FROM ANIMAL");
		// 1. 드라이버 로딩
		Class.forName("com.mysql.jdbc.Driver");
		// 2. DB 연결
		con = DriverManager.getConnection(url, id, pw);// 3. Query를 실행할 수 있도록 Statement 객체 준비

		stmt = con.prepareStatement(query.toString());
		rs = stmt.executeQuery(); // 4. Query 실행
		while (rs.next()) { // 5. 조회결과 처리
			// rs.getString();
			int id2 = rs.getInt("ID");
			String name = rs.getString("NAME");
			String gender = rs.getString("GENDER");
			String kind = rs.getString("KIND");
			System.out.println(id2+"\n" + name+"\n" + gender+"\n" + kind+"\n");

		}

	}
}
