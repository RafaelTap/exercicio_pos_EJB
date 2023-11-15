package com.outlook.rafael_taparica.bean;

import jakarta.ejb.Local;
import jakarta.ejb.Stateless;
import com.outlook.rafael_taparica.interfaces.FolhaPagamento;

@Stateless // não guarda o estado atual.
@Local(FolhaPagamento.class)
public class FolhaPagamentoBean implements FolhaPagamento {

	private double salario;

	@Override
	public void setSalario(double salario) {

	}

	@Override
	public double calcularINSS(double taxa) {
		return salario * taxa / 100;
	}

	@Override
	public double calcularSalarioLiquido() {
		return salario - calcularINSS (10);
	}

	@Override
	public char[] getCartao() {
		return null;
	}

}
