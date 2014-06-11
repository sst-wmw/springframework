package br.com.wmw.spring.domain;

public class Produto extends AbstractDomain {

	private Integer cdProduto;
	private String dsProduto;
	private Double vlProduto;

	public Produto(final Integer cdProduto, final String dsProduto, final Double vlProduto) {
		this.cdProduto = cdProduto;
		this.dsProduto = dsProduto;
		this.vlProduto = vlProduto;
		setFlImpresso("N");
	}

	public Integer getCdProduto() {
		return cdProduto;
	}

	public void setCdProduto(Integer cdProduto) {
		this.cdProduto = cdProduto;
	}

	public String getDsProduto() {
		return dsProduto;
	}

	public void setDsProduto(String dsProduto) {
		this.dsProduto = dsProduto;
	}

	public Double getVlProduto() {
		return vlProduto;
	}

	public void setVlProduto(Double vlProduto) {
		this.vlProduto = vlProduto;
	}

	public String toString() {
		return cdProduto + " : " + dsProduto + " : " + vlProduto;
	}

}
