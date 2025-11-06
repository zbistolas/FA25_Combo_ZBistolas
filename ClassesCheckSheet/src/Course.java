
public class Course {
	String courseNumber;
	public int numStudents;
	public int maxStudents;
	public double credits;
	
	
	public Course() {
		this.courseNumber = " ";
		this.numStudents = 0;
		this.maxStudents = 0;
		this.credits = 0.0;
	}


	public Course(String courseNumber, int numStudents, int maxStudents, double credits) {
		super();
		this.courseNumber = courseNumber;
		this.numStudents = numStudents;
		this.maxStudents = maxStudents;
		this.credits = credits;
	}


	public String getCourseNumber() {
		return courseNumber;
	}


	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}


	public int getNumStudents() {
		return numStudents;
	}


	public void setNumStudents(int numStudents) {
		this.numStudents = numStudents;
	}


	public int getMaxStudents() {
		return maxStudents;
	}


	public void setMaxStudents(int maxStudents) {
		this.maxStudents = maxStudents;
	}


	public double getCredits() {
		return credits;
	}


	public void setCredits(double credits) {
		this.credits = credits;
	}


	@Override
	public String toString() {
		return "Course Number: " + courseNumber + "\nNumber of Students: " + numStudents + "\nMax Students: " + maxStudents
				+ "\nCredits: " + credits;
	}
	
	
	
	
	
	
}
