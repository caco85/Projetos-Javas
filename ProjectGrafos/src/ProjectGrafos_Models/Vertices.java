package ProjectGrafos_Models;

public class Vertices {
	int id;
	String name;
	
	public Vertices(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	private int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Vertices [id=" + id + ", name=" + name + "]";
	}
	
}
