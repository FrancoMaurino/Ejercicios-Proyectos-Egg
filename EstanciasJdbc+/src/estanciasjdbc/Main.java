package estanciasjdbc;

import estanciasjdbc.servicios.FamiliaServicio;



public class Main {

    public static void main(String[] args) {
        
      
        
        try {
            FamiliaServicio fs = new FamiliaServicio();
            
            fs.imprimirFamilias();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
      
    }

}
