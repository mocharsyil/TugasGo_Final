# Tugas GO

# Our Team
![Teams](https://img.shields.io/badge/Our%20Team-Team%202-blue)
<div align='center'>

<img src="Assets/ImamFirdaus.png" width="128"/>
<img src="Assets/IfanyDewiTustianti.png" width="128"/>
<img src="Assets/MFarhanFU.png" width="128"/>
<img src="Assets/RizaFajarM.png" width="128"/>
<img src="Assets/MuhamadRizkiIsaD.png" width="128"/>

<br>

[![12070559](https://img.shields.io/badge/059-M.%20Syarifuddin-blue)](https://github.com/syarif2002) 
  [![1207050060](https://img.shields.io/badge/060-Mahran%20Rangga%20Basyus-blue)](https://github.com/Mahran24-arch) [![1207050063](https://img.shields.io/badge/063-Moch.%20Arsyil%20Albany-blue)](https://github.com/mocharsyil) [![1207050065](https://img.shields.io/badge/065-Muhammad%20Afian%20Anwar-blue)](https://github.com/AfianAnwar)
  <br> [Teknik Informatika](http://if.uinsgd.ac.id/) [UIN Sunan Gunung Djati Bandung](https://uinsgd.ac.id/) 

</div>

## Latar Belakang Masalah
Kebanyakan mahasiswa memiliki banyak tugas dan tanggung jawab, sehingga mudah terlupakan sesuatu. Selain itu, ada juga faktor-faktor lain yang dapat mempengaruhi kemampuan seseorang untuk mengingat tugas, seperti stres, kelelahan, dan distraksi dari lingkungan sekitar. Solusi untuk masalah ini dapat berupa menggunakan teknik pengingatan atau mencatat tugas-tugas yang harus dilakukan, serta mengelola waktu secara efektif untuk memastikan bahwa semua tugas dapat diselesaikan tepat waktu.

## Identifikasi Masalah
1. Tingginya para pekerja bidang teknologi di United states dengan kondisi kesehatan mental yang kurang diperhatikan
2. Beratnya beban pekerjaan di bidang teknologi yang mampu membuat kesehatan mental menurun
3. Kesehatan mental berpengaruh pada pentingnya produktivitas kerja
4. Kesehatan mental yang buruk membuat pekerjaan yang dilakukan tidak maksimal
5. Gangguan kesehatan mental pekerja berpotensi membawa dampak pada kerugian perekonomian

## Metode Pendekatan Penyelesaian Masalah
Metode penyelesaian masalah yang digunakan pada penelitian ini adalah metodologi CRISP-DM. Metodologi Cross-Industry Standard Process for Data Mining atau CRISP-DM adalah salah satu model proses datamining (datamining framework) yang awalnya (1996) dibangun oleh 5 perusahaan yaitu Integral Solutions Ltd (ISL), Teradata, Daimler AG, NCR Corporation dan OHRA. Framework ini kemudian dikembangan oleh ratusan organisasi dan perusahaan di Eropa untuk dijadikan methodology standard non-proprietary bagi data mining. Versi pertama dari methodologi ini dipresentasikan pada 4th CRISP-DM SIG Workshop di Brussels pada bulan Maret 1999 (Pete Chapman, 1999); dan langkah langkah proses datamining berdasarkan model ini di publikasikan pada tahun berikutnya (Pete Chapman,2000).
Banyak hasil penelitian yang mengungkapkan bahwa CRISP-DM adalah datamining model yang masih digunakan secara luas di kalangan industry, sebahagian dikarenakan keunggulannya dalam menyelesaikan banyak persoalan dalam proyek proyek data mining.CRISP-DM memiliki 6 tahapan yaitu:
1. Business Understanding
2. Data Understanding
3. Data Preparation
4. Modeling
5. Evaluation
6. Deployment

## Tujuan Teknis dan Kriteria Kesuksesan
1. Mengetahui gender para pekerja di bidang teknologi di United States yang lebih dominan mengalami gangguan mental 
2. Mengetahui pebadingan jumlah perusahaan yang menyediakan layanan kesehatan
3. Mengetahui pengaruh kesehatan mental terhadap keefektifan bekerja 
4. Mengetahui apakah para pekerja di bidang teknologi di United States ini sudah mendapatkan terapi pengobatan
5. Mengetahui rentang usia para pekerja di bidang teknologi di United States yang rentan mengalami gangguan mental

## Timeline mini riset
Timeline mini riset tentang mental health on tech workspace mengikuti tahapan dari metode CRISP-DM. Berikut adalah timeline dari mini riset ini.
1. Pencarian topik penelitian
2. Pencarian dataset yang cocok dengan topik penelitian
3. Pemilihan algoritma
4. Business Understanding
5. Data Understanding
6. Data Preparation
7. Modeling
8. Evaluation
![Timeline_Assets](Assets/Timeline.png)

# Data Understanding
![Schedule](https://img.shields.io/badge/Schedule-23%20November%202022-green)
## Kebutuhan Data
Kebutuhan data yang diperlukan dalam penelitian ini adalah kondisi mental dari para pekerja yang bekerja di bidang teknologi serta faktor apa saja yang mempengaruhi kesehatan mental para pekerja tersebut.

## Pengambilan Data
Pengambilan data dilakukan melalui dari website dataset, yaitu kaggle dengan judul dataset Mental Health in Tech Survey yang beralamatkan di https://www.kaggle.com/datasets/osmi/mental-health-in-tech-survey

## Integrasi Data
Data yang digunakan dalam penelitian ini merupakan data yang berasal hanya dari satu sumber data saja. Integrasi data yang dilakukan dalam penelitian ini nantinya hanya akan menghubungkan antar jenis data sesuai dengan kebutuhan data yang diperlukan.

## Telaah Karekteristik Data
Dalam dataset Mental Health in Tech Survey ini terdapat 27 kolom dengan 5 jenis karakteristik, yaitu sebagai berikut :
1. Timestamp, yaitu tanggal dimana survey ini dilakukan berisi tanggal juga jam berlangsungnya. jenis data ini adalah object.
2. Age, yaitu umur dari para respondent survey. jenis data ini adalah integer
3. Gender, yaitu jenis kelamin dari para respondent survey. jenis data ini adalah string.
4. country, yaitu asal negara dari pada respondet survey. jenis data ini adalah string.
5. state, yaitu berisi kode negara bagian bagi para respondent yang berasal dari united states. jenis data ini adalah string.
6. self_employed, yaitu seseorang yang tidak bekerja untuk perusahaan tertentu yang memberikan gaji atau upah konsisten. jenis data ini adalah boolean.
7. family_history, yaitu riwayat keluarga yang pernah mengalami gangguan kesehatan mental. jenis data ini adalah string.
8. treatment, yaitu data apakah para pekerja dengan gangguan mental ini sudah mendapatkan terapi. jenis data ini adalah boolean.
9. work_interfere, yaitu data kondisi para respondent yang memiliki gangguan mental apakah dapat mengganggu pekerjaan. jenis data ini adalah string.
10. no_employee, yaitu jumlah karyawan yang berkerja di perusahaan tempat repondent bekerja, jenis data ini adalah String.
11. remote_work, yaitu waktu bekerja dari jarak jauh setidaknya 50% dari waktu kerja, jenis data ini boolean.
12. tech_company, yaitu data apakah respondent bekerja di perusahaan dengan basis teknologi. jenis data ini adalah boolean.
13. benefits, yaitu data apakah perusahaan menyediakan layanan untuk kesehatan mental. jenis data ini adalah string.
14. care_options, yaitu pengetahuan para respondent mengenai penyediaan layanan kesehatan mental yang disediakan perusahaan. jenis data ini adalah string.
15. wellness_program, yaitu pnegetahuan para respondent mengenai apakah atasannya memiliki program kesehatan mental sebagai kesejahteraan karyawannya. jenis data ini adalah string.
16. seek_help, yaitu pengetahuan para respondent mengenai penanganan lebih lanjut terhadap masalah kesehatan mental. jenis data ini adalah string.
17. anonymity, yaitu jaminan atas kerahasiaan riwayat perawatan kesehatan mental. jenis data ini adalah string.
18. leave, yaitu kemudahan pengambilan cuti bagi respondent ketika memiliki gangguan kesehatan mental. jenis data ini adalah string.
19. mental_health_consequence, yaitu data apakah jika para pekerja mendiskusikan kesehatan mental dengan atasannya akan memberikan dampak negatif bagi pekerjaannya. jenis data ini adalah string.
20. physc_health_consequence, yaitu data apakah jika para pekerja mendiskusikan kesehatan fisik dengan atasannya akan memberikan dampak negatif bagi pekerjaannya. jenis data ini adalah string.
21. coworkers, yaitu data apakah respondent bersedia mendiskusikan kesehatan mental dengan rekan kerjanya. jenis data ini adalah string.
22. supervisors, yaitu data apakah respondent bersedia mendiskusikan kesehatan mental langsung kepada atasannya. jenis data ini adalah string.
23. mental_health_interview, yaitu data apakah para respondent mendapatkan topik kesehatan mental saat interview kerja. jenis data ini adalah string.
24. physc_mental_health, yaitu data apakah para respondent mendapatkan topik kesehatan fisik saat interview kerja. jenis data ini adalah string.
25. mental_vs_physc, yaitu pengetahuan para respondent apakah atasannya memandang bahwa kesehatan mental sama pentingnya dengan kesehatan fisik. jenis data ini adalah string.
26. obs_consequence, yaitu hasil pengamatan para respondent terhadap rekan kerja nya yang memiliki gangguan mental apakah berpengaruh negatif pada pekerjaannya. jenis data ini adalah boolean.
27. comments, yaitu komentar atau catatan yang bersifat opsional. jenis data ini adalah string. 


## Validasi Data
Data yang digunakan merupakan Kumpulan data yang berasal dari survei tahun 2014. Data tersebut mengukur sikap terhadap kesehatan mental dan frekuensi gangguan kesehatan mental di tempat kerja teknologi. Data yang digunakan memiliki lisensi CC BY-SA 4.0. Data tersebut diunggah pada situs kaggle oleh Open Sourcing Mental Illness, LTD.

# Data Preparation
![Schedule](https://img.shields.io/badge/Schedule-30%20November%202022-green)
<br>Untuk mempermudah dalam memvisualisasikan data, maka dilakukan persiapan data yang akan diolah dari sumber data yang telah disiapkan. Terdapat beberapa persiapan yang dilakukan, diantaranya adalah sebagai berikut:
### Negara yang digunakan hanya United States
Untuk menunjang tujuan teknis serta mempermudah dalam memvisualisasikan data, maka data yang disiapkan hanya data dari negara United States saja.
### Merapihkan kategori data jenis kelamin
Pada sumber data yang digunakan, terdapat banyak kategori jenis kelamin yang dimasukkan. Kategori tersebut kemudian dikelompokkan menjadi kategori yang akan digunakan yang terbagi menjadi dua jenis kategori sebagai berikut.
| Female  | Male |
| ------------- | ------------- |
| Cis-Female  | Cis Male  |
| cis-female/femmme  | M  |
| F | Mail  |
| femail  | maile  |
| Femake  | Make  |
| Female  | Male  |
| Female (cis)  | Male(CIS)  |
| queer/she/they  | Male-ish  |
| woman  | Man  |
|   | msle  |

<br>Untuk data yang tidak memiliki kejelasan diantara dua kategori tersebut dilakukan pemisahan data untuk tidak diambil sebagai bahan miniriset. Berikut adalah kategori yang tidak digunakan.
1. Genderqueer
2. Nah
3. non binary
4. p
5. Female (trans)
6. Trans woman
7. Trans-female

### Merapihkan data umur
Pekerja umumnya berumur diatas 18 tahun dan dibawah 100 tahun. Maka untuk data dengan umur dibawah 18 tahun dan diatas 100 tahun tidak diambil sebagai bahan miniriset.

### Mengambil kategori tech company
Karena pada data tersebut masih tercampur antara tech company dan non-tech company maka diperlukan pemilhan data untuk kategori tech company saja.

# Data Visualization
![Dashboard_Assets](Data%20Visualization/Mental%20health%20on%20tech%20tech%20workplace%20in%20uinted%20states.png)
1. [Statistik pekerja bidang teknologi di United States yang mengalami gangguan mental berdasarkan gender](https://github.com/imamfirdaus-if/Mental-Health-on-Tech-Workplaces/blob/main/Data%20Visualization/Mental%20Health%20on%20Tech%20Workplaces%20-%20Gender%20rev%201.pdf)
2. [Statistik perusahaan yang menyediakan layanan kesehatan](https://github.com/imamfirdaus-if/Mental-Health-on-Tech-Workplaces/blob/main/Data%20Visualization/perbadingan%20jumlah%20perusahaan%20yang%20menyediakan%20layanan%20kesehatan.pdf)
3. [Statistik kefektifan kerja berdasarkan kesehatan mental](https://github.com/imamfirdaus-if/Mental-Health-on-Tech-Workplaces/blob/main/Data%20Visualization/pengaruh%20kesehatan%20mental%20terhadap%20keefektifan%20kerja.pdf)
4. [Statistik pekerja bidang teknologi di United States yang mengalami gangguan mental berdasarkan terapi pengobatan](https://github.com/imamfirdaus-if/Mental-Health-on-Tech-Workplaces/blob/main/Data%20Visualization/Mental%20Health%20on%20Tech%20Workplaces%20-%20Treatment.pdf)
5. [Statistik pekerja bidang teknologi di United States yang mengalami gangguan mental berdasarkan umur](https://github.com/imamfirdaus-if/Mental-Health-on-Tech-Workplaces/blob/main/Data%20Visualization/Mental%20Health%20on%20Tech%20Workplaces%20-%20Age.pdf)

# Modelling 
![Schedule](https://img.shields.io/badge/Schedule-7%20Desember%202022-green)
Modelling data dapat dilihat pada link berikut [Analisis pengaruh pemberian perawatan kesehatan mental pada pekerja industri teknologi terhadap kesehatan mental meenggunakan algoritma naive bayes](https://github.com/imamfirdaus-if/Mental-Health-on-Tech-Workplaces/blob/main/AnalisisPengaruhPemberianPerawatanKesehatanMentalPadaPekerjaDiIndustriTeknologiTerhadapKesehatanMentalMenggunakanAlgoritmaNaiveaBayes.ipynb)

# Modelling Evaluation
![Schedule](https://img.shields.io/badge/Schedule-14%20Desember%202022-green)
Modelling evaluation dapat dilihat pada link berikut [Analisis pengaruh pemberian perawatan kesehatan mental pada pekerja industri teknologi terhadap kesehatan mental meenggunakan algoritma naive bayes](https://github.com/imamfirdaus-if/Mental-Health-on-Tech-Workplaces/blob/main/AnalisisPengaruhPemberianPerawatanKesehatanMentalPadaPekerjaDiIndustriTeknologiTerhadapKesehatanMentalMenggunakanAlgoritmaNaiveaBayes.ipynb)

# Dashboard
![Schedule](https://img.shields.io/badge/Schedule-21%20Desember%202022-green)
Dashboard Web dapat dilihat pada link berikut [Dashoard](https://inipunyaku.github.io/chart/)
