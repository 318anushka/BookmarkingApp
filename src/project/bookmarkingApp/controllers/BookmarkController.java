package project.bookmarkingApp.controllers;

import project.bookmarkingApp.entities.Bookmark;
import project.bookmarkingApp.entities.User;
import project.bookmarkingApp.manager.BookmarkManager;

public class BookmarkController {
    private BookmarkController(){}
    private static BookmarkController instance = new BookmarkController();

    public static BookmarkController getInstance(){
        return instance;
    }

    public void saveUserBookmark(User user, Bookmark bookmark) {
        BookmarkManager.getInstance().saveUserBookmark(user ,bookmark);
    }
}
