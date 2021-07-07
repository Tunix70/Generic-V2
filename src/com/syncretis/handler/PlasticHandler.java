package com.syncretis.handler;

import com.syncretis.Model.Material;
import com.syncretis.productContainer.RecyclableMaterialContainer;

public class PlasticHandler extends Handler{
    RecyclableMaterialContainer<? extends Material> container;

    public PlasticHandler(RecyclableMaterialContainer<? extends Material> container) {
        this.container = container;
    }

    @Override
    public void handle() {
        System.out.println(container.getMass());
    }

    @Override
    public Class getType() {
        return container.getType();
    }
}
