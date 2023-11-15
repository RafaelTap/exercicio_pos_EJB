package com.outlook.rafael_taparica.web;

import java.io.IOException;
import java.io.PrintWriter;

import com.outlook.rafael_taparica.interfaces.FolhaPagamento;

import jakarta.ejb.EJB;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/folha")
public class ServLetFolha extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@EJB
	FolhaPagamento fp;

	public ServLetFolha() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		try {

			int salario = Integer.parseInt(request.getParameter("salario"));

			fp.setSalario(salario);
			out.print("Salario Bruto: " + salario);
			out.print("<br/>Salario Liquido: " + fp.calcularSalarioLiquido());
			out.print("<br/>");
			out.print(fp.getCartao());

		} catch (Exception e) {
			out.print(e.getMessage());
		}
	}
}
