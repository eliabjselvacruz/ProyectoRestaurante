/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectorestaurante;

/**
 *
 * @author eliab
 */
public class ProyectoRestaurante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                // Crear instancia de la clase PedidoRestaurante
        Pedidos pedido = new Pedidos("Ensalada", "Pollo asado", "Jugo de naranja", "Tres leche", 8.0, 12.0, 3.5, 5.0);

        // Prueba de métodos sobrecargados
        double total1 = pedido.calcularValorPedido(pedido.getPrecioPrimerPlato(), pedido.getPrecioBebida());
        System.out.println("Valor del pedido (primer plato + bebida): C$" + total1);

        double total2 = pedido.calcularValorPedido(pedido.getPrecioPrimerPlato(), pedido.getPrecioSegundoPlato(), pedido.getPrecioBebida());
        System.out.println("Valor del pedido (primer plato + segundo plato + bebida): C$" + total2);

        double total3 = pedido.calcularValorPedido(pedido.getPrecioPrimerPlato(), pedido.getPrecioSegundoPlato(), pedido.getPrecioBebida(), pedido.getPrecioPostre());
        System.out.println("Valor del pedido (primer plato + segundo plato + bebida + postre): C$" + total3);
    }
    
}
