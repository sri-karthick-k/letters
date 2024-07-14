package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "memberships")
public class Membership {
    @Id
    private String id;
    private String name;
    private List<String> plans;

    // Getters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPlans() {
        return plans;
    }

    public void setPlans(List<String> plans) {
        this.plans = plans;
    }
}
