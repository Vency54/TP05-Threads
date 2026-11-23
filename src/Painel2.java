/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * Dupla: João Victor Lima Venceslau - Rayssa Silva de Oliveira

 */
import javax.swing.DefaultListModel;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;

public class Painel2 implements Runnable {

    private int maximo;
    private DefaultListModel<String> modelo;
    private JLabel lblFim;

    public Painel2(int maximo,
            DefaultListModel<String> modelo,
            JLabel lblFim) {
        this.maximo = maximo;
        this.modelo = modelo;
        this.lblFim = lblFim;
    }

    @Override
    public void run() {
        for (int i = 1; i <= maximo; i++) {

         final int numero = i;

            SwingUtilities.invokeLater(() -> {
                modelo.addElement(String.valueOf(numero));
            });
    
        }
        
        SwingUtilities.invokeLater(() -> {
            lblFim.setVisible(true);
        });
    }
             

}
