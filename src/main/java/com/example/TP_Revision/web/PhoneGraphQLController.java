package com.example.TP_Revision.web;

import com.example.TP_Revision.service.PhoneManager;
import com.example.TP_Revision.service.dtos.PhoneDTO;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;

import java.util.List;

public class PhoneGraphQLController {
    private final PhoneManager phoneManager;

    public PhoneGraphQLController(PhoneManager phoneManager) {
        this.phoneManager = phoneManager;
    }

    @QueryMapping
    public List<PhoneDTO> getPhoneByModel(@Argument String model) {
        return phoneManager.getPhonesByModel(model);
    }

    @QueryMapping
    public List<PhoneDTO> getPhoneByModelAndPrice(@Argument String model, @Argument Float price) {
        return phoneManager.getPhonesByModelAndPrice(model, price);
    }

    @MutationMapping
    public PhoneDTO savePhone(@Argument PhoneDTO phoneDTO) {
        return phoneManager.savePhone(phoneDTO);
    }

    @MutationMapping
    public void deletePhone(@Argument Long id) {
        phoneManager.deletePhone(id);
    }
}
