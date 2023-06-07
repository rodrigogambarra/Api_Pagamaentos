package com.apipagamentos.apipagamentos.model;

import lombok.*;

import javax.persistence.*;

//@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Transacao {

    @Id
    private Long id;

    private int cartao;

    @OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn
    private Descricao descricao;

    @OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn
    private FormaPagamento formaPagamento;

}
