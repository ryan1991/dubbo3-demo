package com.kinbo.dubbo3demo.service;

import com.kinbo.dubbo3demo.api.EchoRequest;
import com.kinbo.dubbo3demo.api.EchoResult;
import com.kinbo.dubbo3demo.api.EchoService;
import org.apache.dubbo.config.annotation.DubboService;


/**
 * @author songjunbao
 * @date 2024-09-07
 */
@DubboService(protocol = {"dubbo","rest"})
public class EchoServiceImpl implements EchoService {

    @Override
    public EchoResult echo(EchoRequest echoRequest) {
        System.out.println("echoRequest item:"+ echoRequest.getItem());
        EchoResult echoResult = new EchoResult();
        echoResult.setItem(echoRequest.getItem());
        return echoResult;
    }
}
