package CONTROLER;
import MODEL.Estudiante;
import MODEL.ConeccionDB;

import java.util.ArrayList;
public class ProcesarEstudiantes {
    public ArrayList<Estudiante> lstEstudiantes;
    public ProcesarEstudiantes() {
        this.lstEstudiantes = lstEstudiantes;
    }


    public void calculoPromedios(){
        for(Estudiante est : lstEstudiantes)
            est.promedio = (est.nota1 + est.nota2) / 2;
    }
    public void calculoEstados(){
        for(Estudiante est : lstEstudiantes)
            est.estado = (est.promedio >= 7) ? "Aprobado" : "Reprobado";
    }
    public void insertarEstudiante(Estudiante estudiante) {
        ConeccionDB coneccionDB = new ConeccionDB();
        coneccionDB.setConcDB("jdbc:sqlite:bd/dbTest1.db");
        coneccionDB.insertarEstudiante(estudiante);
    }
    public ArrayList<Estudiante> getLstEstudiantes() {
        return (new ConeccionDB()).getLstEstudiantes();
    }
}