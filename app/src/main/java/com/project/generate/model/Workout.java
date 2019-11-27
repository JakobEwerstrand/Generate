package com.project.generate.model;

import java.util.ArrayList;

/**
 * responsibility: A simple workout.
 * used-by:
 * @author Jakob
 */
public class Workout {

    private String workoutName;
    private String directory;
    private String workoutDescription;
    private int weeks;
    private int days;
    private int numOfExercises;
    private ArrayList<Exercise> exercises;

    public Workout(String workoutName) {
        this.workoutName = workoutName;
    }

    public String getName() {
        return workoutName;
    }

    public void setName(String name) {
        this.workoutName = workoutName;
    }

    public ArrayList<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(ArrayList<Exercise> exercises) {
        this.exercises = exercises;
    }


}
