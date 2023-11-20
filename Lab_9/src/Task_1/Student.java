package Task_1;

public class Student {
	private String id;
	private String name;
	private int year;

	public Student(String id, String name, int year) {
		super();
		this.id = id;
		this.name = name;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", year=" + year + "]";
	}

	public Integer getYear() {
		// TODO Auto-generated method stub
		return null;
	}

}
