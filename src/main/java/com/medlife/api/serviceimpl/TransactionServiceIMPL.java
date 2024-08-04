package com.medlife.api.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medlife.api.dao.TransactionDao;
import com.medlife.api.entity.TransactionDetails;
import com.medlife.api.service.TransactionService;
/**
 * @author Abhay
 *
 */
@Service
public class TransactionServiceIMPL implements TransactionService {

	@Autowired
	private TransactionDao dao;

	@Override
	public int generateSalaryForUser(TransactionDetails transactionDetails) {
		return 0;
		
	}

	@Override
	public List<String> generateSalaryreportForUser(String username, int from, int to) {
		return null;
		
	}

}
