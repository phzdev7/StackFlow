package main;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import entities.DBConnection;
import entities.Product;

public class Main {

	public static void main(String[] args) {
		
		
		 try (Scanner sc = new Scanner (System.in)){
		ArrayList<Product> produto = new ArrayList<>();
		
		
		
		
		
		System.out.println("===============================================================================");
		System.out.println("\n                                  STACKFLOW STORE");
		System.out.println("\n===============================================================================");
		
		
		try {
		    Connection conexao = DBConnection.conectar();

		    System.out.println("                         Conexão com o DATABASE realizada!");

		    conexao.close();

		} catch (SQLException e) {
		    System.out.println("Erro ao conectar com o banco:");
		    System.out.println(e.getMessage());
		}
		while(true) {
		System.out.println("\n                                       MENU");
		
		System.out.println("\n1 - VER ITENS PARA COMPRAR");
		System.out.println("2 - ADICIONAR AO CARRINHO");
		System.out.println("3 - REMOVER ITEM DA COMPRA ");
		System.out.println("4 - FINALIZAR");
		System.out.println("5 - ÁREA DO GERENTE");
		System.out.println("0 - SAIR");
		
		System.out.println("===============================================================================");
		System.out.print("Escolha: ");
		int escolha = sc.nextInt();
		System.out.println("===============================================================================");
		switch(escolha) {
		
		case 1: 
			try {
			    Connection conexao = DBConnection.conectar();

			    Statement stmt = conexao.createStatement();

			    ResultSet resultado = stmt.executeQuery("SELECT * FROM products");
			    int quantidade = 0;
			    while (resultado.next()) {
			        int id = resultado.getInt("id");
			        String nome = resultado.getString("nome");
			        double preco = resultado.getDouble("preco");
			        int estoque = resultado.getInt("estoque");


			        System.out.println("#" +  id + " - " + nome
			        		+ " | R$ " + preco
			        		+ " | Estoque: " + estoque);

			        quantidade++;
			    }
			    if (quantidade == 0) {
			        System.out.println("Nenhum produto disponível no momento.");
			    }
			} catch (SQLException e) {
			    System.out.println("Erro ao buscar produtos: " + e.getMessage());
			}
			break;
			
			
			
			
			
			
			
			
			
			
			
			
			
		case 0:
			System.out.println("Adeus!");
			return;
			
			
		case 5: 
			System.out.print("Senha do Gerente: ");
			String senha = sc.next();
			String pass = "300309";
			if (senha.equals(pass)) {
			    System.out.println("Seja bem-vindo Gerente!");
			    
			} else {
			    System.out.println("Senha não autorizada");
			    continue;
			    
			}
			
			//GERENTEEEEEEEEE 
			boolean menuGerenteAtivo = true;
			while(menuGerenteAtivo) {
			System.out.println("\n                                       MENU");
			System.out.println("\n1 - CADASTRAR PRODUTO");
			System.out.println("2 - LISTAR PRODUTOS");
			System.out.println("3 - EXCLUIR PRODUTO");
			System.out.println("4 - ATUALIZAR PRODUTO");
			System.out.println("5 - CONSULTAR PRODUTO");
			System.out.println("6 - HISTÓRICO DE VENDAS");
			System.out.println("7 - RELATÓRIO DA LOJA");
			System.out.println("0 - VOLTAR PARA O MENU PRINCIPAL");
			
			System.out.println("===============================================================================");
			System.out.print("Escolha: ");
			escolha = sc.nextInt();
			System.out.println("===============================================================================");
			switch(escolha) {
			
			case 1:
				
				sc.nextLine();
				System.out.print("Nome do Produto: ");
				String nome = sc.nextLine();
				
				System.out.print("Preço: R$");
				BigDecimal preco = sc.nextBigDecimal();
				System.out.print("Quantidade no estoque: ");
				int estoque = sc.nextInt();
				
				String sql = "INSERT INTO products (nome, preco, estoque) VALUES (?, ?, ?)";
				
				 try (Connection conexao = DBConnection.conectar();
				         PreparedStatement stmt = conexao.prepareStatement(sql)) {

				        stmt.setString(1, nome);
				        stmt.setBigDecimal(2, preco);
				        stmt.setInt(3, estoque);

				        stmt.executeUpdate();

				        System.out.println("Produto cadastrado com sucesso!");

				    } catch (SQLException e) {
				        System.out.println("Erro ao cadastrar produto: " + e.getMessage());
				    }

				    break;
			
			
			case 2:
				
				try {
				    Connection conexao = DBConnection.conectar();

				    Statement stmt = conexao.createStatement();

				    ResultSet resultado = stmt.executeQuery("SELECT * FROM products");
				    int quantidade = 0;
				    while (resultado.next()) {
				        int id = resultado.getInt("id");
				        nome = resultado.getString("nome");
				        preco = resultado.getBigDecimal("preco");
				        estoque = resultado.getInt("estoque");


				        System.out.println("#" +  id + " - " + nome
				        		+ " | R$ " + preco
				        		+ " | Estoque: " + estoque);

				        quantidade++;
				    }
				    if (quantidade == 0) {
				        System.out.println("Nenhum produto disponível no momento.");
				    }
				} catch (SQLException e) {
				    System.out.println("Erro ao buscar produtos: " + e.getMessage());
				}
			
				break;
			
			case 3:

				
				try {
				    Connection conexao = DBConnection.conectar();

				    Statement stmt = conexao.createStatement();

				    ResultSet resultado = stmt.executeQuery("SELECT * FROM products");
				    int quantidade = 0;
				    while (resultado.next()) {
				        int id = resultado.getInt("id");
				        nome = resultado.getString("nome");
				        preco = resultado.getBigDecimal("preco");
				        estoque = resultado.getInt("estoque");


				        System.out.println("#" +  id + " - " + nome
				        		+ " | R$ " + preco
				        		+ " | Estoque: " + estoque);

				        quantidade++;
				    }
				    if (quantidade == 0) {
				        System.out.println("Nenhum produto disponível no momento.");
				    }
				} catch (SQLException e) {
				    System.out.println("Erro ao buscar produtos: " + e.getMessage());
				}
				System.out.println("item que deseja remover: #");
				long e = sc.nextLong();
				
				 sql = "DELETE FROM products WHERE id = ?";
				 try (Connection conexao = DBConnection.conectar();
					     PreparedStatement stmt = conexao.prepareStatement(sql)) {

					    stmt.setLong(1, e);

					    int linhasAfetadas = stmt.executeUpdate();

					    if (linhasAfetadas > 0) {
					        System.out.println("Produto excluído com sucesso!");
					    } else {
					        System.out.println("Produto não encontrado.");
					    }

					} catch (SQLException ex) {
					    System.out.println("Erro ao excluir produto: " + ex.getMessage());
					}

					break;
			
			case 4:
				
			
			
			
			
			
			
			case 0:
			    menuGerenteAtivo = false;
			    break;
			}
				
			}//AREA DO GERENTE	
				
			}
		
		 }
		 }
	}

}
