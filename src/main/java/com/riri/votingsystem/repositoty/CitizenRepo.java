package com.riri.votingsystem.repositoty;

import com.riri.votingsystem.entity.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitizenRepo extends JpaRepository<Citizen,Long> {
    public Citizen findByName(String name);
}
