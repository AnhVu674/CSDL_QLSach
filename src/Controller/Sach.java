package Controller;

public class Sach {
	private String id;
	private String tenSach;
	private String namXuatBan;
	private double gia;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTenSach() {
		return tenSach;
	}

	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}

	public String getNamXuatBan() {
		return namXuatBan;
	}

	public void setNamXuatBan(String namXuatBan) {
		this.namXuatBan = namXuatBan;
	}

	public double getGia() {
		return gia;
	}

	public void setGia(double gia) {
		this.gia = gia;
	}

	public Sach(String id, String tenSach, String namXuatBan, double gia) {
		super();
		this.id = id;
		this.tenSach = tenSach;
		this.namXuatBan = namXuatBan;
		this.gia = gia;
	}

	@Override
	public String toString() {
		return "Sach [id=" + id + ", tenSach=" + tenSach + ", namXuatBan=" + namXuatBan + ", gia=" + gia + "]";
	}
}
