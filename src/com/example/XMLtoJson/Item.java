
package com.example.XMLtoJson;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;

public class Item {

    @Expose
    private String itemType;
    @Expose
    private String itemCategory;
    @Expose
    private String name;
    @Expose
    private List<String> images = new ArrayList<String>();
    @Expose
    private CreationDetails creationDetails;
    @Expose
    private SocialActions socialActions;

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public CreationDetails getCreationDetails() {
        return creationDetails;
    }

    public void setCreationDetails(CreationDetails creationDetails) {
        this.creationDetails = creationDetails;
    }

    public SocialActions getSocialActions() {
        return socialActions;
    }

    public void setSocialActions(SocialActions socialActions) {
        this.socialActions = socialActions;
    }

}
