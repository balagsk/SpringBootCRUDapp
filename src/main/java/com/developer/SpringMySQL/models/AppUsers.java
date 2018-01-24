package com.developer.SpringMySQL.models;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.repository.query.Param;

import javax.persistence.*;

/**
 * Created by Balakrishan on 6/25/2017.
 */
@Entity
@Table(name = "appusers")
public class AppUsers {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   // @SequenceGenerator(name="UserSeq",sequenceName="USER_SEQ.nextval",allocationSize=1)
    public int id;
    @Column(name = "firstname")
    public String firstName;
    @Column(name = "lastname")
    public String lastName;

    public AppUsers() {
    }

    public AppUsers(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }




}
