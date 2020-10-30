/*
 * Created by JFormDesigner on Wed Oct 28 20:16:24 AST 2020
 */

package Menu;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.DefaultTableModel;

import Persona.Adulto;
import Persona.Children;
import Persona.Joven;
import RSMaterialComponent.*;

/**
 * @author edison padilla
 */
public class Menu extends JFrame implements Funciones{
    DefaultTableModel model ;
    ButtonGroup buttonGroup;

    public Menu() {
        initComponents();
        addModel();
        buttonGroup = new ButtonGroup();
        buttonGroup.add(rSRadioButtonMaterial1);
        buttonGroup.add(rSRadioButtonMaterial2);
        buttonGroup.add(rSRadioButtonMaterial3);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void addModel(){
        Vector filas  = new Vector<String>();
        Vector columnas  = new Vector<String>();

        columnas.addElement("id");
        columnas.addElement("Nombre");
        columnas.addElement("Apellido");
        columnas.addElement("Edad");
        columnas.addElement("Generacion");

        model = new DefaultTableModel(filas , columnas);
        rSTableMetro1.setModel(model);
    }





    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - edison padilla
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        scrollPane1 = new JScrollPane();
        rSTableMetro1 = new RSTableMetro();
        rSTextFieldOne1 = new RSTextFieldOne();
        rSTextFieldOne2 = new RSTextFieldOne();
        label1 = new JLabel();
        rSRadioButtonMaterial1 = new RSRadioButtonMaterial();
        rSRadioButtonMaterial2 = new RSRadioButtonMaterial();
        rSRadioButtonMaterial3 = new RSRadioButtonMaterial();
        spinner1 = new JSpinner();
        label2 = new JLabel();
        rSButtonMaterialGradientShadow1 = new RSButtonMaterialGradientShadow();
        rSButtonMaterialGradientShadow2 = new RSButtonMaterialGradientShadow();
        rSButtonMaterialGradientShadow3 = new RSButtonMaterialGradientShadow();
        rSLabelTextIcon2 = new RSLabelTextIcon();
        label3 = new JLabel();

        //======== this ========
        setTitle("Parcial 2");
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing
            . border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e", javax. swing. border. TitledBorder
            . CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069al\u006fg" ,java .
            awt .Font .BOLD ,12 ), java. awt. Color. red) ,dialogPane. getBorder( )) )
            ; dialogPane. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
            ) {if ("\u0062or\u0064er" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} )
            ;
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setLayout(null);

                //======== scrollPane1 ========
                {
                    scrollPane1.setViewportView(rSTableMetro1);
                }
                contentPanel.add(scrollPane1);
                scrollPane1.setBounds(20, 45, 395, 310);
                contentPanel.add(rSTextFieldOne1);
                rSTextFieldOne1.setBounds(new Rectangle(new Point(425, 90), rSTextFieldOne1.getPreferredSize()));
                contentPanel.add(rSTextFieldOne2);
                rSTextFieldOne2.setBounds(new Rectangle(new Point(425, 180), rSTextFieldOne2.getPreferredSize()));

                //---- label1 ----
                label1.setText("Apellido: ");
                contentPanel.add(label1);
                label1.setBounds(425, 145, 180, 30);

                //---- rSRadioButtonMaterial1 ----
                rSRadioButtonMaterial1.setText("Ni\u00f1o");
                contentPanel.add(rSRadioButtonMaterial1);
                rSRadioButtonMaterial1.setBounds(425, 320, 75, rSRadioButtonMaterial1.getPreferredSize().height);

                //---- rSRadioButtonMaterial2 ----
                rSRadioButtonMaterial2.setText("Adulto");
                contentPanel.add(rSRadioButtonMaterial2);
                rSRadioButtonMaterial2.setBounds(590, 320, 85, rSRadioButtonMaterial2.getPreferredSize().height);

                //---- rSRadioButtonMaterial3 ----
                rSRadioButtonMaterial3.setText("Joven");
                contentPanel.add(rSRadioButtonMaterial3);
                rSRadioButtonMaterial3.setBounds(505, 320, 85, rSRadioButtonMaterial3.getPreferredSize().height);
                contentPanel.add(spinner1);
                spinner1.setBounds(430, 280, 230, spinner1.getPreferredSize().height);

                //---- label2 ----
                label2.setText("Edad:");
                contentPanel.add(label2);
                label2.setBounds(430, 240, 180, 30);

                //---- rSButtonMaterialGradientShadow1 ----
                rSButtonMaterialGradientShadow1.setText("Actualizar");
                contentPanel.add(rSButtonMaterialGradientShadow1);
                rSButtonMaterialGradientShadow1.setBounds(20, 380, 105, 40);
                rSButtonMaterialGradientShadow1.addActionListener(e -> updatePeople());

                //---- rSButtonMaterialGradientShadow2 ----
                rSButtonMaterialGradientShadow2.setText("Eliminar");
                contentPanel.add(rSButtonMaterialGradientShadow2);
                rSButtonMaterialGradientShadow2.setBounds(140, 380, 120, 40);
                rSButtonMaterialGradientShadow2.addActionListener(e -> addOrDelete("eliminar"));

                //---- rSButtonMaterialGradientShadow3 ----
                rSButtonMaterialGradientShadow3.setText("Agregar");
                rSButtonMaterialGradientShadow3.addActionListener(e -> addOrDelete("crear"));
                contentPanel.add(rSButtonMaterialGradientShadow3);
                rSButtonMaterialGradientShadow3.setBounds(270, 380, 135, 40);

                //---- rSLabelTextIcon2 ----
                rSLabelTextIcon2.setText("Administrado de Personas");
                contentPanel.add(rSLabelTextIcon2);
                rSLabelTextIcon2.setBounds(-10, -5, 260, rSLabelTextIcon2.getPreferredSize().height);

                //---- label3 ----
                label3.setText("Nombre:");
                contentPanel.add(label3);
                label3.setBounds(425, 50, 175, 30);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < contentPanel.getComponentCount(); i++) {
                        Rectangle bounds = contentPanel.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = contentPanel.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    contentPanel.setMinimumSize(preferredSize);
                    contentPanel.setPreferredSize(preferredSize);
                }
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - edison padilla
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JScrollPane scrollPane1;
    private RSTableMetro rSTableMetro1;
    private RSTextFieldOne rSTextFieldOne1;
    private RSTextFieldOne rSTextFieldOne2;
    private JLabel label1;
    private RSRadioButtonMaterial rSRadioButtonMaterial1;
    private RSRadioButtonMaterial rSRadioButtonMaterial2;
    private RSRadioButtonMaterial rSRadioButtonMaterial3;
    private JSpinner spinner1;
    private JLabel label2;
    private RSButtonMaterialGradientShadow rSButtonMaterialGradientShadow1;
    private RSButtonMaterialGradientShadow rSButtonMaterialGradientShadow2;
    private RSButtonMaterialGradientShadow rSButtonMaterialGradientShadow3;
    private RSLabelTextIcon rSLabelTextIcon2;
    private JLabel label3;

    @Override
    public void deletePeople() {

        if(rSTableMetro1.getSelectedRow() != -1){
            model.removeRow(rSTableMetro1.getSelectedRow());
            alerta("Eliminado Correctamente!");
        }else {
            alerta("Selecciones una fila!");
        }
    }

    @Override
    public void addPeople() {


        String nombre1 =rSTextFieldOne1.getText() ;
        String apellido1= rSTextFieldOne2.getText() ;
        int  edad1 = (int) spinner1.getValue();
        String[] fullData = {nombre1 , apellido1, String.valueOf(edad1)};
      RSRadioButtonMaterial[] group = {rSRadioButtonMaterial1 , rSRadioButtonMaterial2, rSRadioButtonMaterial3};
        boolean validate = true ;

        for(int i = 0 ; i < fullData.length; i++){
            if(fullData[i].length() < 1){
                validate = false;
            }
        }

        if(validate){
            String selected = "";

            for(int i = 0 ; i < group.length ; i++){
                if(group[i].isSelected()){
                   selected = group[i].getText();
                }
            }

                Children persona1 ;
                Joven persona2 ;
                Adulto persona3 ;
                Date id = new Date();

                if(selected ==  "Niño"){
                    persona1 = new Children(nombre1 , apellido1 , edad1);
                    if(persona1.getNombre().length() > 0){
                        model.addRow(new Object[]{id , persona1.getNombre(), persona1.getApellido(), persona1.getEdad() , persona1.getGeneracion("Niño") });
                        clear();
                        JOptionPane.showMessageDialog(this, accionProceso("Agregado correctamente!"));
                    }

                }else if(selected ==  "Joven"){
                    persona2 = new Joven(nombre1  , apellido1 , edad1);
                    if(persona2.getNombre().length() > 0){
                        model.addRow(new Object[]{id , persona2.getNombre(), persona2.getApellido(), persona2.getEdad() , persona2.getGeneracion("Joven") });
                        clear();
                        JOptionPane.showMessageDialog(this, accionProceso("Agregado correctamente!"));
                    }

                }else if(selected ==  "Adulto"){
                    persona3 = new Adulto(nombre1 , apellido1 , edad1);
                    if(persona3.getNombre().length() > 0){
                        model.addRow(new Object[]{id , persona3.getNombre(), persona3.getApellido(), persona3.getEdad() , persona3.getGeneracion("Adulto") });
                        clear();
                        JOptionPane.showMessageDialog(this, accionProceso("Agregado correctamente!"));
                    }


                }

        }else{
            alerta("No se pudo agregar");
        }

    }

    @Override
    public void updatePeople() {
        if(rSTableMetro1.getSelectedRow() != -1){
            alerta("Actualizado Correctamente(La tabla es Editable");
        }else {
            JOptionPane.showMessageDialog(this, "Selecciona una fila");
        }

    }

    @Override
    public void addOrDelete(String key) {

         if(key == "crear"){
             addPeople();
         }else{
             deletePeople();
         }
    }

    @Override
    public String accionProceso(String key) {
        return key;
    }

    private void addPeoppleListenner(ActionEvent e) {
        addPeople();
    }

    private  void alerta(String message){
        JOptionPane alerta = new JOptionPane();
        alerta.showMessageDialog(this, message);
        return ;
    }

    private void clear(){

        rSTextFieldOne1.setText("") ;
         rSTextFieldOne2.setText("") ;
         spinner1.setValue(0);
        rSRadioButtonMaterial1.setSelected(false);
        rSRadioButtonMaterial2.setSelected(false);
        rSRadioButtonMaterial3.setSelected(false);
    }


    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
