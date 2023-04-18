package srv;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Article;
import model.DaoArticle;

/**
 * Servlet implementation class Insert
 */
@WebServlet("/Insert")
public class Insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Insert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int ref =  Integer.parseInt(request.getParameter("ref"));
		String marque =  request.getParameter("marque");
		int prix=  Integer.parseInt(request.getParameter("prix"));
		String couleur =  request.getParameter("couleur");
		
		ArrayList<Article> articles = new ArrayList<Article>();
		
		Article a = new Article(ref, marque, prix, couleur);
		
		DaoArticle articleDao = new DaoArticle();
		
		try {
			articleDao.insert(a);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		articles.add(a);
		
		request.setAttribute("articles", articles);
		
		request.getRequestDispatcher("WEB-INF/recap.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
