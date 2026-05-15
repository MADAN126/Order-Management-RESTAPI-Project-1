package com.restapi.main;

import java.util.List;

import com.restapi.main.Address.AddressDTO;
import com.restapi.main.Address.AddressEntity;
import com.restapi.main.Payment.PaymentDTO;
import com.restapi.main.Payment.PaymentEntity;
import com.restapi.main.Product.ProductDTO;
import com.restapi.main.Product.ProductEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "order_entity")
public class OrderEntity {
	@Id
	private String email;

	private String fullName;

	private long mobileNumber;

	private int totalAmount;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "email_id",referencedColumnName = "email")
	private List<ProductEntity> productInfo;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "addr_Id")
	private AddressEntity addr;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "band_Id")
	private PaymentEntity payment;

}
