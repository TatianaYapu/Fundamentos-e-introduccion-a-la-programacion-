
public class Jugador{
    protected String nombre;
    protected int ptsSalud,ptsDanio,velMovimiento;
    protected int posX,posY;
    protected char ficha;
    public Jugador(String nom,int ptsS,int ptsD,int vel,int x,int y){
        nombre=nom;
        ptsSalud=ptsS;
        ptsDanio=ptsD;
        velMovimiento=vel;
        posX=x;
        posY=y;
        ficha=nombre.charAt(0);
    }
    public void caminar(){
        posY+=velMovimiento;
    }
    public char getFicha(){
        return ficha;
    }
    public int getPosY(){
        return posY;
    }
    public int getPosX(){
        return posX;
    }
    public String getNombre(){
         return nombre;
    }
    public int getPtsSaluud(){
        return ptsSalud;
    }
    public int getptsDnio(){
        return ptsDanio;
    }
    public int getVelMovimiento(){
        return velMovimiento;
    }
    
}
