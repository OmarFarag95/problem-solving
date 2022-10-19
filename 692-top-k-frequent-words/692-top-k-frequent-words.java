class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        HashMap<String,Integer> freqs = new HashMap<>();
        
        for(String word : words)
            freqs.put(word, freqs.getOrDefault(word,0) + 1);
        
        
        PriorityQueue<String> min_heap = new PriorityQueue<>((a, b) -> {
            int a_count = freqs.get(a);
            int b_count = freqs.get(b);
            
            if(a_count == b_count) 
                return b.compareTo(a);
            return a_count - b_count;
        });
        
        
        for(String word : freqs.keySet()) {
            min_heap.offer(word);
            
            // this line is very important, we always keep adding new entries(words), however if the number exceeds 
            // k (as we only need top k frequent) then we will remove the top element as it will be the least frequent
            // because we are having a min heap
            if(min_heap.size() > k) 
                min_heap.poll(); 
        }
    
        
        ArrayList<String> output = new ArrayList<>();
        while(k> 0)
        {
            output.add(0,min_heap.poll());
            k--;
        }
    
        return output;
    }
    
}