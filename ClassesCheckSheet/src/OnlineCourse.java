public class OnlineCourse extends Course {

    
    public OnlineCourse() {
        super();
    }

   
    public OnlineCourse(String courseNumber, int numStudents, int maxStudents, int credits) {
        super(courseNumber, numStudents, maxStudents, credits);
    }

   
   

    @Override
    public String toString() {
        return "Course Number: " + super.getCourseNumber() +
               "\nNumber of Students: " + super.getNumStudents() +
               "\nMax Students: " + super.getMaxStudents() +
               "\nCredits: " + super.getCredits();
    }
}

