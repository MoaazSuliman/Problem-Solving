package leetcode.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//https://leetcode.com/problems/repeated-dna-sequences/description/
public class RepeatedDNASequence {

    public static void main(String[] args) {
        List<String> dna = findRepeatedDnaSequences("AAAAAAAAAAA");
        dna.forEach(System.out::println);

    }

    public static List<String> findRepeatedDnaSequences(String dna) {
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < dna.length() - 10; i++) {
            String substring = dna.substring(i, i + 10);
            if (map.containsKey(substring)) {
                map.put(substring, map.get(substring) + 1);
            } else {
                map.put(substring, 1);
            }
        }
        List<String> result = new ArrayList<>();
        map.forEach((s, integer) -> {
            if (integer > 1) {
                result.add(s);
            }
        });
        return result;
    }
}
