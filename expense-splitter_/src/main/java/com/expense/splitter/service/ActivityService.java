package com.expense.splitter.service;

import com.expense.splitter.model.Activity;
import com.expense.splitter.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ActivityService {
    @Autowired
    private ActivityRepository activityRepository;

    public Activity logActivity(Activity activity) {
        return activityRepository.save(activity);
    }

    public Activity getActivityById(Long id) {
        return activityRepository.findById(id).orElse(null);
    }
    public void deleteActivity(Long id) {
        activityRepository.deleteById(id);
    }
}
