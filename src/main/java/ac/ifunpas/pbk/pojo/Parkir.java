package ac.ifunpas.pbk.pojo;

import java.sql.Timestamp;

public class Parkir {
	
	private Integer kode_karcis;
	private String plat_nomor;
	private String jenis_parkir;
	private Integer total_bayar;
	private String tgl_masuk;
	private Timestamp tgl_keluar;
	public Integer getKode_karcis() {
		return kode_karcis;
	}
	public void setKode_karcis(Integer kode_karcis) {
		this.kode_karcis = kode_karcis;
	}
	public String getPlat_nomor() {
		return plat_nomor;
	}
	public void setPlat_nomor(String plat_nomor) {
		this.plat_nomor = plat_nomor;
	}
	public String getJenis_parkir() {
		return jenis_parkir;
	}
	public void setJenis_parkir(String jenis_parkir) {
		this.jenis_parkir = jenis_parkir;
	}
	public Integer getTotal_bayar() {
		return total_bayar;
	}
	public void setTotal_bayar(Integer total_bayar) {
		this.total_bayar = total_bayar;
	}
	public String getTgl_masuk() {
		return tgl_masuk;
	}
	public void setTgl_masuk(String tgl_masuk) {
		this.tgl_masuk = tgl_masuk;
	}
	public Timestamp getTgl_keluar() {
		return tgl_keluar;
	}
	public void setTgl_keluar(Timestamp tgl_keluar) {
		this.tgl_keluar = tgl_keluar;
	}
	
	

}
