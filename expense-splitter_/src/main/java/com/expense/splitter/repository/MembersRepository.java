package com.expense.splitter.repository;

import com.expense.splitter.model.Members;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembersRepository extends JpaRepository<Members, Long> {
}