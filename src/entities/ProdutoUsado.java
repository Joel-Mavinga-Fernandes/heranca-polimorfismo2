package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

	private Date dataFabrico;
	
	public ProdutoUsado() {	
	}

	public ProdutoUsado(String nome, Double preco, Date dataFabrico) {
		super(nome, preco);
		this.dataFabrico = dataFabrico;
	}

	public SimpleDateFormat getSdf() {
		return sdf;
	}

	public void setSdf(SimpleDateFormat sdf) {
		this.sdf = sdf;
	}

	public Date getDataFabrico() {
		return dataFabrico;
	}

	public void setDataFabrico(Date dataFabrico) {
		this.dataFabrico = dataFabrico;
	}
	
	@Override
	public String etiquetaPreco() {
		return super.getNome() + "(usado) $ "+ (String.format("%.2f", super.getPreco()) + "(Data de fabrico:"+getDataFabrico()+ ")");
	
	
	}
	
}
