package io.clebersimm.store.action;

import io.clebersimm.store.order.Order;

public class SendOrderEmail implements ActionAfterOrder {

	public void execute(Order order) {
		System.out.println("sending email");
	}

}
