package io.clebersimm.store.discounts;

import java.math.BigDecimal;

import io.clebersimm.store.budget.Budget;

public abstract class Discount {

	protected Discount next;

	public Discount(Discount next) {
		this.next = next;
	}

	public abstract BigDecimal calculate(Budget budget);

}
