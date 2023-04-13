package ru.pivovarov.jdbc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.pivovarov.jdbc.repository.DaoRepository;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    public OrderService(DaoRepository daoRepository) {
        this.daoRepository = daoRepository;
    }

    private DaoRepository daoRepository;

    public List<String> getProductNameFromCustomerName(String customerName) {
        return daoRepository.getProductName(customerName);
    }
}
