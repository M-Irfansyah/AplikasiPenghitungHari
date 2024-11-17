
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import javax.swing.event.ChangeEvent;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class PenghitungHariFrame extends javax.swing.JFrame {

    /**
     * Creates new form PenghitungHariFrame
     */
    public PenghitungHariFrame() {
        initComponents();
    }
    private String terjemahHari(java.time.DayOfWeek hari) {
    switch (hari) {
        case MONDAY:
            return "Senin";
        case TUESDAY:
            return "Selasa";
        case WEDNESDAY:
            return "Rabu";
        case THURSDAY:
            return "Kamis";
        case FRIDAY:
            return "Jumat";
        case SATURDAY:
            return "Sabtu";
        case SUNDAY:
            return "Minggu";
        default:
            return "";
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lHasil = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        sTahun = new javax.swing.JSpinner();
        cbBulan = new javax.swing.JComboBox<>();
        btnHitung = new javax.swing.JButton();
        btnSelisih = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        jKalender = new com.toedter.calendar.JCalendar();
        kalenderAkhir = new com.toedter.calendar.JCalendar();
        kalenderAwal = new com.toedter.calendar.JCalendar();
        jLabel8 = new javax.swing.JLabel();
        lSelisih = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Penghiting Hari");

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Masukkan Bulan");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Masukkan Tahun");

        lHasil.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lHasil.setText("Hasil");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Perhitungan Selisih Hari");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Pilih Tanggal Awal");

        sTahun.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sTahunStateChanged(evt);
            }
        });

        cbBulan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));
        cbBulan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBulanActionPerformed(evt);
            }
        });

        btnHitung.setText("Hitung");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        btnSelisih.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSelisih.setText("Hitung Selisih Hari");
        btnSelisih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelisihActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Pilih Tanggal Akhir");

        lSelisih.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lSelisih.setText("Hasil Selisih Hari");

        jLabel3.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel3.setText("Aplikasi Penghitung Hari");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sTahun, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbBulan, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(btnHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(175, 175, 175)
                                .addComponent(btnHapus))
                            .addComponent(lHasil)
                            .addComponent(jKalender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(257, 257, 257)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(kalenderAwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lSelisih)
                                            .addComponent(btnSelisih))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(kalenderAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(310, 310, 310)
                                .addComponent(btnKeluar)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(336, 336, 336))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel3)
                .addGap(89, 89, 89)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(sTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbBulan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(btnHitung))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel5)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lHasil)
                        .addGap(67, 67, 67)
                        .addComponent(jKalender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHapus)
                        .addGap(48, 48, 48))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(6, 6, 6)
                                .addComponent(kalenderAwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(7, 7, 7)
                                .addComponent(kalenderAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSelisih)
                        .addGap(18, 18, 18)
                        .addComponent(lSelisih)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(btnKeluar)
                        .addGap(35, 35, 35))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
    btnHitung.addActionListener((ActionEvent e) -> {
        kalkulatorhari();
    });    // TODO add your handling code here:
    }//GEN-LAST:event_btnHitungActionPerformed

    private void btnSelisihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelisihActionPerformed
    btnSelisih.addActionListener((ActionEvent e) -> {
            Selisih();
        });
    }//GEN-LAST:event_btnSelisihActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
     // Event listener untuk tombol "Hapus"
        btnHapus.addActionListener((ActionEvent e) -> {
            hapusinputan();
        });    // TODO add your handling code here:
    }//GEN-LAST:event_btnHapusActionPerformed

    private void sTahunStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sTahunStateChanged
    sTahun.addChangeListener((ChangeEvent e) -> {
        pembaruankalender();
    });    // TODO add your handling code here:
    }//GEN-LAST:event_sTahunStateChanged

    private void cbBulanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBulanActionPerformed
    cbBulan.addItemListener((ItemEvent e) -> {
            pembaruankalender();
        });
    }//GEN-LAST:event_cbBulanActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
    System.exit(0);  // TODO add your handling code here:
    }//GEN-LAST:event_btnKeluarActionPerformed
    // Metode untuk memperbarui JCalendar sesuai pilihan bulan dan tahun
    private void pembaruankalender() {
        int month = cbBulan.getSelectedIndex(); // Indeks bulan ComboBox mulai dari 0
        int year = (int) sTahun.getValue();

        // Mengatur JCalendar untuk bulan dan tahun yang dipilih
        Calendar selectedDate = Calendar.getInstance();
        selectedDate.set(Calendar.YEAR, year);
        selectedDate.set(Calendar.MONTH, month); // Calendar.MONTH juga mulai dari 0
        selectedDate.set(Calendar.DAY_OF_MONTH, 1);
        jKalender.setCalendar(selectedDate); // Memperbarui tampilan JCalendar
    }
        private void kalkulatorhari() {
        //Mengambil nilai bulan dari JComboBox
        int month = cbBulan.getSelectedIndex() + 1; // ComboBox menggunakan indeks dari 0, jadi ditambah 1
        // Mengambil nilai tahun dari JSpinner
        int year = (int) sTahun.getValue();

        // Juga mengatur tanggal JCalendar sesuai dengan bulan dan tahun yang dipilih
        Calendar selectedDate = jKalender.getCalendar();
        selectedDate.set(Calendar.MONTH, month - 1); // Calendar.MONTH menggunakan indeks dari 0
        selectedDate.set(Calendar.YEAR, year);
        jKalender.setCalendar(selectedDate); // Menampilkan bulan dan tahun yang dipilih di JCalendar

        // Membuat objek YearMonth berdasarkan bulan dan tahun yang dipilih
        YearMonth yearMonth = YearMonth.of(year, month);

        // Menghitung jumlah hari dalam bulan tersebut
        int daysInMonth = yearMonth.lengthOfMonth();

        // Mendapatkan hari pertama dan hari terakhir dalam bulan tersebut
        LocalDate hariPertama = yearMonth.atDay(1);
        LocalDate hariTerakhir = yearMonth.atEndOfMonth();
        
        // Menampilkan hasil jumlah hari, hari pertama, dan hari terakhir pada JLabel
        String hariAwal = terjemahHari(hariPertama.getDayOfWeek());
        String hariAkhir = terjemahHari(hariTerakhir.getDayOfWeek());
        lHasil.setText(String.format(
            "Jumlah hari : %d , Hari pertama : %s dan Hari terakhir : %s", 
            daysInMonth, hariAwal , hariAkhir
        ));
        
    }

// Metode untuk menghapus atau mereset pilihan
    private void hapusinputan() {
        // Reset bulan ke Januari
        cbBulan.setSelectedIndex(0);

        // Reset tahun ke tahun default (misalnya 2023)
        sTahun.setValue(2023);

        // Reset JCalendar ke tanggal hari ini
        jKalender.setCalendar(Calendar.getInstance());

        // Kosongkan hasil pada JLabel
        lHasil.setText("Jumlah hari: ");
    }
// Metode untuk menghitung selisih hari antara dua tanggal
    private void Selisih() {
        // Mendapatkan tanggal awal dan akhir dari JCalendar
        Calendar startCal = kalenderAwal.getCalendar();
        Calendar endCal = kalenderAkhir.getCalendar();

        // Konversi Calendar ke LocalDate
        LocalDate startDate = startCal.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate endDate = endCal.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        // Menghitung selisih hari menggunakan ChronoUnit.DAYS
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);

        // Menampilkan hasil selisih hari pada JLabel
        lSelisih.setText("Selisih hari antara dua tanggal: " + daysBetween + " hari");
    }
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
            java.util.logging.Logger.getLogger(PenghitungHariFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenghitungHariFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenghitungHariFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenghitungHariFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PenghitungHariFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSelisih;
    private javax.swing.JComboBox<String> cbBulan;
    private com.toedter.calendar.JCalendar jKalender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JCalendar kalenderAkhir;
    private com.toedter.calendar.JCalendar kalenderAwal;
    private javax.swing.JLabel lHasil;
    private javax.swing.JLabel lSelisih;
    private javax.swing.JSpinner sTahun;
    // End of variables declaration//GEN-END:variables

    
}