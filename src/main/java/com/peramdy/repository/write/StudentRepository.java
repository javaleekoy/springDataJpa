package com.peramdy.repository.write;

import com.peramdy.entity.write.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by peramdy on 2017/8/29.
 */
public interface StudentRepository extends JpaRepository<Student,Integer>,JpaSpecificationExecutor<Student> {
}
