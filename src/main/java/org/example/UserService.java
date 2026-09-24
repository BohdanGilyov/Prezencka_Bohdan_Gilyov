package org.example;
import java.util.*;

public class UserService {
    private final List<User> database;

    public UserService(List<User> database){
        this.database = database;
    }

    public GenderRatio computeGenderRatio(){
        int boyCount = 0;
        int girlCount = 0;
        for (int i = 0; i < database.size(); i++) {
            if(database.get(i).gender() == User.Gender.MALE){
                boyCount++;
            } else {
                girlCount++;
            }
        }
        int ratioNumber = boyCount/girlCount;
        GenderRatio ratio = new GenderRatio(boyCount, girlCount, ratioNumber);
        return ratio;
    }
}