public class PilaPizza {

    private Nodo tope;

    public PilaPizza() {
        tope = null;
    }

    // Verificar si la pila está vacía
    public boolean isEmpty() {
        return tope == null;
    }

    // Insertar una pizza en el tope de la pila
    public void push(Pizza pizza) {

        Nodo nuevo = new Nodo(pizza);

        // El nuevo nodo apunta al nodo que era el tope
        nuevo.siguiente = tope;

        // Ahora el nuevo nodo se convierte en el tope
        tope = nuevo;
    }

    // Eliminar el elemento del tope
    public Pizza pop() {

        if (isEmpty()) {
            return null;
        }

        Pizza pizza = tope.pizza;

        // El tope pasa a ser el siguiente nodo
        tope = tope.siguiente;

        return pizza;
    }

    // Ver la pizza del tope sin eliminarla
    public Pizza peek() {

        if (isEmpty()) {
            return null;
        }

        return tope.pizza;
    }
}