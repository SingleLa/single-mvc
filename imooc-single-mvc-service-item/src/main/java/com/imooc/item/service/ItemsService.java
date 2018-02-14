package com.imooc.item.service;

import com.imooc.pojo.Items;

public interface ItemsService {

	/**
	 * @Description: 根据商品id获取商品
	 */
	public Items getItem(String itemId);
	
	/**
	 * @Description: 购买商品成功后减少库存
	 */
	public void displayReduceCounts(String itemId, int buyCounts);

}

