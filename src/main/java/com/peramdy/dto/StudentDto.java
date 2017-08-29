package com.peramdy.dto;

import java.io.Serializable;

/**
 * Created by peramdy on 2017/8/21.
 */
public class StudentDto implements Serializable {

    private Integer id;
    private String Name;
    private Integer classId;
    private String className;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }



}
