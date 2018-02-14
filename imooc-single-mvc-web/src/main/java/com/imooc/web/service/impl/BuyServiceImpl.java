package com.imooc.web.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imooc.item.service.ItemsService;
import com.imooc.order.service.OrdersService;
import com.imooc.web.service.BuyService;

@Service("buyService")
public class BuyServiceImpl implements BuyService {
	
	final static Logger log = LoggerFactory.getLogger(BuyServiceImpl.class);
	
	@Autowired
	private ItemsService itemService;

	@Autowired
	private OrdersService ordersService;
	
	@Override
	public void doBuyItem(String itemId) {
		// 减少库存
		itemService.displayReduceCounts(itemId, 1);
		
		// 创建订单
		ordersService.createOrder(itemId);
	}
	
}

