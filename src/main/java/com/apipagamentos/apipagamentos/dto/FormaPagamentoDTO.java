package com.apipagamentos.apipagamentos.dto;

import com.apipagamentos.apipagamentos.enums.Tipo;
import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FormaPagamentoDTO {

    @NotNull
    private Tipo tipo;
    @NotNull
    private int parcelas;

}
