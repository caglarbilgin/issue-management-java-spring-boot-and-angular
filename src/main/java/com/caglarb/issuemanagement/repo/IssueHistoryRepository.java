package com.caglarb.issuemanagement.repo;

import com.caglarb.issuemanagement.entity.IssueHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueHistoryRepository extends JpaRepository<IssueHistory,Long> {
}
