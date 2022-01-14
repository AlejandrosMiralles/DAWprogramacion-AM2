package ClaseAlumnos;

public class Alumno{
    private int id;
    private String grupo, nombre;

    private static int totalAlumnos = 0; 

    Alumno(String nickname, int identifier){
        ++totalAlumnos;

        nombre = nickname;
        id = identifier;
    }

    Alumno(String nickname, int identifier, String studentGroup){
        ++totalAlumnos;

        nombre = nickname;
        id = identifier;
        grupo = studentGroup;
    }

    void preguntarDuda(){
        System.out.println(nombre+" levanta la mano.");
    }

    static void imprimirInforme(){
        System.out.println(totalAlumnos);
    }

    private String getName(){ return nombre;}
    private String getGroup(){ return grupo;}

    static void imprimirInformeAlumnos(Alumno[] inform){
        for (Alumno student : inform) {
            System.out.print("Nombre: "+student.getName()+"\nID: "+student.id+"\n");

            if (student.getGroup() != null){
                System.out.println("Grupo: "+student.getGroup()+"\n");
            }else{
                System.out.println("");
            }
        }
    }
}