package assignment.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import assignment.entity.Statement;
import assignment.entity.User;
import assignment.service.AssignmentService;
import assignment.service.SearchStatementCriteria;

/**
 * Servlet implementation class SearchStatementServlet
 */
@WebServlet("/searchStatement")
public class SearchStatementServlet extends HttpServlet {
	
	Logger logger = Logger.getLogger(SearchStatementServlet.class);
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchStatementServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.info("SearchStatementServlet.doGet()");
		RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.info("SearchStatementServlet.doPost()");
		List<Statement> searchResult = null;
		AssignmentService service = new AssignmentService();
		
		try {
			
			response.setContentType("text/html;charset=UTF-8");
	        PrintWriter out = response.getWriter();
	        Cookie[] cks = request.getCookies();
			logger.info("Welcome ::: "+ cks[0].getValue());
			
			String amountFrom = request.getParameter("amountFrom");
			String amountTo = request.getParameter("amountTo");
			String dateFrom = request.getParameter("dateFrom");
			String dateTo = request.getParameter("dateTo");
			
			// check the user authentication
			User loggedInUser = (User) request.getSession().getAttribute("loggedInUser");
			if(loggedInUser != null ) {
				if(loggedInUser.getUserType().equals(User.USER_TYPE_USER)) {
					if((amountFrom != null && amountFrom.trim().length() > 0) ||
						(amountTo != null && amountTo.trim().length() > 0) ||
						(dateFrom != null && dateFrom.trim().length() > 0) ||
						(dateTo != null && dateTo.trim().length() > 0)) {
						
						logger.info("Unauthorized User ...");
						// The below commented out lines will redirect to error401.jsp page
//						response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
//						response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized User ... This user couldn't specify any parameter to search");
						request.setAttribute("showMsg", "true");
						request.setAttribute("errorMsg", "401 Unauthorized User ... This user couldn't specify any parameter to search");
						RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
						dispatcher.forward(request, response);
						return;
					}
				}
			}
			
			SearchStatementCriteria searchStatementCriteria = new SearchStatementCriteria();
			searchStatementCriteria.setAccountId(Integer.valueOf(request.getParameter("accountId")));
			searchStatementCriteria.setAmountFrom(amountFrom);
			searchStatementCriteria.setAmountTo(amountTo);

			searchStatementCriteria.setDateFrom(dateFrom);
			searchStatementCriteria.setDateTo(dateTo);

			searchResult = service.searchStatementByCriteria(searchStatementCriteria);


			logger.info("searchResult.size() :: " + searchResult.size());

			request.removeAttribute("showMsg");
			request.setAttribute("searchResult", searchResult);

			searchResult.forEach((p) -> logger.info(p.toString()) );
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("searchStatementResult.jsp");
			dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp");
			dispatcher.forward(request, response);
		}
	}

}
