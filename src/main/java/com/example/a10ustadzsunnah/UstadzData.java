package com.example.a10ustadzsunnah;

import java.util.ArrayList;

public class UstadzData {
    private static String[] ustadzNames = {
            "Ustadz Yazid bin Abdul Qadir Jawas",
            "Ustadz Firanda Andirja",
            "Ustadz Badrusalam",
            "Ustadz Khalid Basalamah",
            "Ustadz Syafiq Riza Basalamah",
            "Ustadz Ahmad Zainuddin Al Banjary",
            "Ustadz Muhammad Nuzul Dzikri",
            "Ustadz Muhammad Elvi Syam",
            "Ustadz Zainal Abidin bin Syamsuddin",
            "Ustadz Sufyan Baswedan",

    };
    private static String[] ustadzDetails = {
            "Ustadz Salafy yang direkomendasikan.Sosok yang dihormati dan dituakan oleh seluruh asatidz sunnah di Indonesia. Murid dari ulama dunia, Syaikh Utsamin. Sejak 1980an telah berjuang keras mendakwahkan sunnah bersama temannya, Ustadz Abdul Hakim bin Amir Abdat. Buku-buku beliau seperti “Mulia dengan Manhaj Salaf” menjadi rujukan masyarakat Sunnah.",
            "Belajar kepada Ulama Besar Madinah, seperti Syaikh Abdul Muhsin dan Syaikh Prof. Abdurrazaq Al Badr. Diangkat oleh Kerajaan Arab Saudi sebagai pengajar resmi di Masjid Nabawi. Kedalaman ilmu beliau, terutama dalam masalah aqidah membuatnya menjadi Ustadz yang paling direkomendasikan oleh sesama asatidz. ",
            "Pembina Rodja TV, Saluran TV Ahluss Sunnah dengan jumlah penonton terbanyak di Indonesia, sehingga beliau dinilai sangat berjasa dalam menebarkan dakwah sunnah ke seluruh pelosok Indonesia. Mempunyai sanad ilmu hadits yang bersambung hingga Imam Bukhari melalui guru beliau, Syaikh Muhammad A'zami.",
            "Ustadz sekaligus pebisnis. Beliau pemilik dari restoran Ajwad. Santun dalam berdakwah. Mempunyai koleksi video kajian sunnah yang mencapai 1000 lebih video. Berkat dakwahnya yang masif, beliau menjadi Ustadz Sunnah paling populer di Indonesia. karena banyaknya video kajian beliau yang tersebar di media.",
            "Salah seorang ustadz terbaik yang mempopulerkan istilah “dakwah sunnah” pada masyarakat Indonesia. Video ceramah beliau merupakan video yang paling sering diputar di Yufid TV, yakni sekitar 3,7 juta kali telah ditonton oleh masyarakat umum. Pusat dakwah beliau berlokasi di Masjid Imam Syafii, Banjarmasin.",
            "Selalu rutin mengisi kajian di Rodja TV dan Yufid TV. Banyak orang yang tergugah dan tersentuh hatinya ketika menghadiri kajian beliau. Hal inilah yang membuat kajian sunnah yang beliau isi selalu ramai didatangi banyak orang. Penulis buku best seller yang berjudul Berbekal Setengah Isi Setengah Kosong.",
            "Cara penyampaian yang bijak selalu mengena di hati. Ustadz Sunnah yang mempunyai gaya bahasa yang sejuk, kekinian, dan intelek. Akhlak salafi tercermin dari kata-kata beliau yang penuh hikmah juga pada kepribadian beliau. Sehingga, kajian sunnah yang beliau isi banyak membuat orang masuk Islam.",
            "Beliau berasal dari Kota Payakumbuh. Direktur Surau TV, saluran TV yang menebarkan dakwah Ahlus Sunnah wal Jamaah di Ranah Minang. Sebagai Ulama Muhammadiyah, beliau aktif dalam Majelis Tarjih DPW Sumatera Barat. Beliau juga salah seorang ulama MUI. Murid beliau biasa memanggilnya Buya Elvi Syam.",
            "Besar di kalangan masyarakat tradisional, membuat beliau sangat anti dengan dakwah sunnah. Namun, setelah hidayah menyapa, beliau menjadi seorang da’i yang sangat gencar menyebarkan sunnah dan memberantas bid’ah. Beliau juga sangat paham sejarah, dan mengarang buku ilmiah Fakta Baru Wali Songo.",
            "Doktor dalam Ilmu Hadits. Beliau memiliki keahlian dalam memfilter hadits yang shahih dan yang bukan. Oleh karenanya, banyak yang  bertanya tentang derajat sebuah hadits yang biasanya beredar di masyarakat. Mendapatkan pujian atas kredibilitas ilmiahnya dalam takhrij hadits dari Syaikh Prof. Abdullah Dompu.",



    };

    private static int[] ustadzImages = {
            R.drawable.yazidjawas,
            R.drawable.firanda2,
            R.drawable.badrusalam,
            R.drawable.ustadzkhalidbasalamah,
            R.drawable.syafiqrizabasalamah,
            R.drawable.ahmadzainuddinalbanjary,
            R.drawable.ustadzmuhammadnuzuldzikri,
            R.drawable.buyaelvisyam,
            R.drawable.ustadzzainalabidinbinsyamsuddin,
            R.drawable.sufyanbaswedan,

    };
    static ArrayList<Ustadz> getListData(){
        ArrayList<Ustadz> list = new ArrayList<>();
        for (int position = 0; position <ustadzNames.length; position++){
            Ustadz ustadz = new Ustadz();
            ustadz.setName(ustadzNames[position]);
            ustadz.setDetail(ustadzDetails[position]);
            ustadz.setPhoto(ustadzImages[position]);
            list.add(ustadz);

        }
        return list;
    }

}
