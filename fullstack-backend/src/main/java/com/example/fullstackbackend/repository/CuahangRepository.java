package com.example.fullstackbackend.repository;

import com.example.fullstackbackend.entity.Cuahang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface CuahangRepository extends JpaRepository<Cuahang, Integer> {

}