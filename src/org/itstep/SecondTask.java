package org.itstep;

public class SecondTask {
    public static void main(String[] args) {

        // 1. Загадать однозначное число в 10-тичной системе. Преобразовать его в двоичную и 16-ричную (в столбик).
        int i = 9;
        System.out.println("Decimal number " + i +
                " --> Binary:" + Integer.toBinaryString(i) +
                " --> Hex: " + Integer.toHexString(i));

        // 2. Загадать двузначное число в 10-тичной системе. Преобразовать его в двоичную и 16-ричную
        int b = 25;
        System.out.println("Decimal number " + b +
                " --> Binary: " + Integer.toBinaryString(b) +
                " --> Hex: " + Integer.toHexString(b));

        // 3. Загадать 3-значное число в двоичной системе. Преобразовать его в десятичную и 16-ричную.
        byte ib = 0b111;
        System.out.println("Binary number " + Integer.toBinaryString(ib) +
                " --> Decimal: " + ib +
                " --> Hex: " + Integer.toHexString(ib));

        // 4. Загадать 6-значное число в двоичной системе. Преобразовать его в десятичную и 16-ричную.
        ib = 0b100111;
        System.out.println("Binary number " + Integer.toBinaryString(ib) +
                " --> Decimal: " + ib +
                " --> Hex: " + Integer.toHexString(ib));

        // 5. Загадать 2-значное число в 16-ричной системе. Преобразовать его в двоичную и десятичную.
        int ih = 0x9A;
        System.out.println("Hex number " + Integer.toHexString(ih) +
                " --> Binary: " + Integer.toBinaryString(ih)  +
                " --> Decimal: " + ih);

        // 6. Загадать 4-значное число в 16-ричной системе. Преобразовать его в двоичную и десятичную.
        ih = 0x9AFC;
        System.out.println("Hex number " + Integer.toHexString(ih) +
                " --> Binary: " + Integer.toBinaryString(ih)  +
                " --> Decimal: " + ih);
    }
}
