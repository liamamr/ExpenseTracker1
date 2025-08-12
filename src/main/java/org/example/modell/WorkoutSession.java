package org.example.modell;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class WorkoutSession {

    private final Date date;
    private final List<Exersice> exersices;

    public WorkoutSession() {
        this.date = new Date();
        this.exersices = new LinkedList<>();
    }

    public boolean addExersice(Exersice exersice) {
        exersices.add(exersice);

        return exersices.contains(exersice);
    }
}
