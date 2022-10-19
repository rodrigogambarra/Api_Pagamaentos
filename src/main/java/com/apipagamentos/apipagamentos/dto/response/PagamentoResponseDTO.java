package com.apipagamentos.apipagamentos.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class PagamentoResponseDTO {

    private TransacaoResponseDTO transacao;

}
