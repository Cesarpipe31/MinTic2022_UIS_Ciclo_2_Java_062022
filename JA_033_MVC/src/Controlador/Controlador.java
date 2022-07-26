package Controlador;

import Modelo.Modelo;
import Vista.frmVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener 
{
    private frmVista view;
    private Modelo model;

    public Controlador(frmVista view, Modelo model) {
        this.view = view;
        this.model = model;
        this.view.btnmultiplicar.addActionListener(this);
        view.txtResultado.setText(String.valueOf(model.getResultado()));
    }
    
    public void inicia()
    {
        view.setTitle("MVC Multiplicar");
        view.setLocationRelativoTo(null);
    }
    
    public void actioPerformed(ActionEvent e)
    {
        model.setNumeroUno(Integer.parseInt(view.txtnumerouno.getText());
        model.setNumeroDos(Integer.parseInt(view.txtnumerodos.getText());
        model.multiplicar();
        view.txtResultado.setText(model.getResultado());
        
        
    }
    
    public void iniciar()
    {
        view.setTitle("MVC Multiplicar");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}
