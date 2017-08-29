package com.peramdy.entity.read;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by peramdy on 2017/8/21.
 */
@Entity
@Table(name = "class")
public class Clazz {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "className")
    private String name;
    @Column(name = "studentCount")
    private Integer sudentCount;
    @Column(name = "status")
    private Integer status;
    @Column(name = "craeteTime")
    private Date createTime;
    @Column(name = "updateTime")
    private Date updateTime;

}
