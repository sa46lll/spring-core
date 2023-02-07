package com.sa46lll.core;

import com.sa46lll.core.discount.RateDiscountPolicy;
import com.sa46lll.core.member.repository.MemoryMemberRepository;
import com.sa46lll.core.member.service.MemberService;
import com.sa46lll.core.member.service.MemberServiceImpl;
import com.sa46lll.core.order.service.OrderService;
import com.sa46lll.core.order.service.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(new MemoryMemberRepository(), new RateDiscountPolicy());
    }
}
