package com.apipagamentos.apipagamentos.model;

import lombok.*;

import javax.persistence.*;

//@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn
    private Transacao transacao;

}
