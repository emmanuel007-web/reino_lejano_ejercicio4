public class Personajes extends Reino{
    private int edad; 

    public Personajes(String poder, String nombre, int nivel, String habitad, String secreto){
        super(poder, nombre, nivel, habitad, secreto)
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad{
        return edad;
    }


}