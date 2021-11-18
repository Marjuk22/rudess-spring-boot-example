package com.rudess.crud.example.type;

import com.rudess.crud.example.entity.ActivityLevel;

import java.util.List;

public class ActivityLevelListDTO {
    public List<ActivityLevel> getActivityLevels() {
        return activityLevels;
    }

    public void setActivityLevels(List<ActivityLevel> activityLevels) {
        this.activityLevels = activityLevels;
    }

    private List<ActivityLevel> activityLevels;
}
