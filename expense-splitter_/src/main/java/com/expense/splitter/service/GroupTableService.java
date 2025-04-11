package com.expense.splitter.service;

import com.expense.splitter.model.GroupTable;
import com.expense.splitter.repository.GroupTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupTableService {
    @Autowired
    private GroupTableRepository groupTableRepository;

    public GroupTable createGroup(GroupTable group) {
        return groupTableRepository.save(group);
    }

    public GroupTable getGroupById(Long id) {
        return groupTableRepository.findById(id).orElse(null);
    }
}
