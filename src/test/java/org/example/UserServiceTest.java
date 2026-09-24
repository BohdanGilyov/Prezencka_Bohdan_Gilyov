package org.example;

import java.time.LocalDate;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    private UserService userService;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        userService = new UserService(List.of(
                new User(1L,
                        "Ferko",
                        "Velky",
                        User.Gender.MALE,
                        LocalDate.of(2000, 4, 13),
                        User.Role.STUDENT
                        ),
                new User(2L,
                        "Anka",
                        "Mala",
                        User.Gender.FEMALE,
                        LocalDate.of(2004, 7, 18),
                        User.Role.STUDENT
                        ),
                new User(3L,
                        "Maria",
                        "Gudzon",
                        User.Gender.FEMALE,
                        LocalDate.of(2001, 10, 9),
                        User.Role.STUDENT
                        )
        ));
    }

    @org.junit.jupiter.api.Test
    void computeGenderRatio() {

    }
}