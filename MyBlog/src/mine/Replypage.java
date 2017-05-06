package mine;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.connector.Request;

public class Replypage {
	public List<REPLY> Getreply(){
		// 创建List
		List<REPLY> list = new ArrayList<REPLY>();
		// 获取数据库连接
		Connection conn = null;
		conn=ConnDB.getConnection();
		// 分页查询的SQL语句
		String sql = "select * from post order by date desc limit ?,?";
		try {
			// 获取PreparedStatement
			PreparedStatement ps = conn.prepareStatement(sql);
			// 对SQL语句中的第1个参数赋值
			ResultSet rs = ps.executeQuery();
			// 光标向后移动，并判断是否有效
			while(rs.next()){
				// 实例化Product
				REPLY p = new REPLY();
				// 对name属性赋值
				p.setname(rs.getString("name"));
				p.setTitle(rs.getString("title"));
				p.setFloor(rs.getInt("floor"));
				p.setDate(rs.getString("date"));
				p.setReply(rs.getString("reply"));
				// 将Product添加到List集合中
				list.add(p);
				}
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
}