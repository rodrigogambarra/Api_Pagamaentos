package com.apipagamentos.apipagamentos.model;

import com.apipagamentos.apipagamentos.enums.Tipo;
import lombok.*;

import javax.persistence.*;

//@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class FormaPagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Tipo tipo;
    private int parcelas;

}
