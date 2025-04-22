package tiquetes;

import java.util.Date;

public class General extends Tiquete {
    private String tipo; // Básico, Familiar, Oro, Diamante

    public General(Date fechaCompra, int precio, String tipo) {
        super(fechaCompra, precio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Tiquete General [" + tipo + "] - " + super.toString();
    }
}