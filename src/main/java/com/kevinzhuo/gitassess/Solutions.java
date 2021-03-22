package com.kevinzhuo.gitassess;

import java.util.ArrayList;
import java.util.List;

public class Solutions {
	public static String calc(String a) {
		
		if(a.length() < 2) {
			return a;
		}
		int lpt = 0;
		int rpt = 1;
		int maxlen = 0;
		int maxl = 0;
		int maxr = 0;
		while(rpt < a.length()) {
			int left = lpt;
			int right = rpt;
			int len = rpt - lpt == 1?0:1;
			while(left >= 0 && right < a.length() && a.charAt(left) == a.charAt(right)) {
				len += 2;
				left--;
				right++;
			}
			if(len > maxlen) {
				maxlen = len;
				maxl = left;
				maxr = right;
			}
			if(rpt - lpt == 1) {
				rpt++;
			}
			else {
				lpt++;
			}
		}
		return a.substring(maxl + 1, maxr);
	}

	public static Integer calcbinary(Integer num) {
		List<Integer> ls = new ArrayList<>();
		int tmp = num;
		Integer res = 0;
		while(tmp > 0) {
			ls.add(tmp%2);
			tmp = tmp/2;
		}
		int padd = (8 - ls.size()%8)%8;
		for(int j = 0; j < padd; j++) {
			ls.add(0);
		}
		System.out.println(ls.size());
		for(Integer i: ls) {
			res = res*2 + i;
		}
		return res;
	}
}
