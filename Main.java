public class Main {
    public static void main(String[] args) {
        Personajes personaje1 = new Personajes("Rayos electricos", "electrus", 11, "aereo", "experto en diseños de armas");
        Personajes personaje2 = new Personajes("Regeneracion", "Deedpool", 15, "Terrestre", "Asesino macabro");
        Personajes personaje3 = new Personajes("curacion", "sandor", 7, "Terrestre", "creador de bombas nucleares");
        Personajes personaje4 = new Personajes("invisibilidad", "plantom", 13, "acuatico", "espia encubierto");


        personaje1.caracteristicas();
        personaje2.caracteristicas();
        personaje3.caracteristicas();
        personaje4.caracteristicas();

        
    }  
   
}
