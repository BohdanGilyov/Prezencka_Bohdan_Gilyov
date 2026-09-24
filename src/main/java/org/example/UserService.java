package org.example;

import java.util.*;

public class UserService {
    private final List<User> database;

    public UserService(List<User> database) {
        this.database = database;
    }

    public GenderRatio computeGenderRatio() {
        int numBoys = 0, numGirls = 0, numUnknowns = 0;
        for (User u : this.database) {
            switch (u.gender()) {
                case MALE -> numBoys++;
                case FEMALE -> numGirls++;
                case UNKNOWN -> numUnknowns++;
            }
        }

        return new GenderRatio(
                (double) numBoys / this.database.size(),
                (double) numGirls / this.database.size(),
                (double) numUnknowns / this.database.size()
        );
    }

//Mine version of computeGenderRatio
//    public GenderRatio computeGenderRatioMine() {
//        int boyCount = 0;
//        int girlCount = 0;
//        int unknownCount = 0;
//        for (int i = 0; i < database.size(); i++) {
//            if (database.get(i).gender() == User.Gender.MALE) {
//                boyCount++;
//            } else {
//                girlCount++;
//            }
//        }
//        GenderRatio ratio = new GenderRatio(boyCount / database.size(), girlCount / database.size(), unknownCount / database.size());
//        return ratio;
//    }
}