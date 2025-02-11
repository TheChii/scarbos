public class Fibonacci {
    
    static int simple_fib(int i){
        if(i == 0 || i == 1){
            return 1;
        }
    
        return simple_fib(i-1) + simple_fib(i-2);
    }    
    
    
    
    static int[] cache = new int[100]; 
    static int cached_fib(int i) {      //?
        if (i == 0) return 0;
        if (i == 1) return 1;
        
        if (cache[i] != 0) return cache[i]; 

        cache[i] = cached_fib(i-1) + cached_fib(i-2);
        return cache[i];
    }

    static void iterative_fib(int n){
        int a = 1, b = 1;
        int c;
        
        System.out.println(1);
        if(n == 1) return;
        
        System.out.println(1);
        if(n == 2) return;
        
        for(int i = 0;i<n-2;i++){
            c = a+b;
            a = b;
            b = c;
            
            System.out.println(c);
        }
        
    }
    
    
    public static void main(String args[]) {
        iterative_fib(10);
    }
  
}
