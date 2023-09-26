public class DataTypes {
    public static void main(String []args){

        //byte:  1 byte, with range  -128 to 127
        //short: 2 bytes, with range -32,768 to 32,767
        //int:   4 bytes, with range -2,147,483,627 to -2,147,483,626
        //long:  8 bytes, with range -9,233,372,036,854,775,808 to -9,233,372,036,854,775,807


        int number=1234567890;
        long largeNumber=123456789L;//Add L at the end to recognize like Long type


        //float   4 bytes with range  -1.4011298464324811707 e-45 to 3.40282346638528860 e+38
        // double 8 bytes with range 4.94065645841246544e-324d to 1.79769313486231570e+308d

        double numberDouble=123.45678912345689;
        float  floatNumber=123.45678912345689F;

        //char 2 bytes with range Unicode

        char letter='j';

        //boolean 2 bytes, true or false
        boolean flag=true;

        //Since Java 10
        var name="jose luis";

    }
}
