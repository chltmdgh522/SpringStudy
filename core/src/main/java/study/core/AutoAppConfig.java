package study.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;
import study.core.member.MemberRepository;
import study.core.member.MemoryMemberRepository;

@Configuration
@ComponentScan(
       // basePackages = "study.core.member",
        excludeFilters = @ComponentScan.Filter(type=FilterType.ANNOTATION,classes = Configuration.class)

)
public class AutoAppConfig {

    @Bean("memoryMemberRepository")
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}
