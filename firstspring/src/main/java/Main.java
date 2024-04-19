import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Create Spring application context using the configuration class
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        // Retrieve StudentService bean from the context
        StudentService studentService = context.getBean(StudentService.class);

        // Create a new student
        Student student1 = new Student("John", "Doe", 1);
        studentService.createStudent(student1);
        
        // Print the student object
        System.out.println(student1);

        // Retrieve a student by ID and display it
        Student retrievedStudent = studentService.findStudentById(1);
        if (retrievedStudent != null) {
            System.out.println("Retrieved Student: " + retrievedStudent);
        } else {
            System.out.println("Student not found.");
        }
    }
}
