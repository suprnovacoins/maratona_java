package br.com.javacore.Qwrappers.test;

public class WrappersTest {
    public static void main(String[] args) {
        byte bytePrimitivo = 1;
        short shortPrimitivo = 1;
        int intPrimitivo = 10;
        long longPrimitivo = 10L;
        float floatPrimitivo = 10F;
        double doublePrimitivo = 10D;
        char charPrimitivo = 'A';
        boolean booleanPrimitivo = true;

        Byte byteWrapper = 1;
        Short shortWrapper = 1;
        Integer integerWrapper = 1;
        Long longWrapper = 10L;
        Float floatWrapper = 10F;
        Double doubleWrapper = 10D;
        Character characterWrapper = 'A';
        Boolean booleanWrapper = true;

        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetter('1'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isUpperCase('a'));

    }
}
