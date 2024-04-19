

import java.util.HashMap;
import java.util.Map;

public class InMemoryStudentRepository implements StudentRepository {
    private Map<Integer, Student> students = new HashMap<>();

    @Override
    public void save(Student student) {
        students.put(student.getId(), student);
    }

    @Override
    public Student findById(int id) {
        return students.get(id);
    }
}
