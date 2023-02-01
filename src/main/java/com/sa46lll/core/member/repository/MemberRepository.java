package com.sa46lll.core.member.repository;

import com.sa46lll.core.member.entity.Member;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);
}
