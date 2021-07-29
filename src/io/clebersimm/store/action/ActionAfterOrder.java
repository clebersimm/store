package io.clebersimm.store.action;

import io.clebersimm.store.order.Order;

public interface ActionAfterOrder {

	public void execute(Order order);
}
