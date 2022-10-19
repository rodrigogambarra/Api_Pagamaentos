package com.apipagamentos.apipagamentos.controller;

import com.apipagamentos.apipagamentos.dto.request.PagamentoDTO;
import com.apipagamentos.apipagamentos.dto.response.PagamentoResponseDTO;
import com.apipagamentos.apipagamentos.model.Pagamento;
import com.apipagamentos.apipagamentos.enums.Status;
import com.apipagamentos.apipagamentos.services.ServicePagamento;
import com.apipagamentos.apipagamentos.services.exceptions.ServiceException;
import com.apipagamentos.apipagamentos.util.CustomErrorType;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;


@Api(value = "API REST PAGAMENTO")
@RestController
@RequestMapping("/api")
public class PagamentoController {

    @Autowired
    ServicePagamento pagamentoService;

    @ApiOperation(value = "Retorna todos Pagamentos")
    @RequestMapping(value = "/pagamento/", method = RequestMethod.GET)
    public ResponseEntity<List<PagamentoResponseDTO>> listResponseEntity() {
        List<PagamentoResponseDTO> pagamentos = pagamentoService.findAll();
        if(pagamentos.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<PagamentoResponseDTO>>(pagamentos, HttpStatus.OK);
    }

    @ApiOperation(value = "Retorna um pagamento por ID da transacao")
    @RequestMapping(value = "/pagamento/{idTransacao}", method = RequestMethod.GET)
    public ResponseEntity<?> getPagamento(@PathVariable("idTransacao") long idTransacao) {

        PagamentoResponseDTO pagamento = pagamentoService.findPagDtoByTransacao(idTransacao);
        if (pagamento == null) {
            return new ResponseEntity(new CustomErrorType("Pagamento não encontrado"), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<PagamentoResponseDTO>(pagamento, HttpStatus.OK);
    }

    @ApiOperation(value = "Realiza estorno de pagamento")
    @RequestMapping(value = "/pagamento/{idTransacao}", method = RequestMethod.PUT)
    public ResponseEntity<PagamentoResponseDTO> updatePagamento(@PathVariable("idTransacao") long idTransacao){
        Pagamento pagamento = pagamentoService.findPagByTransacao(idTransacao);
        if (pagamento == null) {
            return new ResponseEntity(new CustomErrorType("Pagamento não encontrado"), HttpStatus.NOT_FOUND);
        }
        PagamentoResponseDTO pagamentoResponseDTO = pagamentoService.estorno(pagamento);
        return new ResponseEntity<PagamentoResponseDTO>(pagamentoResponseDTO, HttpStatus.OK);
    }

    @ApiOperation(value = "Insere novo pagamento")
    @RequestMapping(value = "/pagamento/", method = RequestMethod.POST)
    public ResponseEntity<PagamentoResponseDTO> insert(@Valid @RequestBody PagamentoDTO pagamentoDto){
        try {

            PagamentoResponseDTO pagDto = pagamentoService.insert(pagamentoDto);
            URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/api/pagamento/{idTransacao}")
                    .buildAndExpand(pagDto.getTransacao().getId()).toUri();
            return ResponseEntity.created(uri).body(pagDto);

        }catch (ServiceException e){
            return new ResponseEntity(new CustomErrorType("Transação já existe"), HttpStatus.CONFLICT);
        }
    }
}
