package com.sa46lll.core.discount;

import com.sa46lll.core.member.entity.Member;

public interface DiscountPolicy {

    /**
     * @return 할인 대상 금액
     */
    int discount(Member member, int price);

}
