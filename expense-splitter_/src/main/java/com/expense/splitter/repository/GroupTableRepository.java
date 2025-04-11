package com.expense.splitter.repository;

import com.expense.splitter.model.GroupTable;
import com.expense.splitter.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface GroupTableRepository extends JpaRepository<GroupTable, Long> {
    Optional<GroupTable> findByGroupName(String groupName);

    @Query("SELECT g FROM GroupTable g WHERE g.createdBy = :user OR :user MEMBER OF g.members")
    List<GroupTable> findByCreatedByOrMembersContaining(@Param("user") User user);
}