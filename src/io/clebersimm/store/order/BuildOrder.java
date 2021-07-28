package io.clebersimm.store.order;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import io.clebersimm.store.budget.Budget;

public class BuildOrder {

	private String cliente;
	private BigDecimal valueBudget;
	private int amountItems;

	public BuildOrder(String cliente, BigDecimal valueBudget, int amountItems) {
		this.cliente = cliente;
		this.valueBudget = valueBudget;
		this.amountItems = amountItems;
	}


	public String getCliente() {
		return cliente;
	}

	public BigDecimal getValueBudget() {
		return valueBudget;
	}

	public int getAmountItems() {
		return amountItems;
	}

}
