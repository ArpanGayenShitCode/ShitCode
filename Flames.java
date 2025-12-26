import java.util.Scanner;

public class Flames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a[] = {"arpan", "subhajit", "pornab", "adriyan", "aishik", "zayn", "snehal", "sirshoy"};
        
        System.out.println("\n\t========== F L A M E S ==========\n");
        
        for(int i = 0; i < a.length; i++){
            for(int j = i + 1; j < a.length; j++){
                    System.out.println("\t"+a[i]+" & "+a[j]+" : "+FlamesCounter(countNumberOfLetters(a[i] , a[j])));
            }
            System.out.println();
        }
        
        sc.close();
    }

    private static int countNumberOfLetters(String a, String b) {
        a = a.toUpperCase();
        b = b.toUpperCase();
        String resA = "", resB = "";

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if(!b.contains(String.valueOf(ch))) resA += ch;
        }

        for (int i = 0; i < b.length(); i++) {
            char ch = b.charAt(i);
            if (!a.contains(String.valueOf(ch))) resB += ch;
        }

        String result = resA + resB;
        return result.length();
    }

    private static String FlamesCounter(int n) {
        String flames = "FLAMES";
        int index = 0;

        while (flames.length() > 1) {
            index = (n - 1) % flames.length();

            flames = flames.substring(0, index) + flames.substring(index + 1);
        }

        switch (flames.charAt(0)) {
            case 'F': 
                return "Friendship";
            case 'L': 
                return "Love";
            case 'A': 
                return "Affection";
            case 'M': 
                return "Marriage";
            case 'E': 
                return "Enemies";
            case 'S': 
                return "Siblings";
            default:
                return "Unknown";
        }
    }

}
