package com.someproject.th0403.entity;

import org.hibernate.annotations.CollectionId;

import javax.persistence.*;

@Entity
@Table(name = "goods_table", catalog="thymeleafBase")
public class Goods {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private Float price;

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Goods() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
