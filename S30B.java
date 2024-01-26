//36.	30 B) Write a SERVLET program to display the details of Product (ProdCode, PName, Price) on the browser in tabular format. (Use database)	
import java.io.*;
import javax.servlet.*;
import java.sql.*;

public class S30B extends GenericServlet
{
	public void service(ServletRequest req , ServletResponse res ) throws ServletException, IOException
	{
		try
		{
			res.setContentType("text/html");
			PrintWriter pw = res.getWriter();
			// Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/tyjavadb";
			String pwd ="Password@123";
			String uname= "root";
			Connection con = DriverManager.getConnection(url,uname,pwd);
			Statement st = con.createStatement();
			String q = "SELECT * FROM `tyjavadb`.`product`";
			ResultSet rs = st.executeQuery(q);
			while(rs.next())
			{
				pw.print(" "+rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			
			}
		}
		catch(SQLException e){System.out.print("\t"+e.getMessage());}
		
		
	
	
	}

}