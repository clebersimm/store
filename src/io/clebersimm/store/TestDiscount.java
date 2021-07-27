package io.clebersimm.store;

import java.math.BigDecimal;

import io.clebersimm.store.budget.Budget;
import io.clebersimm.store.discounts.DiscountCalculator;

public class TestDiscount {

	public static void main(String[] args) {
		Budget budget = new Budget(new BigDecimal("200"), 6);
		DiscountCalculator discountCalculator = new DiscountCalculator();
		System.out.println(discountCalculator.calculate(budget));
	}

}
