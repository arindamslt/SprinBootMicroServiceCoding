package com.arindam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.arindam.model.Order;
import com.arindam.repo.OrderRepo;

@Service
public class OrderService {
private static final String TOPIC = "order-events";
@Autowired
private KafkaTemplate<String, String> kafkaTemplate;
	@Autowired
private OrderRepo orepo;
	public void addData(Order order)
	{
		Order savedOrder = orepo.save(order);
		kafkaTemplate.send(TOPIC, "Order Placed: " + savedOrder.getPname());
	}
	public List<Order> getData()
	{
		return orepo.findAll();
	}

}
