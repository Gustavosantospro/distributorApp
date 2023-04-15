package com.distributor.service.impl;

import com.distributor.controller.request.DistributorRequest;
import com.distributor.controller.response.DistributorResponse;
import com.distributor.model.Distributor;
import com.distributor.repository.DistributorRepository;
import com.distributor.service.DistributorService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class DistributorServiceImpl implements DistributorService {

    @Autowired
    private DistributorRepository distributorRepository;
    @Override
    public DistributorResponse save(DistributorRequest requestDistributor) {
        Distributor distributor = null;
        try {
            distributor = distributorRepository.save(Distributor.toDomain(requestDistributor));
            log.info("success distributor - id:".concat(distributor.getId().toString()));
        } catch (Exception e) {
            log.error("error in save - "+ e.getMessage(), e);
        }

        return  DistributorResponse.setResponse(distributor);
    }

}
