package Housing;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResearchServlet
 */
public class Research extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String condition=request.getParameter("condition");
		String area=request.getParameter("area");
		String kakaku1=request.getParameter("kakaku1");
		String kakaku2=request.getParameter("kakaku2");
		String menseki1=request.getParameter("menseki1");
		String menseki2=request.getParameter("menseki2");
//		String area2[] = request.getParameterValues("area2");
//		String madori[] =request.getParameterValues("madori");
//		@SuppressWarnings("rawtypes")
//		ArrayList<HashMap<String, Comparable>> arealist = new ArrayList<HashMap<String, Comparable>>();
//		@SuppressWarnings("rawtypes")
//		ArrayList<HashMap<String, Comparable>> madorilist = new ArrayList<HashMap<String, Comparable>>();
//		for (int i = 0; i < area2.length; i++ ) {
//			@SuppressWarnings("rawtypes")
//			HashMap<String, Comparable> areamap = new HashMap<String, Comparable>();
//			areamap.put("area2", area2[i]);
//			arealist.add(areamap);
//		}
//		for (int i = 0; i < madori.length; i++ ) {
//			@SuppressWarnings("rawtypes")
//			HashMap<String, Comparable> madorimap = new HashMap<String, Comparable>();
//			madorimap.put("madori",madori[i]);
//			madorilist.add(madorimap);
//		}
		Connection conn;
		PreparedStatement ps;
		try{
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			 conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","DEV","oracle");
			 conn.setAutoCommit(false);
			 String sql="select * from  where  =?,";
			 ps=conn.prepareStatement(sql);
			 ps.setString(1, condition);
			 ps.setString(2, area);
			 ps.setString(3, kakaku1);
			 ps.setString(4, kakaku2);
			 ps.setString(5, menseki1);
			 ps.setString(6, menseki2);
			 ResultSet rs=ps.executeQuery();
			 while(rs.next()){
				 String =rs.getString();
				 String =rs.getString();
				 Dateb=rs.getDate();
				 SimpleDateFormat f=new SimpleDateFormat();
				 String =f.format();
				 request.setAttribute(,);
				 request.setAttribute(,);
				 request.setAttribute(,);
			 }
			 @SuppressWarnings("rawtypes")
				ArrayList<HashMap<String, Comparable>> list = new ArrayList<HashMap<String, Comparable>>();
				while (rs.next()) {
				@SuppressWarnings("rawtypes")
				HashMap<String, Comparable> map = new HashMap<String, Comparable>();
				map.put("", rs.getString(""));
				map.put("", rs.getString(""));
				map.put("", rs.getDate(""));
				map.put("", rs.getString(""));
				map.put("", rs.getString(""));
				list.add(map);
				}
				request.setAttribute("list",list);
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}finally{
			ps.close();
			conn.close();
		}
		RequestDispatcher dispatcher=request.getRequestDispatcher("/ResearchResult.jsp");
		dispatcher.forward(request, response);
	}

}
