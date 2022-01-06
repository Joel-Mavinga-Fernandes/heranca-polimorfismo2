package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoUsado;
import entities.ProdutosImportados;

public class Program {

	public static void main(String[] args) throws ParseException {
		 
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Produto> list = new ArrayList<>();
		
		System.out.print("Digite a quantidade de produtos: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Digite os dados do #"+i+" produto");
			System.out.print("Nacional, Usada ou Importado (n/u/i)?");
			char a = sc.next().charAt(0);
			if(a=='n') {
				System.out.print("Nome: ");
				String nome = sc.next();
				System.out.print("Preço: ");
				Double preco = sc.nextDouble();
				Produto produto = new Produto(nome, preco);
				list.add(produto);
			}
			else if(a=='u') {
				System.out.print("Nome: ");
				String nome = sc.next();
				System.out.print("Preço: ");
				Double preco = sc.nextDouble();
				System.out.println("Data (dd/MM/yyy): ");
				Date dataFabrico = sdf.parse(sc.next());
				Produto produto = new ProdutoUsado(nome, preco, dataFabrico);
				list.add(produto);
			}
			else if(a=='i') {
				System.out.print("Nome: ");
				String nome = sc.next();
				System.out.print("Preço: ");
				Double preco = sc.nextDouble();
				System.out.print("Taxa da alfandega: ");
				Double taxaAlfandega = sc.nextDouble();
				Produto produto = new ProdutosImportados(nome, preco, taxaAlfandega);
				list.add(produto);
			}	
		}
		
		for (Produto produto: list) {
			System.out.println(produto.etiquetaPreco());
		}
	
		sc.close();

	}

}
