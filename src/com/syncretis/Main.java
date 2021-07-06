package com.syncretis;

import com.syncretis.Model.Glass;
import com.syncretis.Model.Paper;
import com.syncretis.Model.Plastic;
import com.syncretis.handler.MainHandler;
import com.syncretis.productContainer.RecyclableMaterialContainer;
import com.syncretis.resolver.Resolver;
import com.syncretis.resolver.ResolverContainer;

public class Main {

    public static void main(String[] args) {
        RecyclableMaterialContainer<Glass> glassMat = new RecyclableMaterialContainer<>(400, Glass.class);
        RecyclableMaterialContainer<Paper> paperFirst = new RecyclableMaterialContainer<>(200, Paper.class);
        RecyclableMaterialContainer<Plastic> plasticFirst = new RecyclableMaterialContainer<>(500, Plastic.class);
        RecyclableMaterialContainer<Paper> paperSecond = new RecyclableMaterialContainer<>(900, Paper.class);
        RecyclableMaterialContainer<Plastic> plasticSecond = new RecyclableMaterialContainer<>(1500, Plastic.class);

        Resolver resolverContainer = new ResolverContainer();
        MainHandler mainHandler = resolverContainer.transmitHandler(paperSecond);
        mainHandler.printMass();

    }
}
