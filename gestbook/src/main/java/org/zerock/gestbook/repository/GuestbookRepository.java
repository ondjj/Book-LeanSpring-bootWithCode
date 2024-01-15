package org.zerock.gestbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.zerock.gestbook.entity.Guestbook;

public interface GuestbookRepository extends JpaRepository<Guestbook, Long>,
        QuerydslPredicateExecutor<Guestbook> {
}
