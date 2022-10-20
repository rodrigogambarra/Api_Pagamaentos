package com.apipagamentos.apipagamentos.model;

import com.apipagamentos.apipagamentos.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Descricao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double valor;
    private LocalDateTime dataHora;
    private String estabelecimento;
    private long nsu;
    private long codigoAutorizacao;
    private Status status;

}


