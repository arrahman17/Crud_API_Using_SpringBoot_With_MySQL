package com.example.MySqlTest1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Users {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @Column(name = "salary")
    private String salary;
    @Column(name = "team_name")
    private  String team_name;
    @Column(name = "Name")
    private  String Name;

    public Users() {

    }

    public Integer getID() {
        return id;
    }

    public void setID(Integer ID) {
        this.id = ID;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
