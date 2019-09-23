import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "ServerTimeServlet",urlPatterns = "/index")
public class ServerTimeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.println("<html>");

        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        String strDate = formatter.format(date);
        writer.println("Date Format with MM/dd/yyyy: " + strDate +"<br>");

        formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        strDate = formatter.format(date);
        writer.println("Date Format with dd-M-yyyy hh:mm:ss: " + strDate+"<br>");

        formatter = new SimpleDateFormat("dd MMMM yyyy");
        strDate = formatter.format(date);
        writer.println("Date Format with dd MMMM yyyy: " + strDate+"<br>");

        formatter = new SimpleDateFormat("dd MMMM yyyy zzzz");
        strDate = formatter.format(date);
        writer.println("Date Format with dd MMMM yyyy zzzz: " + strDate+"<br>");

        formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
        strDate = formatter.format(date);
        writer.println("Date Format with E, dd MMM yyyy HH:mm:ss z: "
                + strDate+"<br>");
    }
}
