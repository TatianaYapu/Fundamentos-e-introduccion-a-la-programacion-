
public class EjemploDoWhile{
  
    public int calcularEnergiaGasto(int perimetro, int cantVueltas){
       int res = 0;
       int factor = 1;
       int cont = 0;
       do{
           res = res+(perimetro*factor);
           factor = factor+1;
           cont++;
       }while(cont<cantVueltas);
       return res;
    }
    public int calcularGastoEnergiaWhile(int perimetro, int cantVueltas){
        int res = 0;
        int factor = 1;
        int i=0;
        while(i<cantVueltas){
            res = res+(perimetro*factor);
            factor = factor+1;
            i++;
        }
        return res;
    }
   }
 
