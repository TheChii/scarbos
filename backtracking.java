//backtracking simplu
// nu stiu sa l rulez local :(
public class Main
{
    static int[] x = new int[10];
    static int n;
    
    static boolean solutie(int k){
        if(k < 3) return false;
        return true;
    }
    
    static boolean ok(int k){
        for(int i=1;i<k;i++){
            if(x[i] == x[k]) return false;
        }
        return true;
    }
    
    static void afisare(int k){
        for(int i=1;i<=k;i++){
            System.out.print(x[i]);
        }
        System.out.println(" ");
    }
    
	static void backtracking(int k){
	    for(int i=1; i<5; i++){
	        x[k] = i;
	        if(ok(k)){
	            if(solutie(k)){
	                afisare(k);
	            }
	            else {
	                backtracking(k+1);
	            }
	        }
	    }
	}
	
	public static void main(String[] args) {
	    x = new int[10];
		backtracking(1);
	}
}
