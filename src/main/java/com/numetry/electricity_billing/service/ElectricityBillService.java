package com.numetry.electricity_billing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.numetry.electricity_billing.entity.ElectricityBill;
import com.numetry.electricity_billing.repository.ElectricityBillRepository;

@Service
public class ElectricityBillService {

    @Autowired
    private ElectricityBillRepository billRepository;

	public ElectricityBill createBill(ElectricityBill bill) {
		return  billRepository.save(bill);
	}

	public List<ElectricityBill> getAllBills() {
		return billRepository.findAll();
	}
}
