

public interface StudentService {
    void createStudent(Student student);
    Student findStudentById(int id);
    void displayStudent(Student student);
    void createStudent(String firstName, String lastName, String id);
    Student getStudentById(String id);
	void createStudent(String firstName, String lastName, Integer id);
}
