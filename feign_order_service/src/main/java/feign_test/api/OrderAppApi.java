package feign_test.api;

import feign_test.serivce.MemberService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderAppApi {

    @Resource
    MemberService memberService;

    @RequestMapping("/getMemberPortByOrder")
    public String getMemberPortByOrder(){
        return "feign member port " +memberService.memberPort();
    }
}
