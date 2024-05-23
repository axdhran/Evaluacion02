package evaluacion02;

public class pilaresPOO {
    public static void main(String[] args) {
        Persona pe;

        pe = new Futbolista("Cristiano", "Ronaldo", 34,
                7, "Delantero");
        pe.mostrarInformacion();
        pe.accionPrincipal();

        System.out.println("-------------------");

        pe = new Entrenador("Antonio", "Perez",
                43, "FIFA");
        pe.mostrarInformacion();
        pe.accionPrincipal();

        System.out.println("-------------------");

        pe = new Masajista("Valdo", "Sanchez", 47,
                "Fisioterapeuta", 8);
        pe.mostrarInformacion();
        pe.accionPrincipal();
    }
}

class Persona {
    protected String nombre;
    protected String apellido;
    protected int edad;

    public Persona(){}

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public void mostrarInformacion()
    {
        System.out.println("//**DATOS DE LA PERSONA**\\");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
    }

   public void accionPrincipal(){
       System.out.println(nombre + " " + apellido + " esta...");
   }

}

 class Futbolista extends Persona {
     private int dorsal;
     private String demarcacion;

     public Futbolista(){}

     public Futbolista(String nombre, String apellido, int edad, int dorsal, String demarcacion) {
         super(nombre, apellido, edad);
         this.dorsal = dorsal;
         this.demarcacion = demarcacion;
     }

     @Override
     public void accionPrincipal() {
         System.out.println(nombre + " " + apellido + " está jugando un partido.");
     }

     public void mostrarInformacion()
     {
         System.out.println("//**DATOS DEL FUTBOLISTA**\\");
         System.out.println("Nombre: " + nombre);
         System.out.println("Apellido: " + apellido);
         System.out.println("Edad: " + edad);
         System.out.println("Dorsal: " + dorsal);
         System.out.println("Demarcacion: " + demarcacion);
     }
 }

class Entrenador extends Persona {
    private String federacion;

    public Entrenador(){}

    public Entrenador(String nombre, String apellido, int edad, String federacion) {
        super(nombre, apellido, edad);
        this.federacion = federacion;
    }

    @Override
    public void accionPrincipal() {
        System.out.println(nombre + " " + apellido + " está dirigiendo un partido.");
    }

    public void mostrarInformacion()
    {
        System.out.println("//**DATOS DEl ENTRENADOR**\\");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Federacion: " + federacion);
    }
}

class Masajista extends Persona {
    private String titulacion;
    private int aniosExperiencia;

    ;public Masajista(){}

    public Masajista(String nombre, String apellido, int edad,
                     String titulacion, int aniosExperiencia) {
        super(nombre, apellido, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public void accionPrincipal() {
        System.out.println(nombre + " " + apellido + " está dando un masaje.");
    }

    public void mostrarInformacion()
    {
        System.out.println("//**DATOS DEL MASAJISTA**\\");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Titulacion: " + titulacion);
        System.out.println("Anos de Experiencia: " + aniosExperiencia);
    }
}