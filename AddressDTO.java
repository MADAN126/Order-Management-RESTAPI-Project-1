package com.restapi.main.Address;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AddressDTO {

	private Integer addrId;

	private String streetName;

	private String buildingName;

	private String city;

	private String state;

	private int pinCode;

	private int flatNumber;
}
