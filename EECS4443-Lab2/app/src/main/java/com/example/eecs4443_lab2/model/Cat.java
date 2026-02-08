package com.example.eecs4443_lab2.model;

import com.example.eecs4443_lab2.R;
import java.util.ArrayList;
import java.util.List;

/**
 * Data model representing a Cat item.
 *
 * NOTE:
 *      This is the item data model, this should only contain the data fields
 *      and their getters/setters, no logic should be implemented here.
 *      Logic will be kept in ItemAdapter and DetailActivity (need to double check
 *      on the DetailActivity bit). - Kevin 20260206
 */
public class Cat {
    private String title;
    private int imageResId;
    private String description;
    private String detailedDescription;

    public Cat(String title, int imageResId, String description, String detailedDescription) {
        this.title = title;
        this.imageResId = imageResId;
        this.description = description;
        this.detailedDescription = detailedDescription;
    }

    /**
     * Returns hardcoded list of 15 sample Cat items.
     *
     * NOTE:
     *      Please don't change or remove any of the cats. 😠 - Kevin 20260206
     */
    public static List<Cat> getSampleCats() {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Whiskers", R.drawable.cat1, "Playful and energetic.",
                "Always on the move and full of spark, this little ball of energy " +
                        "loves interactive play and spontaneous bursts of zoomies. Whether it’s " +
                        "chasing toys, pouncing on shadows, or initiating games out of nowhere, they " +
                        "bring life and excitement into every room they enter."));
        cats.add(new Cat("Shadow", R.drawable.cat2, "Loves to nap in the sun.",
                "A true connoisseur of cozy moments, this one can often be found " +
                        "stretched out in a warm sunbeam, eyes half-closed in bliss. They know " +
                        "exactly where the light hits best and will happily spend hours soaking up " +
                        "the warmth in total contentment."));
        cats.add(new Cat("Mittens", R.drawable.cat3, "Curious and friendly.",
                "Nothing escapes their notice. With a nose for discovery and an open " +
                        "heart, they love meeting new people, investigating unfamiliar sounds, and " +
                        "inserting themselves into whatever you’re doing — usually with a gentle " +
                        "nudge or inquisitive stare."));
        cats.add(new Cat("Tiger", R.drawable.cat4, "Bold and adventurous.",
                "Fearless and confident, this explorer isn’t afraid to leap into the" +
                        " unknown. New environments, high perches, and unexpected situations are all" +
                        " invitations rather than obstacles, making them a natural trailblazer of the" +
                        " household."));
        cats.add(new Cat("Luna", R.drawable.cat5, "Gentle and affectionate.",
                "Soft-hearted and tender, they show love in subtle, meaningful ways " +
                        "— slow blinks, gentle headbutts, and calm cuddles. Their presence is " +
                        "soothing, and they seem to instinctively know when comfort is needed most."));
        cats.add(new Cat("Simba", R.drawable.cat6, "King of the house.",
                "Carries themselves with undeniable authority. They rule their domain with confidence, " +
                        "choosing the best spots, supervising daily routines, and expecting respect (and treats). " +
                        "Despite the royal attitude, there’s a deep loyalty to their humans."));
        cats.add(new Cat("Bella", R.drawable.cat7, "Sweet and cuddly.",
                "A total sweetheart who thrives on closeness, this one loves curling " +
                        "up beside you, resting their head on your arm, or melting into your lap. " +
                        "Physical affection is their love language, and they give it freely."));
        cats.add(new Cat("Oliver", R.drawable.cat8, "Always hungry.",
                "Food is a passion, a priority, and possibly a life philosophy. They" +
                        " never miss mealtime and are experts at convincing you they haven’t eaten yet." +
                        " Expect dramatic stares, enthusiastic reactions, and a talent for sniffing " +
                        "out snacks."));
        cats.add(new Cat("Cleo", R.drawable.cat9, "Elegant and graceful.",
                "Moves with quiet confidence and effortless poise. Every step, " +
                        "stretch, and jump looks intentional and refined, as if choreographed. " +
                        "There’s a calm beauty to their presence that naturally draws attention."));
        cats.add(new Cat("Leo", R.drawable.cat10, "Loves to climb.",
                "The higher, the better. Shelves, cat trees, and unexpected ledges " +
                        "are irresistible challenges. From above, they observe their surroundings " +
                        "like a watchful guardian, always choosing the best vantage point."));
        cats.add(new Cat("Socks", R.drawable.cat11, "Has unique markings.",
                "No two are alike, and this one proves it. Their distinctive patterns " +
                        "make them instantly recognizable, each marking adding to their charm and " +
                        "individuality. It’s impossible not to admire how striking and special they " +
                        "look."));
        cats.add(new Cat("Pumpkin", R.drawable.cat12, "Orange and fluffy.",
                "A walking puff of sunshine, bursting with warmth and personality. " +
                        "Their fluffy coat makes them extra huggable, and their orange coloring " +
                        "perfectly matches their lively, lovable nature."));
        cats.add(new Cat("Nala", R.drawable.cat13, "Smart and playful.",
                "Quick to learn and always thinking, this clever companion enjoys " +
                        "mental challenges just as much as physical play. They love puzzle toys, " +
                        "interactive games, and figuring things out — often surprising you with how " +
                        "sharp they are."));
        cats.add(new Cat("Milo", R.drawable.cat14, "Likes to explore.",
                "An independent spirit with a strong sense of curiosity, they enjoy " +
                        "wandering, inspecting corners, and discovering new favorite spots. Every " +
                        "space is an opportunity for adventure, even ones they’ve seen a hundred " +
                        "times before."));
        cats.add(new Cat("Ruby", R.drawable.cat15, "Shy but loving.",
                "At first, they may keep their distance, observing quietly from afar. " +
                        "But once trust is built, they reveal a deeply loving and loyal side. Their " +
                        "affection feels extra special because it’s earned — gentle, sincere, and " +
                        "full of warmth."));
        return cats;
    }

    // getters and setters
    public String getTitle() {
        return title;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getDescription() {
        return description;
    }
    public String getDetailedDescription() {return detailedDescription; }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public void setDetailedDescription(String detailedDescription) { this.detailedDescription = detailedDescription; }
}
