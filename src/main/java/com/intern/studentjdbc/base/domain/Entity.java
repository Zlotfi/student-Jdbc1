package com.intern.studentjdbc.base.domain;

public abstract class Entity {

    @SuppressWarnings("unused")
    private Long id;

    public Entity() {
    }

    public Entity(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
