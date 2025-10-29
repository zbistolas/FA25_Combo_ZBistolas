public class RealTimeRemoteCourse extends OnlineCourse {
	private String zoomInfo;

	public RealTimeRemoteCourse() {
		super();
		zoomInfo = "";
	}

	public RealTimeRemoteCourse(String courseNumber, int numStudents, int maxStudents, int credits, String zoomInfo) {
		super(courseNumber, numStudents, maxStudents, credits);
		this.zoomInfo = zoomInfo;
	}

	public String getZoomInfo() {
		return zoomInfo;
	}

	public void setZoomInfo(String zoomInfo) {
		this.zoomInfo = zoomInfo;
	}

	@Override
	public String toString() {
		return "Course Number: " + super.getCourseNumber() + "\nNumber of Students: " + super.getNumStudents()
				+ "\nMax Students: " + super.getMaxStudents() + "\nCredits: " + super.getCredits() + "\nZoom Info: "
				+ zoomInfo;
	}
}