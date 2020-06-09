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
		Connection con = null; // DB ����
		PreparedStatement stmt = null; // Query ����
		ResultSet rs = null; // ��ȸ Query ��� ����
		// ���� �ۼ�
		StringBuffer query = new StringBuffer();
		query.append("SELECT ID, NAME, GENDER, KIND FROM ANIMAL");
		// 1. ����̹� �ε�
		Class.forName("com.mysql.jdbc.Driver");
		// 2. DB ����
		con = DriverManager.getConnection(url, id, pw);// 3. Query�� ������ �� �ֵ��� Statement ��ü �غ�

		stmt = con.prepareStatement(query.toString());
		rs = stmt.executeQuery(); // 4. Query ����
		while (rs.next()) { // 5. ��ȸ��� ó��
			// rs.getString();
			int id2 = rs.getInt("ID");
			String name = rs.getString("NAME");
			String gender = rs.getString("GENDER");
			String kind = rs.getString("KIND");
			System.out.println(id2+"\n" + name+"\n" + gender+"\n" + kind+"\n");

		}

	}
}
