package com.apipagamentos.apipagamentos.dto.request;

import com.apipagamentos.apipagamentos.model.Descricao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DescricaoDTO {

    @NotNull
    private double valor;
    @NotNull
    private String dataHora;
    @NotEmpty
    private String estabelecimento;

}
