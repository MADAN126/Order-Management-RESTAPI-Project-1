package com.restapi.main.Address;

import java.util.List;

import com.restapi.main.OrderEntity;
import com.restapi.main.Payment.PaymentDTO;
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
public class AddressEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addrId;

	private String streetName;

	private String buildingName;

	private String city;

	private String state;

	private int pinCode;

	private int flatNumber;
}
