package test;

         import javax.servlet.http.HttpServlet;
         import javax.servlet.http.HttpServletRequest;
         import javax.servlet.http.HttpServletResponse;
         import java.io.IOException;
         import java.io.PrintWriter;

public class servlet extends HttpServlet {


    protected void service (HttpServletRequest req, HttpServletResponse res) throws IOException {

        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));

        int k = i+j;

        PrintWriter out = res.getWriter();
        out.println("resulr is = " + k);
    }

}
