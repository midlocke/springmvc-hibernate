package com.test.entity;

/**
 * Created by lichao on 2017/9/20.
 */
public class UserEntity {

    public UserEntity(String name,String description){
        this.name = name;
        this.description = description;
    }

    private String name;

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
