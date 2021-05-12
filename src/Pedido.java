/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Pedido {
    protected int CantidaLibros;
    protected String FechaEntrega;
    protected double MontoTotal;
    protected boolean Pago;

    public Pedido(int CantidaLibros, String FechaEntrega, double MontoTotal, boolean Pago) {
        this.CantidaLibros = CantidaLibros;
        this.FechaEntrega = FechaEntrega;
        this.MontoTotal = MontoTotal;
        this.Pago = Pago;
    }

    public Pedido() {
    }

    public int getCantidaLibros() {
        return CantidaLibros;
    }

    public void setCantidaLibros(int CantidaLibros) {
        this.CantidaLibros = CantidaLibros;
    }

    public String getFechaEntrega() {
        return FechaEntrega;
    }

    public void setFechaEntrega(String FechaEntrega) {
        this.FechaEntrega = FechaEntrega;
    }

    public double getMontoTotal() {
        return MontoTotal;
    }

    public void setMontoTotal(double MontoTotal) {
        this.MontoTotal = MontoTotal;
    }

    public boolean isPago() {
        return Pago;
    }

    public void setPago(boolean Pago) {
        this.Pago = Pago;
    }
    
    
}
