package com.github.irya_lis.spring_introduction;

import java.io.Serializable;

abstract public class AbstractPet implements Pet, Serializable {
    private String name;

    public AbstractPet() {
    }

    public AbstractPet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
