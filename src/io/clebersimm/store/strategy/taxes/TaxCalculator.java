package io.clebersimm.store.strategy.taxes;

import java.math.BigDecimal;

import io.clebersimm.store.strategy.budget.Budget;

public class TaxCalculator {

	public BigDecimal calculate(Budget budget, Tax tax) {
		return tax.calculate(budget);
	}

}
