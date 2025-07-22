package models;

import java.util.List;

public class Maquina {
    public Maquina(String string, String string2, List<Integer> asList) {
        
    }
   

    private String nombre; 
    private String ip;
    private List<Integer> codigos;
    private int subred;
    private int riesgo;
    
    public Object getSubred() {
        
        throw new UnsupportedOperationException("Unimplemented method 'getSubred'");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public List<Integer> getCodigos() {
        return codigos;
    }

    public void setCodigos(List<Integer> codigos) {
        this.codigos = codigos;
    }

    public void setSubred(int subred) {
        this.subred = subred;
    }

    public int getRiesgo() {
        return riesgo;
    }

    public void setRiesgo(int riesgo) {
        this.riesgo = riesgo;
    }
    

    
    

    
}
