import main.Business.Patient;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String email;
        String password;
        try {
            email = request.getParameter("email");
            password = request.getParameter("password");

            Patient p1 = new Patient();
            p1.selectDB(email);
            if (p1.getEmail().isEmpty() || !p1.getPassword().equals(password)) {
                RequestDispatcher rd = request.getRequestDispatcher("errorLogin.html");
                rd.forward(request, response);
            } else if (p1.getPassword().equals(password)) {
                RequestDispatcher rd = request.getRequestDispatcher("index.html");
                rd.forward(request, response);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("LoginServlet ending");
            out.close();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        processRequest(request, response);
    }
}