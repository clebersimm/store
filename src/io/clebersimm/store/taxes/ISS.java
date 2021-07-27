package io.clebersimm.store.taxes;

import java.math.BigDecimal;

import io.clebersimm.store.budget.Budget;

/**
 * Calculate the ISS taxes over the budget
 * 
 * @author Cleber Luis Simm
 *
 */
public class ISS implements Tax {

	public BigDecimal calculate(Budget budget) {
		return budget.getValue().multiply(new BigDecimal("0.06"));
	}

}
