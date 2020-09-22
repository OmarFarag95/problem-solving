public class angry_professor {

    // Complete the angryProfessor function below.
    static String angryProfessor(int k, int[] a) {
        int attend=0;
        for(int i=0;i<a.length;i++)
            if(a[i]<=0)
                attend++;         
if(k>attend)
    return "YES";
else return "NO";    
    }
