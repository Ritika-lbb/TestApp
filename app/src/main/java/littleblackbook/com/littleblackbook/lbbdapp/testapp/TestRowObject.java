package littleblackbook.com.littleblackbook.lbbdapp.testapp;

import android.graphics.drawable.Drawable;

/**
 * Created by Admin on 8/10/2015.
 */
public class TestRowObject {
    Integer images;
    String titles;
    String categories;

    public TestRowObject(Integer images, String titles, String categories){
        this.images=images;
        this.titles=titles;
        this.categories=categories;
    }

    public int getMainImage() {
        return images;
    }

    public String getTitle() {
        return titles;
    }

    public String getCategories() {
        return categories;
    }

}
