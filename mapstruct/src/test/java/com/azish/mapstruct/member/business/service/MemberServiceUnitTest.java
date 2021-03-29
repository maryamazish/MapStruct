package com.azish.mapstruct.member.business.service;


import com.azish.mapstruct.member.presentation.MemberDto;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Locale;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * کلاس تست واحد ماژول عضو
 */

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@Slf4j
public class MemberServiceUnitTest {

    @Autowired
    private MemberService memberService;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {

    }

    /**
     * این متد مقادیر پیش فرض را قبل از اجرای تمامی متدهای تست این کلاس مقداردهی اولیه میکند
     */
    @BeforeAll
    void beforeAll() {
        //تنظیم زبان لوکیل پروژه روی پارسی
        Locale.setDefault(new Locale("fa", "IR"));
    }

    @Test
    public void create() {
        MemberDto memberDto = new MemberDto();
        memberDto.setName("test");
        memberDto.setDescription("desc");
        memberDto = memberService.create(memberDto);
        //بررسی ها
        assertThat(memberDto).isNotNull();
        assertThat(memberDto.getId()).isNotNull();
    }

}
