package com.kinbo.dubbo3demo.api;

import java.io.Serializable;

/**
 * @author songjunbao
 * @date 2024-09-07
 */

public class EchoRequest implements Serializable {

    private String item;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
