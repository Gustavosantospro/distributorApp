package com.distributor.controller;

import com.distributor.controller.request.DistributorRequest;
import com.distributor.controller.response.DistributorResponse;
import com.distributor.service.DistributorService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Log4j2
@RequestMapping("/api/distributor")
public class DistributorController {

    @Autowired
    private DistributorService distributorService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<DistributorResponse> saveDistributor(@RequestBody DistributorRequest requestDistributor) {

        log.info("receivable distributor={}", requestDistributor.toString());
        return new ResponseEntity(distributorService.save(requestDistributor), HttpStatus.CREATED);

    }
}
