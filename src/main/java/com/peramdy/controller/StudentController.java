package com.peramdy.controller;

import com.peramdy.dto.StudentDto;
import com.peramdy.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by peramdy on 2017/8/28.
 */
@Controller
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/info.do", method = RequestMethod.POST)
    @ResponseBody
    public String queryStudentInfoList(@RequestParam("userId") Integer userId) {
        StudentDto dto = studentService.queryStudentInfoList(userId);
        return "success";
    }


    @RequestMapping(value = "/test.do", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> test() {

        System.out.println("test");

        return null;
    }

}
