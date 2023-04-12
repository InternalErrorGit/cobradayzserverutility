package net.internalerror.data.entity;

import jakarta.persistence.Entity;

@Entity
public class Item extends AbstractEntity {

    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
