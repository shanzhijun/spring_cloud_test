package feign_test.serivce;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "feign-member")
public interface MemberService {

    @RequestMapping("/memberPort")
    public String memberPort();
}
