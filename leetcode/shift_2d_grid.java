    class Solution {

        public List < List < Integer >> shiftGrid(int[][] grid, int k) {
            List < List < Integer >> result = new ArrayList();


            int m = grid.length;
            int n = grid[0].length;

            int[] rotated_arr = new int[m * n];

            int z = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    int new_index = (z + k) % rotated_arr.length;

                    rotated_arr[new_index] = grid[i][j];
                    z++;
                }
            }


            List < Integer > curr = new ArrayList < Integer > ();
            int r = 0;
            int c = 0;
            int idx = 0;

            while (r != m) {
                if (c < n) {
                    curr.add(rotated_arr[idx]);
                    idx++;
                    c++;
                } else {
                    c = 0;
                    result.add(curr);
                    curr = new ArrayList < Integer > ();
                    curr.clear();
                    r++;
                }
            }


            return result;

        }
    }


    // ugly code
    /*class Solution {
        
    public List < List < Integer >> shiftGrid(int[][] grid, int k) {
            List < List < Integer >> result = new ArrayList();

            int m = grid.length;
            int n = grid[0].length;

            int[][] rotated_arr = grid.clone();
            while (k != 0) {
                rotated_arr = rotate_once(grid);
                k--;
            }

            for (int i = 0; i < m; i++) {
                List < Integer > curr = new ArrayList < Integer > ();
                for (int j = 0; j < n; j++) {
                    curr.add(rotated_arr[i][j]);
                }
                result.add(curr);
            }

            return result;

        }

        public int[][] rotate_once(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;

            Queue < Integer > v = new LinkedList < Integer > ();
            int start = -1;

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (j > 0) {
                        grid[i][n - j] = grid[i][n - j - 1];
                    } else {
                        if (i < m - 1)
                            v.add(grid[i][n - j - 1]);
                        else start = grid[i][n - j - 1];
                    }
                }

            }

            int i = 1;
            while (v.size() != 0) {
                int pre = v.poll();
                grid[i][0] = pre;
                i++;
            }

            grid[0][0] = start;

            return grid;
        }
    }
    */
