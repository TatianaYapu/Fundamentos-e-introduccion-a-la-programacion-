

public class Turril{
    private int capacidad;//Litros
    private int cantAgua;//Litros
    public Turril(){
        capacidad=210;
        cantAgua=0;

   }
   public void cargarAgua(){
       cantAgua=capacidad;
    }
   public int getCpacidad(){
       return capacidad;

    }
    public int getCantAgua(){
        return cantAgua;
   }
   public void setCapacidad(int nCapacidad){
       capacidad=nCapacidad;
    }
   public void setCantAgua(int nCantAgua){
      cantAgua=nCantAgua;
   
    }
}           