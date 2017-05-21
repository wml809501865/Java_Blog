package mine;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnDB {
	public ResultSet rs = null;
	private static String dbClassName = "com.mysql.jdbc.Driver";  
	private static String dbUrl = "jdbc:mysql://localhost:3306/blog";
	private static String USER = "root";
	private static String PASS = "123456789";
	Connection conn = null;
    Statement stmt = null;
    public static Connection getConnection() {
		Connection conn = null;
		try { 
			Class.forName(dbClassName).newInstance(); 
			conn = DriverManager.getConnection(dbUrl,USER,PASS);
		} catch (Exception ee) {
			ee.printStackTrace(); // 杈撳嚭寮傚父淇℃伅
		}
		if (conn == null) {
			System.err.println("database is null!"); 
		}
		return conn; 
	}
    public ResultSet executeQuery(String sql) {
		try { 
			conn = getConnection(); 
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
		} catch (Exception ex) {
			System.err.println(ex.getMessage()); 
		}
		return rs; 
	}
    public int adduser(String sql) {
		int result = 0; 
		try {
			conn = getConnection(); 
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql); 
		} catch (Exception ex) {
			result = 0; 
		}
		return result; 
	}
    public void close() {
		try { 
			if (rs != null) { 
				rs.close(); 
			}
			if (stmt != null) { 
				stmt.close(); 
			}
			if (conn != null) { 
				conn.close(); 
			}
		} catch (Exception e) {
			e.printStackTrace(System.err); 
		}
	}
}
