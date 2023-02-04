class Solution {
    public boolean checkInclusion(String s1, String s2) {

        HashMap < Character, Integer > freq_A = new HashMap < > ();


        if (s1.length() <= s2.length()) {
            for (char c: s1.toCharArray())
                freq_A.put(c, freq_A.getOrDefault(c, 0) + 1);

            for (int i = 0; i < s2.length(); i++) {
                boolean found_match = false;
                if (i + s1.length() <= s2.length()) {
                    String t = s2.substring(i, i + s1.length());
                    HashMap < Character, Integer > freq_B = new HashMap < > ();
                    for (char c: t.toCharArray()) {
                        freq_B.put(c, freq_B.getOrDefault(c, 0) + 1);
                    }

                    if (freq_A.size() == freq_B.size()) {
                        for (char c: freq_A.keySet()) {
                            int count = freq_A.get(c);
                            if (freq_B.containsKey(c) && count == freq_B.get(c))
                                found_match = true;
                            else {
                                found_match = false;
                                break;
                            }
                        }

                        if (found_match)
                            return true;
                    }
                }
            }
        }
        return false;



    }

    //     public boolean checkInclusion(String s1, String s2)
    //     {
    //         char [] arr_1 = s1.toCharArray();

    //         Arrays.sort(arr_1);

    //         if(s1.length()<=s2.length())
    //         {
    //             for(int i=0;i<=s2.length() - s1.length();i++)
    //             {
    //                 char [] t = s2.substring(i,i+s1.length()).toCharArray();
    //                 Arrays.sort(t);
    //                 String t_sorted = new String(t);
    //                 if(new String(arr_1).equals(t_sorted))
    //                     return true;
    //             }
    //         }
    //         return false;
    //     }
}