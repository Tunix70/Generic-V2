package com.syncretis.handler;

import com.syncretis.Model.Material;
import com.syncretis.productContainer.ProductContainer;
import com.syncretis.productContainer.RecyclableMaterialContainer;

public abstract class Handler<MATERIAL extends Material> {
    public abstract void handle();

    public abstract Class<MATERIAL> getType();
}
