package br.com.ronick;

public class CalculadoraEngine {

    //Variáveis, construtor, getter e setter
    private double[] arrayDeNumero;

    public CalculadoraEngine() {
        this.arrayDeNumero = new double[4];
    }

    public double[] getArrayDeNumero() {
        return arrayDeNumero;
    }

    public void setArrayDeNumero(double[] arrayDeNumeros) {
        this.arrayDeNumero = arrayDeNumeros;
    }

    // metodos
    public void desceNumero(double[] arrayDeNumero) {
        arrayDeNumero[1] = arrayDeNumero[2];
        arrayDeNumero[2] = arrayDeNumero[3];
    }
    
    public void sobeUmNumero() {
        arrayDeNumero[3] = arrayDeNumero[2];
        arrayDeNumero[2] = arrayDeNumero[1];
        arrayDeNumero[1] = arrayDeNumero[0];
    }

    public void soma() {
        arrayDeNumero[0] += arrayDeNumero[1];
        desceNumero(arrayDeNumero);
    }

    public void subtracao() {
        arrayDeNumero[0] = arrayDeNumero[1] - arrayDeNumero[0];
        desceNumero(arrayDeNumero);
    }

    public void multiplicacao() {
        arrayDeNumero[0] = arrayDeNumero[0] * arrayDeNumero[1];
        desceNumero(arrayDeNumero);
    }

    public void divisao() {
        if (arrayDeNumero[0] != 0) {
            arrayDeNumero[0] = arrayDeNumero[1] / arrayDeNumero[0];
            desceNumero(arrayDeNumero);
        }
    }

    public void raiz() {
        arrayDeNumero[0] = Math.sqrt(arrayDeNumero[0]);
    }

    public void sobreX() {
        arrayDeNumero[0] = 1 / arrayDeNumero[0];
    }

    public void operacaoC() {
        for (double num : arrayDeNumero) {
            num = 0;
        }
    }
    
}
