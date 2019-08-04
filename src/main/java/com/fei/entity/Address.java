package com.fei.entity;

/**
 * @author feixiaoteng
 * @create 2019-08-01 21:28
 */
public class Address {
    private Long id;
    private String name;

    public Address() {
    }

    public Address(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
