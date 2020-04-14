package ac.ifunpas.pbk.bean.table;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import ac.ifunpas.pbk.bean.BaseBean;
import ac.ifunpas.pbk.dao.impl.CarDaoImpl;
import ac.ifunpas.pbk.pojo.Car;

@ManagedBean(name = "dtBasicView")
@SessionScoped
public class DtBasicView extends BaseBean {
	private List<Car> listCar;
	private Car car;
	
	@PostConstruct public void init(){
		car = new Car();
		try {
			listCar =   new CarDaoImpl().getListCar();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void add(){
		try {
			if(new CarDaoImpl().saveCar(car)) {
				messageInfo("Input Sukses");
				listCar.add(car);
				reset();
			}
			else {
				messageError("data gagal diinput");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Car> getListCar() {
		return listCar;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	
	private void reset() {
		car = new Car();
	}
}
