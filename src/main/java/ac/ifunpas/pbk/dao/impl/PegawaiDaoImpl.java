package ac.ifunpas.pbk.dao.impl;

import ac.ifunpas.pbk.pojo.Pegawai;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class PegawaiDaoImpl extends BaseDao {
	public boolean savePegawai(Pegawai pegawai) throws SQLException{
		Connection connection = getConnection();
		Statement statement = connection.createStatement();
		String sql = "INSERT INTO pegawai VALUES ( '' , ' "+pegawai.getNama()+ "', '"+pegawai.getUsername()+" ', '"+pegawai.getPassword()+"')";
		if(statement.executeUpdate(sql) > 0 ) {
			return true;
		}
		return false;
	}
	

}
