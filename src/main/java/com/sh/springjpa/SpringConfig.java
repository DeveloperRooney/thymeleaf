package com.sh.springjpa;

import com.sh.springjpa.repository.MemberRepository;
import com.sh.springjpa.repository.MemoryMemberRepository;
import com.sh.springjpa.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
