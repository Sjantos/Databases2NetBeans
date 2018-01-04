package gui;

import bd2.DBConnect;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JFrame;
import net.proteanit.sql.DbUtils;

public class JFrameManager extends javax.swing.JFrame {
    JFrame frame;
    DBConnect connect;
    int loggedEmployeeID;
    String tableSelectedName;
    /**
     * Creates new form JFrameManager
     * @param con
     * @param employeeID
     */
    public JFrameManager(DBConnect con, int employeeID) {
        initComponents();
        frame = this;
        connect = con;
        loggedEmployeeID = employeeID;
        tableSelectedName = "clientOrders";
        //table.setModel(DbUtils.resultSetToTableModel(connect.ShowClientOrders()));
        UpdateView(connect.ShowClientOrders());
    }
    
    public void UpdateView(ResultSet result)
    {
        table.setModel(DbUtils.resultSetToTableModel(result));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        panelOptions = new javax.swing.JPanel();
        buttonSearch = new javax.swing.JButton();
        buttonEdit = new javax.swing.JButton();
        buttonChangeQuantity = new javax.swing.JButton();
        buttonMakeWarehouseOrder = new javax.swing.JButton();
        buttonCancelWarehouseOrder = new javax.swing.JButton();
        buttonMakeClientOrder = new javax.swing.JButton();
        buttonCancelClientOrder = new javax.swing.JButton();
        buttonAddClient = new javax.swing.JButton();
        buttonAddWorker = new javax.swing.JButton();
        buttonAddDrink = new javax.swing.JButton();
        buttonDeleteDrink = new javax.swing.JButton();
        buttonAddProvider = new javax.swing.JButton();
        panelViews = new javax.swing.JPanel();
        buttonClientOrders = new javax.swing.JButton();
        buttonWarehouseOrders = new javax.swing.JButton();
        buttonClients = new javax.swing.JButton();
        buttonProviders = new javax.swing.JButton();
        buttonDrinks = new javax.swing.JButton();
        scrollpanel = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        jButton2.setText("jButton2");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelOptions.setLayout(new java.awt.GridLayout(12, 0));

        buttonSearch.setText("Wyszukaj");
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });
        panelOptions.add(buttonSearch);

        buttonEdit.setText("Edytuj");
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });
        panelOptions.add(buttonEdit);

        buttonChangeQuantity.setText("Zmień ilość produktu");
        buttonChangeQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonChangeQuantityActionPerformed(evt);
            }
        });
        panelOptions.add(buttonChangeQuantity);

        buttonMakeWarehouseOrder.setText("Złóż zamówienie hurtowni");
        buttonMakeWarehouseOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMakeWarehouseOrderActionPerformed(evt);
            }
        });
        panelOptions.add(buttonMakeWarehouseOrder);

        buttonCancelWarehouseOrder.setText("Anuluj zamówienie hurtowni");
        panelOptions.add(buttonCancelWarehouseOrder);

        buttonMakeClientOrder.setText("Złóż zamówienie klienta");
        buttonMakeClientOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMakeClientOrderActionPerformed(evt);
            }
        });
        panelOptions.add(buttonMakeClientOrder);

        buttonCancelClientOrder.setText("Anuluj zamówienie klienta");
        panelOptions.add(buttonCancelClientOrder);

        buttonAddClient.setText("Dodaj klienta");
        buttonAddClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddClientActionPerformed(evt);
            }
        });
        panelOptions.add(buttonAddClient);

        buttonAddWorker.setText("Dodaj pracownika");
        buttonAddWorker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddWorkerActionPerformed(evt);
            }
        });
        panelOptions.add(buttonAddWorker);

        buttonAddDrink.setText("Dodaj napój");
        buttonAddDrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddDrinkActionPerformed(evt);
            }
        });
        panelOptions.add(buttonAddDrink);

        buttonDeleteDrink.setText("Usun napój");
        buttonDeleteDrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteDrinkActionPerformed(evt);
            }
        });
        panelOptions.add(buttonDeleteDrink);

        buttonAddProvider.setText("Dodaj dostawcę");
        buttonAddProvider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddProviderActionPerformed(evt);
            }
        });
        panelOptions.add(buttonAddProvider);

        getContentPane().add(panelOptions, java.awt.BorderLayout.LINE_START);

        buttonClientOrders.setText("Show client orders");
        buttonClientOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClientOrdersActionPerformed(evt);
            }
        });
        panelViews.add(buttonClientOrders);

        buttonWarehouseOrders.setText("Show warehouse orders");
        buttonWarehouseOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonWarehouseOrdersActionPerformed(evt);
            }
        });
        panelViews.add(buttonWarehouseOrders);

        buttonClients.setText("Show clients");
        buttonClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClientsActionPerformed(evt);
            }
        });
        panelViews.add(buttonClients);

        buttonProviders.setText("Show providers");
        buttonProviders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProvidersActionPerformed(evt);
            }
        });
        panelViews.add(buttonProviders);

        buttonDrinks.setText("Show drinks");
        buttonDrinks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDrinksActionPerformed(evt);
            }
        });
        panelViews.add(buttonDrinks);

        getContentPane().add(panelViews, java.awt.BorderLayout.PAGE_START);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollpanel.setViewportView(table);

        getContentPane().add(scrollpanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonClientOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClientOrdersActionPerformed
        table.setModel(DbUtils.resultSetToTableModel(connect.ShowClientOrders()));
        tableSelectedName = "clientOrders";
    }//GEN-LAST:event_buttonClientOrdersActionPerformed

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        JFrameSearch searchFrame = new JFrameSearch(table, frame, tableSelectedName, connect);
        
        searchFrame.setVisible(true);
        System.out.println(searchFrame.isVisible());
    }//GEN-LAST:event_buttonSearchActionPerformed

    private void buttonDrinksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDrinksActionPerformed
        table.setModel(DbUtils.resultSetToTableModel(connect.ShowAllDrinks()));
        tableSelectedName = "drinks";
    }//GEN-LAST:event_buttonDrinksActionPerformed

    private void buttonWarehouseOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonWarehouseOrdersActionPerformed
        table.setModel(DbUtils.resultSetToTableModel(connect.ShowWarehouseOrders()));
        tableSelectedName = "warehouseOrders";
    }//GEN-LAST:event_buttonWarehouseOrdersActionPerformed

    private void buttonClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClientsActionPerformed
        table.setModel(DbUtils.resultSetToTableModel(connect.ShowAllClients()));
        tableSelectedName = "clients";
    }//GEN-LAST:event_buttonClientsActionPerformed

    private void buttonProvidersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProvidersActionPerformed
        table.setModel(DbUtils.resultSetToTableModel(connect.ShowAllProviders()));
        tableSelectedName = "providers";
    }//GEN-LAST:event_buttonProvidersActionPerformed

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        // TODO add your handling code here:
        JFrameEditManager EditManagerFrame = new JFrameEditManager(connect);
        
        EditManagerFrame.setVisible(true);
        System.out.println(EditManagerFrame.isVisible());
    }//GEN-LAST:event_buttonEditActionPerformed

    private void buttonAddProviderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddProviderActionPerformed
         JFrameAddProvider AddProviderFrame = new JFrameAddProvider(connect);
        
        AddProviderFrame.setVisible(true);
        System.out.println(AddProviderFrame.isVisible());
    }//GEN-LAST:event_buttonAddProviderActionPerformed

    private void buttonAddClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddClientActionPerformed
        // TODO add your handling code here:
        JFrameAddClient AddClientFrame = new JFrameAddClient(connect);
        
        AddClientFrame.setVisible(true);
        System.out.println(AddClientFrame.isVisible());
    }//GEN-LAST:event_buttonAddClientActionPerformed

    private void buttonAddDrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddDrinkActionPerformed
        // TODO add your handling code here:
        JFrameAddDrink AddDrinkFrame = new JFrameAddDrink(connect);
        
        AddDrinkFrame.setVisible(true);
        System.out.println(AddDrinkFrame.isVisible());
    }//GEN-LAST:event_buttonAddDrinkActionPerformed

    private void buttonAddWorkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddWorkerActionPerformed
        // TODO add your handling code here:
        JFrameAddWorker AddWorkerFrame = new JFrameAddWorker(connect);
        
        AddWorkerFrame.setVisible(true);
        System.out.println(AddWorkerFrame.isVisible());
    }//GEN-LAST:event_buttonAddWorkerActionPerformed

    private void buttonDeleteDrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteDrinkActionPerformed
        // TODO add your handling code here:
        JFrameDeleteDrink DeleteDrinkFrame = new JFrameDeleteDrink(connect);
        
        DeleteDrinkFrame.setVisible(true);
        System.out.println(DeleteDrinkFrame.isVisible());
    }//GEN-LAST:event_buttonDeleteDrinkActionPerformed

    private void buttonChangeQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonChangeQuantityActionPerformed
        // TODO add your handling code here:
        JFrameChangeamountOfDrink ChangeamountofDrinkFrame = new JFrameChangeamountOfDrink(connect);
        
        ChangeamountofDrinkFrame.setVisible(true);
        System.out.println(ChangeamountofDrinkFrame.isVisible());
    }//GEN-LAST:event_buttonChangeQuantityActionPerformed

    private void buttonMakeClientOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMakeClientOrderActionPerformed
        // TODO add your handling code here:
        JFrameMakeClientOrder makeClientOrderFrame = new JFrameMakeClientOrder(connect, loggedEmployeeID);
        
        makeClientOrderFrame.setVisible(true);
    }//GEN-LAST:event_buttonMakeClientOrderActionPerformed

    private void buttonMakeWarehouseOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMakeWarehouseOrderActionPerformed
        // TODO add your handling code here:
        JFrameMakeWarehouseOrder makeWarehouseOrderFrame = new JFrameMakeWarehouseOrder(connect, loggedEmployeeID);
        
        makeWarehouseOrderFrame.setVisible(true);
    }//GEN-LAST:event_buttonMakeWarehouseOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAddClient;
    private javax.swing.JButton buttonAddDrink;
    private javax.swing.JButton buttonAddProvider;
    private javax.swing.JButton buttonAddWorker;
    private javax.swing.JButton buttonCancelClientOrder;
    private javax.swing.JButton buttonCancelWarehouseOrder;
    private javax.swing.JButton buttonChangeQuantity;
    private javax.swing.JButton buttonClientOrders;
    private javax.swing.JButton buttonClients;
    private javax.swing.JButton buttonDeleteDrink;
    private javax.swing.JButton buttonDrinks;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JButton buttonMakeClientOrder;
    private javax.swing.JButton buttonMakeWarehouseOrder;
    private javax.swing.JButton buttonProviders;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JButton buttonWarehouseOrders;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel panelOptions;
    private javax.swing.JPanel panelViews;
    private javax.swing.JScrollPane scrollpanel;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
