package com.outlook.rafael_taparica.interfaces;

import jakarta.ejb.Local;
import jakarta.ejb.Stateless;

@Stateless
@Local (FolhaPagamento.class)
public class FolhaPagamentoBean implements FolhaPagamento {

}
