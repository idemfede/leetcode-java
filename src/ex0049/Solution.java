package ex0049;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Solution {

	public static void main(String[] args) {
		Solution m = new Solution();
		String[] list1 = { "" };

		Object ret = m.groupAnagrams(list1);

		ret.toString();
	}

	public List<List<String>> groupAnagrams(String[] strs) {

		Map<String, List<String>> ret = new HashMap<String, List<String>>();

		for (int i = 0; i < strs.length; i++) {
			String word = strs[i];
			String hash = hash(word);

			if (!ret.containsKey(hash)) {
				ret.put(hash, new ArrayList<>());
			}

			ret.get(hash).add(word);
		}

		return new ArrayList<List<String>>(ret.values());

	}

	public String hash(String word) {

		Map<Object, Optional<String>> stringStream = word.chars().mapToObj(c -> String.valueOf((char) c)).sorted()
				.collect(Collectors.groupingBy(x -> x, Collectors.reducing((a, b) -> a + b)));

		Optional<String> a = stringStream.entrySet().stream()
				.map(x -> x.getKey().toString() + x.getValue().get().length()).sorted()
				.collect(Collectors.reducing((u, v) -> u + v));

		return a.orElseGet(() -> "");
	}

	public List<List<String>> groupAnagrams2(String[] strs) {
		List<List<String>> list = new ArrayList<>();
		if (strs.length == 1) {
			list.add(Arrays.asList(strs[0]));
			return list;
		}

		int primes[] = { 2, 3, 5, 7, 9, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89,
				97, 101 };

		HashMap<Long, Integer> map = new HashMap<>();

		for (String str : strs) {
			long anagramKey = 1L;
			for (char ch : str.toCharArray())
				anagramKey *= primes[ch - 'a'];

			if (!map.containsKey(anagramKey)) {
				map.put(anagramKey, list.size());
				List<String> l = new ArrayList<>();
				l.add(str);
				list.add(l);
			} else {
				int ndx = map.get(anagramKey);
				list.get(ndx).add(str);
			}
		}
		return list;
	}
}
