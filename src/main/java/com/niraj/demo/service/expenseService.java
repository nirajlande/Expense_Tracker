package com.niraj.demo.service;
import com.niraj.demo.model.expense;
import  com.niraj.demo.repository.expenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class expenseService {

    public final expenseRepository expenseRepository;

    @Autowired
    public expenseService(expenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public void addexpense(expense e){
        expenseRepository.insert(e);

    }

    public expense getexpensebyname(String Name)
    {
         return expenseRepository.findByName(Name)
                 .orElseThrow(() -> new RuntimeException(String.format("Cannot Find Expense by Name - %s", Name)));
    }

    public List<expense> getAllExpense()
    {
       return  expenseRepository.findAll();
    }
}
