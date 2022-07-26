package ja_033_mvc;

public class JA_033_MVC {
  
    public static void main(String[] args) {
        Modelo mod = new Modelo();
        frmVista view = new frmVista();
        
        Controlador ctrl = new Controlador(view, mod);
        ctrl.iniciar();
        view.setVisible(true);      
    }
    
}
