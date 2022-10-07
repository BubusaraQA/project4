package module4;

public class Assignment1 {

    public static void main(String[] args) {
        Assignment1 assignmentPart1 = new Assignment1();
        assignmentPart1.compareStrings("dog", "catalog");
        assignmentPart1.compareStrings("cdog", "cDog");
        assignmentPart1.compareStrings("doggy", "dog");
        assignmentPart1.compareStrings("pig", "pigeon");
        assignmentPart1.compareStrings("cat", null);

    }
    public void compareStrings(String a, String b) {
        if (a == null || b == null) {
            System.out.println("Cannot compare Strings");
        } else if (a.equalsIgnoreCase(b)) {
            System.out.println("The " + a + " and " + b + " Strings are the same");
        } else if (a.contains(b)) {
            System.out.println(b + " is the part of " + a);
        } else if (b.contains(a)) {
            System.out.println(a + " is the part of " + b);
        } else {
            System.out.println("Error");
        }
    }
}





