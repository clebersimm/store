package io.clebersimm.store.discounts;

import java.math.BigDecimal;

import io.clebersimm.store.budget.Budget;

public class DiscountBudgetMoreThenFiveItens extends Discount {

	public DiscountBudgetMoreThenFiveItens(Discount next) {
		super(next);
	}

	public BigDecimal calculate(Budget budget) {
		if (budget.getAmountItems() > 5) {
			return budget.getValue().multiply(new BigDecimal("0.1"));
		}
		return next.calculate(budget);
	}

}
