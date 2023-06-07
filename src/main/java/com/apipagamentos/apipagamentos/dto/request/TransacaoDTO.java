package com.apipagamentos.apipagamentos.dto.request;

import com.apipagamentos.apipagamentos.dto.FormaPagamentoDTO;
import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
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
