package Depuraciones;

import javax.swing.*;

public class Ejercicio_Dep2 {
    public static String removeLastChar(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        return str.substring(0, str.length() - 1);
    }

    public static void main(String[] args) {
        int num, n,R;
        int f=0;
        String aux="";
        byte potencia=0;
        num=Integer.parseInt(JOptionPane.showInputDialog("ingresa un nmero y te lo descompongo en potencias de 10"));
        n=num;

        while(n>0) {
            n=n%10;
            R=n/10;
            f=R*(int)Math.pow(10,potencia);
            potencia=(byte) (potencia+1);
            aux+=String.valueOf(+n)+"+";


        }
        aux=removeLastChar((aux));
        JOptionPane.showMessageDialog(null,aux);
    }

}
