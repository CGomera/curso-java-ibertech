package curso.java.colecciones.ejercicio1bis;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		Main main = new Main();
		main.abrirInstituto();
		main.mostrarEstudiantes();
	}
	
	private List<Estudiante> estudiantes;
	public void abrirInstituto() {
		
		Set<Asignatura> asignaturas1=new HashSet<Asignatura>();
		asignaturas1.add(new Asignatura("Lengua"));
		asignaturas1.add(new Asignatura("Latín"));
		asignaturas1.add(new Asignatura("Griego"));
		Set<Asignatura> asignaturas2=new HashSet<Asignatura>();
		asignaturas2.add(new Asignatura("Matemáticas"));
		asignaturas2.add(new Asignatura("Física"));
		asignaturas2.add(new Asignatura("Química"));
		Set<Asignatura> asignaturas3=new HashSet<Asignatura>();
		asignaturas3.add(new Asignatura("Lengua"));
		asignaturas3.add(new Asignatura("Matemáticas"));
		Set<Asignatura> asignaturas4=new HashSet<Asignatura>();
		asignaturas4.add(new Asignatura("Lengua"));
		asignaturas4.add(new Asignatura("Latín"));
		Set<Asignatura> asignaturas5=new HashSet<Asignatura>();
		asignaturas5.add(new Asignatura("Matemáticas"));
		asignaturas5.add(new Asignatura("Física"));
		

		Estudiante e1=new Estudiante("Carlos", "García",asignaturas1);
		Estudiante e2=new Estudiante("Juan", "Robles",asignaturas2);
		Estudiante e3=new Estudiante("Sergio", "Rodriguez",asignaturas3);
		Estudiante e4=new Estudiante("Pablo", "Sánchez",asignaturas4);
		Estudiante e5=new Estudiante("Daniel", "López",asignaturas5);
		
		this.estudiantes=new ArrayList<Estudiante>();
		this.estudiantes.add(e1);
		this.estudiantes.add(e2);
		this.estudiantes.add(e3);
		this.estudiantes.add(e4);
		this.estudiantes.add(e5);	
	}
	public void mostrarEstudiantes() {
		System.out.println("Estudiantes:\n");
		for (Estudiante estudiante : estudiantes) {
			System.out.println(estudiante.getNombre()+" "+estudiante.getApellidos());
			for (Asignatura asignatura : estudiante.getAsignaturas()) {
				System.out.println(asignatura.getNombre()+": "+String.format("%.2f", asignatura.getNota()));
			}
			System.out.println();
		}
	}

}