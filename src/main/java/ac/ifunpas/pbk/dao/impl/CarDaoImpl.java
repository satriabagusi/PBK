package ac.ifunpas.pbk.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ac.ifunpas.pbk.pojo.Car;

public class CarDaoImpl extends BaseDao{
	public boolean saveCar(Car car) throws SQLException {
		Connection connection = getConnection();
		Statement statement = connection.createStatement();
		String sql = "INSERT INTO car (id, year, brand, color) VALUES ('"+car.getId()+"', " + 
				+ car.getYear()+", " 
				+ "'"+car.getBrand()+"', " 
				+ "'"+car.getColor()+"')";
		if(statement.executeUpdate(sql) > 0) {
			return true;
		}
		return false;
	}
	
	
	public List<Car> getListCar() throws SQLException{
		List<Car> listCar = new ArrayList<Car>();
		Connection connection = getConnection();
		Statement statement = connection.createStatement();
		String sql = "SELECT * FROM car";
		ResultSet rs = statement.executeQuery(sql);
		while (rs.next()) {
			Car car = new Car();
			car.setId(rs.getString("id"));
			car.setYear(rs.getInt("year"));
			car.setBrand(rs.getString("brand"));
			car.setColor(rs.getString("color"));
			listCar.add(car);			
		}
		
		return listCar;
	}
}
