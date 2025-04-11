package com.expense.splitter.service;

import com.expense.splitter.model.Query;
import com.expense.splitter.repository.QueryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QueryService {
    @Autowired
    private QueryRepository queryRepository;

    public Query createQuery(Query query) {
        return queryRepository.save(query);
    }

    public Query getQueryById(Long id) {
        return queryRepository.findById(id).orElse(null);
    }
}