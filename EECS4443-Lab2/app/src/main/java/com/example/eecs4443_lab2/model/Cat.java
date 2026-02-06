package com.example.eecs4443_lab2.model;

// This is the item data model, this should only contain the data fields and their getters/setters, no logic should be implemented here
// Logic will be kept in ItemAdapter and DetailActivity (need to doublecheck on the DetailActivity bit). - Kevin 20260206

import java.util.ArrayList;
import java.util.List;

public class Cat {
    private String title;
    private int imageResId;     // this will contain the resource ID number for the thumbnail in the drawable folder. - Kevin 20260206
    private String description;

    public Cat(String title, int imageResId, String description) {
        this.title = title;
        this.imageResId = imageResId;
        this.description = description;
    }

    public static List<Cat> getSampleCats() { // here for now until we add actual images and descriptions.
        List<Cat> cats = new ArrayList<>();   // getSampleCats() will be used to populate the RecyclerView with sample data. - Kevin 20260206
        for (int i = 1; i <= 15; i++) {
            cats.add(new Cat("Cat " + i, 0, "Description for Cat " + i));
        }
        return cats;
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
