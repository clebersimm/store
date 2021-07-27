package io.clebersimm.store;

import java.math.BigDecimal;

import io.clebersimm.store.budget.Budget;
import io.clebersimm.store.taxes.ICMS;
import io.clebersimm.store.taxes.ISS;
import io.clebersimm.store.taxes.TaxCalculator;

public class TestTaxes {

	public static void main(String[] args) {
		Budget budget = new Budget(new BigDecimal("100"), 1);
		TaxCalculator taxCalculator = new TaxCalculator();
		System.out.println(taxCalculator.calculate(budget, new ICMS()));
		System.out.println(taxCalculator.calculate(budget, new ISS()));
	}

}
