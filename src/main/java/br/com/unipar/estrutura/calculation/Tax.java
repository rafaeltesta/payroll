package br.com.unipar.estrutura.calculation;

public class Tax implements Aliquot {

    private double aliquotValue;

    @Override
    public double getAliquot(double aliquotValue) {
        this.aliquotValue = aliquotValue;
        return this.aliquotValue;
    }

}
