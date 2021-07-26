package io.clebersimm.store.strategy.taxes;

import java.math.BigDecimal;

import io.clebersimm.store.strategy.budget.Budget;

public interface Tax {

	BigDecimal calculate (Budget budget);
	
}
