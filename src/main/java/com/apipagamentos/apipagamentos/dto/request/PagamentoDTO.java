package com.apipagamentos.apipagamentos.dto.request;

import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PagamentoDTO {

    @NotNull
    private TransacaoDTO transacao;
}
