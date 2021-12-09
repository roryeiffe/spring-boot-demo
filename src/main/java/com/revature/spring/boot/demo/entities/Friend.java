package com.revature.spring.boot.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Friend {
    @Id
    private long id;

    @OneToOne
    private long empId1;
    private long empId2;

    public Friend () {}


}
