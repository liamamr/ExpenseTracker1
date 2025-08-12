package org.example.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;


/*
 * Wiederholungen pro Set (int oder Liste<Integer> wenn variabel)
Gewicht pro Set (optional: int oder double oder Liste<Double>)
(Optional) Pausenzeit, Notizen
 */
public class Exercise {

    private final String name;
    private final int numberSets;
    private final Map<Integer, Integer> reps;
    private final Map<Integer, Double> weight;
    private final Double breakTime;
    private final Optional<String> notes;

    // Constructor
    public Exercise(String name, int numberSets, Double breakTime) {
        this.name = name;
        this.numberSets = numberSets;
        this.reps = new HashMap<>();
        this.weight = new HashMap<>();
        this.breakTime = breakTime;
        this.notes = Optional.empty();
    }

    // TODO
    public void setName(String name) {

    }

    // TODO
    public boolean setSets(int number) {
        return true;
    }

    // TODO
    public boolean setReps(int set, int reps) {
        this.reps.put(set, reps);

        return this.reps.containsValue(reps);
    }

    // TODO
    public boolean setWeight(int set, Double weight) {
        return true;
    }

    // TODO
    public void writeNotes(String notes) {
    }

    public String getName() {
        return this.name;
    }

    public int getSets() {
        return this.numberSets;
    }

    public int getReps(int set, int reps) {
        return this.reps.get(set);
    }

    public Double getWeight(int set, Double weight) {
        return this.weight;
    }

    public Double getBreakTime() {
        return this.breakTime;
    }

    public Optional<String> getNotes() {
        if (!Optional.of(this.notes).isEmpty()) {
            return Optional.of(this.notes).get();
        } else {
            return Optional.empty();
        }
    }
}
