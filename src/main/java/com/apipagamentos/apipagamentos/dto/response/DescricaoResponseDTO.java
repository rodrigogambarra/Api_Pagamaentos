package com.apipagamentos.apipagamentos.dto.response;

import com.apipagamentos.apipagamentos.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DescricaoResponseDTO {

    private double valor;
    private String dataHora;
    private String estabelecimento;
    private long nsu;
    private long codigoAutorizacao;
    private Status status;

}
