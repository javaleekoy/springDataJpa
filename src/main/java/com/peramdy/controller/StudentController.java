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

    @RequestMapping(value = "/infoR.do", method = RequestMethod.POST)
    @ResponseBody
    public String queryStudentInfo(@RequestParam("userId") Integer userId) {
        StudentDto dto = studentService.queryStudentR(userId);
        return dto.toString();
    }

    @RequestMapping(value = "/infoW.do", method = RequestMethod.POST)
    @ResponseBody
    public String queryStudentInfo2(@RequestParam("userId") Integer userId) {
        StudentDto dto = studentService.queryStuInfoW(userId);
        return dto.toString();
    }

    @RequestMapping(value = "/stuCountW.do", method = RequestMethod.POST)
    @ResponseBody
    public String stuCount(@RequestParam("classId") Integer classId) {
        int stuCount = studentService.queryStuCountW(classId);
        return stuCount + "";
    }

    @RequestMapping(value = "/stuNameR.do", method = RequestMethod.POST)
    @ResponseBody
    public String stuName(@RequestParam("userId") Integer userId) {
        String stuName = studentService.queryStuNameR(userId);
        return stuName;
    }

}
