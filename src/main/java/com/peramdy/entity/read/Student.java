package com.peramdy.entity.read;

import javax.persistence.*;

/**
 * Created by peramdy on 2017/8/21.
 */
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "stuName")
    private String stuName;
    @Column(name = "classId")
    private Integer classId;

}
