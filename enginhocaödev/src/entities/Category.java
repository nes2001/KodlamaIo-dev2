package entities;

public class Category implements Entity{

	private int id;
	private String name;
	private int kursSayisi;
	
	
	
	public Category(int id, String name, int kursSayisi) {
		this.id = id;
		this.name = name;
		this.kursSayisi = kursSayisi;
	}
	
	public Category(int id,String name) {
		this.id=id;
		this.name=name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKursSayisi() {
		return kursSayisi;
	}

	public void setKursSayisi(int kursSayisi) {
		this.kursSayisi = kursSayisi;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", kursSayisi=" + kursSayisi + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
