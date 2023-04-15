package com.distributor.service;

import com.distributor.controller.request.DistributorRequest;
import com.distributor.controller.response.DistributorResponse;

public interface DistributorService {
    DistributorResponse save(DistributorRequest requestDistributor);
}
