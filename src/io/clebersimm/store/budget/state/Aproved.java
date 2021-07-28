package io.clebersimm.store.budget.state;

import java.math.BigDecimal;

import io.clebersimm.store.budget.Budget;

public class Aproved extends BudgetState {

	public BigDecimal calculateValueExtraDiscount(Budget budget) {
		return budget.getValue().multiply(new BigDecimal("0.02"));
	}
	
	@Override
	public void finish(Budget budget) {
		budget.setBudgetState(new Finished());
	}
	
}
