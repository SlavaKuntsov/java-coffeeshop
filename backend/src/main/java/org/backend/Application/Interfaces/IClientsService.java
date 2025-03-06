package org.backend.Application.Interfaces;

import org.backend.Application.DTO.ClientDTO;
import org.backend.Domain.Model.Client;

import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public interface IClientsService {
    Iterable<Client> getAllClients();
    Optional<Client> getClientById(UUID id);
    CompletableFuture<Client> createAsync(ClientDTO clientDTO);
    Client updateClient(UUID id, Client clients);
    void stopAccount(UUID id);
    void deleteClient(UUID id);
}
