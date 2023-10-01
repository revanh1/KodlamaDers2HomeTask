public class Main {
    public static void main(String[] args) {
        Course course1 = new Course(1, "java", 5500, "engin demirog");
        Course course2 = new Course(2, "python", 6000, "revan haciyev");

        Course[] courses = {course1, course2};

        CourseManager courseManager = new CourseManager();

        for(Course course: courses){
            courseManager.courseAdd(course);
        }
    }
}