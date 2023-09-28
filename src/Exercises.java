public class Exercises {
    public static void main(String[] args) {

        char c='z';//to int
        int cCasted=c;
        System.out.println(cCasted);

        int i=205;// to long, then short
        long iLong=i;
        short iShort=(short)iLong;
        System.out.println(iShort);

        double d=301.067;//to long
        long dLong=(long)d;
        System.out.println(dLong);

        int i_Int=100; //add 5000.66 and to float
        float iFloat=i+5000.66F;
        System.out.println(iFloat);

        int i_IntB=737;// * 100 to byte
        byte iByte= (byte) (i_IntB*100);

        System.out.println(iByte);

        double dB=298.638;// /25 to long;
        long dLongB=(long)(dB/25);

        System.out.println(dLongB);
    }
}
