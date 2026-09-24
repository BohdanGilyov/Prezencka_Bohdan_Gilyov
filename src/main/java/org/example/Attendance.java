package org.example;

import java.lang.classfile.constantpool.LoadableConstantEntry;
import java.time.*;
import java.util.*;

public record Attendance(
        Long id,
        LocalDate date,
        Subject subject,
        List<User> attendees
) {

}
