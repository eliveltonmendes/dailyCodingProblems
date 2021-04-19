package com.daily.coding.problems1;

import java.util.Arrays;

import com.daily.coding.problems1.problem1.Problem1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		Problem1 problem1 = new Problem1();
		problem1.calculateValue(Arrays.asList(10, 15, 3, 7), 17);
	}
}