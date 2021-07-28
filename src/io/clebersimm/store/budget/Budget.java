package io.clebersimm.store.budget;

import java.math.BigDecimal;

import io.clebersimm.store.budget.state.BudgetState;
import io.clebersimm.store.budget.state.UnderAnalysis;

public class Budget {

	private BigDecimal value;
	private int amountItems;
	private BudgetState budgetState;

	public Budget(BigDecimal value, int amountItems) {
		this.value = value;
		this.amountItems = amountItems;
		this.budgetState = new UnderAnalysis();
	}

	public void applyDiscountExtra() {
		BigDecimal discountValue = this.budgetState.calculateValueExtraDiscount(this);
		this.value = this.value.subtract(discountValue);
	}
	
	public void aprove() {
		this.budgetState.aprove(this);
	}
	
	public void reprove() {
		this.budgetState.reprove(this);
	}
	
	public void finish() {
		this.budgetState.finish(this);
	}

	public BigDecimal getValue() {
		return value;
	}

	public int getAmountItems() {
		return amountItems;
	}


	public BudgetState getBudgetState() {
		return budgetState;
	}

	public void setBudgetState(BudgetState budgetState) {
		this.budgetState = budgetState;
	}

}
