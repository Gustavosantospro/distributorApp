package com.distributor.controller.response;

import com.distributor.controller.request.DistributorRequest;
import com.distributor.model.Distributor;
import lombok.Data;

import java.util.UUID;


@Data
public class DistributorResponse extends DistributorRequest {

    private UUID id;

    public static DistributorResponse setResponse(Distributor dis){
        DistributorResponse distributorResponse = new DistributorResponse();
        distributorResponse.setId(dis.getId());
        distributorResponse.setName(dis.getName());
        distributorResponse.setCategory(dis.getCategory());
        distributorResponse.setNeighborhood(dis.getNeighborhood());

        return distributorResponse;
    }


}
