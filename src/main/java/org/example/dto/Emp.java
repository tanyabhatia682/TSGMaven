package org.example.dto;


import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Hello world!
 *
 */

@SpringBootApplication
public class Emp
{
    private int id;
    private String name;
    private String address;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }


}
