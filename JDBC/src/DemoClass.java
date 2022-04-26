import java.sql.*;

public class DemoClass {
/*
 * 
 * Steps:
 * 1. Import  ---> java.sql
 * 2. Load and register the driver
 * 3. Create Connection
 * 4. Create Statement
 * 5. Execute the query
 * 6. Process the result
 * 7. Close
 * 
 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String userName = "hr";
		String pass = "hr";
		String query = "select * from departments ";
		
		
		 
		try(
				Connection con = DriverManager.getConnection(url,userName,pass);
				Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
				ResultSet rs = stmt.executeQuery(query);
				) //TRY with resources --> JAVA 7 and above
		{
			
			while(rs.next()) {
				StringBuffer sb = new StringBuffer();
				sb.append("Department ID: "+rs.getString("department_id"));
				sb.append(" Name: "+rs.getString("department_name"));
				System.out.println(sb.toString());
			}
			
			System.out.println("Total Number of rows: "+rs.getRow());
		}
		catch (Exception e) {
			System.err.println(e);
		}
//		Statement st = con.createStatement();
//		ResultSet rs = st.executeQuery(query);
//		
//		rs.next();
//		String result = rs.getString("department_name");
//		
//		System.out.println(result);
//		st.close();
//		con.close();
		
	}

}
