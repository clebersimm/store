package io.clebersimm.store.budget.state;

import java.math.BigDecimal;

import io.clebersimm.store.budget.Budget;

public class UnderAnalysis extends BudgetState {

	public BigDecimal calculateValueExtraDiscount(Budget budget) {
		return budget.getValue().multiply(new BigDecimal("0.05"));
	}
	
	@Override
	public void aprove(Budget budget) {
		budget.setBudgetState(new Aproved());
	}
	
	@Override
	public void reprove(Budget budget) {
		super.reprove(budget);
	}
		
}
