package io.clebersimm.store.discounts;

import java.math.BigDecimal;

import io.clebersimm.store.budget.Budget;

public class DiscountCalculator {

	public BigDecimal calculate(Budget budget) {
		if(budget.getAmountItems() > 5) {
			return budget.getValue().multiply(new BigDecimal("0.1"));
		}
		return BigDecimal.ZERO;
	}
	
}
