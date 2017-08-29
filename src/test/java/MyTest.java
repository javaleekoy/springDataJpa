import com.peramdy.dto.StudentDto;
import com.peramdy.entity.read.Student;
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

    @Test
    public void testOne() {
        System.out.println("//////////");
    }


    @Test
    public void testTwo() {
        StudentDto studentDto = studentService.queryStudentInfoList(11);
        if (studentDto != null)
            System.out.println(studentDto.getClassId());
    }

}
