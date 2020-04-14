package ac.ifunpas.pbk.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuModel;



@ManagedBean(name = "menuModelBean")
@SessionScoped
public class MenuModelBean extends BaseBean implements Serializable{



	private MenuModel menuModel;

	public MenuModel getMenuModel() {
		return menuModel;
	}

	@PostConstruct
	public void init() {
		menuModel = new DefaultMenuModel();

		doListMenu();
	}



	private void doListMenu() {
		
		DefaultMenuItem beranda = new DefaultMenuItem();
		beranda.setUrl("/PBK/ui/home.xhtml");
		beranda.setValue("Beranda");
		beranda.setIcon("fa fa-server");
		
		
		DefaultSubMenu tableSubMenu = new DefaultSubMenu();
		tableSubMenu.setLabel("Parkir");
		
		DefaultMenuItem tableBasicItem = new DefaultMenuItem();
		tableBasicItem.setUrl("/PBK/ui/parkir/tambah-parkir.xhtml");
		tableBasicItem.setValue("Tambah Parkir");
		tableBasicItem.setIcon("fa fa-plus");
		tableSubMenu.addElement(tableBasicItem);
		
		DefaultMenuItem tableSelectionItem = new DefaultMenuItem();
		tableSelectionItem.setUrl("/PBK/ui/parkir/list-parkir.xhtml");
		tableSelectionItem.setValue("Riwayat Parkir");
		tableSelectionItem.setIcon("fa fa-list");
		tableSubMenu.addElement(tableSelectionItem);
		
		menuModel.addElement(beranda);
		menuModel.addElement(tableSubMenu);

	}

	public void setMenuModel(MenuModel menuModel) {
		this.menuModel = menuModel;
	}
	
	
}
