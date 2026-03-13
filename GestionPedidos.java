public class GestionPedidos {

    private PilaPizza pilaPrincipal;
    private PilaPizza pilaSecundaria;

    public GestionPedidos() {
        pilaPrincipal = new PilaPizza();
        pilaSecundaria = new PilaPizza();
    }

    // Registrar pizza
    public void registrarPizza(Pizza pizza) {

        pilaPrincipal.push(pizza);

        // Cuando se registra una nueva pizza
        // se limpia la pila de redo
        pilaSecundaria = new PilaPizza();

        System.out.println("Pizza registrada correctamente.");
    }

    // Deshacer
    public void deshacer() {

        if (pilaPrincipal.isEmpty()) {
            System.out.println("No hay pedidos para deshacer.");
            return;
        }

        Pizza pizza = pilaPrincipal.pop();
        pilaSecundaria.push(pizza);

        System.out.println("Pedido deshecho.");
    }

    // Rehacer
    public void rehacer() {

        if (pilaSecundaria.isEmpty()) {
            System.out.println("No hay pedidos para rehacer.");
            return;
        }

        Pizza pizza = pilaSecundaria.pop();
        pilaPrincipal.push(pizza);

        System.out.println("Pedido recuperado.");
    }

    // Mostrar pedido actual
    public void mostrarPedidoActual() {

        Pizza pizza = pilaPrincipal.peek();

        if (pizza == null) {
            System.out.println("No hay pedidos registrados.");
        } else {
            System.out.println("Pedido actual:");
            pizza.mostrarPizza();
        }
    }
}