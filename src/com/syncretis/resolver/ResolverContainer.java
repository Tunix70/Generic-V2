package com.syncretis.resolver;

import com.syncretis.Model.Glass;
import com.syncretis.Model.Material;
import com.syncretis.Model.Paper;
import com.syncretis.handler.GlassHandler;
import com.syncretis.handler.MainHandler;
import com.syncretis.handler.PaperHandler;
import com.syncretis.handler.PlasticHandler;
import com.syncretis.productContainer.RecyclableMaterialContainer;

public class ResolverContainer implements Resolver{
//map
    @Override
    public MainHandler transmitHandler(RecyclableMaterialContainer<? extends Material> recyclableMaterialContainer) {
        MainHandler handler = null;
        if(recyclableMaterialContainer.getType().equals(Glass.class)){
            handler = new GlassHandler(recyclableMaterialContainer.getMass());
        }
        if(recyclableMaterialContainer.getType().equals(Paper.class)){
            handler = new PaperHandler(recyclableMaterialContainer.getMass());
        }
        if(recyclableMaterialContainer.getType().equals(PlasticHandler.class)){
            handler = new PlasticHandler(recyclableMaterialContainer.getMass());
        }
        return handler;
    }
}
