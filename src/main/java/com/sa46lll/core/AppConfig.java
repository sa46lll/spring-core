package com.sa46lll.core;

import com.sa46lll.core.discount.DiscountPolicy;
import com.sa46lll.core.discount.RateDiscountPolicy;
import com.sa46lll.core.member.repository.MemoryMemberRepository;
import com.sa46lll.core.member.service.MemberService;
import com.sa46lll.core.member.service.MemberServiceImpl;
import com.sa46lll.core.order.service.OrderService;
import com.sa46lll.core.order.service.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public MemoryMemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }
}
