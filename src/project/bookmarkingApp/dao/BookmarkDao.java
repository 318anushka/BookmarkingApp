package project.bookmarkingApp.dao;

import project.bookmarkingApp.DataStore;
import project.bookmarkingApp.entities.Bookmark;
import project.bookmarkingApp.entities.UserBookmark;

public class BookmarkDao {
    public Bookmark[][] getBookmark(){
        return DataStore.getBookmark();
    }

    public void saveUserBookmark(UserBookmark userBookmark) {
        DataStore.add(userBookmark);
    }
}
