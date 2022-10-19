package com.apipagamentos.apipagamentos.model;

import com.apipagamentos.apipagamentos.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Descricao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double valor;
    private String dataHora;
    private String estabelecimento;
    private long nsu;
    private long codigoAutorizacao;
    private Status status;

}


