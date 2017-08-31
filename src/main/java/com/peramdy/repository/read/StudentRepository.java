package com.peramdy.repository.read;

import com.peramdy.entity.read.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by peramdy on 2017/8/29.
 */
@Repository(value = "studentRepositoryR")
public interface StudentRepository extends JpaRepository<Student, Integer>, JpaSpecificationExecutor<Student> {

    @Query(value = "SELECT s.stuName FROM student s WHERE s.id=:stuId", nativeQuery = true)
    String queryStuName(@Param("stuId") Integer stuId);

}
