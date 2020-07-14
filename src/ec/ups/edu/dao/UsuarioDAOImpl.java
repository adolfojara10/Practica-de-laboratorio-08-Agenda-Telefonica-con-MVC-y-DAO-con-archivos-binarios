/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.dao;

import ec.ups.edu.idao.IUsuarioDAO;
import ec.ups.edu.modelo.Usuario;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Adolfo
 */
public class UsuarioDAOImpl implements IUsuarioDAO {

    //estructutra del archivo
    /**
     * private String cedula |10 caracteres| (validar cedula) private String
     * nombre |25 caracteres| (llenar con espacio; cortar a 25 caracteres)
     * private String apellido; |25 caracteres| (llenar con espacio; cortar a 25
     * caracteres)( private String correo |50 caracteres| (llenar con espacio;
     * cortar a 50 caracteres) private String contraseña; |8 caracteres|
     * (validar contraseña) 118 bytes +10 extras 128 bytes
     *
     *
     */
    private RandomAccessFile archivo;
    private Usuario usuario;
    private int registro;

    public UsuarioDAOImpl() {
        registro = 128;
        try {
            archivo = new RandomAccessFile("C:\\Users\\Adolfo\\Desktop\\POO\\InterfazGraficaconArchivosBinarios\\datos\\usuario.dat", "rw");
        } catch (IOException ex) {
            System.out.println("error de escritura y lectura");
            ex.printStackTrace();
        }
    }

    //mandar un usuario a la base de datos
    @Override
    public void create(Usuario cliente) {
        try {
            archivo.seek(archivo.length());
            archivo.writeUTF(cliente.getCedula());
            archivo.writeUTF(cliente.getNombre());
            archivo.writeUTF(cliente.getApellido());
            archivo.writeUTF(cliente.getCorreo());
            archivo.writeUTF(cliente.getContraseña());
        } catch (IOException ex) {
            System.out.println("Error de lectura y escritura(create usuario)");
            ex.printStackTrace();
        }
    }

    //para buscar un usuario
    @Override
    public Usuario read(String cedula) {
        int salto = 0;
        try {
            while (salto < archivo.length()) {
                archivo.seek(salto);
                String cedulaArchivo = archivo.readUTF();
                if (cedula.equals(cedulaArchivo)) {
                    Usuario usuario1 = new Usuario(cedula, archivo.readUTF().trim(),
                            archivo.readUTF().trim(), archivo.readUTF().trim(),
                            archivo.readUTF().trim());
                    return usuario1;
                }
                salto += registro;
            }
        } catch (IOException ex) {
            System.out.println("Error de lectura o escritura(readUsuario)");
        }
        return null;
    }

    //para actualizar un usuario ya creado
    @Override
    public void update(Usuario cliente) {

    }

    //para eliminar un usuario
    @Override
    public void delete(Usuario cliente) {

    }

    //para iniciar sesion en la cuenta del usuario
    @Override
    public Usuario iniciarSesion(String correo, String contraseña) {
        // boolean saber = false;
        try {
            int salto = 66;

            byte[] correoArreglo = new byte[50];
            byte[] contraseñaArreglo = new byte[8];
            /* FileReader aux = new FileReader("C:\\Users\\Adolfo\\Desktop\\POO\\InterfazGraficaconArchivosBinarios\\datos\\usuario.dat");
            BufferedReader archivoLectura = new BufferedReader(aux);      */

            while (salto < archivo.length()) {
                archivo.seek(salto);

                String correoArchivo = archivo.readUTF();
                String contraseñaArchivo = archivo.readUTF();

                System.out.println(correoArchivo);
                System.out.println(contraseñaArchivo);

                System.out.println(correo + " " + contraseña);

                if (correo.equals(correoArchivo.trim()) && contraseña.equals(contraseñaArchivo.trim())) {

                    archivo.seek(salto - 66);
                    usuario = new Usuario(archivo.readUTF().trim(), archivo.readUTF().trim(),
                            archivo.readUTF().trim(), correoArchivo, contraseñaArchivo);
                    return usuario;
                }
                salto += registro;
            }

        } catch (IOException ex) {
            System.out.println("Error escritu o lectura (iniciar sesion) ");
        }

        return null;
    }

    //devuelve todos los usuarios
    @Override
    public Map<String, Usuario> findAll() {
        return null;
    }
}