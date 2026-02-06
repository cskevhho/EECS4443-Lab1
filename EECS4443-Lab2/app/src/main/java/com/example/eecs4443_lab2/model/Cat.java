package com.example.eecs4443_lab2.model;

// This is the item data model, this should only contain the data fields and their getters/setters, no logic should be implemented here
// Logic will be kept in ItemAdapter and DetailActivity (need to doublecheck on the DetailActivity bit). - Kevin 20260206

public class Cat {
    private String title;
    private int imageResId;     // this will contain the resource ID number for the thumbnail in the drawable folder. - Kevin 20260206
    private String description;

    public Cat(String title, int imageResId, String description) {
        this.title = title;
        this.imageResId = imageResId;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getDescription() {
        return description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
