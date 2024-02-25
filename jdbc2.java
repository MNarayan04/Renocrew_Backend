import java.sql.*;
class jdbc2{
    public static void main(String args[])
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");


            String url ="jdbc:mysql://localhost3000/jd";
            String usrname = "root";
            String password ="root";



            Connection con=DriverManager.getConnection(url, usrname, password)


            if(con.isClosed()){
                System.out.println("connection is Closed");
            }else{
                System.out.println("connection");
            }
        }
        finally{

        }
    }
}
