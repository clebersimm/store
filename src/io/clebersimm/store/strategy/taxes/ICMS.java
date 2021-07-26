package io.clebersimm.store.strategy.taxes;

import java.math.BigDecimal;

import io.clebersimm.store.strategy.budget.Budget;

/**
 * Calculate the ICMS taxes over the budget
 * 
 * @author Cleber Luis Simm
 *
 */
public class ICMS implements Tax {

	public BigDecimal calculate(Budget budget) {
		return budget.getValue().multiply(new BigDecimal("0.1"));
	}

}
