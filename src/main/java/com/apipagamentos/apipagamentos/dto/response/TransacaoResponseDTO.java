package com.apipagamentos.apipagamentos.dto.response;

import com.apipagamentos.apipagamentos.dto.FormaPagamentoDTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransacaoResponseDTO {

    private int cartao;
    private Long id;
    private DescricaoResponseDTO descricao;
    private FormaPagamentoDTO formaPagamento;

}
