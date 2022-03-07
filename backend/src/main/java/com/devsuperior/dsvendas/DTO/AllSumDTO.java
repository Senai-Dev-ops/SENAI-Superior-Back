package com.devsuperior.dsvendas.DTO;

import java.io.Serializable;

public class AllSumDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Double sum1;
	private Long sum2;
	private Long sum3;
	
	public AllSumDTO(){	
	}

	public AllSumDTO(Double sum1, Long sum2, Long sum3) {
		this.sum1 = sum1;
		this.sum2 = sum2;
		this.sum3 = sum3;
	}

	public Double getTotalValor() {
		return sum1;
	}

	public void setTotalValor(Double sum1) {
		this.sum1 = sum1;
	}

	public Long getTotalFechados() {
		return sum2;
	}

	public void setTotalFechado(Long sum2) {
		this.sum2 = sum2;
	}
	
	public Long getTotalVisitado() {
		return sum3;
	}

	public void setTotalVisitado(Long sum3) {
		this.sum3 = sum3;
	}
	
}
