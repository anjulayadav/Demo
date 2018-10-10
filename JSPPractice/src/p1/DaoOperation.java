package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DaoOperation {

	
	public boolean checkLogin(String unm,String pwd){
		Connection con=ConnectionProvider.getConnection();
		try {
			PreparedStatement ps=con.prepareStatement("select * from HospitalLogin where Hospital_UserName=? and Hospital_Password=?");
			ps.setString(1, unm);
			ps.setString(2, pwd);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				return true;
			}
			else{
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}//end checkLogin
	
	public ArrayList reterive(String username){
		ArrayList<HospitalSchedule> array=new ArrayList<HospitalSchedule>();
		Connection con=ConnectionProvider.getConnection();
		try {
			PreparedStatement ps=con.prepareStatement("select * from HospitalSchedule where Name=?");
			ps.setString(1, username);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				HospitalSchedule hs=new HospitalSchedule(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
				 array.add(hs);
			}
			return array;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
}
