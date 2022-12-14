package com.javaproject.jpaproject.dto;

public class QueryInfoDTO {

    private String name;
    private String owner;
    private String description;
    private String creationTime;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDescription() {
        return description;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }
}
