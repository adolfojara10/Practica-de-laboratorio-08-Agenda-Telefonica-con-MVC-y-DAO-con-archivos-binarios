/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.modelo;

/**
 *
 * @author Adolfo
 */
public class Telefono {

    //declaracion de atributos
    private int codigo;
    private String numero;
    private String tipo;
    private String operadora;
    private Usuario usuario;

    /**
     * metodo constructor Telefono.
     *
     * no setea ningun atributo
     */
    public Telefono() {
    }

    /**
     * metodo constructor Telefono.
     *
     * recibe datos los cuales son seteados en los atributos de esta clase
     *
     * @param codigo
     * @param numero
     * @param tipo
     * @param operadora
     */
    public Telefono(int codigo, String numero, String tipo, String operadora) {
        this.setCodigo(codigo);
        this.setNumero(numero);
        this.setTipo(tipo);
        this.setOperadora(operadora);
    }

    /**
     * metodo getCodigo.
     *
     * envia el codigo del telefono.
     *
     * @return codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * metodo setCodigo.
     *
     * sirve para setear el codigo de un objeto de tipo telefono
     *
     * @param codigo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * metodo getNumero.
     *
     * envia el numero del telefono.
     *
     * @return numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * metodo setNumero.
     *
     * sirve para setear el numero de un objeto de tipo telefono
     *
     * @param numero
     */
    public void setNumero(String numero) {
        this.numero = validarEspacios(numero, 20);
    }

    /**
     * metodo getTipo.
     *
     * envia el codigo del telefono.
     *
     * @return tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * metodo setTipo.
     *
     * sirve para setear el tipo de un objeto de tipo telefono
     *
     * @param tipo
     */
    public void setTipo(String tipo) {
        this.tipo = validarEspacios(tipo, 25);
    }

    /**
     * metodo getOperadora.
     *
     * envia la operadora del telefono.
     *
     * @return operadora
     */
    public String getOperadora() {
        return operadora;
    }

    /**
     * metodo setOperadora.
     *
     * sirve para setear la operadora de un objeto de tipo telefono
     *
     * @param operadora
     */
    public void setOperadora(String operadora) {
        this.operadora = validarEspacios(operadora, 25);
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String validarEspacios(String cadena, int espacios) {
        if (cadena.length() == espacios) {
            return cadena;
        } else {
            if (cadena.length() < espacios) {
                cadena = llenarEspacios(cadena, espacios);
                return cadena;
            } else {
                cadena = cortarEspacios(cadena, espacios);
                return cadena;
            }
        }

    }

    public String llenarEspacios(String cadena, int espacios) {
        return String.format("%-" + espacios + "s", cadena);
    }

    public String cortarEspacios(String cadena, int espacios) {
        return cadena.substring(0, espacios);
    }

    /**
     * metodo hashCode.
     *
     * este metodo crea el codigo unico del codigo de un telefono
     *
     * @return hash
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.codigo;
        return hash;
    }

    /**
     * metodo equals.
     *
     * este metodo es el encargado de comparar el codigo del telefono, en caso
     * de que lo enuentre devuelve un true, caso contrario un false
     *
     * @param obj
     * @return boolean
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Telefono other = (Telefono) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    /**
     * metodo toString.
     *
     * metodo que sirve para imprimir los datos del telefono en orden.
     *
     * @return String
     */
    @Override
    public String toString() {
        return "\nTelefono:\n" + "codigo: " + codigo + ", numero: " + numero
                + "\ntipo: " + tipo + ", operadora: " + operadora;
    }
}
