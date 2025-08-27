

public class Reino {
    private String poder;
    private String nombre;
    private int nivel;
    private String habitad;
    private String secreto;

    public Reino(String poder, String nombre, int nivel, String habitad, String secreto){
        this.poder = poder;
        this.nombre = nombre;
        this.nivel = nivel;
        this.habitad = habitad;
        this.secreto = secreto;
    }


    public void setPoder (String poder){
        this.poder = poder;
    }

    public String getPoder{
        return poder;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre{
        return nombre;
    }
    
    public void setNivel(int nivel){
        this.nivel = nivel;
    }
    
    public String getNivel{
        return nivel;
    }

    public void setHabitad( String habitad){
        this.habitad = habitad;
    }
    public String getHabitad{
        return habitad;
    }

    public void setSecreto( String secreto){
        this.secreto = secreto;
    }

    public String getSecreto{
        return secreto;
    }


    public void caracteristicas{
        System.out.println("---------------------caracteristicas de personajes----------------------");
        System.out.println("Nombre:  " + nombre );
        System.out.println("Poder del personaje: " + poder);
        System.out.println("habitad: " + habitad;);
        System.out.println("nivel de personaje: " + nivel);
        System.out.println("tiene un  secreto: " + secreto);
        System.out.println("tiene " + edad + "años");
        System.out.println("-------------------------------------------------------------");
    }




}
