package AlluraChallenge.modelos;

public record ValoresMonedas(String ARS, String USD, String BRL, String COP) {


    @Override
    public String toString() {
        return "Valores " + "ARS: " + this.ARS() + ", BRL: " +  this.BRL() + ", USD: " + this.USD() + ", COP: " + this.COP();
    }
}
