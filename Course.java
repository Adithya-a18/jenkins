

class Course {
    // Attributes of the Course class
    private String courseName;
    private String courseCode;
    private ArrayList<String> enrolledStudents;

    // Constructor to initialize the Course object
    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.enrolledStudents = new ArrayList<>();
    }

    // Method to enroll a student
    public void enrollStudent(String studentName) {
        enrolledStudents.add(studentName);
    }

    // Method to display course information
    public void displayCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
        System.out.println("Enrolled Students: ");
        for (String student : enrolledStudents) {
            System.out.println("- " + student);
        }
    }

    // Getters and Setters for courseName and courseCode (if needed)
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }



    public static void main(String[] args) {
        // Create a course object
        Course javaProgramming = new Course("Java Programming", "CS101");

        // Enroll some students in the course
        javaProgramming.enrollStudent("Alice");
        javaProgramming.enrollStudent("Bob");
        javaProgramming.enrollStudent("Charlie");

        // Display course information
        javaProgramming.displayCourseInfo();
    }
}
