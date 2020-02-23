package project.bookmarkingApp;

import project.bookmarkingApp.controllers.BookmarkController;
import project.bookmarkingApp.entities.Bookmark;
import project.bookmarkingApp.entities.User;
import project.bookmarkingApp.manager.UserManager;

public class View {

    public static void bookmark(User user , Bookmark[][] bookmarks){

        System.out.println("User is :"+ " "+ user.getEmail());
        for(int i = 0; i< DataStore.BOOKMARK_COUNT_PER_TYPE; i++){

            int type1 = (int)(Math.random() * DataStore.BOOKMARK_TYPES_COUNT);
            int type2 = (int)(Math.random() * DataStore.BOOKMARK_COUNT_PER_TYPE);

            Bookmark bookmark = bookmarks[type1][type2];
            BookmarkController.getInstance().saveUserBookmark(user , bookmark);
            System.out.println(bookmark);
        }
    }
}
