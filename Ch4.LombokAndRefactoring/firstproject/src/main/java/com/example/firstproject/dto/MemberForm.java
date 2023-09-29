package com.example.firstproject.dto;

import com.example.firstproject.entity.Member;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class MemberForm {
    private String email;  // 이메일을 받을 필드
    private String password;  // 비밀번호를 받을 필드
    // MemberForm 생성자와 toString() 메서드 삭제
    public Member toEntity() {
        return new Member(null, email, password);
    }
}
