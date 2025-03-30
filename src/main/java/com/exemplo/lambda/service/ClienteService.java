package com.exemplo.lambda.service;

import com.exemplo.lambda.dto.ClienteDTO;
import com.exemplo.lambda.model.Cliente;
import com.exemplo.lambda.repository.ClienteRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class ClienteService {
    
    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public ClienteDTO criarCliente(Cliente cliente) {
        clienteRepository.save(cliente);
        return new ClienteDTO(cliente.getNome(), cliente.getEmail(), cliente.getIdade());
    }

    public List<ClienteDTO> listarCliente() {
        return  clienteRepository.findAll()
                .stream()
                .map(cliente -> new ClienteDTO(cliente.getNome(), cliente.getEmail(), cliente.getIdade()))
                .collect(Collectors.toList());
    }

    public List<ClienteDTO> filtrarClientesPorIdadeMinimo(int idadeMinima) {
        Predicate<Cliente> filtroIdade = cliente -> cliente.getIdade() >= idadeMinima;

        return clienteRepository.findAll()
                .stream()
                .filter(filtroIdade)
                .map(cliente -> new ClienteDTO(cliente.getNome(), cliente.getEmail(), cliente.getIdade()))
                .collect(Collectors.toList());
    }
}
