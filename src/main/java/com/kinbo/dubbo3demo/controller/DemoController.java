package com.kinbo.dubbo3demo.controller;

import com.kinbo.dubbo3demo.reference.GreetsServiceAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author songjunbao
 * @date 2024-08-10
 */
@RestController
@RequestMapping
public class DemoController {

    @Autowired
    private GreetsServiceAdapter greetsServiceAdapter;


    @RequestMapping("/greets/{name}")
    public String greets(@PathVariable String name) {

        return greetsServiceAdapter.greets(name);
    }
}
