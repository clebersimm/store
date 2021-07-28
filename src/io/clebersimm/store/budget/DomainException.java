package io.clebersimm.store.budget;

public class DomainException extends RuntimeException {

	private static final long serialVersionUID = -3391280071390542200L;
	
	public DomainException(String exception) {
		System.out.println(exception);
	}

}
