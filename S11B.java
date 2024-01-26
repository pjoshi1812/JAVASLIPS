import java.io.*;
import javax.servlet.*;

public class S11B extends GenericServlet
{
    public void service (ServletRequest req, ServletResponse res) throws ServletException , IOException
	{
		res.setContentType("text/html");
		PrintWriter pw =res.getWriter();
		String  no1 = req.getParameter("t1");
		String  no2 = req.getParameter("t2");
		int n1 = Integer.parseInt("no1");
		int n2 = Integer.parseInt("no2");
		pw.print("Addition is :"+(n1+n2));
	}
}