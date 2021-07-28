package io.clebersimm.store.order;

import java.time.LocalDateTime;

import io.clebersimm.store.budget.Budget;

public class BuildOrderHandler {

	// Deps
	public BuildOrderHandler() {

	}

	public void execute(BuildOrder buildOrder) {
		Budget budget = new Budget(buildOrder.getValueBudget(), buildOrder.getAmountItems());
		Order order = new Order(buildOrder.getCliente(), LocalDateTime.now(), budget);
	}

}
