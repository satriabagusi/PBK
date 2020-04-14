package ac.ifunpas.pbk.listparkir;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import ac.ifunpas.pbk.bean.BaseBean;
import ac.ifunpas.pbk.dao.impl.ParkirDaoImpl;

import ac.ifunpas.pbk.pojo.Parkir;

@ManagedBean(name = "dtParkir")
@SessionScoped
public class DtParkir extends BaseBean implements Serializable {
	
	public DtParkir() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	private List<Parkir> listParkir;
	private Parkir parkir;
	
	@PostConstruct public void init(){
		parkir = new Parkir();
		try {
			listParkir = new ParkirDaoImpl().getListParkir();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void add() {
		try {
			if(new ParkirDaoImpl().saveParkir(parkir)) {
				messageInfo("Berhasil menambahkan data Parkir !");
				listParkir.add(parkir);
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

	public List<Parkir> getListParkir() {
		return listParkir;
	}

	public Parkir getParkir() {
		return parkir;
	}

	public void setParkir(Parkir parkir) {
		this.parkir = parkir;
	}
	
	private void reset() {
		parkir = new Parkir();
	}
	
}
