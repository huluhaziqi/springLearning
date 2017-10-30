package com.lin.model;

public class DemoObj {

    private String name;

    private Long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DemoObj() {
    }

    public DemoObj(String name, Long id) {
        this.name = name;
        this.id = id;
    }
}
