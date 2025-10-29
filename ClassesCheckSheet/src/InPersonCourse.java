public class InPersonCourse extends Course {
	private String roomNumber;

	public InPersonCourse() {
		super();
		roomNumber = "";
	}

	public InPersonCourse(String courseNumber, int numStudents, int maxStudents, int credits, String roomNumber) {
		super(courseNumber, numStudents, maxStudents, credits);
		this.roomNumber = roomNumber;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	@Override
	public String toString() {
		return "Course Number: " + super.getCourseNumber() + "\nNumber of Students: " + super.getNumStudents()
				+ "\nMax Students: " + super.getMaxStudents() + "\nCredits: " + super.getCredits() + "\nRoom Number: "
				+ roomNumber;
	}
}