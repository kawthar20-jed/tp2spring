import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    
    @Bean
    public StudentService studentService() {
        return new StudentServiceImpl(studentRepository());
    }

    @Bean
    public StudentRepository studentRepository() {
        return new InMemoryStudentRepository();
    }
}
