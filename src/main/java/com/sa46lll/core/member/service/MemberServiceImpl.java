package com.sa46lll.core.member.service;

import com.sa46lll.core.member.entity.Member;
import com.sa46lll.core.member.repository.MemberRepository;
import com.sa46lll.core.member.repository.MemoryMemberRepository;

public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
