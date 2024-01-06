package com.numetry.electricity_billing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.numetry.electricity_billing.entity.ElectricityBill;
import com.numetry.electricity_billing.service.ElectricityBillService;

@RestController
@RequestMapping("/api/bills")
public class ElectricityBillController {
	@Autowired
    private ElectricityBillService billService;

    @PostMapping
    public ResponseEntity<ElectricityBill> createBill(@RequestBody ElectricityBill bill) {
        ElectricityBill createdBill = billService.createBill(bill);
        return new ResponseEntity<>(createdBill, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ElectricityBill>> getAllBills() {
        List<ElectricityBill> bills = billService.getAllBills();
        return new ResponseEntity<>(bills, HttpStatus.OK);
    }
}
