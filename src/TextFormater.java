public class TextFormater {
    public static int checkNumberOfWords(String line) {
        String b = line.trim();
        String[] c = b.split(" ");
        return c.length;
    }

    public static boolean checkPolindromInLine(String line) {
        String b = line.trim();
        String[] c = b.split(" ");
        boolean u = false;
        for (String a : c) {
            if (checkPolindromInWord(a)) {
                u = true;
                System.out.println("poli: " + a);
            }

        }return u;
    }

    private static boolean checkPolindromInWord(String word) {
        boolean flag = true;
        if (word.length() == 1){return flag = false;}
        for (int i = 0; i < word.length() - 1; i++){
            int y = 0;
            for (int j = word.length() - 1; j >= 0; j--) {
                if (word.charAt(y) != word.charAt(j)) {
                    flag = false;
                }
                y++;
            }
        }
        return flag;
    }
}
