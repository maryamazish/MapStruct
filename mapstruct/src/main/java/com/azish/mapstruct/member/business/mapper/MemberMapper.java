package com.azish.mapstruct.member.business.mapper;


import com.azish.mapstruct.member.persistence.Member;
import com.azish.mapstruct.member.presentation.MemberDto;
import org.mapstruct.Mapper;

import java.util.ArrayList;
import java.util.List;

/**
 * کلاس مبدل انتیتی و مدل عضو
 */
@Mapper(componentModel = "spring")
public interface MemberMapper {
    MemberDto toDto(Member entity);
    Member toEntity(MemberDto dto);
    ArrayList<MemberDto> toDtoLis(List<Member> entityList);
    List<Member> toEntityList(ArrayList<MemberDto> dtoList);
}