package com.sa46lll.core.discount;

import com.sa46lll.core.member.entity.Grade;
import com.sa46lll.core.member.entity.Member;

public class FixDiscountPolicy implements DiscountPolicy {

    private int discountFixAmount = 1000; // 1000원 할인

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        }
        return 0;
    }
}
