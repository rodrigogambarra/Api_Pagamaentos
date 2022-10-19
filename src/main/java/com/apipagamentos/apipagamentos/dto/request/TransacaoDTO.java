package com.apipagamentos.apipagamentos.dto.request;

import com.apipagamentos.apipagamentos.dto.FormaPagamentoDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransacaoDTO {

    @NotNull
    private Long id;
    @NotNull
    private int cartao;
    @NotNull
    private DescricaoDTO descricao;
    @NotNull
    private FormaPagamentoDTO formaPagamento;
}
