class Solution {
    /*public List < List < String >> groupAnagrams(String[] strs) {

        List < List < String >> output = new ArrayList < List < String >> ();

        int emptyStrings = 0;
        HashMap < String, HashMap < Character, Integer >> map = new HashMap < > ();

        HashMap < String, Integer > counts = new HashMap < > ();
        for (String s: strs) {
            if (s.length() == 0) {
                emptyStrings += 1;
                continue;
            }

            if (counts.containsKey(s)) {
                counts.put(s, counts.getOrDefault(s, 0) + 1);

                continue;
            } else counts.put(s, 1);

            HashMap < Character, Integer > internal = new HashMap < > ();


            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                internal.put(c, internal.getOrDefault(c, 0) + 1);
                map.put(s, internal);
            }
        }

        HashSet < String > taken = new HashSet < > ();


        for (String k: map.keySet()) {
            List < String > current = new ArrayList < > ();
            if (taken.contains(k))
                continue;
            current.add(k);
            taken.add(k);
            for (String l: map.keySet()) {

                if (!l.equals(k) && map.get(l).equals(map.get(k))) {
                    if (!taken.contains(l)) {
                        int count = counts.get(l);
                        if (count >= 1) {
                            while (count != 0) {
                                current.add(l);
                                count--;
                            }
                            counts.put(l, count);
                        }
                        taken.add(l);
                    }
                } else if (l.equals(k) && counts.get(l) > 1) {
                    int count = counts.get(l);
                    if (count >= 1) {
                        while (count != 1) {
                            current.add(l);
                            count--;
                        }
                        counts.put(l, count);
                    }
                    taken.add(l);
                }
            }

            output.add(current);
        }


        if (emptyStrings > 0) {
            List < String > current = new ArrayList < > ();
            while (emptyStrings != 0) {
                current.add("");
                emptyStrings -= 1;
            }
            output.add(current);
        }


        return output;
    }*/
    
    public List < List < String >> groupAnagrams(String[] strs) {
        
        String [] sortedStrs = new String[strs.length];
        List < List < String >> output = new ArrayList < List < String >> ();
        
        HashMap<String,List<String>> map = new HashMap<>();
        
        for(int i = 0;i<strs.length;i++)
        {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            sortedStrs[i] = sorted;
            if(map.containsKey(sorted))
            {
                List<String> current  = map.get(sorted);
                current.add(strs[i]);
                map.put(sorted, current);
            }
            else
            {
                List<String> current = new ArrayList<>();
                current.add(strs[i]);
                map.put(sorted, current);
            }
        }
        
        
        for(String k : map.keySet())
        {
            output.add(map.get(k));
        }
        
     
        return output;
    }
    
    
}