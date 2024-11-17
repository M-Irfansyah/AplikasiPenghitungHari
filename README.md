# AplikasiPenghitungHari
 Tugas 4 - M.irfansyah(2210010176)

# 1. Deskripsi Program
Aplikasi ini menghitung jumlah hari dalam bulan tertentu pada tahun tertentu yang dipilih oleh pengguna.

- Input: Pengguna memilih bulan dari JComboBox dan memasukkan tahun menggunakan JSpinner.
- Penggunaan JCalendar: Untuk mempermudah pengguna memilih bulan dan tahun.
- Output: Setelah tombol ditekan, aplikasi menampilkan jumlah hari dalam bulan yang dipilih.
  
# 2. Komponen GUI: 
JFrame, JPanel, JLabel, JComboBox, JSpinner, JButton, JCalendar
- JPanel: Untuk menampung komponen lain.
- JLabel: Berfungsi sebagai label untuk elemen input dan output.
- JComboBox: Untuk memilih bulan.
- JSpinner: Untuk memasukkan tahun.
- JCalendar: Untuk mempermudah pengguna memilih bulan dan tahun secara visual.
- JButton: Tombol untuk menghitung jumlah hari, menghitung selisih hari, hapus dan keluar

• Button Hitung
```
private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {                                          
    btnHitung.addActionListener((ActionEvent e) -> {
        kalkulatorhari(); // method
    });    
    }   
```
• Button Hitung Selisih Hari
```
private void btnSelisihActionPerformed(java.awt.event.ActionEvent evt) {                                           
    btnSelisih.addActionListener((ActionEvent e) -> {
            Selisih(); // method
        });     
```
• Button Hapus
```
private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {                                         
     // Event listener untuk tombol "Hapus"
        btnHapus.addActionListener((ActionEvent e) -> {
            hapusinputan(); // method
        });   
    }     
```

• Button Keluar
```
   private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {                                         
    System.exit(0);       
    } 
```
• Spinner
```
private void sTahunStateChanged(javax.swing.event.ChangeEvent evt) {                                    
    sTahun.addChangeListener((ChangeEvent e) -> {
        pembaruankalender();
    });    // TODO add your handling code here:
    } 
```
• Combo Box
```
private void cbBulanActionPerformed(java.awt.event.ActionEvent evt) {                                        
    cbBulan.addItemListener((ItemEvent e) -> {
            pembaruankalender();
        });
    } 
```
# 3. Logika Program: 
Penggunaan API tanggal (LocalDate), Perhitungan hari dalam bulan, Perhitungan tahun kabisat

# 4. Events:
• ActionListener pada btnHitung Saat tombol ditekan, method kalkulatorhari() akan dipanggil.
```
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
```
• Method untuk memperbarui JCalendar sesuai pilihan bulan dan tahun
```
    private void pembaruankalender() {
        int month = cbBulan.getSelectedIndex(); // Indeks bulan ComboBox mulai dari 0
        int year = (int) sTahun.getValue();

        // Mengatur JCalendar untuk bulan dan tahun yang dipilih
        Calendar selectedDate = Calendar.getInstance();
        selectedDate.set(Calendar.YEAR, year);
        selectedDate.set(Calendar.MONTH, month); // Calendar.MONTH juga mulai dari 0
        selectedDate.set(Calendar.DAY_OF_MONTH, 1);
        jKalender.setCalendar(selectedDate); // Memperbarui tampilan JCalendar
  ```
• Method untuk menghapus atau mereset pilihan
```
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
```

# 5. Variasi:
• Tampilkan informasi tambahan seperti hari pertama dan terakhir dalam bulan tersebut

// Mendapatkan hari pertama dan hari terakhir dalam bulan tersebut
```
        LocalDate hariPertama = yearMonth.atDay(1);
        LocalDate hariTerakhir = yearMonth.atEndOfMonth();
        
        // Menampilkan hasil jumlah hari, hari pertama, dan hari terakhir pada JLabel
        String hariAwal = terjemahHari(hariPertama.getDayOfWeek());
        String hariAkhir = terjemahHari(hariTerakhir.getDayOfWeek());
        lHasil.setText(String.format(
            "Jumlah hari : %d , Hari pertama : %s dan Hari terakhir : %s", 
            daysInMonth, hariAwal , hariAkhir
        ));
```
• Integrasikan fitur untuk menghitung selisih hari antara dua tanggal    
• Method untuk menghitung selisih hari antara dua tanggal
```
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
```
• Menerjemahkan hari ke bahasa Indonesia
```
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
```
# Hasil Gambar Project Ketika di Run
![penghitung hari](https://github.com/user-attachments/assets/e0e18628-87f4-49a6-af5d-ae76c1530b6a)

## Indikator Penilaian:

| No  | Komponen         |  Persentase  |
| :-: | --------------   |   :-----:    |
|  1  | Komponen GUI     |    10    |
|  2  | Logika Program   |    20    |
|  3  | Event            |    20    |
|  4  | Kesesuaian UI    |    20    |
|  5  | Memenuhi Variasi |    30    |
|     | TOTAL        | 100 |

## Pembuat

Nama  : M.Irfansyah

NPM   : 2210010176
