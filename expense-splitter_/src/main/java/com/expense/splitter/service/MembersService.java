package com.expense.splitter.service;

import com.expense.splitter.model.Members;
import com.expense.splitter.repository.MembersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MembersService {
    @Autowired
    private MembersRepository membersRepository;

    public Members addMember(Members member) {
        return membersRepository.save(member);
    }

    public Members getMemberById(Long id) {
        return membersRepository.findById(id).orElse(null);
    }
}
