package com.rudess.crud.example.service;

import com.rudess.crud.example.entity.Activity;
import com.rudess.crud.example.error.customException;
import com.rudess.crud.example.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.Order;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ActivityService {
    @Autowired
    private ActivityRepository repo;

    //Basic crud operations
    public Activity saveActivity (Activity activity) {
        /*activity = verifyActivity(activity);*/
        return repo.save(activity);
    }

    public void delete(int id) {
         repo.deleteById(id);
    }


    /*public List<Activity> saveActivity(List<Activity> activities) {
        return repo.saveAll(activities);
    }


    public List<Activity> getActivity () {
        return repo.findAll();
    }*/

    public Activity getActivityById(int id) {
        return repo.findById(id).orElse(null);
    }

    public String deleteActivityById(int id) {

        try {
            repo.deleteById(id);
        } catch(Exception e) {
            throw new customException("Entity Not Found");
        }
        return "Activity removed";
    }

    public Activity verifyActivity(Activity activity) {
        if(activity.getDuration() > 1) {
            throw new customException("Activity not Valid");
        }
        return null;
    }

    public Activity updateActivity(Activity activity) {
       Activity existingActivity = repo.findById(activity.getLogId()).orElse(null);
       existingActivity.setActivityName(activity.getActivityName());
       return repo.save(existingActivity);
    }


}


