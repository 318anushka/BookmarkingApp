package project.bookmarkingApp;

import project.bookmarkingApp.entities.Bookmark;
import project.bookmarkingApp.entities.User;
import project.bookmarkingApp.manager.BookmarkManager;
import project.bookmarkingApp.manager.UserManager;

import java.awt.image.VolatileImage;

public class Launch {

    private static User[] users;
    private static Bookmark[][] bookmarks;

    public static void loadData(){
       System.out.println("Loading data");
        DataStore.loadData();

        users = UserManager.getInstance().getUser();
        bookmarks = BookmarkManager.getInstance().getBookmark();
        System.out.println("Printing Data");

        printUserData();
        printBookmark();

    }

    public static void printUserData(){
        for(User user: users){
            System.out.println(user);
        }
    }

    public static void printBookmark(){
        for(Bookmark[] bookmarklist : bookmarks){

            for(Bookmark bookmark : bookmarklist){
            System.out.println(bookmark);}
        }
    }

    private static void startBookmarking() {

        System.out.println("Bookmarking");
        for(User user: users){
            View.bookmark(user , bookmarks);
        }
    }

    public static void main(String[] args){
        loadData();
        startBookmarking();
    }
}
