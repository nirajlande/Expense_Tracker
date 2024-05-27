package com.niraj.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("expense")
public class expense {

    @Id
    private String id;
    @Field("name")
    @Indexed(unique = true)
    private String expenseName;
    @Field("category")
    private expense_catagory expenseCategory;
    @Field("amount")
    private int expenseAmount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getExpenseName() {
        return expenseName;
    }

    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
    }

    public expense_catagory getExpenseCategory() {
        return expenseCategory;
    }

    public void setExpenseCategory(expense_catagory expenseCategory) {
        this.expenseCategory = expenseCategory;
    }

    public int getExpenseAmount() {
        return expenseAmount;
    }

    public void setExpenseAmount(int expenseAmount) {
        this.expenseAmount = expenseAmount;
    }

    @Override
    public String toString() {
        return "expense{" +
                "id='" + id + '\'' +
                ", expenseName='" + expenseName + '\'' +
                ", expenseCategory=" + expenseCategory +
                ", expenseAmount=" + expenseAmount +
                '}';
    }

    public expense(String id, String expenseName, expense_catagory expenseCategory, int expenseAmount) {
        this.id = id;
        this.expenseName = expenseName;
        this.expenseCategory = expenseCategory;
        this.expenseAmount = expenseAmount;
    }
}
