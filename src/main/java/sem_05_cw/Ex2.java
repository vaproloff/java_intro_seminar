package sem_05_cw;

import java.util.HashMap;

/*
Написать программу, определяющую правильность расстановки скобок в выражении.
Пример 1: a+(d*3) - истина
Пример 2: [a+(1*3) - ложь
Пример 3: [6+(3*3)] - истина
Пример 4: {a}[+]{(d*3)} - истина
Пример 5: <{a}+{(d*3)}> - истина
Пример 6: {a+]}{(d*3)} - ложь
*/
public class Ex2 {
    public static void main(String[] args) {
        StringBuilder expr1 = new StringBuilder("a+(d*3)");
        System.out.println(checkString(expr1));

        StringBuilder expr2 = new StringBuilder("[a+(1*3)");
        System.out.println(checkString(expr2));

        StringBuilder expr3 = new StringBuilder("[6+(3*3)]");
        System.out.println(checkString(expr3));

        StringBuilder expr4 = new StringBuilder("{a}[+]{(d*3)}");
        System.out.println(checkString(expr4));

        StringBuilder expr5 = new StringBuilder("<{a}+{(d*3)}>");
        System.out.println(checkString(expr5));

        StringBuilder expr6 = new StringBuilder("{a+]}{(d*3)}");
        System.out.println(checkString(expr6));
    }

    private static boolean checkString(StringBuilder expr) {
        HashMap<Character, Character> brackets = new HashMap<>();
        brackets.put('[', ']');
        brackets.put('{', '}');
        brackets.put('(', ')');
        brackets.put('<', '>');

        int index = 0;
        while (index < expr.length()) {
//            System.out.println(expr);
            if (brackets.containsKey(expr.charAt(index))) {
                int index2 = expr.indexOf(String.valueOf(brackets.get(expr.charAt(index))));
                if (index2 >= 0) {
                    expr.deleteCharAt(index);
                    expr.deleteCharAt(index2 - 1);
                    index--;
                } else {
                    return false;
                }

            } else if (brackets.containsValue(expr.charAt(index))) {
                return false;
            }
            index++;
        }
        return true;
    }
}
