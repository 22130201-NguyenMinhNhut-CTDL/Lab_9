package Task_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

public class Faculty {
	private String name;
	private String address;
	private List<Course> courses = new ArrayList<>();
	private List<Course> course;

	public Faculty(String name, String address, List<Course> courses) {
		super();
		this.name = name;
		this.address = address;
		this.courses = courses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Course> getCourse() {
		return getCourse();
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Faculty [name=" + name + ", address=" + address + ", courses=" + courses + "]";
	}

	public Course getMaxPracticalCourse() {
		Course maxPracticalCourse = null;
		int maxStudentCount = 0;

		for (Course course : course) {
			if (course.getType().equals("thực hành")) {
				int studentCount = course.getStudents().size();
				if (studentCount > maxStudentCount) {
					maxStudentCount = studentCount;
					maxPracticalCourse = course;
				}
			}
		}

		return maxPracticalCourse;
	}

	public Map<Integer, List<Student>> groupStudentsByYear() {
		Map<Integer, List<Student>> studentsByYear = new HashMap<>();

		for (Course course : course) {
			for (Student student : course.getStudents()) {
				int year = student.getYear();
				List<Student> students = studentsByYear.getOrDefault(year, new ArrayList<>());
				students.add(student);
				studentsByYear.put(year, students);
			}
		}

		return studentsByYear;
	}

	public Set<Course> filterCourses(String type) {
		Set<Course> filteredCourses = new TreeSet<>(Comparator.comparingInt(course -> -course.getStudents().size()));

		for (Course course : course) {
			if (course.getType().equals(type)) {
				filteredCourses.add(course);
			}
		}

		return filteredCourses;
	}
}

