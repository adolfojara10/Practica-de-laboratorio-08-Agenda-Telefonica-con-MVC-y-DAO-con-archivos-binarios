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
    private int codigo;
    private int tamañoRegistro;
    private RandomAccessFile archivo;

    public TelefonoDAOImpl() {
        codigo = 0;
        tamañoRegistro = 92;
        try {
            archivo = new RandomAccessFile("C:\\Users\\Adolfo\\Desktop\\POO\\InterfazGraficaconArchivosBinarios\\datos\\telefono.dat", "rw");
            //archivo = new RandomAccessFile("datos/telefono.dat", "rw");
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
        int codigo = telefono.getCodigo();
        try {
            while (salto < archivo.length()) {
                archivo.seek(salto);
                int codigoArchivo = archivo.readInt();
                if (codigo == codigoArchivo) {
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
    public void delete(int id) {

        int salto = 0;

        try {
            while (salto < archivo.length()) {
                archivo.seek(salto);
                int codigoArchivo = archivo.readInt();
                if (id == codigoArchivo) {
                    archivo.seek(salto);
                    archivo.writeInt(0);
                    archivo.writeUTF(llenarEspacios(20));
                    archivo.writeUTF(llenarEspacios(25));
                    archivo.writeUTF(llenarEspacios(25));
                    archivo.writeUTF(llenarEspacios(10));
                    break;
                }
                salto += tamañoRegistro;
            }
        } catch (IOException ex) {
            System.out.println("Error de lectura o escritura(upDate Telefono)");
        }

    }

    @Override
    public String llenarEspacios(int espacios) {
        String formato = "";
        return String.format("%-" + espacios + "s", formato);
    }

    //para devolver un mapa de telefonos
    @Override
    public List<Telefono> findAll() {
        List<Telefono> listaTelefonos = new ArrayList<>();
        try {
            int salto = 0;

            while (salto < archivo.length()) {
                archivo.seek(salto);

                int valor = archivo.readInt();
                if (valor > 0) {
                    Telefono tele = new Telefono(valor, archivo.readUTF().trim(),
                            archivo.readUTF().trim(), archivo.readUTF().trim());
                    listaTelefonos.add(tele);
                }

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
                    //System.out.println("hola");

                    archivo.seek(salto - 80);
                    int valor = archivo.readInt();
                    if (valor > 0) {
                        Telefono tele = new Telefono(valor, archivo.readUTF().trim(),
                                archivo.readUTF().trim(), archivo.readUTF().trim());
                        teles.add(tele);
                    }

                }
                salto += tamañoRegistro;
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
            if (archivo.length() > 0) {
                //archivo.seek(archivo.length() - tamañoRegistro);
                int aux = (int) (archivo.length() / tamañoRegistro);

                /*if(archivo.readInt()==0)
                {
                    archivo.seek(archivo.length()-(tamañoRegistro*2));
                    System.out.println(archivo.readInt()+"\n1");
                    return archivo.readInt();
                    
                }else{
                    System.out.println(archivo.readInt()+"\n2");
                    return archivo.readInt();
                }*/
                System.out.println(aux);
                return aux;

            } else {
                //System.out.println(archivo.readInt() + "\n3");
                return 0;
            }
        } catch (IOException ex) {
            System.out.println("Error codigo(codigoTelefono)");
        }
        //System.out.println(archivo.readInt()+"\n4");
        return codigo;
    }
}
