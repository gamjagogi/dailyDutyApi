package dailyduty.hjson.dailydutyapi.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;


// 컴밴션 : 로그.디버그("디버그  :  내용"); 스페이스 두번
@Slf4j
@Configuration
public class SecuriyConfig {

    // BCryptPasswordEncoder 사용하기

    // SecurityFilterChain 사용해서 CSRF해제하기 예외 날리고!
    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        // 1. CSRF 해제하기

        // 2. Form 로그인 설정  http.formLogin().로그인페이지패턴().로그인접근url().접근핸들러((요청,응답,어쎔티)->로그)
                // .실패핸들러((요청,응답,예외)-> 로그)

        // 3. 인증, 권한 필터 설정
                //  http.인증요청(오브젝트-> 오브젝트.매칭패턴().401().anyRequest().permitAll());
        return http.build();
    }
}
