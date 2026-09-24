package org.example;

import java.time.LocalDate;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    private UserService userService;

    @org.junit.jupiter.api.BeforeEach
    void computeGenderRatio_happyPath() {
        var userService = new UserService(List.of(
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

        var got = userService.computeGenderRatio();
        var delta = 0.00001;
        //var означает: java сама определи тип переменной

        assertEquals(0.0, got.unknown());
        assertTrue(Math.abs(0.333333 - got.boys()) < delta);
        assertTrue(Math.abs(0.666666 - got.girls()) < delta);
    }

    @org.junit.jupiter.api.BeforeEach
    void computeGenderRatio_empty() {
        var userService = new UserService(null);
        var got = userService.computeGenderRatio();

        assertEquals(0.0, got.boys());
        assertEquals(0.0, got.girls());
        assertEquals(0.0, got.unknown());
    }
}