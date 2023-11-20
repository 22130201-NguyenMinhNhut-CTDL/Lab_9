package Task_1;

import java.util.List;

public class Course {
	private String id;
	private String title;
	private String type;
	private String lecture;
	private List<Student> students;

	public Course(String id, String title, String type, String lecture, List<Student> students) {
		super();
		this.id = id;
		this.title = title;
		this.type = type;
		this.lecture = lecture;
		this.students = students;
	}

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLecture() {
		return lecture;
	}

	public void setLecture(String lecture) {
		this.lecture = lecture;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public int getNumberOfStudents() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", type=" + type + ", lecture=" + lecture + ", students="
				+ students + "]";
	}

}
