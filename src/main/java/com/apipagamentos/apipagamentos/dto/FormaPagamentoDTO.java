package com.apipagamentos.apipagamentos.dto;

import com.apipagamentos.apipagamentos.enums.Tipo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FormaPagamentoDTO {

    @NotNull
    private Tipo tipo;
    @NotNull
    private int parcelas;

}
