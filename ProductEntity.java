package com.restapi.main.Product;

import java.util.List;

import com.restapi.main.OrderEntity;
import com.restapi.main.Address.AddressDTO;
import com.restapi.main.Payment.PaymentDTO;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProductEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;

	private int price;
	private int quantity;

	@ElementCollection
	private List<String> specs;

}
