/*

Sort Characters By Frequency
Medium

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.
Input
First line of the input contains the string s.

Constraints
1<= s.length <= 500000
s consists of uppercase and lowercase English letters
Output
Print the lexicographically sorted string.
Example
Sample Input 1:
tree
Sample Output 1:
eert

Sample Input 2:
acaacc
Sample Output 2:
aaaccc

Explanation
For Input 1 : 'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
For Input 2: Both 'c' and 'a' appear three times, so "aaaccc" is the valid answer as it is lexicographically smallest.
Note : cccaaa is not valid answer.*/








import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static String frequencySort(String S) {
        Map<Character, Integer> characterCount = new HashMap<>();
        for (char ch : S.toCharArray()) {
            characterCount.put(ch, characterCount.getOrDefault(ch, 0) + 1);
        }

        List<Character> charactersList = new ArrayList<>(characterCount.keySet());        
        Collections.sort(charactersList, (ch1, ch2) -> characterCount.get(ch2) - characterCount.get(ch1));

        StringBuilder result = new StringBuilder();
        for (char ch : charactersList) {
            int charCount = characterCount.get(ch);
            for (int i = 0; i < charCount; i++) {
                result.append(ch);
            }
        }
        return result.toString();
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(frequencySort(str));
                      // Your code here
    }
}



