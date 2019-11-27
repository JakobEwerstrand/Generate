package com.project.generate.model;

import androidx.annotation.NonNull;

public enum MuscleGroup {

    //TODO put a monkey on adding more muscleGroups.
    BACK {
        @NonNull
        @Override
        public String toString() {
            return "Back";
        }

        @Override
        public int getId() {
            return 0;
        }
    }, CHEST {
        @NonNull
        @Override
        public String toString() {
            return "Chest";
        }

        @Override
        public int getId() {
            return 1;
        }
    };



    public abstract int getId();
}
