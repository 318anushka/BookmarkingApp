package project.bookmarkingApp.entities;

import org.junit.Test;
import project.bookmarkingApp.manager.BookmarkManager;

import static org.junit.Assert.*;

public class WebLinkTest {

  //  @org.junit.jupiter.api.Test
    @Test
    public void isKidFriendlyEligible() {
        //TEST 1: porn is in url ; false

        WebLink weblink = BookmarkManager.getInstance().createWebLink(2000 , 	"Taming Tiger, Part 2" , "http://www.javaworld.com/article/2072759/core-java/taming-porn--part-2.html" , "http://www.javaworld.com");
        boolean isKidFriendlyEligible = weblink.isKidFriendlyEligible();
        assertFalse("For porn in url kid friendly not eligible" , isKidFriendlyEligible);

        //TEST 2: porn in title: false

        weblink = BookmarkManager.getInstance().createWebLink(2000 , 	"Taming porn, Part 2" , "http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html" , "http://www.javaworld.com");
        isKidFriendlyEligible = weblink.isKidFriendlyEligible();
        assertFalse("For porn in title kid friendly not eligible" , isKidFriendlyEligible);

        //TEST 3: adult in host: false

        weblink = BookmarkManager.getInstance().createWebLink(2000 , 	"Taming Tiger, Part 2" , "http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html" , "http://www.adult.com");
        isKidFriendlyEligible = weblink.isKidFriendlyEligible();
        assertFalse("For adult in host kid friendly not eligible" , isKidFriendlyEligible);

        //TEST 4: adult in url but not host: true

        weblink = BookmarkManager.getInstance().createWebLink(2000 , 	"Taming Tiger, Part 2" , "http://www.javaworld.com/article/2072759/core-java/taming-adult--part-2.html" , "http://www.javaworld.com");
        isKidFriendlyEligible = weblink.isKidFriendlyEligible();
        assertTrue("For adult in url kid friendly eligible" , isKidFriendlyEligible);

        //TEST 5: adult in title only: true

        weblink = BookmarkManager.getInstance().createWebLink(2000 , 	"Taming adult, Part 2" , "http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html" , "http://www.javaworld.com");
        isKidFriendlyEligible = weblink.isKidFriendlyEligible();
        assertFalse("For adult in title kid friendly eligible" , isKidFriendlyEligible);
    }
}