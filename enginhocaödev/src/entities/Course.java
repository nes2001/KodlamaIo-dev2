package entities;

public class Course implements Entity{
	
	private int id;
	private String name;
	private String instructor;
	private String category;
	private int price;
	
	
	public Course(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public Course(int id, String name, String instructor, String category, int price) {
		super();
		this.id = id;
		this.name = name;
		this.instructor = instructor;
		this.category = category;
		this.price = price;
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


	public String getInstructor() {
		return instructor;
	}


	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", instructor=" + instructor + ", category=" + category
				+ ", price=" + price + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
