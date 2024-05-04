package challenges.challenge10;


class Course {

    static int maxCapacity = 20;

    String courseName;
    int enrollments;
    String[] enrolledStudents;

    Course(String courseName) {
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }

    static void setMaxCapacity(int capacity) {
        Course.maxCapacity = capacity;
    }

    void enrolledStudent(String studentName) {
        this.enrolledStudents[enrollments] = studentName;
        enrollments++;
    }

    void unEnrolledStudent(String studentName) {
        System.out.println("student unrolled now.");
    }


}
