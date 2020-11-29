package com.cdac.dao;

import java.util.List;

import com.cdac.dto.Expense;

public interface ExpenseDao {

	void insertExpense(final Expense expense);
	void deleteExpense(final int expenseId);
	Expense selectExpense(int expenseId);
	void updateExpense(Expense expense);
	List<Expense> selectAll();
}
