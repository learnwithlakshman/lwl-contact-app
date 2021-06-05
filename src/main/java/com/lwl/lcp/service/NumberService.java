package com.lwl.lcp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class NumberService {

	public int biggest(int a, int b, int c) {

		if (a > b && a > c) {
			return a;
		} else if (b > c) {
			return b;
		} else {
			return c;
		}
	}

	public boolean isPrime(int num) {
		if (num < 2 || (num % 2 == 0 && num != 2)) {
			return false;
		} else {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					return false;
				}
			}
		}
		return true;
	}

	public List<Integer> generatePrime(int lb, int ub) {

		if (lb > ub) {
			throw new IllegalArgumentException("Lower bound can't > upper bound");
		}

		List<Integer> list = new ArrayList<>();
		for (int i = lb; i <= ub; i++) {
			if (isPrime(i)) {
				list.add(i);
			}
		}
		return list;
	}
}
