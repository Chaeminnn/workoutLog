package com.example.workoutlog.dto;

import java.time.LocalDateTime;

public class WorkoutInput {
    private String exerciseName;
    private String duration;
    private String content;

    public String getExerciseName() {
        return exerciseName;
    }
    public String getDuration() {
        return duration;
    }
    public String getContent() {
        return content;
    }
}
