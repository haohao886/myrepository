package Housing;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Condition
 */
public class Condition extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		RequestDispatcher dispatcher;
		if(request.getParameter("hokkaidou") != null) {
			String condition=request.getParameter("condition");
			request.setAttribute("condition",condition );
			dispatcher=request.getRequestDispatcher("/Hokkaidou.jsp");
			dispatcher.forward(request, response);
		}
		else if(request.getParameter("touhoku") != null) {
			String condition=request.getParameter("condition");
			request.setAttribute("condition",condition );
			dispatcher=request.getRequestDispatcher("/Touhoku.jsp");
			dispatcher.forward(request, response);
		}
		else if(request.getParameter("kantou") != null) {
			String condition=request.getParameter("condition");
			request.setAttribute("condition",condition );
			dispatcher=request.getRequestDispatcher("/Kantou.jsp");
			dispatcher.forward(request, response);
		}
		else if(request.getParameter("chubu") != null) {
			String condition=request.getParameter("condition");
			request.setAttribute("condition",condition );
			dispatcher=request.getRequestDispatcher("/Chubu.jsp");
			dispatcher.forward(request, response);
		}
		else if(request.getParameter("kinki") != null) {
			String condition=request.getParameter("condition");
			request.setAttribute("condition",condition );
			dispatcher=request.getRequestDispatcher("/Kinki.jsp");
			dispatcher.forward(request, response);
		}
		else if(request.getParameter("shikoku") != null) {
			String condition=request.getParameter("condition");
			request.setAttribute("condition",condition );
			dispatcher=request.getRequestDispatcher("/Shikoku.jsp");
			dispatcher.forward(request, response);
		}
		else if(request.getParameter("chugoku") != null) {
			String condition=request.getParameter("condition");
			request.setAttribute("condition",condition );
			dispatcher=request.getRequestDispatcher("/Chugoku.jsp");
			dispatcher.forward(request, response);
		}
		else if(request.getParameter("kyushuu") != null) {
			String condition=request.getParameter("condition");
			request.setAttribute("condition",condition );
			dispatcher=request.getRequestDispatcher("/Kyushuu.jsp");
			dispatcher.forward(request, response);
		}
	}

}
