package com.example.firstproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Member {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String email;
    @Column
    private String passwd;
    // Article 생성자 추가
    public Member(Long id, String email, String passwd) {
        this.id = id;
        this.email = email;
        this.passwd = passwd;
    }
    // toString() 메서드 추가
    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", passwd='" + passwd + '\'' +
                '}';
    }
}
