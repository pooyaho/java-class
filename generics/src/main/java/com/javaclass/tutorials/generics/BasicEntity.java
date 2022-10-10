package com.javaclass.tutorials.generics;

public abstract class BasicEntity {
    private Long id;

    public BasicEntity(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
