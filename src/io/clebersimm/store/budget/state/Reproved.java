package io.clebersimm.store.budget.state;

import io.clebersimm.store.budget.Budget;

public class Reproved extends BudgetState {

	@Override
	public void finish(Budget budget) {
		budget.setBudgetState(new Finished());
	}

}
