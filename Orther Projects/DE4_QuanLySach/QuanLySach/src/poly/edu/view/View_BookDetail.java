/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poly.edu.view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import poly.edu.model.Authors;
import poly.edu.model.Book;
import poly.edu.model.Publishers;
import poly.edu.model.Users;
import poly.edu.repo.BooksRepo;
import poly.edu.service.AuthorService;
import poly.edu.service.BookService;
import poly.edu.service.PublisherService;
import poly.edu.util.Helper;

/**
 *
 * @author user
 */
public class View_BookDetail extends javax.swing.JFrame {

    static Users user = null;
    static BooksRepo book = null;
    PublisherService serPub;
    AuthorService serAu;
    BookService serBook;

    /**
     * Creates new form View_BookDetail
     */
    public View_BookDetail(Users u, BooksRepo b) {
        if (u == null) {
            int o = JOptionPane.showConfirmDialog(this, "Bạn chưa đăng nhập. Mở cửa sổ đăng nhập không?");
            if (o == 0) {
                new View_Login().setVisible(true);
                dispose();
            } else {
                dispose();
                System.exit(0);
            }
        } else {
            initComponents();
            user = u;
            book = b;
            serPub = new PublisherService();
            serAu = new AuthorService();
            serBook = new BookService();

            cboPublisher.removeAllItems();
            for (Publishers p : serPub.getList()) {
                cboPublisher.addItem(p.getPubName());
            }
            cboAuthor.removeAllItems();
            for (Authors a : serAu.getList()) {
                cboAuthor.addItem(a.getAuName());
            }

            this.setTitle("Home/DetailBook");
            setAlwaysOnTop(true);
            setLocationRelativeTo(null);

            showDetail();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cboPublisher = new javax.swing.JComboBox<>();
        cboAuthor = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNote = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        txtBookID = new javax.swing.JTextField();
        txtTitle = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnCLEAR = new javax.swing.JButton();
        btnREMOVE = new javax.swing.JButton();
        btnUPDATE = new javax.swing.JButton();
        btnCLOSE = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        cboPublisher.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cboAuthor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtNote.setColumns(20);
        txtNote.setLineWrap(true);
        txtNote.setRows(5);
        txtNote.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtNote);

        jLabel2.setText("Book ID:");

        jLabel3.setText("Book title:");

        jLabel4.setText("Publisher:");

        jLabel5.setText("Author:");

        jLabel6.setText("Note:");

        jLabel1.setText("Detail Book");

        btnCLEAR.setText("Clear");
        btnCLEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCLEARActionPerformed(evt);
            }
        });

        btnREMOVE.setText("Remove");
        btnREMOVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnREMOVEActionPerformed(evt);
            }
        });

        btnUPDATE.setText("Update");
        btnUPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUPDATEActionPerformed(evt);
            }
        });

        btnCLOSE.setText("Close");
        btnCLOSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCLOSEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBookID, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cboPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cboAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCLEAR)
                        .addGap(18, 18, 18)
                        .addComponent(btnREMOVE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUPDATE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCLOSE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane1, txtTitle});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtBookID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(cboPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCLEAR)
                    .addComponent(btnREMOVE)
                    .addComponent(btnUPDATE)
                    .addComponent(btnCLOSE))
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCLEARActionPerformed
        // TODO add your handling code here:
        clearForm();

    }//GEN-LAST:event_btnCLEARActionPerformed

    private void btnREMOVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnREMOVEActionPerformed
        // TODO add your handling code here:
        if (book == null) {
            return;
        }
        if (JOptionPane.showConfirmDialog(this, "Xóa đầu sách này?") == 0) {
            Book b = serBook.find(book.getBookID());
            if (b == null) {
                return;
            }
            JOptionPane.showMessageDialog(this, serBook.xoa(b));
            close();
        }
    }//GEN-LAST:event_btnREMOVEActionPerformed

    private void btnUPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUPDATEActionPerformed
        // TODO add your handling code here:
        if (book == null) {
            return;
        }
        if (JOptionPane.showConfirmDialog(this, "Sửa thông tin đầu sách này?") == 0) {
            ArrayList<Book> list = serBook.getList();
            for (int i = list.size() -1; i >= 0; i--) {
                if (list.get(i).getBookID().equals(book.getBookID())) {
                    list.remove(i);
                    break;
                }
            }
           
            String tb = new Helper().validateAddBook(txtBookID.getText(), txtTitle.getText(), txtNote.getText(), list);
            if (!tb.equals("")) {
                JOptionPane.showMessageDialog(this, tb);
            } else {
               Publishers p = serPub.find(cboPublisher.getSelectedItem().toString());
               Authors a = serAu.find(cboAuthor.getSelectedItem().toString());
                Book b = new Book(txtBookID.getText(), txtTitle.getText(),
                       p.getPubID(), a.getAuID(),
                        txtNote.getText(), user.getUserName());
                JOptionPane.showMessageDialog(this, serBook.sua(b, book.getBookID()));
                close();
            }
        }
    }//GEN-LAST:event_btnUPDATEActionPerformed

    private void btnCLOSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCLOSEActionPerformed
        // TODO add your handling code here:
        close();
    }//GEN-LAST:event_btnCLOSEActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        close();
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(View_BookDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_BookDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_BookDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_BookDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_BookDetail(user, book).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCLEAR;
    private javax.swing.JButton btnCLOSE;
    private javax.swing.JButton btnREMOVE;
    private javax.swing.JButton btnUPDATE;
    private javax.swing.JComboBox<String> cboAuthor;
    private javax.swing.JComboBox<String> cboPublisher;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBookID;
    private javax.swing.JTextArea txtNote;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables

    private void clearForm() {
        txtBookID.setText("");
        txtTitle.setText("");
        txtNote.setText("");
        cboAuthor.setSelectedIndex(0);
        cboPublisher.setSelectedIndex(0);
    }

    private void showDetail() {
        if (book == null) {
            return;
        }
        txtBookID.setText(book.getBookID());
        txtTitle.setText(book.getTitle());
        txtNote.setText(book.getNotes());

        cboPublisher.setSelectedItem(book.getPub_name());
        cboAuthor.setSelectedItem(book.getAu_name());
    }

    private void close() {
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        new View_Books(user).setVisible(true);
        dispose();
    }
}