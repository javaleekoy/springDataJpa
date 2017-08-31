import com.peramdy.dto.StudentDto;
import com.peramdy.repository.read.StudentRepository;
import com.peramdy.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by peramdy on 2017/8/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring/application.xml"})
@WebAppConfiguration
public class MyTest {

    @Autowired
    private StudentService studentService;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private com.peramdy.repository.write.StudentRepository studentRepositoryW;

    @Test
    public void testOne() {
        System.out.println("//////////");
    }


    @Test
    public void testTwo() {
        StudentDto studentDto = studentService.queryStuInfoW(11);
        if (studentDto != null)
            System.out.println(studentDto.getClassId());
    }

    @Test
    public void testThree() {
        String stuName = studentRepository.queryStuName(1);
        System.out.println(stuName);
    }

    @Test
    public void testFour() {
        int stuCount = studentRepositoryW.queryStuCount(11);
        System.out.println(stuCount);
    }

}
