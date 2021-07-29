package io.clebersimm.store;

import java.math.BigDecimal;
import java.util.Arrays;

import io.clebersimm.store.action.PersistOrder;
import io.clebersimm.store.action.SendOrderEmail;
import io.clebersimm.store.order.BuildOrder;
import io.clebersimm.store.order.BuildOrderHandler;

public class TestOrder {

	public static void main(String[] args) {
		BuildOrder buildOrder = new BuildOrder("Test", new BigDecimal("1000"), 1);
		BuildOrderHandler handler = new BuildOrderHandler(Arrays.asList(new PersistOrder(), new SendOrderEmail()));
		handler.execute(buildOrder);
	}

}
