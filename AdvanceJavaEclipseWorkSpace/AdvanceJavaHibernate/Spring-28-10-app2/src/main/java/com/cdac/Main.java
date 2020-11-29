package com.cdac;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.dto.Expense;
import com.cdac.service.ExpenseService;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ApplicationContext appCntx = new ClassPathXmlApplicationContext("cfg.xml");
		ExpenseService es = appCntx.getBean(ExpenseService.class);
		//Expense expense = new Expense("Bat", 9090.90f, "2020-10-10", 5);
		//es.addExpense(expense);
		
		//es.removeExpense(4);  // delete
		
		//Expense expense = new Expense(5,"Bat", 9090.90f, "2020-10-10",7);
		//es.modifyExpense(expense);

		//Expense e = es.findExpense(3);
		//System.out.println(e);
		List<Expense> li = es.expenseList();
		
		for(Expense i : li) {
			System.out.println(i);
		}
		
	}

}
