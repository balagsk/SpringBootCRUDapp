package com.developer.SpringMySQL.models;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.repository.query.Param;

import javax.persistence.*;

/**
 * Created by Pukar on 6/25/2017.
 */
@Entity
@Table(name = "appusers")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
   // @SequenceGenerator(name="UserSeq",sequenceName="USER_SEQ.nextval",allocationSize=1)
    public int id;
    @Column(name = "firstname")
    public String firstname;
    @Column(name = "lastname")
    public String lastname;

    public User() {
    }

    public User(String firstName, String lastName) {
        this.firstname = firstName;
        this.lastname = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstName) {
        this.firstname = firstName;
    }

    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastName) {
        this.lastname = lastName;
    }




}
