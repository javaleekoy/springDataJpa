package com.peramdy.service;

import com.peramdy.dto.StudentDto;

/**
 * Created by peramdy on 2017/8/25.
 */
public interface StudentService {

    StudentDto queryStudentInfoList(Integer userId);

}
