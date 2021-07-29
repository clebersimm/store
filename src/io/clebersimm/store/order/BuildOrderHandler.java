package io.clebersimm.store.order;

import java.time.LocalDateTime;
import java.util.List;

import io.clebersimm.store.action.ActionAfterOrder;
import io.clebersimm.store.budget.Budget;

public class BuildOrderHandler {

	private List<ActionAfterOrder> actions;

	// Deps
	public BuildOrderHandler(List<ActionAfterOrder> actions) {
		this.actions = actions;
	}

	public void execute(BuildOrder buildOrder) {
		Budget budget = new Budget(buildOrder.getValueBudget(), buildOrder.getAmountItems());
		Order order = new Order(buildOrder.getCliente(), LocalDateTime.now(), budget);
		actions.forEach(action -> action.execute(order));
	}

}