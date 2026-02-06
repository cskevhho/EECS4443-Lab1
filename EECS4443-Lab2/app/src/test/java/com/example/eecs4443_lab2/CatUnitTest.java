package com.example.eecs4443_lab2;

import com.example.eecs4443_lab2.model.Cat;
import com.example.eecs4443_lab2.adapter.CatAdapter;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class CatUnitTest {
// Testing the logic for Cat and CatAdapter here. - Kevin 20260206


    @Test
    public void catModel_gettersAndSetters_workCorrectly() {
        Cat cat = new Cat("Title", 123, "Description");
        assertEquals("Title", cat.getTitle());
        assertEquals(123, cat.getImageResId());
        assertEquals("Description", cat.getDescription());

        cat.setTitle("New Title");
        cat.setImageResId(456);
        cat.setDescription("New Description");

        assertEquals("New Title", cat.getTitle());
        assertEquals(456, cat.getImageResId());
        assertEquals("New Description", cat.getDescription());
    }

    @Test
    public void catAdapter_getItemCount_returnsCorrectSize() {
        List<Cat> cats = Arrays.asList(
                new Cat("Cat1", 1, "Desc1"),
                new Cat("Cat2", 2, "Desc2")
        );
        CatAdapter adapter = new CatAdapter(this, cats);
        assertEquals(2, adapter.getItemCount());
    }
}
