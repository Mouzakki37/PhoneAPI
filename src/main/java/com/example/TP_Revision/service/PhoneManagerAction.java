package com.example.TP_Revision.service;

import com.example.TP_Revision.dao.entities.Phone;
import com.example.TP_Revision.dao.repositories.PhoneRepository;
import com.example.TP_Revision.service.dtos.PhoneDTO;
import com.example.TP_Revision.service.mappers.PhoneMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneManagerAction implements PhoneManager{
    private PhoneRepository phoneRepository;
    private PhoneMapper phoneMapper;
    @Override
    public PhoneDTO savePhone(PhoneDTO phoneDTO) {
        if (phoneRepository.existsByIMEI(phoneDTO.getIMEI())) {
            throw new IllegalArgumentException("IMEI already exists.");
        }
        Phone phone = phoneMapper.toEntity(phoneDTO);
        return phoneMapper.toDTO(phoneRepository.save(phone));
    }

    @Override
    public void deletePhone(Long id) {
        phoneRepository.deleteById(id);
    }

    @Override
    public List<PhoneDTO> getPhonesByModel(String model) {
        return null;
    }

    @Override
    public List<PhoneDTO> getPhoneByModelAndPrice(String model, float price) {
        return null;
    }
}
