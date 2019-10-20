package Data_Access;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

import model.Feed;
import java.util.Date;
//import java.util.DateFormat;
//import java.util.SimpleDateFormat;
import java.util.Calendar;


public class Data {
	

    private Connection jdbcConnection;
     
    public Data(String jdbcURL, String jdbcUsername, String jdbcPassword) {
       
  try {
        if (jdbcConnection == null ) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            }
            catch (ClassNotFoundException e) {
               e.printStackTrace();
            }
            jdbcConnection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        
           }
    }
  catch(SQLException e) {
e.printStackTrace();  }
    }
  
    protected void disconnect() throws SQLException {
        if (jdbcConnection != null && !jdbcConnection.isClosed()) {
            jdbcConnection.close();
        }
    }
     
     
    public List<Feed> shortTerm() throws SQLException {
        List<Feed> listCourse = new ArrayList<>();
         
        String sql = "SELECT * FROM s";
         
        
         
        java.sql.PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();
         
      //  float billAmt = 1;
     // 
        while (resultSet.next()) {
       
        	
        	Feed feed = new Feed();
        	double  billAmt = 0.5/50;
        	
        	//Date cal=dat().getTime();
               billAmt = billAmt * Integer.parseInt((resultSet.getString("CourseFee")));
              // billAmt = int (resultSet.getString("CourseFee");
              
        	feed.setCourseId(resultSet.getString("CourseId"));
    		feed.setCourseName(resultSet.getString("CourseName"));
    		feed.setdetails(resultSet.getString("Details"));
    		feed.setduration(resultSet.getString("Duration"));
    		feed.setfee(Double.toString((billAmt)));
    		feed.seteligibility(resultSet.getString("Eligibility"));
    		feed.setImageUrl(resultSet.getString("imageUrl"));
    		
             
            listCourse.add(feed);
        }
         
        resultSet.close();
        statement.close();
         
        disconnect();
         
        return listCourse;
    }
    
    public List<Feed> longTerm() throws SQLException {
        List<Feed> listCourse = new ArrayList<>();
         
        String sql = "SELECT * FROM l";
         
     
         
        java.sql.PreparedStatement statement =jdbcConnection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();
       // DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        int BillingAmt = 0;
        
        while (resultSet.next()) {
        	
        	Feed feed = new Feed();
    		feed.setCourseId(resultSet.getString("CourseId"));
    		feed.setCourseName(resultSet.getString("CourseName"));
    		feed.setdetails(resultSet.getString("Details"));
    		feed.setduration(resultSet.getString("Duration"));
    		feed.setfee(resultSet.getString("CourseFee"));
    		feed.seteligibility(resultSet.getString("Eligibility"));
    		feed.setImageUrl(resultSet.getString("ImageUrl"));
    		
            listCourse.add(feed);
        }
         
        resultSet.close();
        statement.close();
         
        disconnect();
         
        return listCourse;
    }
    
    public List<Feed> projectshortTerm() throws SQLException {
        List<Feed> listCourse = new ArrayList<>();
         
        String sql = "SELECT * FROM sp";
         
        //connect();
         
        java.sql.PreparedStatement statement =  jdbcConnection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();
         
        while (resultSet.next()) {
        	
        	Feed feed = new Feed();
        	feed.setCourseId(resultSet.getString("CourseId"));
    		feed.setCourseName(resultSet.getString("CourseName"));
    		feed.setdetails("null");
    		feed.setduration(resultSet.getString("Duration"));
    		feed.setfee(resultSet.getString("CourseFee"));
    	feed.seteligibility(resultSet.getString("Content"));

		feed.setImageUrl(resultSet.getString("ImageUrl"));
    		              
            listCourse.add(feed);
        }
         
        resultSet.close();
        statement.close();
         
        disconnect();
         
        return listCourse;
    }
     
    
    public List<Feed> projectlongTerm() throws SQLException {
        List<Feed> listCourse = new ArrayList<>();
         
        String sql = "SELECT * FROM lp";
         
     //   connect();
         
        java.sql.PreparedStatement statement =  jdbcConnection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();
         
        while (resultSet.next()) {
        	
        	Feed feed = new Feed();
    		feed.setCourseId(resultSet.getString("CourseId"));
    		feed.setCourseName(resultSet.getString("CourseName"));
    		feed.setdetails("null");
    		feed.setduration(resultSet.getString("Duration"));
    		feed.setfee(resultSet.getString("CourseFee"));
    	feed.seteligibility(resultSet.getString("Content"));

		feed.setImageUrl(resultSet.getString("ImageUrl"));
            listCourse.add(feed);
        }
         
        resultSet.close();
        statement.close();
         
        disconnect();
         
        return listCourse;
    }
    
    public List<Feed> nsqf() throws SQLException {
        List<Feed> listCourse = new ArrayList<>();
         
        String sql = "SELECT * FROM lp";
         
        //connect();
         
        java.sql.PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();
         
        while (resultSet.next()) {
        	
        	Feed feed = new Feed();
    		feed.setCourseId(resultSet.getString("CourseId"));
    		feed.setCourseName(resultSet.getString("CourseName"));
    		
             
            listCourse.add(feed);
        }
         
        resultSet.close();
        statement.close();
         
        disconnect();
         
        return listCourse;
    }
    
    public List<Feed> east() throws SQLException {
        List<Feed> listCourse = new ArrayList<>();
         
        String sql = "SELECT * FROM Mea";
         
      //  connect();
         
        java.sql.PreparedStatement statement =  jdbcConnection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();
         
        while (resultSet.next()) {
        	
        	Feed feed = new Feed();
        //	feed.setCourseId(resultSet.getString("CourseId"));
    		feed.setCourseName(resultSet.getString("CourseName"));
    		feed.setdetails("null");
    		feed.setduration(resultSet.getString("Duration"));
    		feed.setfee(resultSet.getString("CourseFee"));
    	feed.seteligibility(resultSet.getString("Content"));

		feed.setImageUrl(resultSet.getString("ImageUrl"));
            listCourse.add(feed);
        }
         
        resultSet.close();
        statement.close();
         
        disconnect();
         
        return listCourse;
    }



public List<Feed> west() throws SQLException {
    List<Feed> listCourse = new ArrayList<>();
     
    String sql = "SELECT * FROM west";
     
  //  connect();
     
    java.sql.PreparedStatement statement =  jdbcConnection.prepareStatement(sql);
    ResultSet resultSet = statement.executeQuery();
     
    while (resultSet.next()) {
    	
    	Feed feed = new Feed();
		feed.setCourseId(resultSet.getString("C_id"));
		
		feed.setplace(resultSet.getString("Place"));
		
		feed.setweblink(resultSet.getString("web_link"));
         
        listCourse.add(feed);
    }
     
    resultSet.close();
    statement.close();
     
    disconnect();
     
    return listCourse;
}

public List<Feed> north() throws SQLException {
    List<Feed> listCourse = new ArrayList<>();
     
    String sql = "SELECT * FROM north";
     
  //  connect();
     
    java.sql.PreparedStatement statement =  jdbcConnection.prepareStatement(sql);
    ResultSet resultSet = statement.executeQuery();
     
    while (resultSet.next()) {
    	
    	Feed feed = new Feed();
		feed.setCourseId(resultSet.getString("C_id"));
		
		feed.setplace(resultSet.getString("Place"));
		
		feed.setweblink(resultSet.getString("Web_ink"));
         
        listCourse.add(feed);
    }
     
    resultSet.close();
    statement.close();
     
    disconnect();
     
    return listCourse;
}

public List<Feed> northeast() throws SQLException {
    List<Feed> listCourse = new ArrayList<>();
     
    String sql = "SELECT * FROM northeast";
     
  //  connect();
     
    java.sql.PreparedStatement statement =  jdbcConnection.prepareStatement(sql);
    ResultSet resultSet = statement.executeQuery();
     
    while (resultSet.next()) {
    	
    	Feed feed = new Feed();
		feed.setCourseId(resultSet.getString("C_id"));
		
		feed.setplace(resultSet.getString("Place"));
		
		feed.setweblink(resultSet.getString("web_link"));
         
        listCourse.add(feed);
    }
     
    resultSet.close();
    statement.close();
     
    disconnect();
     
    return listCourse;
}

public List<Feed> south() throws SQLException {
    List<Feed> listCourse = new ArrayList<>();
     
    String sql = "SELECT * FROM south";
     
   // connect();
     
    java.sql.PreparedStatement statement =  jdbcConnection.prepareStatement(sql);
    ResultSet resultSet = statement.executeQuery();
     
    while (resultSet.next()) {
    	
    	Feed feed = new Feed();
		feed.setCourseId(resultSet.getString("C_id"));
		
		feed.setplace(resultSet.getString("Place"));
		
		feed.setweblink(resultSet.getString("web_link"));
         
        listCourse.add(feed);
    }
     
    resultSet.close();
    statement.close();
     
    disconnect();
     
    return listCourse;
}


 Calendar dat() {
	//DateFormat df=new SimpleDateFormat("dd/MM/yy HH:")
Calendar obj=Calendar.getInstance();
System.out.println(obj.getTime());
return obj;
}



}




