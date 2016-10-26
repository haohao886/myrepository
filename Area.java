package Housing;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Area
 */
public class Area extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		RequestDispatcher dispatcher;
		if(request.getParameter("tokyo") != null) {
			String condition=request.getParameter("condition");
			request.setAttribute("condition",condition );
			String area=request.getParameter("tokyo");
			request.setAttribute("area",area );
			dispatcher=request.getRequestDispatcher("/Tokyo.jsp");
			dispatcher.forward(request, response);
		}
		else if(request.getParameter("chiba") != null) {
			String condition=request.getParameter("condition");
			request.setAttribute("condition",condition );
			String area=request.getParameter("chiba");
			request.setAttribute("area",area );
			dispatcher=request.getRequestDispatcher("/Chiba.jsp");
			dispatcher.forward(request, response);
		}
		else if(request.getParameter("saitama") != null) {
			String condition=request.getParameter("condition");
			request.setAttribute("condition",condition );
			String area=request.getParameter("saitama");
			request.setAttribute("area",area );
			dispatcher=request.getRequestDispatcher("/Saitama.jsp");
			dispatcher.forward(request, response);
		}
		else if(request.getParameter("kanagawa") != null) {
			String condition=request.getParameter("condition");
			request.setAttribute("condition",condition );
			String area=request.getParameter("kanagawa");
			request.setAttribute("area",area );
			dispatcher=request.getRequestDispatcher("/Kanagawa.jsp");
			dispatcher.forward(request, response);
		}
		else if(request.getParameter("gunma") != null) {
			String condition=request.getParameter("condition");
			request.setAttribute("condition",condition );
			String area=request.getParameter("gunma");
			request.setAttribute("area",area );
			dispatcher=request.getRequestDispatcher("/Gunma.jsp");
			dispatcher.forward(request, response);
		}
		else if(request.getParameter("tochigi") != null) {
			String condition=request.getParameter("condition");
			request.setAttribute("condition",condition );
			String area=request.getParameter("tochigi");
			request.setAttribute("area",area );
			dispatcher=request.getRequestDispatcher("/Tochigi.jsp");
			dispatcher.forward(request, response);
		}
		else if(request.getParameter("ibaraki") != null) {
			String condition=request.getParameter("condition");
			request.setAttribute("condition",condition );
			String area=request.getParameter("ibaraki");
			request.setAttribute("area",area );
			dispatcher=request.getRequestDispatcher("/Ibaraki.jsp");
			dispatcher.forward(request, response);
		}
	}

}
