package com.kinbo.dubbo3demo.reference;


import com.kinbo.boot2deep.reference.GreetReply;
import com.kinbo.boot2deep.reference.GreetRequest;
import com.kinbo.boot2deep.reference.GreetsProvider;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Component;

/**
 * @author songjunbao
 * @date 2024-08-10
 */
@Component
public class GreetsServiceAdapter {

    @DubboReference(protocol = "tri", check = false)
    private GreetsProvider greetsService;

    public String greets(String userName){
        GreetRequest greetsReq = GreetRequest.newBuilder().setName(userName).build();
        GreetReply greetsReply = greetsService.greets(greetsReq);
        String message = greetsReply.getMessage();
        System.out.println("greets message:"+ message);
        return message;
    }


}
