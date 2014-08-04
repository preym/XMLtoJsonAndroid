
package com.example.XMLtoJson;

import com.google.gson.annotations.Expose;

public class SocialActions {

    @Expose
    private String views;
    @Expose
    private String ratings;
    @Expose
    private String loves;
    @Expose
    private String wishlist;
    @Expose
    private String addToCarts;
    @Expose
    private String purchases;

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public String getRatings() {
        return ratings;
    }

    public void setRatings(String ratings) {
        this.ratings = ratings;
    }

    public String getLoves() {
        return loves;
    }

    public void setLoves(String loves) {
        this.loves = loves;
    }

    public String getWishlist() {
        return wishlist;
    }

    public void setWishlist(String wishlist) {
        this.wishlist = wishlist;
    }

    public String getAddToCarts() {
        return addToCarts;
    }

    public void setAddToCarts(String addToCarts) {
        this.addToCarts = addToCarts;
    }

    public String getPurchases() {
        return purchases;
    }

    public void setPurchases(String purchases) {
        this.purchases = purchases;
    }

}
