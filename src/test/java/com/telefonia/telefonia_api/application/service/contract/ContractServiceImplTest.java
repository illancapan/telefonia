package com.telefonia.telefonia_api.application.service.contract;

import com.telefonia.telefonia_api.domain.model.Client;
import com.telefonia.telefonia_api.domain.model.Contract;
import com.telefonia.telefonia_api.domain.model.Plan;
import com.telefonia.telefonia_api.domain.repository.ClientRepository;
import com.telefonia.telefonia_api.domain.repository.ContractRepository;
import com.telefonia.telefonia_api.domain.repository.PlanRespository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class ContractServiceImplTest {

    private ClientRepository clientRepository;
    private PlanRespository planRespository;
    private ContractRepository contractRepository;
    private ContractServiceImpl contractService;

     Client client;
     Plan plan;
     Contract contract;

    @BeforeEach
    void setUp() {

        Client client = new Client(
                1L,
                "John Doe",
                "12345678-9",
                "123 Street",
                LocalDate.of(1990, 1, 1),
                true);

        plan = new Plan(
                1L,
                "Basic Plan",
                29.99,
                true,
                null);
        contract = new Contract(
                1L,
                client,
                plan,
                LocalDate.now(),
                LocalDate.now().plusMonths(1),
                true);
    }

    @Test
    void shouldCreateContractSuccessfully() {
        // Configurar mocks
        when(clientRepository.findById(client.getId())).thenReturn(Optional.of(client));
        when(planRespository.findById(plan.getId())).thenReturn(Optional.of(plan));
        when(contractRepository.save(any(Contract.class))).thenReturn(contract);

        // Llamar al método
        Contract result = contractService.createContract(client.getId(), plan.getId());

        // Validar resultados
        assertEquals(client, result.getClient());
        assertEquals(plan, result.getPlan());
        assertEquals(LocalDate.now(), result.getStartDate());
        assertTrue(result.isActive());

        // Verificar interacciones
        verify(clientRepository, times(1)).findById(client.getId());
        verify(planRespository, times(1)).findById(plan.getId());
        verify(contractRepository, times(1)).save(any(Contract.class));

    }
}