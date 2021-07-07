package com.syncretis.productContainer;

import com.syncretis.Model.Material;

public class ProductContainer <MATERIAL extends Material> extends Container{
    private final Class<MATERIAL> type;

    public ProductContainer(double mass, Class<MATERIAL> type) {
        super(mass);
        this.type = type;
    }

    public Class<MATERIAL> getType(){
        return type;
    }
}
