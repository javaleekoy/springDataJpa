package com.peramdy.dao.write;

import com.peramdy.dto.StudentDto;

/**
 * Created by peramdy on 2017/8/21.
 */
public interface StudentDao {

    StudentDto queryStuInfById(Integer stuId);

}
