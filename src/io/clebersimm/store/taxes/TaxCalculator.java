package io.clebersimm.store.taxes;

import java.math.BigDecimal;

import io.clebersimm.store.budget.Budget;

public class TaxCalculator {

	public BigDecimal calculate(Budget budget, Tax tax) {
		return tax.calculate(budget);
	}

}
