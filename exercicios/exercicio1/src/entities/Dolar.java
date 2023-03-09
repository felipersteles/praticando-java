package entities;

public class Dolar {
    private double value;
    private double IOF;
    private double amount;

    public Dolar(double value){
        this.IOF = 1.06;
        this.value = value;
    }

    public double getValue(){
        return this.value;
    }

    public double getIOF(){
        return this.IOF;
    }

    public void setValue (double value){
        this.value = value;
    }

    // provavelmente o valor lido será em porcentagem
    // então o calculo ja é feito aqui
    public void setIOF (double IOF){
        this.IOF = (IOF/100) + 1;
    }

    public double buy(double quantity){
        this.amount = (this.value * this.IOF) * quantity;

        return amount;
    }

    // para imprimir no terminal
    public String show() {
        return "The amount to be paid in reais = " + amount;                         // Retorna a resposta
    }
}
