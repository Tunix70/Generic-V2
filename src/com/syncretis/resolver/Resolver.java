package com.syncretis.resolver;

import com.syncretis.Model.Material;
import com.syncretis.handler.MainHandler;
import com.syncretis.productContainer.RecyclableMaterialContainer;

public interface Resolver {
    MainHandler transmitHandler(RecyclableMaterialContainer<? extends Material> container);
}
