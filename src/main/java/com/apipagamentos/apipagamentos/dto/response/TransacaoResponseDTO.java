package com.apipagamentos.apipagamentos.dto.response;

import com.apipagamentos.apipagamentos.dto.FormaPagamentoDTO;

import lombok.Data;

@Data
public class TransacaoResponseDTO {

    private int cartao;
    private Long id;
    private DescricaoResponseDTO descricao;
    private FormaPagamentoDTO formaPagamento;

}
