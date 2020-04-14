package ac.ifunpas.pbk.listparkir;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import ac.ifunpas.pbk.dao.impl.BaseDao;
import ac.ifunpas.pbk.dao.impl.ParkirDaoImpl;
import ac.ifunpas.pbk.pojo.Parkir;

@Named("dtSortParkir")
@ViewScoped
public class DtSortParkir extends BaseDao {
	
	private List<Parkir> listParkir1;
	
	@Inject
	private ParkirDaoImpl parkirDao;

	@PostConstruct public void init()  {
		parkirDao = new ParkirDaoImpl();
		try {
			listParkir1 =   new ParkirDaoImpl().getListParkir();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void setParkirDao(ParkirDaoImpl parkirDao) {
		this.parkirDao = parkirDao;
	}

	public List<Parkir> getListParkir1() {
		return listParkir1;
	}

	public void setListParkir1(List<Parkir> listParkir1) {
		this.listParkir1 = listParkir1;
	}

	
}
