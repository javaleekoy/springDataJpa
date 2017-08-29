package com.peramdy.dao.read;

import com.peramdy.dto.StudentDto;

/**
 * Created by peramdy on 2017/8/21.
 */
public interface StudentDao {

    StudentDto queryStudent(Integer userId);

}
