package com.rudess.crud.example.controller;

import com.rudess.crud.example.entity.Activity;
import com.rudess.crud.example.service.ActivityService;
import com.rudess.crud.example.type.ActivityListDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.rmi.activation.ActivationID;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ActivityController {
    @Autowired
    private ActivityService activityService;

    //Api for adding activity
    @PostMapping("/addActivity")
    public Activity addActivity(@RequestBody Activity activity) {
        return activityService.saveActivity(activity);
    }

    //Api for saving activity
    @PostMapping("/saveActivity")
    public ActivityListDTO addActivityList(@RequestBody ActivityListDTO dto) {
        dto.getActivities().forEach(activity -> {
            Activity a1 = activityService.saveActivity(activity);
            System.out.println(a1);
        });
        return dto;
    }

    //Api for finding activity from id
    @GetMapping("/activity/{id}")
    public Activity findActivityById (@PathVariable int id) {
        return activityService.getActivityById(id);
    }

    //Api for updating activity
    @PutMapping("/update")
    public ActivityListDTO update(@RequestBody ActivityListDTO dto) {
        dto.getActivities().forEach(activity -> {
            activityService.saveActivity(activity);
        });
        return dto;
    }

    //Api for deleting activity
    @DeleteMapping("/deleteActivity/{id}")
    public void deleteActivityById(@PathVariable int id) {
        activityService.deleteActivityById(id);
    }

    //Basic unit testing
    public String testController(String testString) {
        return  String.format("test done successfully for " + testString);
    }
}
