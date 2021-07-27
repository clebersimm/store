package io.clebersimm.store.discounts;

import java.math.BigDecimal;

import io.clebersimm.store.budget.Budget;

public class DiscountBudgetMoreThenFiveItens extends Discount {

	public DiscountBudgetMoreThenFiveItens(Discount next) {
		super(next);
	}

	public BigDecimal executeCal(Budget budget) {
		return budget.getValue().multiply(new BigDecimal("0.1"));
	}

	@Override
	public boolean apply(Budget budget) {
		return (budget.getAmountItems() > 5);
	}

}
