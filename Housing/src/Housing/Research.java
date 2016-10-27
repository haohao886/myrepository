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
		Connection conn = null;
		PreparedStatement ps = null;
		try{
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			 conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","DEV","oracle");
			 conn.setAutoCommit(false);
			 String sql="select dev.TBLDING.bldno , dev.TBLDING.TYPE , dev.TKEN.kenname , dev.TBLDING.address , dev.TBLDING.year , dev.TBLDING.elevator , dev.TBLDING.houses ,"
					 + "dev.TBLDING.kouzo , dev.TLINE.linename , dev.TSTATION.station , dev.TBLDING.distance1 ,  dev.TROOM.area ,dev.TBLDING.rank , dev.troom.floor,"
					 + "dev.TROOM.park , dev.TROOM.ldk , dev.TROOM.direction , dev.TROOM.furniture , dev.TROOM.price , dev.TROOM.cost , dev.troom.mcost , dev.TROOM.deposit , dev.TROOM.keymoney,"
					 + "dev.TROOM.parkcost , dev.TROOM.typeflg , dev.TROOM.expense , dev.TBROKER.brokername , dev.TBROKER.tele , dev.TBROKER.address as address2 , dev.TBROKER.certs , dev.TBROKER.charge "
					 + "from dev.TBLDING "
					 + "join dev.TROOM on dev.TBLDING.bldno = dev.TROOM.bldno "
					 + "join dev.TBROKER on dev.troom.brokerno = dev.TBROKER.brokerno "
					 + "join dev.TLINE on dev.TBLDING.lineno1 = dev.TLINE.lineno "
					 + "join dev.TSTATION on dev.TBLDING.stationno1 = dev.TSTATION.stationno and dev.TBLDING.lineno1 = dev.TSTATION.lineno "
					 + "join dev.TKEN on dev.TBLDING.kenno = dev.TKEN.kenno "
					 + "where dev.TBLDING.TYPE=? and dev.TKEN.kenname=? and "
					 + "dev.TROOM.price between ? and ?";
			 ps=conn.prepareStatement(sql);
			 ps.setString(1, condition);
			 ps.setString(2, area);
			 ps.setString(3, kakaku1);
			 ps.setString(4, kakaku2);
//			 ps.setString(5, menseki1);
//			 ps.setString(6, menseki2);
			 ResultSet rs=ps.executeQuery();
			 @SuppressWarnings("rawtypes")
			ArrayList<HashMap<String, Comparable>> list = new ArrayList<HashMap<String, Comparable>>();
			while (rs.next()) {
				@SuppressWarnings("rawtypes")
				HashMap<String, Comparable> map = new HashMap<String, Comparable>();
				 map.put("bldno",rs.getString("bldno"));
				 int type=rs.getInt("type");
				 if(type==1){
					 map.put("type","新築マンション");
				 }else if(type==2){
					 map.put("type","中古マンション");
				 }else if(type==3){
					 map.put("type","新築一戸建て");
				 }else if(type==4){
					 map.put("type","中古一戸建て");
				 }
				 map.put("kenname",rs.getString("kenname"));
				 map.put("address",rs.getString("address"));
				 map.put("year",rs.getString("year"));
				 int elevator=rs.getInt("elevator");
				 if(elevator==0){
					 map.put("elevator","なし");
				 }else if(elevator==1){
					 map.put("elevator","あり");
				 }
				 map.put("houses",rs.getString("houses"));
				 map.put("kouzo",rs.getString("kouzo"));
				 map.put("linename",rs.getString("linename"));
				 map.put("station",rs.getString("station"));
				 map.put("distance1",rs.getString("distance1"));
				 map.put("menseki",rs.getString("area"));
				 map.put("rank",rs.getString("rank"));
				 map.put("floor",rs.getString("floor"));
				 int park=rs.getInt("park");
				 if(park==0){
					 map.put("park","なし");
				 }else if(park==1){
					 map.put("park","あり");
				 }
				 map.put("ldk",rs.getString("ldk"));
				 map.put("direction",rs.getString("direction"));
				 int furniture=rs.getInt("furniture");
				 if(furniture==0){
					 map.put("furniture","なし");
				 }else if(furniture==1){
					 map.put("furniture","あり");
				 }
				 map.put("price",rs.getString("price"));
				 map.put("cost",rs.getString("cost"));
				 map.put("mcost",rs.getString("mcost"));
				 map.put("deposit",rs.getString("deposit"));
				 map.put("keymoney",rs.getString("keymoney"));
				 map.put("parkcost",rs.getString("parkcost"));
				 int typeflg=rs.getInt("typeflg");
				 if(typeflg==1){
					 map.put("typeflg","販売");
				 }else if(typeflg==2){
					 map.put("typeflg","賃貸");
				 }
				 map.put("expense",rs.getString("expense"));
				 map.put("brokername",rs.getString("brokername"));
				 map.put("tele",rs.getString("tele"));
				 map.put("address2",rs.getString("address2"));
				 map.put("certs",rs.getString("certs"));
				 map.put("charge",rs.getString("charge"));
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
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
		RequestDispatcher dispatcher=request.getRequestDispatcher("/ResearchResult.jsp");
		dispatcher.forward(request, response);
	}

}
