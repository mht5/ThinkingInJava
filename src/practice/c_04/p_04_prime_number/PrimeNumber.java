package practice.c_04.p_04_prime_number;

/**
 * ������
 * @author mohan
 *
 */
public class PrimeNumber {
    public static boolean isPrime(int num) {   
//    ����Ĭ��2����������i=2ʱ��ѭ����ִ��
    	for(int j = 2; j <= Math.sqrt(num); j++) {
    		if(num % j == 0) {
    			return false;
    		}
    	}
    	return true;
	}
    
    public static void main(String[] args) {
    	for(int i = 2; i <= 100; i++) {
            if(isPrime(i)) {
                System.out.println(i + " is a prime");
            }
        }      
    }
}