class LeerPrimos{
    static void leerPrimos(){
        File libro;
        String ruta = "";
        String nombre = "primos.dat";
        BufferedReader lector;
        String contenido = "";

        libro= new File(ruta + nombre);

        try{
            libro.createNewFile();

            lector = BufferedReader(new Reader(libro));

            while(contenido != null){
                System.out.println(contenido);
                contenido = lector.nextLine();
            }
            
        }catch(IOException e){
            System.out.println(e);
        }
    }

    public static void main(String[] arg){
        leerPrimos();
    }

}