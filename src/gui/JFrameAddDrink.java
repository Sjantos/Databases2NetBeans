/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import javax.swing.JFrame;
import net.proteanit.sql.DbUtils;
import java.sql.*;
import bd2.DBConnect;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Lapszo
 */
public class JFrameAddDrink extends javax.swing.JFrame {
    DBConnect connect;
    Connection con;
    Statement st;
    Boolean canBeExecuted = true;
    /**
     * Creates new form JFrameAddDrink
     */
    public JFrameAddDrink(DBConnect conn) {
        connect = conn;
        con = connect.getConnection();
        initComponents();
        initBoxes();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    private void initBoxes()
    {
        Statement st = null;
        ResultSet rs = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM packs;");
        while(rs.next()) 
        { 
           String capasity = rs.getString(2);
          String material = rs.getString(3);
           String d = capasity + "," + material;
           Pack.addItem(d);
            
        }
        rs = st.executeQuery("SELECT * FROM consolidatedpacks;");
        while(rs.next()) 
        { 
           String quantity = rs.getString(2);
          String packType = rs.getString(3);
          String dimentions = rs.getString(4);
           String d = quantity + "," + packType + "," + dimentions;
           ConsolidatedPack.addItem(d);
        }
        } catch (SQLException ex) {
            Logger.getLogger(JFrameAddDrink.class.getName()).log(Level.SEVERE, null, ex);
        }
 
        
        for(int i = 0 ; i <= 100 ; i++)
        {
            String d = Integer.toString(i);
            AlcoholDose.addItem(d);
        }
        
        for(int i = 0 ; i < 5 ; i++)
        {
            for(int j = 0 ; j <= 25 ; j++)
            {
                char c = (char)(i + 'A');
               String d = Integer.toString(j);
               String w = String.valueOf(c);
               String g = w + d;
               WareHouseSector.addItem(g);        
            }
        }
        
        /* next comboboxes
        
Statement st = con.createStatement();
String sql = ("SELECT * FROM posts ORDER BY id DESC LIMIT 1;");
ResultSet rs = st.executeQuery(sql);
if(rs.next()) { 
 int id = rs.getInt("first_column_name"); 
 String str1 = rs.getString("second_column_name");
}

con.close();
        
        */
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Price = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Sugar = new javax.swing.JCheckBox();
        Alcohol = new javax.swing.JCheckBox();
        AlcoholDose = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        Fizzy = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        WareHouseSector = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        Amount = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Pack = new javax.swing.JComboBox<>();
        ConsolidatedPack = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        Add = new javax.swing.JButton();
        Close = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name");

        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });

        jLabel2.setText("Price");

        jLabel3.setText("Sugar");

        jLabel4.setText("Alcohol");

        jLabel5.setText("Alcohol Dose");

        Sugar.setText("Yes");

        Alcohol.setText("Yes");

        jLabel6.setText("Fizzy");

        Fizzy.setText("Yes");

        jLabel7.setText("Warehouse Sector");

        jLabel8.setText("Amount");

        Amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmountActionPerformed(evt);
            }
        });

        jLabel9.setText("Pack");

        jLabel10.setText("Consolidate Pack");

        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Close.setText("Close");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Name)
                    .addComponent(Price)
                    .addComponent(Amount)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Fizzy)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(Sugar)
                            .addComponent(Alcohol)
                            .addComponent(AlcoholDose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(WareHouseSector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(Pack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(ConsolidatedPack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 218, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sugar)
                .addGap(7, 7, 7)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Alcohol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AlcoholDose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Fizzy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(WareHouseSector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ConsolidatedPack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Close, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(Add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void AmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AmountActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        // TODO add your handling code here:
        end();
    }//GEN-LAST:event_CloseActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed

        if(Name.getText().equals(""))
            canBeExecuted = false;
        
        for(int i = 0 ; i < Price.getText().length() ; i++)
        {
            if(Price.getText().charAt(i) < 48 || Price.getText().charAt(i) > 57 )
                canBeExecuted = false;
            if(Price.getText().charAt(i) == 46)
               canBeExecuted = true; 
        }
        for(int i = 0 ; i < Amount.getText().length() ; i++)
        {
            if(Amount.getText().charAt(i) < 48 || Amount.getText().charAt(i) > 57 )
                canBeExecuted = false;
        }


        
        
        if (canBeExecuted == true)
        {
            con = connect.getConnection();
            String name = Name.getText();
            double price = Double.parseDouble(Price.getText());
            int amount = Integer.parseInt(Amount.getText());
            boolean sugar = Sugar.isSelected();
            boolean alcohol = Alcohol.isSelected();
            boolean fizzy = Fizzy.isSelected();
            //int wareHouseSector = WareHouseSector.getSelectedIndex();
            double alcoholDose = Double.parseDouble(AlcoholDose.getSelectedItem().toString());
            String wareHouseSector = WareHouseSector.getSelectedItem().toString();
            int consolidatedPack = ConsolidatedPack.getSelectedIndex()+1;
            int pack = Pack.getSelectedIndex()+1;
            try{
            CallableStatement myStmt = con.prepareCall("{call AddDrink(?,?,?,?,?,?,?,?,?,?)}");
            myStmt.setString(1,name);
            myStmt.setDouble(2,price);
            myStmt.setBoolean(3,sugar);
            myStmt.setBoolean(4,alcohol);
            myStmt.setDouble(5,alcoholDose);
            myStmt.setBoolean(6,fizzy);
            myStmt.setString(7,wareHouseSector);
            myStmt.setInt(8,amount);
            myStmt.setInt(9,pack);
            myStmt.setInt(10,consolidatedPack);
            myStmt.execute();
            } catch (SQLException ex) {
                    Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else
        {
            JOptionPane.showMessageDialog(null,"Bledne dane.","Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
        end();
    }//GEN-LAST:event_AddActionPerformed

    /**
     * @param args the command line arguments
     */
    /*
    publicstatic void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameAddDrink().setVisible(true);
            }
        });
    }
    */
    public void end()
    {
        setVisible(false);
        dispose();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JCheckBox Alcohol;
    private javax.swing.JComboBox<String> AlcoholDose;
    private javax.swing.JTextField Amount;
    private javax.swing.JButton Close;
    private javax.swing.JComboBox<String> ConsolidatedPack;
    private javax.swing.JCheckBox Fizzy;
    private javax.swing.JTextField Name;
    private javax.swing.JComboBox<String> Pack;
    private javax.swing.JTextField Price;
    private javax.swing.JCheckBox Sugar;
    private javax.swing.JComboBox<String> WareHouseSector;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
