package com.outlook.rafael_taparica.interfaces;

public interface FolhaPagamento {
	
	void setSalario(double salario);
	
	double calcularINSS (double taxa);
	
	double calcularSalarioLiquido ();

	char[] getCartao();

}
