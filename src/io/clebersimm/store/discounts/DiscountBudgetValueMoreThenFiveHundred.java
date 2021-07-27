package io.clebersimm.store.discounts;

import java.math.BigDecimal;

import io.clebersimm.store.budget.Budget;

public class DiscountBudgetValueMoreThenFiveHundred extends Discount {

	public DiscountBudgetValueMoreThenFiveHundred(Discount next) {
		super(next);
	}

	public BigDecimal calculate(Budget budget) {
		if (budget.getValue().compareTo(new BigDecimal("500")) > 0) {
			return budget.getValue().multiply(new BigDecimal("0.05"));
		}
		return next.calculate(budget);
	}

}
