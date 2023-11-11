/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package GUI;

import BUS.BillHomeCustomer;
import DTO.Book;
import DTO.Check_Error;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.accessibility.AccessibleContext;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author DELL
 */
public class Sale extends javax.swing.JDialog implements ActionListener{

    private  Book book;
    private  HomeCustomer homeCustomer;
    private final Check_Error c;
    private ArrayList<Book> books;
    

    /**
     * Creates new form Sale
     */
    public Sale(java.awt.Frame parent, boolean modal,HomeCustomer homeCustomer,DTO.Book book) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.book=book;
        this.homeCustomer=homeCustomer;
        loadData();
        addActionListener();
        books=(ArrayList<Book>) DAL.ReadDataFromSQL.readBook();
        c = new Check_Error();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        lbTitle = new javax.swing.JLabel();
        lbImage = new javax.swing.JLabel();
        btnSale = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDetails = new javax.swing.JTextArea();
        txtQuanaty = new javax.swing.JTextField();
        btnPlus = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lbPrice = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 255));

        lbTitle.setBackground(new java.awt.Color(255, 255, 255));
        lbTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(0, 153, 255));
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/oder (2).png"))); // NOI18N
        lbTitle.setText("ĐẶT HÀNG");
        lbTitle.setOpaque(true);

        lbImage.setBackground(new java.awt.Color(153, 153, 153));
        lbImage.setText(" ");
        lbImage.setOpaque(true);

        btnSale.setBackground(new java.awt.Color(0, 153, 255));
        btnSale.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSale.setForeground(new java.awt.Color(255, 255, 255));
        btnSale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/MUA (2).png"))); // NOI18N
        btnSale.setText("MUA");
        btnSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaleActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(255, 0, 0));
        btnCancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/CANCEL.png"))); // NOI18N
        btnCancel.setText("HỦY");

        jLabel1.setBackground(new java.awt.Color(204, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Chi Tiết Sách:");

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane2.setViewportView(txtAddress);

        jLabel3.setBackground(new java.awt.Color(204, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 255));
        jLabel3.setText("Địa Chỉ:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 255));
        jLabel4.setText("SỐ LƯỢNG");

        txtDetails.setColumns(20);
        txtDetails.setRows(5);
        txtDetails.setDragEnabled(true);
        jScrollPane1.setViewportView(txtDetails);

        txtQuanaty.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtQuanaty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQuanaty.setText("0");
        txtQuanaty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuanatyActionPerformed(evt);
            }
        });

        btnPlus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPlus.setText("+");
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });

        btnMinus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMinus.setText("-");

        jLabel5.setText("GIÁ:");

        lbPrice.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbImage, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnMinus)
                            .addGap(18, 18, 18)
                            .addComponent(txtQuanaty, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnPlus)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnSale, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSale, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbImage, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lbPrice))
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtQuanaty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnPlus))
                            .addComponent(btnMinus))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtQuanatyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuanatyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuanatyActionPerformed

    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPlusActionPerformed

    private void btnSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaleActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Sale dialog = new Sale(new javax.swing.JFrame(), true,new HomeCustomer(new LoginFRM()),new DTO.Book());
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    
    
    public JButton getBtnCancel() {
        return btnCancel;
    }

    public void setBtnCancel(JButton btnCancel) {
        this.btnCancel = btnCancel;
    }

    public JButton getBtnSale() {
        return btnSale;
    }

    public void setBtnSale(JButton btnSale) {
        this.btnSale = btnSale;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JLabel getLbImage() {
        return lbImage;
    }

    public void setLbImage(JLabel lbImage) {
        this.lbImage = lbImage;
    }

    public JLabel getLbTitle() {
        return lbTitle;
    }

    public void setLbTitle(JLabel lbTitle) {
        this.lbTitle = lbTitle;
    }

    public JTextArea getTxtDetails() {
        return txtDetails;
    }

    public void setTxtDetails(JTextArea txtDetails) {
        this.txtDetails = txtDetails;
    }

    public AccessibleContext getAccessibleContext() {
        return accessibleContext;
    }

    public void setAccessibleContext(AccessibleContext accessibleContext) {
        this.accessibleContext = accessibleContext;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnSale;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbImage;
    private javax.swing.JLabel lbPrice;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextArea txtDetails;
    private javax.swing.JTextField txtQuanaty;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
        if(this.book.getSourceIMG().contains("/"))
            {
                this.lbImage.setIcon(new ImageIcon(getClass().getResource(this.book.getSourceIMG())));
            }else 
            this.lbImage.setIcon(new ImageIcon(this.book.getSourceIMG()));
        this.lbImage.setSize(200,300);
//this.lbImage = new JLabel(new ImageIcon(getClass().getResource(this.book.getSourceIMG())));
//        this.lbImage.setIcon(new ImageIcon(this.book.getSourceIMG()));
        this.txtDetails.setText(this.book.getDetails());
        this.lbTitle.setText(this.book.getName());
        this.txtDetails.setEnabled(false);
        this.txtDetails.setBackground(Color.BLACK);
        this.txtDetails.setForeground(Color.red);
        System.out.println();
        this.txtAddress.setText(this.homeCustomer.getPreCus().getDiaChi());
        this.lbPrice.setText(this.book.getPrice()+" VNĐ");
        
    }

    private void addActionListener() {
        this.btnSale.addActionListener(this);
        this.btnCancel.addActionListener(this);
        this.btnMinus.addActionListener(this);
        this.btnPlus.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        var src=e.getSource();
        if(src.equals(this.btnCancel))
        {
            dispose();
        }
        if(src.equals(this.btnPlus))
        {
            this.txtQuanaty.setText(Integer.parseInt(this.txtQuanaty.getText())+1+"");
        }
        if(src.equals(this.btnMinus))
        {
            if(Integer.parseInt(this.txtQuanaty.getText())>0)
            {
                this.txtQuanaty.setText(Integer.parseInt(this.txtQuanaty.getText())-1+"");
            }else this.txtQuanaty.setText("0");
        }
        if(src.equals(this.btnSale))
        {
            
            
//            try {
                int x=0;
                try {
                 if(Float.parseFloat(this.txtQuanaty.getText())<=0 )
                {
                    JOptionPane.showMessageDialog(rootPane,"Số Lượng phải lớn hơn 0!");
                    
                }
                  
                 this.book=this.homeCustomer.getSaleBook();
                 System.out.println(book.getQuanaty());
                 if(Float.parseFloat(this.txtQuanaty.getText())<=Float.parseFloat(this.book.getQuanaty().trim()))
                 {
//                     this.book.setQuanaty(Integer.parseInt(this.book.getQuanaty().trim())-
//                         Integer.parseInt(this.txtQuanaty.getText().trim())+"");
                 }
                 
            } catch (Exception ex) {
                    JOptionPane.showMessageDialog(rootPane,"Số Lượng Phải là 1 số");
                    x=-1;
            }
                ///
                    Float bookStore=0f;
                    for(DTO.Book b: books)
                    {
                        if(this.book.getID().equals(b.getID()))
                        {
                            bookStore=Float.parseFloat(b.getQuanaty());
                            break;
                        }
                    }
                    if(Integer.parseInt(this.txtQuanaty.getText())>bookStore)
                    {
                        JOptionPane.showMessageDialog(rootPane,"Số Sách chỉ còn "+bookStore+" Quyển!");
                    }
                if(c.isNumber(this.book.getQuanaty()) && x!=-1 && Integer.parseInt(this.txtQuanaty.getText())>0  
                        && Integer.parseInt(this.txtQuanaty.getText())<=bookStore)
                {
                    //>>>>>
//                     BillHomeCustomer billHomeCustomer= new BillHomeCustomer(
//                         this.book.getID(),
//                         this.homeCustomer.getPreCus().getMaKH()
//                         , txtAddress.getText(),
//                         txtQuanaty.getText(), 
//                         this.book.getQuanaty(), 
//                         Integer.parseInt(this.txtQuanaty.getText())*Integer.parseInt(this.book.getPrice())+"");
//                 DTO.upDateId.updateIDBillCustomer(billHomeCustomer);
//                 DAL.EditDataToSQL.editDataBook(this.book);
//                 DAL.WriteDataToSQL.insertDataBillHomeCusomer(billHomeCustomer);
//                 dispose();
//                 JOptionPane.showMessageDialog(rootPane, "Cảm Ơn Bạn Đã Đặt Hàng!");
                    //<<<<
                    
                   receiveOderDialog rc = new receiveOderDialog(homeCustomer, rootPaneCheckingEnabled,this.homeCustomer.getPreCus(),this.book,this.txtQuanaty.getText());
                   dispose();
                   rc.setVisible(true);
                   
                    
                    
                }
                
//            } catch (Exception ex) {
//                JOptionPane.showMessageDialog(rootPane,"Số Lượng Phải Là Số!");
//            }
               

        }
    }
}