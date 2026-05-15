package com.restapi.main.Payment;

import java.util.List;

import com.restapi.main.OrderEntity;
import com.restapi.main.Address.AddressDTO;
import com.restapi.main.Product.ProductDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PaymentEntity {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bandId;

	private int paidAmount;

	private String status;
}
