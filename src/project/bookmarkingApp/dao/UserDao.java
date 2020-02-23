package project.bookmarkingApp.dao;

import project.bookmarkingApp.DataStore;
import project.bookmarkingApp.entities.User;

public class UserDao {
    public User[] getUsers(){
        return DataStore.getUsers();
    }
}
