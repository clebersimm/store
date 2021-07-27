package io.clebersimm.store.taxes;

import java.math.BigDecimal;

import io.clebersimm.store.budget.Budget;

public interface Tax {

	BigDecimal calculate (Budget budget);
	
}
