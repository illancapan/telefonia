package com.telefonia.telefonia_api.loader;


import com.telefonia.telefonia_api.domain.model.Client;
import com.telefonia.telefonia_api.domain.model.Contract;
import com.telefonia.telefonia_api.domain.model.Plan;
import com.telefonia.telefonia_api.domain.repository.ClientRepository;
import com.telefonia.telefonia_api.domain.repository.ContractRepository;
import com.telefonia.telefonia_api.domain.repository.PlanRespository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@AllArgsConstructor
public class DataLoader implements CommandLineRunner {

    private final PlanRespository planRespository;
    private final ContractRepository contractRepository;
    private final ClientRepository clientRepository;

    @Override
    public void run(String... args) throws Exception {

        Plan plan = Plan.builder()
                .name("Basic Plan")
                .price(29.000)
                .isActive(true)
                .build();
        planRespository.save(plan);

        Client client = Client.builder()
                .name("Juan do")
                .run("12345678-9")
                .birthDate(LocalDate.of(1990, 1, 1))
                .isActive(true)
                .build();
        clientRepository.save(client);

        Contract contract = Contract.builder()
                .client(client)
                .plan(plan)
                .startDate(LocalDate.now())
                .endDate(LocalDate.now().plusMonths(12))
                .isActive(true)
                .build();
        contractRepository.save(contract);

    }
}
