package com.expense.splitter.controller;

import com.expense.splitter.model.Activity;
import com.expense.splitter.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/activities")
public class ActivityController {
    @Autowired
    private ActivityService activityService;

    @PostMapping
    public Activity logActivity(@RequestBody Activity activity) {
        return activityService.logActivity(activity);
    }

    @GetMapping("/{id}")
    public Activity getActivityById(@PathVariable Long id) {
        return activityService.getActivityById(id);
    }
}