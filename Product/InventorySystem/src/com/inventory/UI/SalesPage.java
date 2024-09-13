/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventory.UI;


import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import javax.swing.JOptionPane;
import java.util.Date;
import net.proteanit.sql.DbUtils;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import javax.swing.table.DefaultTableModel;

public class SalesPage extends javax.swing.JPanel {

    Dashboard dashboard;
    Connection Con =  null; 
    PreparedStatement pst,pst1 = null;
    ResultSet Rs=null;
    Statement st =null;
    private double total = 0;
    
    public SalesPage(String username, Dashboard dashboard) {
        initComponents();
        loadDataSet();
        Connection();
      
   
        this.dashboard = dashboard;
        prodNameLabel.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        sellPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        custCodeText = new javax.swing.JTextField();
        prodCodeText = new javax.swing.JTextField();
        priceText = new javax.swing.JTextField();
        quantityText = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        sellButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        addCustButton = new javax.swing.JButton();
        prodNameLabel = new javax.swing.JLabel();
        prodCodeText1 = new javax.swing.JTextField();
        custnamed = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        salesTable = new javax.swing.JTable();
        sellButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel1.setText("SALES");

        sellPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Sell Product"));

        jLabel2.setText("Customer Code:");

        jLabel3.setText("Product Code:");

        jLabel4.setText("Date:");

        jLabel5.setText("Selling Price:");

        jLabel6.setText("Quantity:");

        custCodeText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                custCodeTextKeyReleased(evt);
            }
        });

        prodCodeText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                prodCodeTextKeyReleased(evt);
            }
        });

        jDateChooser1.setForeground(new java.awt.Color(255, 255, 255));

        sellButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sellButton.setText("SELL PRODUCT");
        sellButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sellButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        addCustButton.setText("Click to add a New Customer");
        addCustButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addCustButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustButtonActionPerformed(evt);
            }
        });

        prodNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prodNameLabel.setLabelFor(prodCodeText);

        prodCodeText1.setEditable(false);
        prodCodeText1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                prodCodeText1KeyReleased(evt);
            }
        });

        custnamed.setEditable(false);
        custnamed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                custnamedKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout sellPanelLayout = new javax.swing.GroupLayout(sellPanel);
        sellPanel.setLayout(sellPanelLayout);
        sellPanelLayout.setHorizontalGroup(
            sellPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sellPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sellPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sellPanelLayout.createSequentialGroup()
                        .addComponent(prodNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prodCodeText1))
                    .addComponent(addCustButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sellButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(sellPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(custCodeText))
                    .addGroup(sellPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prodCodeText))
                    .addGroup(sellPanelLayout.createSequentialGroup()
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                    .addGroup(sellPanelLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantityText))
                    .addGroup(sellPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(priceText))
                    .addGroup(sellPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sellPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(custnamed, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        sellPanelLayout.setVerticalGroup(
            sellPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sellPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sellPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sellPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(custCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(custnamed)
                .addGap(8, 8, 8)
                .addComponent(addCustButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sellPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(prodCodeText, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sellPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sellPanelLayout.createSequentialGroup()
                        .addComponent(prodNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(prodCodeText1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sellPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sellPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceText, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sellPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityText, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sellButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sellPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton)
                    .addComponent(clearButton))
                .addContainerGap())
        );

        salesTable.setModel(new javax.swing.table.DefaultTableModel(
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
        salesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salesTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(salesTable);

        sellButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sellButton1.setText("GENERATE SALES REPORT");
        sellButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sellButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sellPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sellButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sellPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sellButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void Connection(){ //Method To Connect to Database
        try{
             Class.forName("com.mysql.jdbc.Driver"); //Get The JDBC Driver
             Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","root"); 
             //Connect to Database using credentials
        }catch(ClassNotFoundException e){ //Catch Error for missing Driver
           JOptionPane.showMessageDialog(this, "Driver not Found");
        }catch(SQLException e){ //Catch Error for database connection
           JOptionPane.showMessageDialog(this, "Failed to Connect to Database");
        }
       
    }
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel)salesTable.getModel();
        int MyIndex = salesTable.getSelectedRow();
        String saleid = model.getValueAt(MyIndex, 0).toString();
        
        
            try {
                String Query = "Delete from salesinfo where salesid="+saleid;
                Statement Del = Con.createStatement();
                Del.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Sales Record Deleted");
                loadDataSet();
             
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
 
           
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        custCodeText.setText("");
        prodCodeText.setText("");
        custnamed.setText("");
        prodCodeText1.setText("");
        priceText.setText("");
        quantityText.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void addCustButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustButtonActionPerformed
        dashboard.addCustPage();
    }//GEN-LAST:event_addCustButtonActionPerformed
   
    private void sellButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellButtonActionPerformed

        try {            
            pst = Con.prepareStatement("select * from products where pid=?");
            pst.setString(1, prodCodeText.getText());
            Rs= pst.executeQuery();
            String productid = prodCodeText.getText();
            while (Rs.next()){
                
                int instock = Rs.getInt("productqty");
                if(Integer.valueOf(quantityText.getText()) > instock){
                    JOptionPane.showMessageDialog(this, "Not Enough Quantity!");
                }
                else{
                 
                 int newstock = instock - Integer.valueOf(quantityText.getText());
                 String sqlnewstock = "Update products set productqty='"+newstock+"' where pid='"+productid+"'";   
                 pst1 = Con.prepareStatement(sqlnewstock);
                 pst1.execute();
                 
                 Date date = jDateChooser1.getDate();
             
                 String strDate = DateFormat.getDateInstance().format(date);
                 String prodname = prodCodeText.getText();
                 String custname = custCodeText.getText();
              
                 int qty = Integer.valueOf(quantityText.getText());
                 double price = Double.valueOf(priceText.getText());
                 double total = qty * price;
                 
                String addsale = "INSERT INTO salesinfo(date, productcode, customercode, quantity, revenue) VALUES ('"+strDate+"','"+prodname+"','"+custname+"','"+qty+"','"+total+"')";
                Con.createStatement().executeUpdate(addsale);
                JOptionPane.showMessageDialog(this, "Item Added");
                loadDataSet();
          
                }
            }

        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_sellButtonActionPerformed

    private void salesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesTableMouseClicked
   
    }//GEN-LAST:event_salesTableMouseClicked

    private void custCodeTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_custCodeTextKeyReleased
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            checkcust();
        }
     
    }//GEN-LAST:event_custCodeTextKeyReleased

    private void prodCodeTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prodCodeTextKeyReleased
    if(evt.getKeyCode()== KeyEvent.VK_ENTER){
        checkprod();
    }
    }//GEN-LAST:event_prodCodeTextKeyReleased

    private void prodCodeText1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prodCodeText1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_prodCodeText1KeyReleased

    private void custnamedKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_custnamedKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_custnamedKeyReleased

    private void sellButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellButton1ActionPerformed

       if (jDateChooser1.getDate() == null){
           JOptionPane.showMessageDialog(null, "Please Select A date To Generate Report For");
           //Validation Check For Date Input
       }
       else{
       Date date = jDateChooser1.getDate();
       String strDate = DateFormat.getDateInstance().format(date);
           
        try {
            pst = Con.prepareStatement("select * from salesinfo where date=?");
            pst.setString(1, strDate);
            Rs= pst.executeQuery();
            //Parameterized Query to select all Sales from specific Date
                    
                    
            String filename = "/Users/adrian/csia/SalesReport.pdf";
            //File Directory of PDF and Name of PDF
            Document doc = new Document();
            
            PdfWriter.getInstance(doc, new FileOutputStream(filename));
            doc.open();
            
            Font f = new Font(Font.FontFamily.HELVETICA, 20, Font.BOLD);
            Font f_head = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD);
            Font f_cell = new Font(Font.FontFamily.HELVETICA, 12);
            
            PdfPTable table = new PdfPTable(5);
            PdfPCell head = new PdfPCell(new Phrase("Sale ID", f_head));
            table.addCell(head);
            head = new PdfPCell(new Phrase("Date", f_head));
            table.addCell(head);
            head = new PdfPCell(new Phrase("Product Code", f_head));
            table.addCell(head);
            head = new PdfPCell(new Phrase("Customer Code", f_head));
            table.addCell(head);
            head = new PdfPCell(new Phrase("Revenue", f_head));
            table.addCell(head);
            table.setHeaderRows(1);

            Paragraph p = new Paragraph("Your Sales Report for " + strDate, f);
            p.setSpacingAfter(36f);
            doc.add(p);
            //Adding Content to PDF Document such as table for sales data and Footer
                      
            while (Rs.next()) {
                PdfPCell cell = new PdfPCell(new Phrase(Rs.getString("salesid"), f_cell));
                table.addCell(cell);
                
                cell = new PdfPCell(new Phrase(Rs.getString("date"), f_cell));
                table.addCell(cell);
                
                cell = new PdfPCell(new Phrase(Rs.getString("productcode"), f_cell));
                table.addCell(cell);
                
                cell = new PdfPCell(new Phrase(Rs.getString("customercode"), f_cell));
                table.addCell(cell);
               
                cell = new PdfPCell(new Phrase(Rs.getString("revenue"), f_cell));
                table.addCell(cell);
            }
            //Inputting Sales Data from Database into PDF
            calculatetotal();
            //Calculate Total Revenue Method
            table.setSpacingAfter(72f);               
            doc.add(table); 
            
            Paragraph cost = new Paragraph("Total Revenue: " + total + " HKD", f);
            p.setSpacingAfter(36f);
            doc.add(cost);
            
            doc.close();
            //Close Document
            JOptionPane.showMessageDialog(this, "PDF has been created!");       
            total = 0;
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);  
        }
       }
 
    }//GEN-LAST:event_sellButton1ActionPerformed
      
    public void loadDataSet() {
        try {
             Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","root");
            st = Con.createStatement();
            Rs = st.executeQuery("select * from salesinfo ORDER BY date");
            salesTable.setModel(DbUtils.resultSetToTableModel(Rs));
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
 
    public void checkcust(){
        try{
            String ccode = custCodeText.getText();
            pst = Con.prepareStatement("select * from customers where cid =?");
            pst.setString(1, ccode);
            Rs = pst.executeQuery();
            if(Rs.next() == false){
                JOptionPane.showMessageDialog(this, "ID NOT FOUND");  
            }
            else{
                String cname = Rs.getString("fullname");
                custnamed.setText(cname.trim());
            }
            
        }catch(SQLException ex){
            
        }
    }
     public void checkprod(){
        try{
            String pcode = prodCodeText.getText();
            pst = Con.prepareStatement("select * from products where pid =?");
            pst.setString(1, pcode);
            Rs = pst.executeQuery();
            if(Rs.next() == false){
                JOptionPane.showMessageDialog(this, "ID NOT FOUND");  
            }
            else{
                String pname = Rs.getString("productname");
                String pprice = Rs.getString("costprice");
                prodCodeText1.setText(pname.trim());
                priceText.setText(pprice.trim());
            }
            
        }catch(SQLException ex){
            
        }
    }

     public void calculatetotal(){
       Date date = jDateChooser1.getDate();
       String strDate = DateFormat.getDateInstance().format(date);
         
         
         try{
            String pcode = prodCodeText.getText();
            pst = Con.prepareStatement("select * from salesinfo where date =?");
            pst.setString(1, strDate);
            Rs = pst.executeQuery();
            while(Rs.next()){
                double price = Rs.getDouble("revenue");
                total = total + price;      
            }

            
        }catch(SQLException ex){
            
        }
    }
     
     
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCustButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextField custCodeText;
    private javax.swing.JTextField custnamed;
    private javax.swing.JButton deleteButton;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField priceText;
    private javax.swing.JTextField prodCodeText;
    private javax.swing.JTextField prodCodeText1;
    private javax.swing.JLabel prodNameLabel;
    private javax.swing.JTextField quantityText;
    private javax.swing.JTable salesTable;
    private javax.swing.JButton sellButton;
    private javax.swing.JButton sellButton1;
    private javax.swing.JPanel sellPanel;
    // End of variables declaration//GEN-END:variables
}
