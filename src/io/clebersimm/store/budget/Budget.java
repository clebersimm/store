package io.clebersimm.store.budget;

import java.math.BigDecimal;

public class Budget {

	private BigDecimal value;
	private int amountItems;

	public BigDecimal getValue() {
		return value;
	}

	public int getAmountItems() {
		return amountItems;
	}

	public Budget(BigDecimal value, int amountItems) {
		this.value = value;
		this.amountItems = amountItems;
	}

}
