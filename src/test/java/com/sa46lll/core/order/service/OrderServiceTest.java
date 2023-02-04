package com.sa46lll.core.order.service;

import com.sa46lll.core.member.entity.Grade;
import com.sa46lll.core.member.entity.Member;
import com.sa46lll.core.member.service.MemberService;
import com.sa46lll.core.member.service.MemberServiceImpl;
import com.sa46lll.core.order.entity.Order;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class OrderServiceTest {

    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder() {
        // given
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        // when
        Order order = orderService.createOrder(memberId, "itemA", 10000);

        // then
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }

}
