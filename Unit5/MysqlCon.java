package Unit5;

import java.sql.*;  
class MysqlCon{  
public static void main(String args[]){  
try{  
//Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/ravi","root","");  

//127.0.0.1
//Sample database
//here dbname is database name, root is username and password  
Statement stmt=con.createStatement();  
//stmt.execute("create table emp(empId varchar(10),empName varchar(50),empAddress varchar(100));");
stmt.execute("insert into emp values(123,'Harish','Tirupati')");
ResultSet rs=stmt.executeQuery("select * from emp");  
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  