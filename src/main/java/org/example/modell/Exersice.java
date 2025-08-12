package org.example.modell;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


/*
 * Wiederholungen pro Set (int oder Liste<Integer> wenn variabel)
Gewicht pro Set (optional: int oder double oder Liste<Double>)
(Optional) Pausenzeit, Notizen
 */
public class Exersice {

    private final String name;
    private final int numberSets;
    private final List<Integer> reps;
    private final List<Double> weight;
    private final Double breakTime;
    private final Optional<String> notes;

    // Constructor
    public Exersice(String name, int numberSets, Double breakTime) {
        this.name = name;
        this.numberSets = numberSets;
        this.reps = new ArrayList<>();
        this.weight = new ArrayList<>();
        this.breakTime = breakTime;
        this.notes = Optional.empty();
    }

    // TODO
    public boolean setSets(int number) {
        return true;
    }

    // TODO
    public boolean setReps(int set, int reps) {
        return true;
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

    public List<Integer> getReps() {
        return this.reps;
    }

    public List<Double> getWeight() {
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
