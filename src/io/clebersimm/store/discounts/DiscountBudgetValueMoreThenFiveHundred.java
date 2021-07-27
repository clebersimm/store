package io.clebersimm.store.discounts;

import java.math.BigDecimal;

import io.clebersimm.store.budget.Budget;

public class DiscountBudgetValueMoreThenFiveHundred extends Discount {

	public DiscountBudgetValueMoreThenFiveHundred(Discount next) {
		super(next);
	}

	public BigDecimal executeCal(Budget budget) {
		return budget.getValue().multiply(new BigDecimal("0.05"));
	}

	@Override
	public boolean apply(Budget budget) {
		return budget.getValue().compareTo(new BigDecimal("500")) > 0;
	}

}
