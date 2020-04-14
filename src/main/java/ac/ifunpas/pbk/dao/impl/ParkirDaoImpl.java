package ac.ifunpas.pbk.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

import ac.ifunpas.pbk.pojo.Parkir;

public class ParkirDaoImpl extends BaseDao {
	
	public boolean saveParkir(Parkir parkir) throws SQLException {
		int a = parkir.getKode_karcis();
		String b = parkir.getPlat_nomor();
		String c = parkir.getJenis_parkir();
		String d = parkir.getTgl_masuk();
		
		Connection connection = getConnection();
		Statement statement = connection.createStatement();
		String sql = "INSERT INTO rjpark.parkir2 (kode_karcis, plat_nomor, jenis_parkir, tgl_masuk) VALUES (' "+a+","+b+","+c+","+d+" ')";
		if(statement.executeUpdate(sql) > 0) {
			return true;
		}
		return false;
	}
	
	
	public List<Parkir> getListParkir() throws SQLException{
		List<Parkir> listParkir = new ArrayList<Parkir>();
		Connection connection = getConnection();
		Statement statement = connection.createStatement();
		String sql = "SELECT * FROM rjpark.parkir2";
		ResultSet rs = statement.executeQuery(sql);
		
		while(rs.next()){
			System.out.println("Benar sekali");
			Parkir parkir = new Parkir();
			parkir.setKode_karcis(rs.getInt("kode_karcis"));
			parkir.setPlat_nomor(rs.getString("plat_nomor"));
			parkir.setJenis_parkir(rs.getString("jenis_parkir"));
			parkir.setTgl_masuk(rs.getString("tgl_masuk"));
		}
		
		return listParkir;
	}
	
}
