package io.clebersimm.store.budget.state;

import java.math.BigDecimal;

import io.clebersimm.store.budget.Budget;
import io.clebersimm.store.budget.DomainException;

public abstract class BudgetState {

	public BigDecimal calculateValueExtraDiscount(Budget budget) {
		return BigDecimal.ZERO;
	}
	
	public void aprove(Budget budget) {
		throw new DomainException("Budget cannot be aproved!");
	}

	public void reprove(Budget budget) {
		throw new DomainException("Budget cannot be reproved!");
	}
	
	public void finish(Budget budget) {
		throw new DomainException("Budget cannot be finished!");
	}

}
