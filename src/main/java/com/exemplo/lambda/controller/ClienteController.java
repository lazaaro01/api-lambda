package com.exemplo.lambda.controller;

import com.exemplo.lambda.dto.ClienteDTO;
import com.exemplo.lambda.model.Cliente;
import com.exemplo.lambda.service.ClienteService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @Operation(summary = "Criar um novo cliente")
    @PostMapping
    public ResponseEntity<ClienteDTO> criarCliente(@RequestBody Cliente cliente) {
        ClienteDTO novoCliente = clienteService.criarCliente(cliente);
        return  ResponseEntity.ok(novoCliente);
    }

    @Operation(summary = "Listar todos os clientes")
    @GetMapping
    public List<ClienteDTO> listarClientes() {
        return clienteService.listarCliente();
    }

    @Operation(summary = "Filtrar clientes por idade mínima")
    @GetMapping("/idade-minima/{idade}")
    public List<ClienteDTO> filtrarClientes(@PathVariable int idade) {
        return clienteService.filtrarClientesPorIdadeMinimo(idade);
    }
}

