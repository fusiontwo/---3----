package com.example.firstproject.repository;

import com.example.firstproject.entity.Member;
// CrudRepository 패키지 자동 임포트
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member, Long> {
}
