package com.azish.mapstruct.member.business.service;

import com.azish.mapstruct.member.presentation.MemberDto;

/**
 * اینترفیس سرویس عضو
 */
public interface MemberService {
    /**
     * متد ثبت عضو
     *
     * @param memberDto مدل عضو
     * @return خروجی: مدل عضو با شناسه
     */
    MemberDto create(MemberDto memberDto);
}
