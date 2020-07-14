/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.dao;

import ec.ups.edu.idao.ITelefonoDAO;
import ec.ups.edu.modelo.Telefono;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Adolfo
 */
public class TelefonoDAOImpl implements ITelefonoDAO {

    /**
     * private int codigo (4 bytes) private String numero; (20 bytes) + 2extras
     * private String tipo; (25 bytes) + 2extras private String operadora; (25
     * bytes) + 2extras private Usuario usuario; (cedula ID) 10 bytes + 2 extras
     * total === 97 bytes
     */
    private Map<Integer, Telefono> listaTelefonos;
    private int codigo;
    private int tamañoRegistro;
    private RandomAccessFile archivo;
    
    public TelefonoDAOImpl() {
        listaTelefonos = new HashMap<>();
        codigo = 0;
        tamañoRegistro = 97;
        try {
            archivo = new RandomAccessFile("C:\\Users\\Adolfo\\Desktop\\POO\\InterfazGraficaconArchivosBinarios\\datos\\telefono.dat", "rw");
        } catch (IOException ex) {
            System.out.println("error de escritura y lectura(teelfonoDAO)");
            ex.printStackTrace();
        }
    }

    //mandar un telefono a la base datos
    @Override
    public void create(Telefono telefono) {
        telefono.setCodigo(++codigo);
        try {
            archivo.writeInt(telefono.getCodigo());
            archivo.writeUTF(telefono.getNumero());
            archivo.writeUTF(telefono.getOperadora());
            archivo.writeUTF(telefono.getTipo());
            archivo.writeUTF(telefono.getUsuario().getCedula());
        } catch (IOException ex) {
            System.out.println("Error (create Telefono)");
        }
        
    }

    //para devolver un telefono de la base de datos
    @Override
    public Telefono read(int id) {
        
        return null;
    }

    //para actualizar un telefono
    @Override
    public void update(Telefono telefono) {
        
    }

    //para eliminar un telefono
    @Override
    public void delete(Telefono telefono) {
        
    }

    //para devolver un mapa de telefonos
    @Override
    public Map<Integer, Telefono> findAll() {
        return null;
    }
    
    @Override
    public int codigoTelefono() {
        try {
            if (archivo.length() > tamañoRegistro) {
                archivo.seek(archivo.length() - tamañoRegistro);
                return archivo.readInt();
            } else {
                return codigo;
            }
        } catch (IOException ex) {
            System.out.println("Error codigo(codigoTelefono)");
        }
        return (codigo);
    }
}
