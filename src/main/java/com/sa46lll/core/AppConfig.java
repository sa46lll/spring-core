package com.sa46lll.core;

import com.sa46lll.core.discount.DiscountPolicy;
import com.sa46lll.core.discount.RateDiscountPolicy;
import com.sa46lll.core.member.repository.MemoryMemberRepository;
import com.sa46lll.core.member.service.MemberService;
import com.sa46lll.core.member.service.MemberServiceImpl;
import com.sa46lll.core.order.service.OrderService;
import com.sa46lll.core.order.service.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    private MemoryMemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    private DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }
}
