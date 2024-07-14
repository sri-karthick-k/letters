package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "rules")
public class Rule {
    @Id
    private String id;
    private String tagId;
    private String regionId;
    private List<String> membershipPlans;
    private List<String> requestTypes;
    private List<String> levelsOfService;
    private List<String> providerStatuses;
    private List<String> products;

    // Getters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public List<String> getMembershipPlans() {
        return membershipPlans;
    }

    public void setMembershipPlans(List<String> membershipPlans) {
        this.membershipPlans = membershipPlans;
    }

    public List<String> getRequestTypes() {
        return requestTypes;
    }

    public void setRequestTypes(List<String> requestTypes) {
        this.requestTypes = requestTypes;
    }

    public List<String> getLevelsOfService() {
        return levelsOfService;
    }

    public void setLevelsOfService(List<String> levelsOfService) {
        this.levelsOfService = levelsOfService;
    }

    public List<String> getProviderStatuses() {
        return providerStatuses;
    }

    public void setProviderStatuses(List<String> providerStatuses) {
        this.providerStatuses = providerStatuses;
    }

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }
}

