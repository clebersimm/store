package io.clebersimm.store.action;

import io.clebersimm.store.order.Order;

public class PersistOrder implements ActionAfterOrder {

	public void execute(Order order) {
		System.out.println("persisting budget");
	}

}
