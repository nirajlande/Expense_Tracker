package com.niraj.demo.controller;

import com.niraj.demo.model.expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.niraj.demo.service.expenseService;

import java.util.List;

@RestController
@RequestMapping("/api/expenses")
public class expenseController {

    public final expenseService expenseService;

    @Autowired
    public expenseController(expenseService expenseService) {
        this.expenseService = expenseService;
    }
    @PostMapping
    public ResponseEntity<Object> addexpense(@RequestBody expense e){
        expenseService.addexpense(e);
        System.out.println("sdgdfbfghsfs");
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity<List<expense>> getAllexpense(){
        System.out.println("fffff");
       return  ResponseEntity.ok(expenseService.getAllExpense());
}

    @GetMapping("/{name}")
    public ResponseEntity<Object> getExpenseByname(@PathVariable String name)
{
    return ResponseEntity.ok( expenseService.getexpensebyname(name));

}

}
