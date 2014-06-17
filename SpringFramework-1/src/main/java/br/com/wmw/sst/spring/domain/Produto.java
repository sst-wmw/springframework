package br.com.wmw.sst.spring.domain;

public class Produto {

	private Integer cdProduto;
	private String dsProduto;

	public Produto(final Integer cdProduto, final String dsProduto) {
		this.cdProduto = cdProduto;
		this.dsProduto = dsProduto;
	}

	public Integer getCdProduto() {
		return cdProduto;
	}

	public void setCdProduto(final Integer cdProduto) {
		this.cdProduto = cdProduto;
	}

	public String getDsProduto() {
		return dsProduto;
	}

	public void setDsProduto(final String dsProduto) {
		this.dsProduto = dsProduto;
	}

	@Override
	public String toString() {
		return String.format("%s - %s", cdProduto, dsProduto);
	}

}
