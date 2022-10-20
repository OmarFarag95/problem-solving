class Solution {
    public int romanToInt(String s) {

        HashMap < String, Integer > map = new HashMap < > ();

        String[] roman = {
            "M",
            "CM",
            "D",
            "CD",
            "C",
            "XC",
            "L",
            "XL",
            "X",
            "IX",
            "V",
            "IV",
            "I"
        };

        // built from the given info
        map.put("I", 1);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XL", 40);
        map.put("L", 50);
        map.put("XC", 90);
        map.put("C", 100);
        map.put("CD", 400);
        map.put("D", 500);
        map.put("CM", 900);
        map.put("M", 1000);

        int output = 0;

        for (int i = 0; i < roman.length; i++) {
            while (s.indexOf(roman[i]) == 0) {
                output += map.get(roman[i]);
                s = s.substring(roman[i].length());
            }
        }

        return output;

    }


}