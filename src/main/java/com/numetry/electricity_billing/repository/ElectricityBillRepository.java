package com.numetry.electricity_billing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.numetry.electricity_billing.entity.ElectricityBill;

public interface ElectricityBillRepository extends JpaRepository<ElectricityBill, Long>{

}
