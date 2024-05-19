package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    /* 스프링 부트 thymeleaf viewName 매핑
     * - resources:templates/ +{ViewName}+ .html
     * - spring-boot-devtools 라이브러리를 추가하면 html 파일을 컴파일만 해주면 서버 재시작 없이 View 파일 변경이 가능
     *   -> IntelliJ 컴파일 방법: 메뉴-build-Recompile */
    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello!!!");
        return "hello";
    }

}
