package com.mycompany.algoritmoeuclides;
/**
 *
 * @author Vinicius
 */
public class CalculaMDC {
    private int a;
    private int b;
    public CalculaMDC(int a, int b){
        // Obtém o valor absoluto de a e b
        this.a = a;
        this.b = b;
    }
    //----------SET GET ------------
        public int getA(){
        return a;
        }
        public void setA(int a){
        this.a = Math.abs(a);
        }
        public int getB(){
        return b;
        }
        public void setB(int b){
        this.b = Math.abs(b);
        }
        //----- fazer a conta ---------
            public int calcularMDC() {
        int a = getA();
        int b = getB();
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
