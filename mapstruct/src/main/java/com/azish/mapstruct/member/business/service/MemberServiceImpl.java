package com.azish.mapstruct.member.business.service;

import com.azish.mapstruct.member.business.mapper.MemberMapper;
import com.azish.mapstruct.member.persistence.Member;
import com.azish.mapstruct.member.persistence.MemberRepository;
import com.azish.mapstruct.member.presentation.MemberDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * کلاس پیاده سازی سرویس عضو
 */
@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class MemberServiceImpl implements MemberService {


    private final MemberRepository memberRepository;
    private final MemberMapper memberMapper;

    private static final String BUSINESS_EXCEPTION_MEMBER_NAME_IS_DUPLICATED = "BUSINESS_EXCEPTION.MEMBER_NAME_IS_DUPLICATED";

    public MemberServiceImpl(MemberRepository memberRepository, MemberMapper memberMapper) {
        this.memberRepository = memberRepository;
        this.memberMapper = memberMapper;
    }


    /**
     * متد ثبت عضو
     *
     * @param memberDto مدل عضو
     * @return خروجی: مدل عضو با شناسه
     */
    @Override
    public MemberDto create(MemberDto memberDto) {
        Member member = memberRepository.save(memberMapper.toEntity(memberDto));
        memberDto.setId(member.getId());
        return memberDto;
    }


}
