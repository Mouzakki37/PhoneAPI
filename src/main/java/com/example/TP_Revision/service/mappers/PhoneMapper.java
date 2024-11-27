package com.example.TP_Revision.service.mappers;

import com.example.TP_Revision.dao.entities.Phone;
import com.example.TP_Revision.service.dtos.PhoneDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class PhoneMapper {
    private final ModelMapper modelMapper = new ModelMapper();

    public PhoneDTO toDTO(Phone phone) {
        return modelMapper.map(phone, PhoneDTO.class);
    }

    public Phone toEntity(PhoneDTO phoneDTO) {
        return modelMapper.map(phoneDTO, Phone.class);
    }
}
