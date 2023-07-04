
public class Robot{
    private int energiaMax,energia;
    public Robot(int energiaMax){
        this.energiaMax=energiaMax;
        energia=0;
    }
    public void cargarEnergia(){
        energia=energiaMax;
    }
    public int cantVueltas(int perimetro){
        int vueltas=0;
        int energiaNesecito=perimetro;
        while(energia>=energiaNesecito){
         energia=energia-energiaNesecito;
         vueltas++;
         energiaNesecito=energiaNesecito+perimetro;
    }
    return vueltas;
    }
    public int cantVueltas2(int perimetro){
        int vueltas=0;
        for(int energiaNesecito=perimetro;energia>=energiaNesecito;energiaNesecito=energiaNesecito+perimetro){
        energia=energia-energiaNesecito;
        vueltas++;
    }
    return vueltas;
}
 }    