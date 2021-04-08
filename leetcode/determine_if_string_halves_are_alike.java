class Solution {
    public boolean halvesAreAlike(String s) {

        if (s.length() % 2 != 0)
            return false;

        //s = s.toLowerCase();
        int l = 0;
        int r = 0;

        HashSet < Character > vowels = new HashSet < > () {
            {
                add('a');
                add('e');
                add('i');
                add('o');
                add('u');
                add('A');
                add('E');
                add('I');
                add('O');
                add('U');
            }
        };

        int i = 0;
        int j = s.length() / 2;

        while (i < s.length() / 2) {
            if (vowels.contains(s.charAt(i)))
                l++;
            if (vowels.contains(s.charAt(j)))
                r++;
            i++;
            j++;
        }


        return l == r;
    }
}
