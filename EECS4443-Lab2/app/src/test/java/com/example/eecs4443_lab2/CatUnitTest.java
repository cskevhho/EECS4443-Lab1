package com.example.eecs4443_lab2;

import com.example.eecs4443_lab2.model.Cat;
import com.example.eecs4443_lab2.adapter.CatAdapter;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class CatUnitTest {

    @Test
    public void catModel_gettersAndSetters_workCorrectly() {
        Cat cat = new Cat("Kitty", 123, "Cute cat", "Super cute cat");
        assertEquals("Kitty", cat.getTitle());
        assertEquals(123, cat.getImageResId());
        assertEquals("Cute cat", cat.getDescription());
        assertEquals("Super cute cat", cat.getDetailedDescription());

        cat.setTitle("Tom");
        cat.setImageResId(456);
        cat.setDescription("Playful");
        cat.setDetailedDescription("Really playful");
        assertEquals("Tom", cat.getTitle());
        assertEquals(456, cat.getImageResId());
        assertEquals("Playful", cat.getDescription());
        assertEquals("Really playful", cat.getDetailedDescription());
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
                new Cat("A", 1, "desc", "detailedDesc"),
                new Cat("B", 2, "desc2", "detailedDesc2")
        );
        CatAdapter adapter = new CatAdapter(cats);
        assertEquals(2, adapter.getItemCount());
    }

    @Test
    public void catAdapter_constructor_handlesNullListGracefully() {
        CatAdapter adapter = new CatAdapter(null);
        assertEquals(0, adapter.getItemCount());
    }
}
