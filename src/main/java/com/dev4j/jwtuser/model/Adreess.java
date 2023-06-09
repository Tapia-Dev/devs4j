package com.dev4j.jwtuser.model;


import javax.persistence.*;

@Entity
@Table(name = "adress")
public class Adreess {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "street", nullable = false,length = 255)
    private String street;
    @Column(name = "number")
    private String number;
    @Column(name = "city")
    private String city;
    @ManyToOne
    private Profile profile;

    //Getters y setters


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}
