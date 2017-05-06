package mine;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Postpage {
	public List<Post> find(int page){
		// 创建List
		List<Post> list = new ArrayList<Post>();
		// 获取数据库连接
		Connection conn = null;
		conn=ConnDB.getConnection();
		// 分页查询的SQL语句
		String sql = "select * from post order by date desc limit ?,?";
		try {
			// 获取PreparedStatement
			PreparedStatement ps = conn.prepareStatement(sql);
			// 对SQL语句中的第1个参数赋值
			ps.setInt(1, (page - 1) *Post.PAGE_SIZE);
			// 对SQL语句中的第2个参数赋值
			ps.setInt(2, Post.PAGE_SIZE);
			// 执行查询操作
			ResultSet rs = ps.executeQuery();
			// 光标向后移动，并判断是否有效
			while(rs.next()){
				// 实例化Product
				Post p = new Post();
				// 对name属性赋值
				p.setUserName(rs.getString("username"));
				p.setTitle(rs.getString("title"));
				p.setAccount(rs.getString("account"));
				p.setDate(rs.getString("date"));
				// 将Product添加到List集合中
				list.add(p);
			}
			// 关闭ResultSet
			rs.close();
			// 关闭PreparedStatement
			ps.close();
			// 关闭Connection
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	/**
	 * 查询总记录数
	 * @return 总记录数
	 */
	public int findCount(){
		// 总记录数
		int count = 0;
		// 获取数据库连接
		Connection conn=null;
		conn=ConnDB.getConnection();
		// 查询总记录数SQL语句
		String sql = "select count(*) from post";
		try {
			// 创建Statement
			Statement stmt = conn.createStatement();
			// 查询并获取ResultSet
			ResultSet rs = stmt.executeQuery(sql);
			// 光标向后移动，并判断是否有效
			if(rs.next()){
				// 对总记录数赋值
				count = rs.getInt(1);
			}
			// 关闭ResultSet
			rs.close();
			// 关闭Connection
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 返回总记录数
		return count;
	}
}
