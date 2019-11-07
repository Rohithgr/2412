import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
@WebServlet("/ControllerServlet")  
public class ServletFile extends HttpServlet {  
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)   
         throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        int  cid=request.getParameter("cid"); 
        String cname=request.getParameter("cname");  
        String qualifaction=request.getParameter("qualifaction");   
        String date=request.getParameter("date");  
        String enddate=request.getParameter("enddate");  
        String party=request.getParameter("party");
        
        state e=new state();
        e.setCid(cid);
        e.setFname(fname);  
        e.setLname(lname); 
        e.setCourse(course); 
        e.setResult(result); 
       
        int status=Database.save(e);  
        if(status>0){  
            out.print("<p>Record saved successfully!</p>");  
            request.getRequestDispatcher("Register.html").include(request, response);  
        }else{  
            out.println("<marquee>Sorry! unable to save record</marquee>");  
        }  
          
        out.close();  
    }  
  
}  