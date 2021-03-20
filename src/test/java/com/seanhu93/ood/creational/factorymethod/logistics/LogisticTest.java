package com.seanhu93.ood.creational.factorymethod.logistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LogisticTest {

    @Test
    public void testLogistics() {

        Logistics seaLogistics = new SeaLogistics();
        Assertions.assertEquals(seaLogistics.planDelivery(), "Deliver by ship");

        Logistics roadLogistics = new RoadLogistics();
        Assertions.assertEquals(roadLogistics.planDelivery(), "Deliver by trunk");
    }
}
