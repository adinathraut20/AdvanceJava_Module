package com.cdac.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.cdac.dto.Expense;

@Repository
public class ExpenseDaoImple implements ExpenseDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public ExpenseDaoImple() {
		
	}

	public void insertExpense(Expense expense) {
		
		String q = "insert into expense(item_name,price,pur_date,user_id) values(?,?,?,?)";
		System.out.println(q);
		jdbcTemplate.update(q,new Object[] {expense.getItemName(),expense.getPrice(),expense.getPurchaseDate(),expense.getUserId()});
		System.out.println("done");

	}

	public void deleteExpense(int expenseId) {
		String q = "delete from expense where expenseId = ?";
		System.out.println(q);
		jdbcTemplate.update(q,new Object[] { expenseId});
		System.out.println("Record Removed");

	}

	public Expense selectExpense(int expenseId) {
		String q = "select * from expense where expenseId = ?";
		System.out.println(q);
		
		Expense expense1 = jdbcTemplate.query(q,new Object[] { expenseId}, new ResultSetExtractor<Expense>() {
			
			public Expense extractData(ResultSet rs) throws SQLException, DataAccessException {
				Expense expense = new Expense();
				if(rs.next()) {
					expense.setExpenseId(rs.getInt("expenseId"));
					expense.setItemName(rs.getString("item_name"));
					expense.setPrice(rs.getFloat("price"));
					expense.setPurchaseDate(rs.getString("pur_date"));
				}
				return expense;
			}
		});
		return expense1;
	}

	public void updateExpense(Expense expense) {
		String q = "update expense set item_name = ?,price = ? ,pur_date = ?,user_id = ? where expenseId = ?";
		System.out.println(q);
		jdbcTemplate.update(q,new Object[] {expense.getItemName(),expense.getPrice(),expense.getPurchaseDate(),expense.getUserId(),expense.getExpenseId()});
		System.out.println("done");

	}

	public List<Expense> selectAll() {
		
		String q = "select * from expense";
		System.out.println(q);
		List<Expense> li = jdbcTemplate.query(q, new ResultSetExtractor<List<Expense>>() {
		
			public List extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Expense> list = new ArrayList<Expense> ();
				while(rs.next()) {
					Expense expense = new Expense();
					expense.setExpenseId(rs.getInt("expenseId"));
					expense.setItemName(rs.getString("item_name"));
					expense.setPrice(rs.getFloat("price"));
					expense.setPurchaseDate(rs.getString("pur_date"));
					expense.setUserId(rs.getInt("user_id"));
					//System.out.println(expense);
					list.add(expense);
				}
				return list;
			}
		});
		return li;
	}

}
