package org.example;

import org.example.model.Exercise;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ExerciseTest {

    @Test
    void testConstructerAndGetter() {
        Exercise ex = new Exercise("Bench Press", 2, 1.5);
        ex.setReps(1, 8);
        ex.setWeight(1, 60.0);

        assertEquals(ex.getName(), "Bench Press");
        assertEquals(ex.getSets(), 2);
        assertEquals(ex.getBreakTime(), 1.5);
        assertEquals(ex.getReps(1, 8), 8);
        assertEquals(ex.getWeight(1, 60.0), 60.0);
    }

    @Test
    void testSetters() {
        Exercise ex = new Exercise("Bench Press", 2, 1.5);
        String notes = "yessir";

        ex.setName("Deadlift");
        ex.setSets(5);
        ex.setReps(1, 5);
        ex.setWeight(1, 120.0);
        ex.writeNotes(notes);

        assertEquals("Deadlift", ex.getName());
        assertEquals(5, ex.getSets());
        assertEquals(5, ex.getReps(1, 5));
        assertEquals(120.0, ex.getWeight(1, 120.0));
        assertEquals("yessir", ex.getName());
    }
}
