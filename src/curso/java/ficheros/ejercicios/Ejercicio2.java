package curso.java.ficheros.ejercicios;

import java.io.IOException;

import curso.java.ficheros.servicio.ArchivoServicio;

public class Ejercicio2 {

	public static void main(String[] args) throws IOException {
        //String nombreArchivo = "D:\\Cursos\\Java\\archivo\\java.txt";
    	String nombreArchivo = "./recursos/alumnos-colegio.txt";
        ArchivoServicio servicio = new ArchivoServicio();

        
        System.out.println(servicio.leerArchivo(nombreArchivo));
	}

}
