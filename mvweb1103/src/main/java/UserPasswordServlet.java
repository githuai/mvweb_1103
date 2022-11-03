

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UserPasswordServlet")
public class UserPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public UserPasswordServlet() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String u=request.getParameter("user");
		String p=request.getParameter("password");
		response.getWriter().append(u).append(":").append(p);
	}

}
