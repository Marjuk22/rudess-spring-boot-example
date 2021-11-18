package com.rudess.crud.example.entity;

import com.rudess.crud.example.type.ActivityLevelListDTO;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ACTIVITY")

public class Activity implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int logId;


    public List<ActivityLevel> getActivityLevel() {
        return activityLevel;
    }

    public void setActivityLevel(List<ActivityLevel> activityLevel) {
        this.activityLevel = activityLevel;
    }

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(
            name="activity_level",
            joinColumns = @JoinColumn(name="activity_id")
    )
    private List<ActivityLevel> activityLevel;


    /*public List<ActivityLevel> getActivityLevels() {
        return activityLevels;
    }

    public void setActivityLevels(List<ActivityLevel> activityLevels) {
        this.activityLevels = activityLevels;
    }

    @OneToMany(mappedBy="activity", cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = ActivityLevel.class)
    private List<ActivityLevel> activityLevels;*/

    private String activityName;
    private int activityTypeId;
    private int calories;
    private long duration;
    private int elevationGain;
    private Instant lastModified;
    private String logType;
    private long steps;

    public int getLogId() {
        return logId;
    }

    public void setLogId(int logId) {
        this.logId = logId;
    }

    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public int getElevationGain() {
        return elevationGain;
    }

    public void setElevationGain(int elevationGain) {
        this.elevationGain = elevationGain;
    }

    public long getSteps() {
        return steps;
    }

    public void setSteps(long steps) {
        this.steps = steps;
    }

    public Instant getLastModified() {
        return lastModified;
    }

    public void setLastModified(Instant lastModified) {
        this.lastModified = lastModified;
    }

    public int getActivityTypeId() {
        return activityTypeId;
    }

    public void setActivityTypeId(int activityTypeId) {
        this.activityTypeId = activityTypeId;
    }
}
