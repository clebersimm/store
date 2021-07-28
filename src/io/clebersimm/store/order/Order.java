package io.clebersimm.store.order;

import java.time.LocalDateTime;

import io.clebersimm.store.budget.Budget;

public class Order {

	private String cliente;
	private LocalDateTime data;
	private Budget budget;

	public Order(String cliente, LocalDateTime data, Budget budget) {
		this.cliente = cliente;
		this.data = data;
		this.budget = budget;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public Budget getBudget() {
		return budget;
	}

	public void setBudget(Budget budget) {
		this.budget = budget;
	}

}
