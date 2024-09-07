package com.kinbo.dubbo3demo.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * 支持rest协议
 * @author songjunbao
 * @date 2024-09-07
 */
@Path("")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
public interface EchoService {

    @POST
    @Path("echo")
    EchoResult echo(EchoRequest echoRequest);

}
