package com.sophos.restlogiccore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sophos.restlogiccore.dtos.Certificate;

public interface ICertificateRepo extends JpaRepository<Certificate, Integer> {

}
