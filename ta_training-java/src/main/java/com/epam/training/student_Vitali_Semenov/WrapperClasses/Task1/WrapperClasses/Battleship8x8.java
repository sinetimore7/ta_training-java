package com.epam.training.student_Vitali_Semenov.WrapperClasses.Task1.WrapperClasses;

import java.math.BigInteger;

public class Battleship8x8 {
    private final long ships;
    private long shots = 0L;

    public Battleship8x8(final long ships) {
        this.ships = ships;
    }

    public boolean shoot(String shot) {
        String registerShot = Long.toBinaryString(shots);
        String ship = Long.toBinaryString(ships);
        StringBuilder registerShotSB = new StringBuilder(registerShot);
        StringBuilder shipSB = new StringBuilder(ship);
        int symbolNumber = 0;

        while (registerShotSB.length() < 64){
            registerShotSB.insert(0, 0);
        }
        while (shipSB.length() < 64){
            shipSB.insert(0, 0);
        }
        char firstSymbol = shot.charAt(0);
        char secondSymbol = shot.charAt(1);
        int intSecondSymbol = Integer.parseInt(String.valueOf(secondSymbol));
        int var = 0;
        for (char i = 'A'; i <= 'H'; i++){
            if (i == firstSymbol){
                symbolNumber = var + (intSecondSymbol - 1) * 8;
                break;
            }
            var++;
        }

        if (registerShotSB.charAt(symbolNumber) == '0'){
            registerShotSB.setCharAt(symbolNumber, '1');
            BigInteger bigInt = new BigInteger(registerShotSB.toString(), 2);
            shots = bigInt.longValue();
        }
        if (shipSB.charAt(symbolNumber) == '1') return true;
        else return false;
    }

    public String state() {
        String shot = Long.toBinaryString(shots);
        String ship = Long.toBinaryString(ships);
        StringBuilder shotsFinal = new StringBuilder(shot);
        StringBuilder shipsFinal = new StringBuilder(ship);
        StringBuilder state = new StringBuilder();
        while (shotsFinal.length() < 64){
            shotsFinal.insert(0, 0);
        }
        while (shipsFinal.length() < 64){
            shipsFinal.insert(0, 0);
        }
        for (int i = 0, j = 1; i < 64; i++, j++){
            if (shotsFinal.charAt(i) == '0' && shipsFinal.charAt(i) == '0') {
                state.append('.');
            } else if (shotsFinal.charAt(i) == '1' && shipsFinal.charAt(i) == '0') {
                state.append('×');
            } else if (shotsFinal.charAt(i) == '0' && shipsFinal.charAt(i) == '1') {
                state.append('☐');
            } else state.append('☒');
            if (j%8 == 0 && j != 0){
                state.append('\n');
            }
        }
        return state.toString();
    }
}
