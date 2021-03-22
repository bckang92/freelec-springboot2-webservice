package com.kbc.personalPjt.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//Mybatis Dao 역할, db layer 접근자 JpaRepository<엔티티클래스, pk타입> 상속하여 인터페이스 생성하면 자동으로 CRUD 생성
public interface PostsRepository extends JpaRepository<Posts, Long> {

    @Query("SELECT p FROM Posts p ORDER BY p.id DESC")
    List<Posts> findAllDesc();
}