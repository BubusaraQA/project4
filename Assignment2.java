package module4;

public class Assignment2 {

    public static void main(String[] args) {
        Assignment2 assignmentPart2 = new Assignment2();
        boolean result = assignmentPart2.isPalindrome("recaceu");
        System.out.println(result);
    }

    public boolean isPalindrome(String wordToCheck) {
        boolean result = true;
        if (wordToCheck == null || wordToCheck.isBlank() || wordToCheck.isEmpty()) {
            System.out.println("The String is null or empty");
        } else {
            int wholeWord = wordToCheck.length();
            int wordMiddle = wordToCheck.length() / 2;
//            System.out.println(wholeWord);
//            System.out.println(wordMiddle);

            for (int i = 0; i < wordMiddle; i++) {
                int j = i + 1;
                char a = wordToCheck.charAt(i);
                char b = wordToCheck.charAt(wordToCheck.length() - j);
//                System.out.println(a);
//                System.out.println(b);
                if (a != b) {
                    result = false;
                    break;
                }
            }
    }
        return result;
    }
}


