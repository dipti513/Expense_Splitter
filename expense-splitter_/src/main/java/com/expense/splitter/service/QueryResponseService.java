package com.expense.splitter.service;

import com.expense.splitter.model.QueryResponse;
import com.expense.splitter.repository.QueryResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QueryResponseService {
    @Autowired
    private QueryResponseRepository queryResponseRepository;

    public QueryResponse createQueryResponse(QueryResponse queryResponse) {
        return queryResponseRepository.save(queryResponse);
    }

    public QueryResponse getQueryResponseById(Long id) {
        return queryResponseRepository.findById(id).orElse(null);
    }
}