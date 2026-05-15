package com.restapi.main.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.main.OrderDTO;
import com.restapi.main.OrderEntity;
import com.restapi.main.Address.AddressEntity;
import com.restapi.main.Payment.PaymentEntity;
import com.restapi.main.Product.ProductDTO;
import com.restapi.main.Product.ProductEntity;
import com.restapi.main.Repo.Repo;

@Service
public class ServiceLayer {

	@Autowired
	Repo repo;

	public List<OrderEntity> load() {
		List<OrderEntity> list = repo.findAll();
		return list;
	}

	public String create(OrderDTO o1) {
		PaymentEntity p1 = new PaymentEntity();
		p1.setPaidAmount(o1.getPayment().getPaidAmount());
		p1.setStatus(o1.getPayment().getStatus());

		AddressEntity a1 = new AddressEntity();
		a1.setBuildingName(o1.getAddr().getBuildingName());
		a1.setCity(o1.getAddr().getCity());
		a1.setFlatNumber(o1.getAddr().getFlatNumber());
		a1.setPinCode(o1.getAddr().getPinCode());
		a1.setState(o1.getAddr().getState());
		a1.setStreetName(o1.getAddr().getStreetName());

		List<ProductEntity> products = new ArrayList();

		for (ProductDTO p : o1.getProductInfo()) {

			ProductEntity product = new ProductEntity();

			product.setPrice(p.getPrice());
			product.setQuantity(p.getQuantity());
			product.setSpecs(p.getSpecs());
			products.add(product);
		}

		OrderEntity order = new OrderEntity();
		order.setEmail(o1.getEmail());
		order.setFullName(o1.getFullName());
		order.setMobileNumber(o1.getMobileNumber());
		order.setTotalAmount(o1.getTotalAmount());
		order.setAddr(a1);
		order.setPayment(p1);
		order.setProductInfo(products);
		repo.save(order);
		repo.flush();
		return order.getFullName() + " detail is stored";
	}

}
