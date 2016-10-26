package Housing;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Menu
 */
public class Menu extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		RequestDispatcher dispatcher;
		if(request.getParameter("newmansion") != null) {
			String condition=request.getParameter("newmansion");
			request.setAttribute("condition",condition );
			dispatcher=request.getRequestDispatcher("/Condition.jsp");
			dispatcher.forward(request, response);
		}
		else if(request.getParameter("oldmansion") != null) {
			String condition=request.getParameter("oldmansion");
			request.setAttribute("condition",condition );
			dispatcher=request.getRequestDispatcher("/Condition.jsp");
			dispatcher.forward(request, response);
		}
		else if(request.getParameter("newhome") != null) {
			String condition=request.getParameter("newhome");
			request.setAttribute("condition",condition );
			dispatcher=request.getRequestDispatcher("/Condition.jsp");
			dispatcher.forward(request, response);
		}
		else if(request.getParameter("oldhome") != null) {
			String condition=request.getParameter("oldhome");
			request.setAttribute("condition",condition );
			dispatcher=request.getRequestDispatcher("/Condition.jsp");
			dispatcher.forward(request, response);
		}
	}

}
