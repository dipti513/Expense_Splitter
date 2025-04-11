package com.expense.splitter.controller;

import com.expense.splitter.model.QueryResponse;
import com.expense.splitter.service.QueryResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/query-responses")
public class QueryResponseController {
    @Autowired
    private QueryResponseService queryResponseService;

    @PostMapping
    public QueryResponse createQueryResponse(@RequestBody QueryResponse queryResponse) {
        return queryResponseService.createQueryResponse(queryResponse);
    }

    @GetMapping("/{id}")
    public QueryResponse getQueryResponseById(@PathVariable Long id) {
        return queryResponseService.getQueryResponseById(id);
    }
}