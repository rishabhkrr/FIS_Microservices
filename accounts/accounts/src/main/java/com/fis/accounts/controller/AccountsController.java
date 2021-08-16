package com.fis.accounts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fis.accounts.bean.Accounts;

@RestController
@RequestMapping("/accounts")
public class AccountsController {

	@GetMapping("/{number}")
	public Accounts getAccount(@PathVariable long number) {
		return new Accounts(987987973432l, "savings", 234343);
	}

}