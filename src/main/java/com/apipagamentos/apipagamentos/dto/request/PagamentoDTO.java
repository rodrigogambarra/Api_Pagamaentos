package com.apipagamentos.apipagamentos.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PagamentoDTO {

    @NotNull
    private TransacaoDTO transacao;
}
