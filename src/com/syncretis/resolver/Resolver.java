package com.syncretis.resolver;

import com.syncretis.Model.Material;
import com.syncretis.handler.Handler;

public interface Resolver {
    Handler<? extends Material> getHandler(Class<? extends Material> type);
}
