class Q5 {
    public static void main(String args[]) {
        String s = "aabbbcccc";
        int max = 0;
        int smax = 0;
        char mch = ' ';
        char smch = ' ';

        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {   // was charAt(i) == charAt(i)
                    count++;
                }
            }

            if (count > max) {
                smax = max;
                smch = mch;
                max = count;
                mch = s.charAt(i);
            } else if (count > smax && s.charAt(i) != mch) {   // missing case
                smax = count;
                smch = s.charAt(i);
            }
        }

        System.out.println("Second most frequent character: " + smch);
    }
}