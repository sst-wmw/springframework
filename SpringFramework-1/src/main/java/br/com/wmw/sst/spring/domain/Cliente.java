package br.com.wmw.sst.spring.domain;

import br.com.wmw.spring.domain.AbstractDomain;

public class Cliente extends AbstractDomain {

	private Integer cdCliente;
	private String nmCliente;

	public Cliente(final Integer cdCliente, final String nmCliente) {
		this.cdCliente = cdCliente;
		this.nmCliente = nmCliente;
		setFlImpresso("N");
	}

	public Integer getCdCliente() {
		return cdCliente;
	}

	public void setCdCliente(Integer cdCliente) {
		this.cdCliente = cdCliente;
	}

	public String getNmCliente() {
		return nmCliente;
	}

	public void setNmCliente(String nmCliente) {
		this.nmCliente = nmCliente;
	}

	public String toString() {
		return cdCliente + " : " + nmCliente;
	}

}
