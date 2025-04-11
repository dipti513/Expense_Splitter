package com.expense.splitter.controller;

import com.expense.splitter.model.GroupTable;
import com.expense.splitter.service.GroupTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/groups")
public class GroupTableController {
    @Autowired
    private GroupTableService groupTableService;

    @PostMapping
    public GroupTable createGroup(@RequestBody GroupTable group) {
        return groupTableService.createGroup(group);
    }

    @GetMapping("/{id}")
    public GroupTable getGroupById(@PathVariable Long id) {
        return groupTableService.getGroupById(id);
    }
}