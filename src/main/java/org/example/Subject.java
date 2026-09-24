package org.example;
import java.util.*;

public record Subject(
        Long id,
        String name,
        int year,
        List<User> students
) {

}