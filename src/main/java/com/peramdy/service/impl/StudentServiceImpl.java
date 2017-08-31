package com.peramdy.service.impl;

import com.peramdy.dao.read.StudentDao;
import com.peramdy.dto.StudentDto;
import com.peramdy.repository.read.StudentRepository;
import com.peramdy.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by peramdy on 2017/8/25.
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDaoR;

    @Autowired
    private StudentRepository StudentRepository;

    @Autowired
    private com.peramdy.dao.write.StudentDao studentDaoW;

    @Autowired
    private com.peramdy.repository.write.StudentRepository studentRepositoryW;



    public StudentDto queryStudentR(Integer userId) {
        return studentDaoR.queryStudent(userId);
    }

    public String queryStuNameR(Integer userId){
        return StudentRepository.queryStuName(userId);
    }

    public StudentDto queryStuInfoW(Integer userId) {
        return studentDaoW.queryStuInfById(userId);
    }

    public int queryStuCountW(Integer classId) {
        return studentRepositoryW.queryStuCount(classId);
    }
}
