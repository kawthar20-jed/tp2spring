public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void createStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Student findStudentById(int id) {
        return studentRepository.findById(id);
    }

    @Override
    public void displayStudent(Student student) {
        System.out.println(student);
    }

    @Override
    public void createStudent(String firstName, String lastName, Integer id) {
        Student student = new Student(firstName, lastName, id);
        createStudent(student);
    }

    @Override
    public Student getStudentById(String id) {
        // Implement the logic to retrieve a student by ID
        return null;
    }

	@Override
	public void createStudent(String firstName, String lastName, String id) {
		// TODO Auto-generated method stub
		
	}
}
