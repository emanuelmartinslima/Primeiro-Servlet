

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;    

    public DemoServlet() {
        super();
    }

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.getWriter().append("Served at: ").append(req.getContextPath());
		
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		
		pw.println("<html><body style='background-color: #000;'>");
		pw.println("<h1 style='color: pink;'>Hello, World!");
		pw.println("</h1>");
		pw.println("</body></html>");
		
		pw.close();
	}

}
