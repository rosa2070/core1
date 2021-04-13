package hello.core1.scan;

import hello.core1.AutoAppConfig;
import hello.core1.member.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutoAppConfigTest {

    @Test
    void basicScan() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AutoAppConfig.class);

        MemberService memberService = ac.getBean(MemberService.class);
        org.assertj.core.api.Assertions.assertThat(memberService).isInstanceOf(MemberService.class);
    }
}
