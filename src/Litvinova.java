import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/*")
public class Litvinova extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getPathInfo();
        name = name.substring(1, name.length());
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();
        if(name.equals("")) {
            out.println("Введите ваше имя в адресной строке");
        } else {
            out.println("Ваше введённое имя: " + name);
        }

    }
}


