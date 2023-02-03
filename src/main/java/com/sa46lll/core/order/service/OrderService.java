package com.sa46lll.core.order.service;

import com.sa46lll.core.order.entity.Order;

public interface OrderService {

    Order createOrder(Long memberId, String itemName, int itemPrice);
}
