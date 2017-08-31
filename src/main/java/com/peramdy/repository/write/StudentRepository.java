package com.peramdy.repository.write;

import com.peramdy.entity.write.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by peramdy on 2017/8/29.
 */
@Repository(value = "studentRepositoryW")
public interface StudentRepository extends JpaRepository<Student, Integer>, JpaSpecificationExecutor<Student> {

    @Query(value = "SELECT COUNT(1) FROM student s WHERE s.classId=:claId ", nativeQuery = true)
    int queryStuCount(@Param("claId") Integer claId);
}
