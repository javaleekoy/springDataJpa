package com.peramdy.service;

import com.peramdy.dto.StudentDto;

/**
 * Created by peramdy on 2017/8/25.
 */
public interface StudentService {

    StudentDto queryStudentR(Integer userId);

    String queryStuNameR(Integer userId);

    StudentDto queryStuInfoW(Integer userId);

    int queryStuCountW(Integer classId);

}
