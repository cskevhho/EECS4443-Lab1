package com.example.eecs4443_lab2;

import com.example.eecs4443_lab2.model.Cat;
import com.example.eecs4443_lab2.adapter.CatAdapter;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class CatUnitTest {

    @Test
    public void catModel_gettersAndSetters_workCorrectly() {
        Cat cat = new Cat("Kitty", 123, "Cute cat");
        assertEquals("Kitty", cat.getTitle());
        assertEquals(123, cat.getImageResId());
        assertEquals("Cute cat", cat.getDescription());

        cat.setTitle("Tom");
        cat.setImageResId(456);
        cat.setDescription("Playful");
        assertEquals("Tom", cat.getTitle());
        assertEquals(456, cat.getImageResId());
        assertEquals("Playful", cat.getDescription());
    }

    @Test
    public void catModel_getSampleCats_returns15Items() {
        List<Cat> cats = Cat.getSampleCats();
        assertEquals(15, cats.size());
        assertEquals("Whiskers", cats.get(0).getTitle());
        assertEquals("Ruby", cats.get(14).getTitle());
    }

    @Test
    public void catAdapter_getItemCount_nonEmptyList() {
        List<Cat> cats = Arrays.asList(
                new Cat("A", 1, "desc"),
                new Cat("B", 2, "desc2")
        );
        CatAdapter adapter = new CatAdapter(cats);
        assertEquals(2, adapter.getItemCount());
    }

    @Test
    public void catAdapter_constructor_handlesNullList() {
        // Testing that nothing is thrown, adapter still expects non-null list passed in.
        try {
            new CatAdapter(null);
            fail("Should throw NullPointerException");
        } catch (NullPointerException e) {
            // Comment to get rid of the yellow squiggle :)
        }
    }
}
