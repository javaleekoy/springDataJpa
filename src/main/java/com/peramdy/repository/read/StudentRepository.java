package com.peramdy.repository.read;

import com.peramdy.entity.read.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by peramdy on 2017/8/29.
 */
public interface StudentRepository extends JpaRepository<Student,Integer>,JpaSpecificationExecutor<Student> {
}
