package com.anandan.learn.jenkins.stage;

import org.springframework.stereotype.Service;

@Service
public class Calculator {
	public int sum(int a, int b) {
		return a + b;
	}
}