package com.sa46lll.core.order.service;

import com.sa46lll.core.discount.DiscountPolicy;
import com.sa46lll.core.discount.FixDiscountPolicy;
import com.sa46lll.core.member.entity.Member;
import com.sa46lll.core.member.repository.MemberRepository;
import com.sa46lll.core.member.repository.MemoryMemberRepository;
import com.sa46lll.core.order.entity.Order;

public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
