package com.telefonia.telefonia_api.application.usecase;

import com.telefonia.telefonia_api.domain.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClientUseCase {

    private final ClientRepository clientRepository;

}
