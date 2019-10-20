package WebService;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.google.gson.Gson;
import com.mysql.jdbc.Connection;

import Data_Access.Data;
import model.Feed;
	
	@Path("/webservice")
	public class Service {
		
	@GET
	@Path("/shortTermCourses")
	@Produces("application/json")
	public String feed()
	{
	String feeds = null;
	try 
	{
	ArrayList<Feed> feedData = null;
	String connectionURL = "jdbc:mysql://localhost:3306/hackcbs";
	String username = "root";
	String userPass = "A23690108";
	
	Data data = new Data(connectionURL,username,userPass);
	feedData = (ArrayList<Feed>) data.shortTerm();
	
	Gson gson = new Gson();
	//System.out.println(gson.toJson(feedData));
	feeds = gson.toJson(feedData);
    System.out.println(feeds);
	}

	catch (Exception e)
	{
	e.printStackTrace();//Console 
	}
	return feeds;
	}

/*	@POST
	@Path("/ShortTermCourses")
	@Produces("application/json")
	public String feed2()
	{
	String feeds = null;
	try 
	{
		ArrayList<Feed> feedData = null;
		String connectionURL = "jdbc:mysql://localhost:3306/hackcbs";
		String username = "root";
		String userPass = "A23690108";
		
		Data data = new Data(connectionURL,username,userPass);
		feedData = (ArrayList<Feed>) data.shortTerm();
		
		Gson gson = new Gson();
		//System.out.println(gson.toJson(feedData));
		feeds = gson.toJson(feedData);
	}

	catch (Exception e)
	{
	System.out.println("Exception Error"); //Console 
	}
	return feeds;
	}
*/
	
	
	@POST
	@Path("/registration")
	//@Consumes("text/plain")
	//@Consumes(MediaType.TEXT_PLAIN)
	@Consumes("application/x-www-Form-urlencoded")
	public void new_registration(@FormParam("FirstName") String firstname,@FormParam("LastName") String lastname,
			@FormParam("E-mail") String email, @FormParam("Qualification") String qua ,@FormParam("CourseName") String coursename,@FormParam("CourseFee") String Coursefee,@FormParam("MobileNo") String mobileno,
			@FormParam("Category") String category) throws Exception
	{
		 
		try
		{
		String connectionURL = "jdbc:mysql://localhost:3306/hackcbs";
		
		java.sql.Connection conn = null;

		Class.forName("com.mysql.jdbc.Driver").newInstance();
		
		conn = DriverManager.getConnection(connectionURL, "root", "A23690108");
		String sql="insert into reg values(?,?,?,?,?,?,?,?)";
				
			
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, firstname);
				ps.setString(2, lastname);
				ps.setString(3, email);
				ps.setString(4, mobileno);
				ps.setString(5, category);

				ps.setString(6, coursename);

				ps.setString(7, qua);

				ps.setString(8, Coursefee);
			 ps.execute();
			 System.out.println("Inserted records into the table...");
		
		}
		catch (SQLException e)
		{
		
			throw e;
		}
		catch (Exception e)
		{
		throw e;	
		}
		

	}
	
	
	
	

	@GET
	@Path("/longTermCourses")
	@Produces("application/json")
	public String feed3()
	{
	String feeds = null;
	try 
	{
	ArrayList<Feed> feedData = null;
	String connectionURL = "jdbc:mysql://localhost:3306/hackcbs";
	String username = "root";
	String userPass = "A23690108";
	
	Data data = new Data(connectionURL,username,userPass);
	feedData = (ArrayList<Feed>) data.longTerm();
	
	Gson gson = new Gson();
	//System.out.println(gson.toJson(feedData));
	feeds = gson.toJson(feedData);

	}

	catch (Exception e)
	{
	System.out.println("Exception Error"); //Console 
	}
	return feeds;
	}
	
	
	

	@GET
	@Path("/projecttrainingshortTermCourses")
	@Produces("application/json")
	public String feed4()
	{
	String feeds = null;
	try 
	{
	ArrayList<Feed> feedData = null;
	String connectionURL = "jdbc:mysql://localhost:3306/hackcbs";
	String username = "root";
	String userPass = "A23690108";
	
	Data data = new Data(connectionURL,username,userPass);
	feedData = (ArrayList<Feed>) data.projectshortTerm();
	
	Gson gson = new Gson();
	//System.out.println(gson.toJson(feedData));
	feeds = gson.toJson(feedData);

	}

	catch (Exception e)
	{
	System.out.println("Exception Error"); //Console 
	}
	return feeds;
	}

	
	

	@GET
	@Path("/ProjecttraininglongTermCourses")
	@Produces("application/json")
	public String feed5()
	{
	String feeds = null;
	try 
	{
	ArrayList<Feed> feedData = null;
	String connectionURL = "jdbc:mysql://localhost:3306/hackcbs";
	String username = "root";
	String userPass = "A23690108";
	
	Data data = new Data(connectionURL,username,userPass);
	feedData = (ArrayList<Feed>) data.projectlongTerm();
	
	Gson gson = new Gson();
	//System.out.println(gson.toJson(feedData));
	feeds = gson.toJson(feedData);

	}

	catch (Exception e)
	{
	System.out.println("Exception Error"); //Console 
	}
	return feeds;
	}

	
	

	@GET
	@Path("/nsqfCourses")
	@Produces("application/json")
	public String feed6()
	{
	String feeds = null;
	try 
	{
	ArrayList<Feed> feedData = null;
	String connectionURL = "jdbc:mysql://localhost:3306/hackcbs";
	String username = "root";
	String userPass = "A23690108";
	
	Data data = new Data(connectionURL,username,userPass);
	feedData = (ArrayList<Feed>) data.nsqf();
	
	Gson gson = new Gson();
	//System.out.println(gson.toJson(feedData));
	feeds = gson.toJson(feedData);

	}

	catch (Exception e)
	{
	System.out.println("Exception Error"); //Console 
	}
	return feeds;
	}
	
	
	

	@GET
	@Path("/north")
	@Produces("application/json")
	public String feed7()
	{
	String feeds = null;
	try 
	{
	ArrayList<Feed> feedData = null;
	String connectionURL = "jdbc:mysql://localhost:3306/hackcbs";
	String username = "root";
	String userPass = "A23690108";
	
	Data data = new Data(connectionURL,username,userPass);
	feedData = (ArrayList<Feed>) data.north();
	
	Gson gson = new Gson();
	//System.out.println(gson.toJson(feedData));
	feeds = gson.toJson(feedData);

	}

	catch (Exception e)
	{
	System.out.println("Exception Error"); //Console 
	}
	return feeds;
	}
	
	
	
	

	@GET
	@Path("/east")
	@Produces("application/json")
	public String feed8()
	{
	String feeds = null;
	try 
	{
	ArrayList<Feed> feedData = null;
	String connectionURL = "jdbc:mysql://localhost:3306/hackcbs";
	String username = "root";
	String userPass = "A23690108";
	
	Data data = new Data(connectionURL,username,userPass);
	feedData = (ArrayList<Feed>) data.east();
	
	Gson gson = new Gson();
	//System.out.println(gson.toJson(feedData));
	feeds = gson.toJson(feedData);

	}

	catch (Exception e)
	{
	System.out.println("Exception Error"); //Console 
	}
	return feeds;
	}
	
	
	

	@GET
	@Path("/south")
	@Produces("application/json")
	public String feed9()
	{
	String feeds = null;
	try 
	{
	ArrayList<Feed> feedData = null;
	String connectionURL = "jdbc:mysql://localhost:3306/hackcbs";
	String username = "root";
	String userPass = "A23690108";
	
	Data data = new Data(connectionURL,username,userPass);
	feedData = (ArrayList<Feed>) data.south();
	
	Gson gson = new Gson();
	//System.out.println(gson.toJson(feedData));
	feeds = gson.toJson(feedData);

	}

	catch (Exception e)
	{
	System.out.println("Exception Error"); //Console 
	}
	return feeds;
	}
	
	
	

	@GET
	@Path("/west")
	@Produces("application/json")
	public String feed10()
	{
	String feeds = null;
	try 
	{
	ArrayList<Feed> feedData = null;
	String connectionURL = "jdbc:mysql://localhost:3306/hackcbs";
	String username = "root";
	String userPass = "A23690108";
	
	Data data = new Data(connectionURL,username,userPass);
	feedData = (ArrayList<Feed>) data.west();
	
	Gson gson = new Gson();
	//System.out.println(gson.toJson(feedData));
	feeds = gson.toJson(feedData);

	}

	catch (Exception e)
	{
	System.out.println("Exception Error"); //Console 
	}
	return feeds;
	}
	
	

	@GET
	@Path("/northeast")
	@Produces("application/json")
	public String feed11()
	{
	String feeds = null;
	try 
	{
	ArrayList<Feed> feedData = null;
	String connectionURL = "jdbc:mysql://localhost:3306/hackcbs";
	String username = "root";
	String userPass = "A23690108";
	
	Data data = new Data(connectionURL,username,userPass);
	feedData = (ArrayList<Feed>) data.northeast();
	
	Gson gson = new Gson();
	//System.out.println(gson.toJson(feedData));
	feeds = gson.toJson(feedData);

	}

	catch (Exception e)
	{
	System.out.println("Exception Error"); //Console 
	}
	return feeds;
	}
	
	}