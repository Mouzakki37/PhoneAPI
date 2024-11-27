package com.example.TP_Revision.dao.repositories;

import com.example.TP_Revision.dao.entities.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PhoneRepository extends JpaRepository<Phone, Long> {
    List<Phone> findByModel(String model);
    List<Phone> findByModelAndPrice(String model, Float price);
    boolean existsByIMEI(String imei);
}
