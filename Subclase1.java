public class Subclase1 extends Base{
    private int unidades;
    private double precio;
    private boolean aprobado;
    
    public Subclase1(int unidades, double precio, boolean aprobado){
        this.unidades = unidades;
        this.precio = precio;
        this.aprobado = aprobado;
    }
    
    public void setUnidades(int unidades){
        this.unidades = unidades;
    }
    
    public int getUnidades(){
        return this.unidades;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    public double getPrecio(){
        return this.precio;
    }
    
    public void setAprobado(boolean aprobado){
        this.aprobado = aprobado;
    }
    
    public boolean getAprobado(){
        return this.aprobado;
    }
    
    public String informar(String informar){
        return "Por ultimo, " + informar;
    }
    
    public double total(){
        return unidades*precio;
    }
    
    
    
}