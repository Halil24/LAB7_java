import java.math.BigInteger;

public class largerNumbers {

    public static void main(String[]args) {

        BigInteger[] largePrimes = new BigInteger[5];
        BigInteger current = BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE);

        int i = 0;

        while (i<largePrimes.length) {

            if (current.isProbablePrime(50)){

                largePrimes[i++]=current;
            }
            current=current.add(BigInteger.ONE);
        }

        for(BigInteger prime: largePrimes){
            System.out.print(prime+" ");
        }
    }

}
