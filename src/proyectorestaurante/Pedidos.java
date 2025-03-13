/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectorestaurante;

/**
 *
 * @author eliab
 */
public class Pedidos {
    
    private String PrimerPlato;
    private String SegundoPlato;
    private String Bebida;
    private String Postre;
    private double PrecioPrimerPlato;
    private double PrecioSegundoPlato;
    private double PrecioBebida;
    private double PrecioPostre;

    public Pedidos(String PrimerPlato, String SegundoPlato, String Bebida, String Postre, double PrecioPrimerPlato, double PrecioSegundoPlato, double PrecioBebida, double PrecioPostre) {
        this.PrimerPlato = PrimerPlato;
        this.SegundoPlato = SegundoPlato;
        this.Bebida = Bebida;
        this.Postre = Postre;
        this.PrecioPrimerPlato = PrecioPrimerPlato;
        this.PrecioSegundoPlato = PrecioSegundoPlato;
        this.PrecioBebida = PrecioBebida;
        this.PrecioPostre = PrecioPostre;
    }

    public Pedidos() {
    }

    public String getPrimerPlato() {
        return PrimerPlato;
    }

    public void setPrimerPlato(String PrimerPlato) {
        this.PrimerPlato = PrimerPlato;
    }

    public String getSegundoPlato() {
        return SegundoPlato;
    }

    public void setSegundoPlato(String SegundoPlato) {
        this.SegundoPlato = SegundoPlato;
    }

    public String getBebida() {
        return Bebida;
    }

    public void setBebida(String Bebida) {
        this.Bebida = Bebida;
    }

    public String getPostre() {
        return Postre;
    }

    public void setPostre(String Postre) {
        this.Postre = Postre;
    }

    public double getPrecioPrimerPlato() {
        return PrecioPrimerPlato;
    }

    public void setPrecioPrimerPlato(double PrecioPrimerPlato) {
        this.PrecioPrimerPlato = PrecioPrimerPlato;
    }

    public double getPrecioSegundoPlato() {
        return PrecioSegundoPlato;
    }

    public void setPrecioSegundoPlato(double PrecioSegundoPlato) {
        this.PrecioSegundoPlato = PrecioSegundoPlato;
    }

    public double getPrecioBebida() {
        return PrecioBebida;
    }

    public void setPrecioBebida(double PrecioBebida) {
        this.PrecioBebida = PrecioBebida;
    }

    public double getPrecioPostre() {
        return PrecioPostre;
    }

    public void setPrecioPostre(double PrecioPostre) {
        this.PrecioPostre = PrecioPostre;
    }
    
        // Métodos sobrecargados para calcular el valor del pedido
    public double calcularValorPedido(double precioPrimerPlato, double precioBebida) {
        return precioPrimerPlato + precioBebida;
    }

    public double calcularValorPedido(double precioPrimerPlato, double precioSegundoPlato, double precioBebida) {
        return precioPrimerPlato + precioSegundoPlato + precioBebida;
    }

    public double calcularValorPedido(double precioPrimerPlato, double precioSegundoPlato, double precioBebida, double precioPostre) {
        return precioPrimerPlato + precioSegundoPlato + precioBebida + precioPostre;
    }
    
}
