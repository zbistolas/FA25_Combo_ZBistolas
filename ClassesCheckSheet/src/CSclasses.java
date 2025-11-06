import java.util.ArrayList;
import java.util.Scanner;

public class CSclasses {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<Course> courseList = new ArrayList<>();

		System.out.println("Enter number of courses you want to add: ");
		int numCourses = input.nextInt();
		input.nextLine(); // consume newline

		for (int i = 0; i < numCourses; i++) {
			System.out.println("\nEnter course number:");
			String courseNum = input.nextLine();

			System.out.println("Enter number of students:");
			int numStudents = input.nextInt();

			System.out.println("Enter max students:");
			int maxStudents = input.nextInt();

			System.out.println("Enter credit hours:");
			int credits = input.nextInt();
			input.nextLine();

			System.out.println("Is this course:");
			System.out.println("1. In-Person");
			System.out.println("2. Full Remote");
			System.out.println("3. Real-Time Remote");
			int type = input.nextInt();
			input.nextLine();

			Course newCourse;

			if (type == 1) {
				System.out.println("Enter classroom location:");
				String room = input.nextLine();
				newCourse = new InPersonCourse(courseNum, numStudents, maxStudents, credits, room);
			} else if (type == 2) {
				System.out.println("Enter instructor email:");
				String email = input.nextLine();
				newCourse = new FullRemoteCourse(courseNum, numStudents, maxStudents, credits, email);
			} else {
				System.out.println("Enter meeting link:");
				String link = input.nextLine();
				newCourse = new RealTimeRemoteCourse(courseNum, numStudents, maxStudents, credits, link);
			}

			courseList.add(newCourse);
		}

		System.out.println("\nCOURSE LIST (toString)");
		for (Course c : courseList) {
			System.out.println(c.toString());
			System.out.println();
		}

		System.out.println("COURSE LIST (no toString)");
		for (Course c : courseList) {
			System.out.println("Course Number: " + c.courseNumber);
			System.out.println("Students: " + c.numStudents);
			System.out.println("Max Students: " + c.maxStudents);
			System.out.println("Credits: " + c.credits);
			System.out.println();
		}

	}
}