package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import Database.JDBCtul;

public class Dao_Sach implements DAO_Interface<Sach>{
	public static Dao_Sach getInstence() {
		return new Dao_Sach();
	}

	@Override
	public int insert(Sach t) {
		int check = 0;
		try {
			Connection con = JDBCtul.getConnect();
			String sql = "INSERT INTO Sach(id,tenSach,namXuatBan,gia) "+"VALUES(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			 ps.setString(1, t.getId());
			 ps.setString(2,t.getTenSach());
			 ps.setString(3, t.getNamXuatBan());
			 ps.setLong(4, (long) t.getGia());
			 check = ps.executeUpdate();
			 System.out.println("Thuc thi: "+sql);
			 System.out.println(ps);
			 JDBCtul.closeConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}

	@Override
	public int upDate(Sach t) {
		int check = 0;
		try {
			Connection con = JDBCtul.getConnect();
			String sql = "UPDATE Sach " + "SET" +"tenSach=?"+"namXuatBan=?" +"gia=?" + "WHERE ID=?";
			PreparedStatement ps = con.prepareStatement(sql);
			 ps.setString(1, t.getId());
			 ps.setString(2,t.getTenSach());
			 ps.setString(3, t.getNamXuatBan());
			 ps.setLong(4, (long) t.getGia());
			 check = ps.executeUpdate();
			 System.out.println("Thuc thi: "+sql);
			 System.out.println(ps);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}

	@Override
	public int delete(Sach t) {
		int check = 0;
		try {
			Connection con = JDBCtul.getConnect();
			String sql = "DELETE FROM Sach"+"WHERE ID=?";
			PreparedStatement ps = con.prepareStatement(sql);
			 ps.setString(1, t.getId());
			 check = ps.executeUpdate();
			 System.out.println("Thuc thi: "+sql);
			 System.out.println(ps);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	

	@Override
	public ArrayList<Sach> selectAll() {
		ArrayList<Sach> check = new ArrayList<Sach>();
		try {
			Connection con = JDBCtul.getConnect();
			String sql = "SELECT * FROM Sach";
			PreparedStatement ps = con.prepareStatement(sql);
			 ResultSet rs = ps.executeQuery();
			 while(rs.next()) {
				 String ten = rs.getString("ten");
				 String id = rs.getString("id");
				 String namXuatBan = rs.getString("namXuatBan");
				 Double gia = rs.getDouble("gia");
				 Sach sach = new Sach(id, ten, namXuatBan, gia);
				 check.add(sach);
				 }
			 System.out.println("Thuc thi: "+sql);
			 System.out.println(ps);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}

	@Override
	public Sach selectByID(Sach t) {
		Sach check = null;
		Connection con = JDBCtul.getConnect();
		String sql = "SELECT FROM Sach where id=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, t.getId());
			ResultSet rs = ps.executeQuery();
			String id = rs.getString("id");
			String tenSach = rs.getString("tenSach");
			String namXuatBan = rs.getString("namXuatBan");
			Double gia = rs.getDouble("gia");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return check;	
				
	}

	@Override
	public ArrayList<Sach> selectCondition(String condition) {
		ArrayList<Sach> check = new ArrayList<Sach>();
		try {
			Connection con = JDBCtul.getConnect();
			String sql = "SELECT * FROM Sach" + "WHERE" +condition;
			PreparedStatement ps = con.prepareStatement(sql);
			 ResultSet rs = ps.executeQuery();
			 ps.setString(1, condition);
			 while(rs.next()) {
				 String ten = rs.getString("ten");
				 String id = rs.getString("id");
				 String namXuatBan = rs.getString("namXuatBan");
				 Double gia = rs.getDouble("gia");
				 Sach sach = new Sach(id, ten, namXuatBan, gia);
				 check.add(sach);
				 }
			 System.out.println("Thuc thi: "+sql);
			 System.out.println(ps);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}

}
