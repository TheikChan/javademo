package org.theikchan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum DayOfWeek {
    MONDAY("MON"), TUESDAY("TUE"), WEDNESDAY("WED"), THURSDAY("THU"), FRIDAY("FRI"), SATURDAY("SAT"), SUNDAY("SUN");
    
    private final String abbreviation;
    
    DayOfWeek(String abbreviation) {
        this.abbreviation = abbreviation;
    }
    
    public String getAbbreviation() {
        return abbreviation;
    }
}

enum MyEnum {
    A() {
        @Override
        void doSomething() {
            IO.println("a");
        }
    },
    B() {
        @Override
        void doSomething() {
            IO.println("b");
        }
    };
    
    abstract void doSomething();
}

void main() {
    DayOfWeek weekStart = DayOfWeek.MONDAY;

    if (weekStart == DayOfWeek.MONDAY) {
        IO.println("The week starts on Monday.");
    }

    DayOfWeek someDay = DayOfWeek.FRIDAY;

    switch (someDay) {
        case MONDAY ->
            IO.println("The week just started.");
        case TUESDAY, WEDNESDAY, THURSDAY ->
            IO.println("We are somewhere in the middle of the week.");
        case FRIDAY ->
            IO.println("The weekend is near.");
        case SATURDAY, SUNDAY ->
            IO.println("Weekend");
        default ->
            throw new AssertionError("Should not happen");
    }

    // DayOfWeek someDay = DayOfWeek.FRIDAY;

    String text = switch (someDay) {
        case MONDAY -> "The week just started.";
        case TUESDAY, WEDNESDAY, THURSDAY -> "We are somewhere in the middle of the week.";
        case FRIDAY -> "The weekend is near.";
        case SATURDAY, SUNDAY -> "Weekend";
    };

    IO.println(text);

    IO.println(DayOfWeek.MONDAY.name());    // prints "MONDAY"
    IO.println(DayOfWeek.MONDAY.ordinal()); // prints "0" because MONDAY is the first constant in the DayOfWeek enum

    // DayOfWeek[] days = DayOfWeek.values(); // all days of the week
    DayOfWeek monday = DayOfWeek.valueOf("MONDAY");

    List<DayOfWeek> days = new ArrayList<>(List.of(DayOfWeek.FRIDAY, DayOfWeek.TUESDAY, DayOfWeek.SATURDAY));
    Collections.sort(days);
}

public void compareDayOfWeek(DayOfWeek dayOfWeek){
    int comparison = dayOfWeek.compareTo(DayOfWeek.WEDNESDAY);
    if (comparison < 0) {
        IO.println("It's before the middle of the work week.");
    } else if (comparison > 0){
        IO.println("It's after the middle of the work week.");
    } else {
        IO.println("It's the middle of the work week.");
    }
}