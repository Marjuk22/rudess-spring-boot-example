package com.rudess.crud.example.type;

import com.rudess.crud.example.entity.Activity;

import java.util.List;

public class ActivityListDTO {
    private List<Activity> activities;

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }
}
