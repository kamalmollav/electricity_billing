package com.numetry.electricity_billing.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "electricity_bills")
public class ElectricityBill {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String consumerName;
	    private double unitsConsumed;
	    private double totalAmount;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getConsumerName() {
			return consumerName;
		}
		public void setConsumerName(String consumerName) {
			this.consumerName = consumerName;
		}
		public double getUnitsConsumed() {
			return unitsConsumed;
		}
		public void setUnitsConsumed(double unitsConsumed) {
			this.unitsConsumed = unitsConsumed;
		}
		public double getTotalAmount() {
			return totalAmount;
		}
		public void setTotalAmount(double totalAmount) {
			this.totalAmount = totalAmount;
		}

}
