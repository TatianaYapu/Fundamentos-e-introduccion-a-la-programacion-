
public class Main{
    public static void main(String args[]){
        Lote[][] lotes=new Lote[4][4];
        lotes[0][0]=new Lote(6,"Mamani");
        lotes[0][1]=new Lote(11,"Lopez");
        lotes[0][2]=new Lote(9,"Flores");
        lotes[0][3]=new Lote(8,"Choque");
        lotes[1][0]=new Lote(3,"Rojas");
        lotes[1][1]=new Lote(5,"Vargas");
        lotes[1][2]=new Lote(4,"Villca");
        lotes[1][3]=new Lote(10,"Soliz");
        lotes[2][0]=new Lote(5,"Vega");
        lotes[2][1]=new Lote(13,"Arias");
        lotes[2][2]=new Lote(8,"Guzman");
        lotes[2][3]=new Lote(6,"Prado");
        lotes[3][0]=new Lote(7,"Andrade");
        lotes[3][1]=new Lote(10,"Coca");
        lotes[3][2]=new Lote(9,"Camacho");
        lotes[3][3]=new Lote(12,"Veizaga");
        Barrio barrio=new Barrio(lotes);
        barrio.visualizar();
        System.out.println("------------------------------------");
        System.out.println("el dueño de la mayor cant de pers es: "+barrio.nombPropMayCant());
        System.out.println("el lote con mayor cant de pers esta: "+barrio.callesLoteMayCant());
        System.out.println("el dueño de la menor cant de pers es: "+barrio.nombPropMenCant());
        System.out.println("el lote con menor cant de pers esta: "+barrio.callesLoteMenCant());
    
    
    
    
    
    
    
    }
}
