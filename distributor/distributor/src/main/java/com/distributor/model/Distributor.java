package com.distributor.model;

import com.distributor.controller.request.DistributorRequest;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
public class Distributor {

    @Id
    private UUID id;
    private String name;
    private String category;
    private String neighborhood;


    public static Distributor toDomain(DistributorRequest requestDistributor) {
        Distributor distributor = new Distributor();
        distributor.setName(requestDistributor.getName());
        distributor.setCategory(requestDistributor.getCategory());
        distributor.setNeighborhood(requestDistributor.getNeighborhood());
        distributor.setId(UUID.randomUUID());

        return distributor;
    }
}
