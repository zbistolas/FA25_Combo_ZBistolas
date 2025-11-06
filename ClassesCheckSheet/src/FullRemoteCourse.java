public class FullRemoteCourse extends OnlineCourse {
	private String emailContact;

	public FullRemoteCourse() {
		super();
		emailContact = "";
	}

	public FullRemoteCourse(String courseNumber, int numStudents, int maxStudents, int credits, String emailContact) {
		super(courseNumber, numStudents, maxStudents, credits);
		this.emailContact = emailContact;
	}

	public String getEmailContact() {
		return emailContact;
	}

	public void setEmailContact(String emailContact) {
		this.emailContact = emailContact;
	}

	public String contactInfo() {
		return "Email contact: " + emailContact;
	}

	@Override
	public String toString() {
		return "Course Number: " + super.getCourseNumber() + "\nNumber of Students: " + super.getNumStudents()
				+ "\nMax Students: " + super.getMaxStudents() + "\nCredits: " + super.getCredits() + "\nEmail Contact: "
				+ emailContact;
	}
}