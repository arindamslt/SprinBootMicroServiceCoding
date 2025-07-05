package com.arindam;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arindam.model.Register;

@Repository
public interface RegisterRepo extends JpaRepository<Register,String> {

}
