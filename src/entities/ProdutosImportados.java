package entities;

public class ProdutosImportados extends Produto {
	
	private Double taxaAlfandega;
	
	public ProdutosImportados() {
		
	}

	public ProdutosImportados(String nome, Double preco, Double taxaAlfandega) {
		super(nome, preco);
		this.taxaAlfandega = taxaAlfandega;
	}

	public Double getTaxaAlfandega() {
		return taxaAlfandega;
	}

	public void setTaxaAlfandega(Double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}
	
	public double precoTotal() {
		return super.getPreco() + taxaAlfandega;
	}
	
	@Override
	public String etiquetaPreco() {
		return super.getNome() + " $ " + precoTotal() + "  (Taxa de alfandega: "+(String.format("%.2f", taxaAlfandega)+")");
	}

	

	
}
