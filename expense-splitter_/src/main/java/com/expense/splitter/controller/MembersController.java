package com.expense.splitter.controller;

import com.expense.splitter.model.Members;
import com.expense.splitter.service.MembersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/members")
public class MembersController {
    @Autowired
    private MembersService membersService;

    @PostMapping
    public Members addMember(@RequestBody Members member) {
        return membersService.addMember(member);
    }

    @GetMapping("/{id}")
    public Members getMemberById(@PathVariable Long id) {
        return membersService.getMemberById(id);
    }
}