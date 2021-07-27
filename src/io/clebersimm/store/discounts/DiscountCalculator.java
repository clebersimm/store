package io.clebersimm.store.discounts;

import java.math.BigDecimal;

import io.clebersimm.store.budget.Budget;

public class DiscountCalculator {

	public BigDecimal calculate(Budget budget) {

		Discount discount = new DiscountBudgetMoreThenFiveItens(
				new DiscountBudgetValueMoreThenFiveHundred(
						new NoDiscount()));

		return discount.calculate(budget);
	}

}
