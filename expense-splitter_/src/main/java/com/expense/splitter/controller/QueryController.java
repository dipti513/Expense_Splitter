package com.expense.splitter.controller;

import com.expense.splitter.model.Query;
import com.expense.splitter.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/queries")
public class QueryController {
    @Autowired
    private QueryService queryService;

    @PostMapping
    public Query createQuery(@RequestBody Query query) {
        return queryService.createQuery(query);
    }

    @GetMapping("/{id}")
    public Query getQueryById(@PathVariable Long id) {
        return queryService.getQueryById(id);
    }
}