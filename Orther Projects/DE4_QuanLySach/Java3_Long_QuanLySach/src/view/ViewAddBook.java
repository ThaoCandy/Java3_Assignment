/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import entity.Authors;
import entity.Books;
import entity.Publishers;
import entity.Users;
import java.util.List;
import javax.swing.JOptionPane;
import repository.BooksRepository;
import response.BooksResponse;
import serviceimpl.AuthorsServiceImpl;
import serviceimpl.PublishersServiceImpl;
import static util.Validate.checkBookID;
import static util.Validate.checkEmpty;

/**
 *
 * @author ThinkPad
 */
public class ViewAddBook extends javax.swing.JFrame {

    private BooksResponse bookDetail;
    private String user;
    private Users user1;
    private AuthorsServiceImpl serviceAuthor;
    private PublishersServiceImpl servicePublisher;
    private BooksRepository serviceBook;

    public ViewAddBook(Users u) {
        initComponents();
        setLocationRelativeTo(null);
        user1 = u;
        user = u.getUserName();
        serviceAuthor = new AuthorsServiceImpl();
        servicePublisher = new PublishersServiceImpl();
        serviceBook = new BooksRepository();
        loadComboBox();
    }

    public ViewAddBook(Users u, BooksResponse bookDetail) {
        initComponents();
        setLocationRelativeTo(null);
        user1 = u;
        user = u.getUserName();
        serviceAuthor = new AuthorsServiceImpl();
        servicePublisher = new PublishersServiceImpl();
        serviceBook = new BooksRepository();
        loadComboBox();
        fillData(bookDetail);
    }

    public void fillData(BooksResponse bookDetail) {
        txtBookID.setText(bookDetail.getBookID());
        txtBookTitle.setText(bookDetail.getBookTitle());
        cbxPublishers.setSelectedItem(bookDetail.getPublisherName());
        cbxAuthors.setSelectedItem(bookDetail.getAuthorName());
        txtNote.setText(bookDetail.getNote());
    }

    public Books getValues() {
        try {
            String id = txtBookID.getText().trim();
            String title = txtBookTitle.getText().trim();
            String note = txtNote.getText().trim();
            if (checkEmpty(id) || checkEmpty(title) || checkEmpty(note)) {
                JOptionPane.showMessageDialog(this, "Không được để trống");
                return null;
            }
            if (!checkBookID(id)) {
                JOptionPane.showMessageDialog(this, "Định dạng đúng cần là 2 chữ cái và 4 số\n BU/MC/PC/PS/TC");
                return null;
            }
            if (serviceBook.searchBooks(0, id).size() > 0) {
                JOptionPane.showMessageDialog(this, "Đã tồn tại ID Book này, vui lòng thử lại");
                return null;
            }
            String idPublisher = servicePublisher.getIdPublisherByName((String) cbxPublishers.getSelectedItem());
            String idAuthor = serviceAuthor.getIdAuthorByName((String) cbxAuthors.getSelectedItem());

            return new Books(id, title, idPublisher, idAuthor, note, user);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Vui lòng thử lại");
            return null;
        }

    }

    public void loadComboBox() {
        cbxAuthors.removeAllItems();
        List<Authors> listAuthors = serviceAuthor.getAllAuthors();
        for (Authors author : listAuthors) {
            cbxAuthors.addItem(author.getAuthorName());
        }

        cbxPublishers.removeAllItems();
        List<Publishers> listPublishers = servicePublisher.getAllPublishers();
        for (Publishers publisher : listPublishers) {
            cbxPublishers.addItem(publisher.getPublisherName());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtBookID = new javax.swing.JTextField();
        txtBookTitle = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbxPublishers = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbxAuthors = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNote = new javax.swing.JTextArea();
        btnClear = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnXong = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("[PH31848] Thêm sách mới");

        jLabel1.setText("Book ID");

        jLabel2.setText("Book Title");

        jLabel3.setText("Publisher");

        cbxPublishers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Author");

        cbxAuthors.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Note");

        txtNote.setColumns(20);
        txtNote.setRows(5);
        jScrollPane1.setViewportView(txtNote);

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(153, 255, 153));
        btnAdd.setForeground(new java.awt.Color(51, 51, 51));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnXong.setText("Xong!");
        btnXong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnXong)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnClear)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAdd))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addGap(24, 24, 24)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtBookTitle)
                                .addComponent(cbxAuthors, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbxPublishers, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtBookID)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(btnXong)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBookID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBookTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbxPublishers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxAuthors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnAdd))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        Books book = getValues();
        if (book != null) {
            JOptionPane.showMessageDialog(this, serviceBook.insertBook(book));
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtBookID.setText("");
        txtBookTitle.setText("");
        txtNote.setText("");
        cbxAuthors.setSelectedIndex(0);
        cbxPublishers.setSelectedIndex(0);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnXongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXongActionPerformed
        new ViewHome(user1).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnXongActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ViewAddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ViewAddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ViewAddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ViewAddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ViewAddBook().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnXong;
    private javax.swing.JComboBox<String> cbxAuthors;
    private javax.swing.JComboBox<String> cbxPublishers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBookID;
    private javax.swing.JTextField txtBookTitle;
    private javax.swing.JTextArea txtNote;
    // End of variables declaration//GEN-END:variables
}
