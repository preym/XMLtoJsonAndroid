
package com.example.XMLtoJson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Feeds {

    @Expose
    private String type;
    @Expose
    private List<Item> items = new ArrayList<Item>();
    @SerializedName("has_more")
    @Expose
    private String hasMore;
    @Expose
    private String callbackhash;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public String getHasMore() {
        return hasMore;
    }

    public void setHasMore(String hasMore) {
        this.hasMore = hasMore;
    }

    public String getCallbackhash() {
        return callbackhash;
    }

    public void setCallbackhash(String callbackhash) {
        this.callbackhash = callbackhash;
    }


    public String toString() {
        return this.type + "-" + this.items;
    }

}
