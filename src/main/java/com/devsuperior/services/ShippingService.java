package com.devsuperior.services;

import org.springframework.stereotype.Service;

import com.devsuperior.entities.Order;

@Service
public class ShippingService {
	
	public double shipment(Order order) {
		if (order.getBasic() < 100) {
			return 20;
		}else if (order.getBasic() < 200) {
			return 10;
		}
		return 0;
	}

}
