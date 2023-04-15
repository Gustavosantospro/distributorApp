package com.distributor.repository;

import com.distributor.model.Distributor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DistributorRepository extends JpaRepository<Distributor, UUID> {
}
