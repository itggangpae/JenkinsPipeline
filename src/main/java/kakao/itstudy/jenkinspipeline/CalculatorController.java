package kakao.itstudy.jenkinspipeline;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CalculatorController {
    private final Calculator calculator;

    @RequestMapping("/")
    String sum(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
        System.out.println("Hello Cron");
        return String.valueOf(calculator.sum(a, b));
    }
}
