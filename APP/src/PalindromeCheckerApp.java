import java.util.*;

String input = "civic";

Queue<Character> queue = new LinkedList<>();
Stack<Character> stack = new Stack<>();

for (char c : input.toCharArray()) {
        queue.add(c);
    stack.push(c);
}

boolean isPalindrome = true;

while (!queue.isEmpty()) {
        if (!queue.remove().equals(stack.pop())) {
isPalindrome = false;
        break;
        }
        }

        System.out.println("Is Palindrome? : " + isPalindrome);
