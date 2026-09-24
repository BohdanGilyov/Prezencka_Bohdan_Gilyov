package org.example;
import java.util.*;

public class UserService {
    private final List<User> database;

    public UserService(List<User> database){
        this.database = database;
    }
}
