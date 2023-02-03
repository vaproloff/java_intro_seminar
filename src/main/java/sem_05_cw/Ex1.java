package sem_05_cw;

import java.util.HashMap;

public class Ex1 {
    public static void main(String[] args) {
        String str1 = "note";
        String str2 = "code";
        System.out.println(checkIfIsomorph(str1, str2));
    }

    private static boolean checkIfIsomorph(String str1, String str2) {
        boolean ifIsomorph = false;
        if (str1.length() == str2.length()) {
            HashMap<Character, Character> isomorph = new HashMap<>();
            for (int i = 0; i < str1.length(); i++) {
                if (isomorph.containsKey(str1.charAt(i))) {
                    if (isomorph.get(str1.charAt(i)) != str2.charAt(i)) {
                        return ifIsomorph;
                    }
                } else {
                    if (isomorph.containsValue(str2.charAt(i))) {
                        return ifIsomorph;
                    }
                    isomorph.put(str1.charAt(i), str2.charAt(i));
                }
            }
            ifIsomorph = true;
        }
        return ifIsomorph;
    }
}
