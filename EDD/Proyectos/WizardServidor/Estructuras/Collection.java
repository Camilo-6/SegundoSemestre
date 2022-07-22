package WizardServidor.Estructuras;

public interface Collection<T> extends Iterable<T> {

    /**
     * Agrega un elemento a la colección.
     * @param elemento el elemento a agregar.
     * @throws IllegalArgumentException si <code>elemento</code> es
     *                                  <code>null</code>.
    */
    public void add(T elemento);

    /**
     * Elimina un elemento de la colección.
     * @param elemento el elemento a eliminar.
     */
    public boolean delete(T elemento);

    /**
     * Regresa un elemento de la colección.
     * y lo elimina.
     * @return el elemento a sacar.
     */
    public T pop();

    /**
     * Regresa el número de elementos en la colección.
     * @return el número de elementos en la colección.
     */
    public int size();

    /**
     * Nos dice si un elemento está contenido en la colección.
     * @param elemento el elemento que queremos verificar si está contenido en
     *                 la colección.
     * @return <code>true</code> si el elemento está contenido en la colección,
     *         <code>false</code> en otro caso.
     */
    public boolean contains(T elemento);

    /**
     * Vacía la colección.
     */
    public void empty();

    /**
     * Nos dice si la colección es vacía.
     * @return <code>true</code> si la colección es vacía, <code>false</code> en
     *         otro caso.
     */
    public boolean isEmpty();
    
    /**
     * Nos dice si la colección es igual a otra colección recibida.
     * @param coleccion la colección con el que hay que comparar.
     * @return <tt>true</tt> si la colección es igual a la colección recibida;
     *         <tt>false</tt> en otro caso.
     */
    public boolean equals(Object o);

    /**
     * Regresa una representación en cadena de la colección.
     * @return una representación en cadena de la colección.
     */
    public String toString();
    
    /**
     * Método que invierte el orden de la colección.
     */
    public void reverse();

    /**
     * Regresa una copia de la colección.
     * @return una copia de la colección.
     */
    public Collection<T> clone();
}