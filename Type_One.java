import java.sql.*;
public class Type_One
{
    public static void main(String[] args) 
    {
        try
        {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con= DriverManager.getConnection("jdbc:odbc:vivek_104");
            Statement s=con.createStatement();
            String query="select * from student";
            s.executeQuery(query);
            ResultSet rs= s.getResultSet();
            while(rs.next())
            {
                System.out.println("FirstName : "+rs.getString(2));
            }
            s.close();
            con.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception "+e);
        }   
    }
}