package com.cpt202.appointment_system.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

import java.util.List;

import com.cpt202.appointment_system.Models.ServiceType;

public interface ServiceTypeRepo extends JpaRepository<ServiceType, Integer>{
    
    public ServiceType  findBySid(Integer sid);

    public List<ServiceType> findAll();

    @SuppressWarnings("unchecked")
    public ServiceType save(ServiceType service);

    public void deleteById(Integer sid);

    public List<ServiceType> findByServiceNameContaining(String name);

}
