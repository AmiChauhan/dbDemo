import java.sql.*;
import java.sql.*;

public class DbDemo
{

 public static void main(String args[]){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/Java","root","");
//here sonoo is database name, root is username and password
                PreparedStatement stmt=con.prepareStatement("insert into amidetails values(?,?)");
                stmt.setString(1,"ami");//1 specifies the first parameter in the query
                stmt.setInt(2,9898989);

                int i=stmt.executeUpdate();
                System.out.println(i+" records inserted");
//                Statement stmt=con.createStatement();
//                ResultSet rs=stmt.executeQuery("select * from amidetails");
//                while(rs.next())
//                    System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
//                con.close();
            }catch(Exception e){ System.out.println(e);}
        }
    }




