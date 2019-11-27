package com.project.generate.model;

import java.util.ArrayList;

public class Profile {

    private ArrayList<Workout> workouts;
    private ArrayList<Exercise> exercises;

    public Profile() {
    }

    public ArrayList<Workout> getWorkouts() {
        return workouts;
    }

    public void setWorkouts(ArrayList<Workout> workouts) {
        this.workouts = workouts;
    }

    public ArrayList<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(ArrayList<Exercise> exercises) {
        this.exercises = exercises;
    }


}
