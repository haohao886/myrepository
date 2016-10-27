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
		PreparedStatement ps = null;
		request.setCharacterEncoding("UTF-8");
		String conditionString=request.getParameter("condition");
		int condition = Integer.parseInt(conditionString);
		int typeflg = 0 ;
		if((condition <= 4) && (condition >= 1)){
			typeflg=1;
		}else if((condition <= 8) && (condition >= 5)){
			typeflg=2;
		}
		String area=request.getParameter("area");
		String kakak1=request.getParameter("kakaku1");
		String kakak2=request.getParameter("kakaku2");
		String mensek1=request.getParameter("menseki1");
		String mensek2=request.getParameter("menseki2");
		int kakaku1=Integer.parseInt(kakak1);
		int kakaku2=Integer.parseInt(kakak2);
		int menseki1=Integer.parseInt(mensek1);
		int menseki2=Integer.parseInt(mensek2);
//		String area2[] = request.getParameterValues("area2");
		String madori[] =request.getParameterValues("madori");
//		System.out.println(condition);
//		System.out.println(area);
//		System.out.println(kakaku1);
//		System.out.println(kakaku2);
//		System.out.println(menseki1);
//		System.out.println(menseki2);
//		System.out.println(madori[0]);
//		@SuppressWarnings("rawtypes")
//		ArrayList<HashMap<String, Comparable>> arealist = new ArrayList<HashMap<String, Comparable>>();
//		for (int i = 0; i < area2.length; i++ ) {
//			@SuppressWarnings("rawtypes")
//			HashMap<String, Comparable> areamap = new HashMap<String, Comparable>();
//			areamap.put("area2", area2[i]);
//			arealist.add(areamap);
//		}
		Connection conn = null;
		if(madori.length==1){
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
					 + "dev.TROOM.price between ? and ? and "
					 + "dev.TROOM.area between ? and ? and "
					 + "dev.TROOM.ldk like ? and "
					 + "dev.TROOM.typeflg = ?";
			 ps=conn.prepareStatement(sql);
			 ps.setInt(1, condition);
			 ps.setString(2, area);
			 ps.setInt(3, kakaku1);
			 ps.setInt(4, kakaku2);
			 ps.setInt(5, menseki1);
			 ps.setInt(6, menseki2);
			 ps.setString(7, madori[0]);
			 ps.setInt(8, typeflg);
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
				 int typeflg2=rs.getInt("typeflg");
				 if(typeflg2==1){
					 map.put("typeflg","販売");
				 }else if(typeflg2==2){
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
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally{
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		}
		else if(madori.length==2){
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
					 + "dev.TROOM.price between ? and ? and "
					 + "dev.TROOM.area between ? and ? and "
					 + "dev.TROOM.ldk like ? or dev.TROOM.ldk like ? and "
					 + "dev.TROOM.typeflg = ?";
			 ps=conn.prepareStatement(sql);
			 ps.setInt(1, condition);
			 ps.setString(2, area);
			 ps.setInt(3, kakaku1);
			 ps.setInt(4, kakaku2);
			 ps.setInt(5, menseki1);
			 ps.setInt(6, menseki2);
			 ps.setString(7, madori[0]);
			 ps.setString(8, madori[1]);
			 ps.setInt(9, typeflg);
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
				 int typeflg2=rs.getInt("typeflg");
				 if(typeflg2==1){
					 map.put("typeflg","販売");
				 }else if(typeflg2==2){
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
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally{
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		}
		else if(madori.length==3){
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
					 + "dev.TROOM.price between ? and ? and "
					 + "dev.TROOM.area between ? and ? and "
					 + "dev.TROOM.ldk like ? or dev.TROOM.ldk like ? or dev.TROOM.ldk like ? and "
					 + "dev.TROOM.typeflg = ?";
			 ps=conn.prepareStatement(sql);
			 ps.setInt(1, condition);
			 ps.setString(2, area);
			 ps.setInt(3, kakaku1);
			 ps.setInt(4, kakaku2);
			 ps.setInt(5, menseki1);
			 ps.setInt(6, menseki2);
			 ps.setString(7, madori[0]);
			 ps.setString(8, madori[1]);
			 ps.setString(9, madori[2]);
			 ps.setInt(10, typeflg);
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
				 int typeflg2=rs.getInt("typeflg");
				 if(typeflg2==1){
					 map.put("typeflg","販売");
				 }else if(typeflg2==2){
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
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally{
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		}
		else if(madori.length==4){
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
					 + "dev.TROOM.price between ? and ? and "
					 + "dev.TROOM.area between ? and ? and "
					 + "dev.TROOM.ldk like ? or dev.TROOM.ldk like ? or dev.TROOM.ldk like ? or dev.TROOM.ldk like ? and "
					 + "dev.TROOM.typeflg = ?";
			 ps=conn.prepareStatement(sql);
			 ps.setInt(1, condition);
			 ps.setString(2, area);
			 ps.setInt(3, kakaku1);
			 ps.setInt(4, kakaku2);
			 ps.setInt(5, menseki1);
			 ps.setInt(6, menseki2);
			 ps.setString(7, madori[0]);
			 ps.setString(8, madori[1]);
			 ps.setString(9, madori[2]);
			 ps.setString(10, madori[3]);
			 ps.setInt(11, typeflg);
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
				 int typeflg2=rs.getInt("typeflg");
				 if(typeflg2==1){
					 map.put("typeflg","販売");
				 }else if(typeflg2==2){
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
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally{
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		}
		RequestDispatcher dispatcher=request.getRequestDispatcher("/ResearchResult.jsp");
		dispatcher.forward(request, response);
	}

}
