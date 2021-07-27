package io.clebersimm.store.discounts;

import java.math.BigDecimal;

import io.clebersimm.store.budget.Budget;

public abstract class Discount {

	protected Discount next;

	public Discount(Discount next) {
		this.next = next;
	}

	public BigDecimal calculate(Budget budget) {
		if (apply(budget)) {
			return executeCal(budget);
		}
		return next.calculate(budget);
	}

	protected abstract BigDecimal executeCal(Budget budget);

	public abstract boolean apply(Budget budget);

}
