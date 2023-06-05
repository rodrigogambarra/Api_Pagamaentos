<h1 align="center">Api que simula uma requisição de pagamento e de estorno</h1>

---

**<p align="center">Sumário:</p>**
<p align="center">
<a href="#sobre">Sobre</a> |
<a href="#funcionalidades">Funcionalidades</a> |
<a href="#tecnologias-utilizadas">Tecnologias utilizadas</a> |
<a href="#servicos-e-sistemas-usados">Serviços e sistemas usados</a> |
<a href="#imagens">Imagens</a> |
<a href="#como-usar">Como usar</a> |
<a href="#pré-requisitos">Pré-requisitos</a> |
<a href="#links">Links</a> |
<a href="#autor">Autor</a></p>



## Sobre
Projeto desevolvido com o objetivo de simular requisições de pagamentos e estornos via Api Rest

## Funcionalidades
As principais funcionalidades do projeto são:

✅ Listar todos os pagamentos e seus status;

✅ Cadastrar um novo pagamento;

✅ Consultar um pagamento específico;

✅ Realizar estorno de um pagamento;


## Tecnologias utilizadas
* Java
* Spring Boot
* Spring Data
* JPA
* Hibernate
* H2
* JUnit, Mockito


## Serviços e sistemas usados
* GitHub
* Intellij

## Imagens
<p>No momento não há imagens</p>

## Como usar
<p>Após iniciar o sistema, a api disponibiliza os seguintes métodos request:</p>

1. RequestMethod <i>GET</i> para url: http://localhost:8080/api/pagamento/ - <b>Retorna lista todos pagamentos realizados e seus status</b>

2. RequestMethod <i>POST</i> Url: http://localhost:8080/api/pagamento - <b>Cadastra um novo pagamento, conforme exemplo:</b>

Exemplo:
{

    "transacao":{
            "cartao":"33233234",
            "id":677552,
            "descricao":{
                    "valor":"500.50",
                    "dataHora":"22/10/2022 13:58",
                    "estabelecimento":"Pet Shop Mundo Cão"
            },
            "formaPagamento":{
                    "tipo":"PARCELADO_LOJA",
                    "parcelas":"1"
            }
        }

}

3. RequestMethod <i>GET</i> Url: http://localhost:8080/api/pagamanto/{id} - <b>Retorna um pagamento específico a partir do valor do "id" da transação</b>


4. RequestMethod <i>PUT</i> Url: http://localhost:8080/api/pagamento/{id} - <b>Realiza estorno de um pagamento específico a partir do valor "id" da transação</b>

## Pré requisitos
Para abrir o sistema, basta o uso de um navegador de sua preferência.

## Links
* Repositório GitHub: https://github.com/rodrigogambarra/Api_Pagamentos
* Swagger: http://localhost:8080/swagger-ui.html

## Autor
✨ Feito por Rodrigo Gambarra!!

* rodrigo@gambarra.com.br
* <a href="linkedin.com/in/rodrigo-gambarra-2a195b151" target=”_blank”>LinkedIn</a>
* <a href="https://github.com/rodrigogambarra" target=”_blank”>GitHub</a>
