package com.example.TP_Revision.service;

import com.example.TP_Revision.service.dtos.PhoneDTO;

import java.util.List;

public interface PhoneManager {
    PhoneDTO savePhone(PhoneDTO phoneDTO);
    void deletePhone(Long id);
    List<PhoneDTO> getPhonesByModel(String model);
    List<PhoneDTO> getPhonesByModelAndPrice( String model, float price);

}
