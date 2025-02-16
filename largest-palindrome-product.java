
public class Main
{
	public static void main(String[] args) {
		int max_palindom = 0;

        int a;
        int b;


        for(a=999; a>=100;a--){
            for(b=100;b<=999;b++){
                if(panlindrom(a*b)){
                    if(a*b > max_palindom) max_palindom = a*b;
                }
            }
        }

        System.out.println(max_palindom);


	}

    static boolean panlindrom(int x) {
        String number = String.valueOf(x);
        String reversed_string = new StringBuilder(number).reverse().toString();
        return number.equals(reversed_string);
    }
    


}
