package com.sa46lll.core.member.service;

import com.sa46lll.core.member.entity.Member;

public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);

}
