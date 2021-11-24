/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import helper.dialogHelper;
import helper.Auth;
import helper.shareHelper;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JInternalFrame;
import javax.swing.Timer;


/**
 *
 * @author TRAN DUC TUNG
 */
public class FormChinh extends javax.swing.JFrame {

    /**
     * Creates new form Formchinhbanhang
     */
    public FormChinh() {
        initComponents();
        init();
    }
    
    void init(){
        openLogin(); // gọi dangNhapJDialog
    }
    
    
    public void openLogin() {
        new DangNhapFormJDialog(this, true).setVisible(true);
    }
    
    void logoff() {
        Auth.clear();
        this.openLogin();
        
    }
    
   
    
    FormDoanhThu frmdoanhthu = new FormDoanhThu();
    public void openDoanhThu() {
        if (Auth.isLogin()) {
            frmdoanhthu.setVisible(true);
        } else {
            dialogHelper.alert(this, "Vui lòng đăng nhập!");
        }
    }
    
    FormGDQLNhanVien frmnhanVien = new FormGDQLNhanVien();
    public void openQLNhanVien() {
        if (Auth.isLogin()) {
            frmnhanVien.setVisible(true);
           
        } else {
            dialogHelper.alert(this, "Vui lòng đăng nhập!");
        }
    }
    
    FormHoaDon frmhoaDon = new FormHoaDon();
    public void openHoaDon() {
        if (Auth.isLogin()) {
            frmhoaDon.setVisible(true);
          
        } else {
            dialogHelper.alert(this, "Vui lòng đăng nhập!");
        }
    }
    
    FormSanPham frmSp = new FormSanPham();
    public void openSanPham(){
        if(Auth.isLogin()){
            frmSp.setVisible(true);
        }else{
            dialogHelper.alert(this, "Vui lòng đăng nhập!");
        }
    }
    
  
  
    public void openLoaiSanPham() {
        if (Auth.isLogin()) {
            FormLoaiSanPham frmloaiSP = new FormLoaiSanPham();
            frmloaiSP.setVisible(true);
           
        } else {
            dialogHelper.alert(this, "Vui lòng đăng nhập!");
        }
    }
    void exit() {

        if (dialogHelper.confirm(this, "Bạn thực sự muốn kết thúc?")) {
            System.exit(0);
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

        jMenuItem1 = new javax.swing.JMenuItem();
        lbl_dongHo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        btn_logout = new javax.swing.JButton();
        btn_NhanVien = new javax.swing.JButton();
        btn_SanPham = new javax.swing.JButton();
        btn_loaiSanPham = new javax.swing.JButton();
        btn_HoaDon = new javax.swing.JButton();
        btn_doanhThu1 = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_dongHo.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 131, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 53, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 332, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("10:50 PM");

        btn_logout.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_logout.setText("Đăng Xuất");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        btn_NhanVien.setBackground(new java.awt.Color(0, 153, 153));
        btn_NhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageIcon/Clien list.png"))); // NOI18N
        btn_NhanVien.setText("QUẢN LÝ NHÂN VIÊN");
        btn_NhanVien.setFocusable(false);
        btn_NhanVien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_NhanVien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_NhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NhanVienActionPerformed(evt);
            }
        });

        btn_SanPham.setBackground(new java.awt.Color(0, 153, 153));
        btn_SanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageIcon/Full basket.png"))); // NOI18N
        btn_SanPham.setText("QUẢN LÝ SAN PHAM");
        btn_SanPham.setFocusable(false);
        btn_SanPham.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_SanPham.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_SanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SanPhamActionPerformed(evt);
            }
        });

        btn_loaiSanPham.setBackground(new java.awt.Color(0, 153, 153));
        btn_loaiSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageIcon/Full basket.png"))); // NOI18N
        btn_loaiSanPham.setText("LOẠI SẢN PHẨM");
        btn_loaiSanPham.setFocusable(false);
        btn_loaiSanPham.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_loaiSanPham.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_loaiSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loaiSanPhamActionPerformed(evt);
            }
        });

        btn_HoaDon.setBackground(new java.awt.Color(0, 153, 153));
        btn_HoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageIcon/Cash register.png"))); // NOI18N
        btn_HoaDon.setText("HÓA ĐƠN");
        btn_HoaDon.setFocusable(false);
        btn_HoaDon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_HoaDon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_HoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HoaDonActionPerformed(evt);
            }
        });

        btn_doanhThu1.setBackground(new java.awt.Color(0, 153, 153));
        btn_doanhThu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageIcon/Diagram.png"))); // NOI18N
        btn_doanhThu1.setText("DOANH THU");
        btn_doanhThu1.setFocusable(false);
        btn_doanhThu1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_doanhThu1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_doanhThu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_doanhThu1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lbl_dongHoLayout = new javax.swing.GroupLayout(lbl_dongHo);
        lbl_dongHo.setLayout(lbl_dongHoLayout);
        lbl_dongHoLayout.setHorizontalGroup(
            lbl_dongHoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lbl_dongHoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(23, 23, 23))
            .addGroup(lbl_dongHoLayout.createSequentialGroup()
                .addGroup(lbl_dongHoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lbl_dongHoLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lbl_dongHoLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btn_NhanVien)
                        .addGap(37, 37, 37)
                        .addComponent(btn_SanPham)
                        .addGap(43, 43, 43)
                        .addComponent(btn_loaiSanPham)
                        .addGap(39, 39, 39)
                        .addComponent(btn_HoaDon)
                        .addGap(53, 53, 53)
                        .addComponent(btn_doanhThu1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lbl_dongHoLayout.setVerticalGroup(
            lbl_dongHoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lbl_dongHoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lbl_dongHoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lbl_dongHoLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lbl_dongHoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(lbl_dongHoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_doanhThu1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_NhanVien, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_SanPham, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_loaiSanPham, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_HoaDon, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(lbl_dongHoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_logout))
                .addContainerGap())
        );

        jMenu1.setText("Hệ thống");

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageIcon/Key.png"))); // NOI18N
        jMenu3.setText("Đăng nhập");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageIcon/Log out.png"))); // NOI18N
        jMenu4.setText("Đăng xuất");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageIcon/Refresh.png"))); // NOI18N
        jMenu5.setText("Đổi mật khẩu");
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenu5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Quản lý");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_dongHo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_dongHo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_HoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HoaDonActionPerformed
        // TODO add your handling code here:
        openHoaDon();
    }//GEN-LAST:event_btn_HoaDonActionPerformed

    private void btn_NhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NhanVienActionPerformed
        // TODO add your handling code here:
        openQLNhanVien();
    }//GEN-LAST:event_btn_NhanVienActionPerformed

    private void btn_SanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SanPhamActionPerformed
        // TODO add your handling code here:
        openSanPham();
    }//GEN-LAST:event_btn_SanPhamActionPerformed

    private void btn_loaiSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loaiSanPhamActionPerformed
        // TODO add your handling code here:
        openLoaiSanPham();
    }//GEN-LAST:event_btn_loaiSanPhamActionPerformed

    private void btn_doanhThu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_doanhThu1ActionPerformed
        // TODO add your handling code here:
        openDoanhThu();
    }//GEN-LAST:event_btn_doanhThu1ActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        // TODO add your handling code here:
        logoff();
        this.dispose();
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
        openLogin();
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:
        logoff();
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        // TODO add your handling code here:
        if (Auth.isLogin()) {
            new DoiMatKhauFormJDialog(this, true).setVisible(true);
        } else {
            dialogHelper.alert(this, "Vui lòng đăng nhập trước khi đổi mật khẩu");
        }
    }//GEN-LAST:event_jMenu5ActionPerformed

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
            java.util.logging.Logger.getLogger(FormChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormChinh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_HoaDon;
    private javax.swing.JButton btn_NhanVien;
    private javax.swing.JButton btn_SanPham;
    private javax.swing.JButton btn_doanhThu1;
    private javax.swing.JButton btn_loaiSanPham;
    private javax.swing.JButton btn_logout;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JPanel lbl_dongHo;
    // End of variables declaration//GEN-END:variables
}
