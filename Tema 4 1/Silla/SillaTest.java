package Silla;

public class SillaTest {

    static String randomColor(){
        int option = (int) (Math.random() * (6 - 1 + 1) + 1);

        switch(option){
            case(1): return "Azul";
            case(2): return "Cian";
            case(3): return "Fucsia";
            case(4): return "Rojo";
            case(5): return "Blanco";
            case(6): return "Negro";
            default: return "Naranja";
        }
    }

    static String randomMaterial(){
        int option = (int) (Math.random() * (6 - 1 + 1) + 1);

        switch(option){
            case(1): return "Madera";
            case(2): return "Plástico";
            case(3): return "Arcilla";
            case(4): return "Cemento";
            case(5): return "Chocolate";
            case(6): return "Poliestel";
            default: return "Acero";
        }
    }

    static boolean randomRespaldo(){
        int option = (int) (Math.random() * (1 - 0 + 1) + 0);

        if (option == 1){ return true;}
        return false;
    }

    static void test(){
        String color, material;
        byte patas, comodidad;
        boolean respaldo;
        int x, y;

        Silla chair = new Silla();

        color = randomColor();
        material = randomMaterial();

        x = (int) (Math.random() * (20 - -20 + 1) + -20);
        y = (int) (Math.random() * (20 - -20 + 1) + -20);
        patas = (byte) (Math.random() * (6 - 1 + 1) + 1);
        comodidad = (byte) (Math.random() * (10 - 0 + 1) + 0);

        respaldo = randomRespaldo();

        chair.setColor(color);
        chair.setMaterial(material);
        chair.setCoordenadas(x, y);
        chair.setComodidad(comodidad);
        chair.setPatas(patas);
        chair.setRespaldo(respaldo);

        System.out.println("Hash code: "+chair.hashCode()+"\n");
        System.out.println("Color: "+chair.getColor()+
            "\nMaterial: "+ chair.getMaterial()+"\nComodidad: "+
            chair.getComodidad()+"\nPatas: "+chair.getPatas()+
            "\nRespaldo: "+chair.getRespaldo()+"\nLocalización: "+chair.getCoordenadas());
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println("_____________Silla "+(i+1)+"___________\n");
            test();
            System.out.println("");
        }
    }
}