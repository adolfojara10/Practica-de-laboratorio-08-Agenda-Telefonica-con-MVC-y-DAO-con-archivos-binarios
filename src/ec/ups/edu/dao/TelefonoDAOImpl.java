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
import java.util.*;
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
     * total === 92 bytes
     */
    private List<Telefono> listaTelefonos;
    private int codigo;
    private int tamañoRegistro;
    private RandomAccessFile archivo;

    public TelefonoDAOImpl() {
        listaTelefonos = new ArrayList<>();
        codigo = 0;
        tamañoRegistro = 92;
        try {
            archivo = new RandomAccessFile("datos/telefono.dat", "rw");
        } catch (IOException ex) {
            System.out.println("error de escritura y lectura(teelfonoDAO)");
            ex.printStackTrace();
        }
    }

    //mandar un telefono a la base datos
    @Override
    public void create(Telefono telefono) {
       // telefono.setCodigo(++codigo);
       
        try {
            codigo++;
            archivo.seek(archivo.length());
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

        int salto = 0;
        int codigo= telefono.getCodigo();
        try {
            while (salto < archivo.length()) {
                archivo.seek(salto);
                int codigoArchivo = archivo.readInt();
                if (codigo== codigoArchivo ) {
                    archivo.writeUTF(telefono.getNumero());
                    archivo.writeUTF(telefono.getOperadora());
                    archivo.writeUTF(telefono.getTipo());
                    break;
                }
                salto += tamañoRegistro;
            }
        } catch (IOException ex) {
            System.out.println("Error de lectura o escritura(upDate Telefono)");
        }
    }

    //para eliminar un telefono
    @Override
    public void delete(Telefono telefono) {

    }

    //para devolver un mapa de telefonos
    @Override
    public List<Telefono> findAll() {
        try {
            int salto = 0;

            while (salto < archivo.length()) {
                archivo.seek(salto);
                Telefono tele = new Telefono(archivo.readInt(), archivo.readUTF().trim(), archivo.readUTF().trim(),
                        archivo.readUTF().trim());
                listaTelefonos.add(tele);
                salto += tamañoRegistro;
            }
            return listaTelefonos;
        } catch (IOException ex) {
            System.out.println("error find all telefono");
        }
        return listaTelefonos;
    }

    @Override
    public List<Telefono> telefonosUsuario(String id) {
        List<Telefono> teles = new ArrayList<>();

        try {
            int salto = 80;
            while (salto < archivo.length()) {
                archivo.seek(salto);
                String aux = archivo.readUTF().trim();
                System.out.println(aux);
                if (aux.equals(id.trim())) {
                    System.out.println("hola");
                    archivo.seek(salto - 80);
                    Telefono tele = new Telefono(archivo.readInt(), archivo.readUTF().trim(),
                            archivo.readUTF().trim(), archivo.readUTF().trim());
                    teles.add(tele);
                }
                salto+=tamañoRegistro;
            }
            return teles;
        } catch (IOException ex) {
            System.out.println("Error telefonos usuario");
        }

        return teles;
    }

    @Override
    public int codigoTelefono() {
        try {
            if (archivo.length() >= tamañoRegistro) {
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
