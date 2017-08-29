package com.peramdy.service.impl;

import com.peramdy.dao.read.StudentDao;
import com.peramdy.dto.StudentDto;
import com.peramdy.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by peramdy on 2017/8/25.
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    public StudentDto queryStudentInfoList(Integer userId){
        return studentDao.queryStudent(userId);
    }

}
