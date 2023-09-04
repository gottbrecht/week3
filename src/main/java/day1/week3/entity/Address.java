package day1.week3.entity;


import jakarta.persistence.*;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String street;
    String zip;
    String city;

    @OneToMany(mappedBy = "address", cascade = CascadeType.PERSIST, orphanRemoval = true) //bidirectional
    private List<Citizen> citizens = new ArrayList();

    public void addCitizen(Citizen citizen) {
        citizens.add(citizen);
        citizen.setAddress(this);
    }

    public Address(String street, String zip, String city) {
        this.street = street;
        this.zip = zip;
        this.city = city;

    }
}
