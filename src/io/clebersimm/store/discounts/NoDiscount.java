package io.clebersimm.store.discounts;

import java.math.BigDecimal;

import io.clebersimm.store.budget.Budget;

public class NoDiscount extends Discount {

	public NoDiscount() {
		super(null);
	}

	public BigDecimal executeCal(Budget budget) {
		return BigDecimal.ZERO;
	}

	@Override
	public boolean apply(Budget budget) {
		return true;
	}

}
