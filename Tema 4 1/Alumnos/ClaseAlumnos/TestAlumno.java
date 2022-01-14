package ClaseAlumnos;

public class TestAlumno {
    public static void main(String[] args) {
        Alumno pepe, maria, marta, julio, estefan, jose, chinchun;
        

        pepe = new Alumno("Pepe", 35356);
        maria = new Alumno("María", 354345, "1CFSJ");
        marta = new Alumno("Marta", 35156);
        julio = new Alumno("Julio", 35956);
        estefan = new Alumno("Estefan", 1290, "1CFSG");
        jose = new Alumno("Jose", 8421, "1CFSG");
        chinchun = new Alumno("Chin Chun", 897654321, "1CFSJ");

        Alumno[] students = {pepe, maria, marta, julio, estefan, jose, chinchun};
        
        System.out.println("LA DUDA:");
        chinchun.preguntarDuda();
        System.out.println("\n_________________________________________________\n");

        System.out.println("\n\nNúmero de alumnos:");
        Alumno.imprimirInforme();
        System.out.println("\n_________________________________________________\n");

        System.out.println("\n\nInforme de Alumnos:");
        Alumno.imprimirInformeAlumnos(students);
        System.out.println("\n");
    }
}
