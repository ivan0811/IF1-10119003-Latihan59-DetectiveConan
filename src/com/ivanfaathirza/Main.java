package com.ivanfaathirza;

/**
 *
 * @author
 * NAMA     : Ivan Faathirza
 * KELAS    : IF1
 * NIM      : 10119003
 * Deskripsi Program: menampilkan daftar karakter detektif konan
 */

public class Main {

    public static void main(String[] args) {
        Karakter ai2, conan2, eri;
        Detektif kogoro;
        DetektifCilik mitsuhiko, ai, hiroshi, conan, ayumi, genta;
        SMATeitan ran, sonoko;
        SMAKaihou heiji, kazuha;

        System.out.println("Karakter");
        kogoro = new KogoroMouri();
        kogoro.setNama("Mōri Kogoro");
        kogoro.setNamaAlias(new String[]{"Detective Moron", "Shinigami", "Sleeping Kogoro", "Smoking Kogoro", "The Sleeping Sleuth"});
        kogoro.setJenisKelamin("l");
        kogoro.setUmur(38);
        kogoro.setKemampuan("Judo");
        kogoro.tampil();
        System.out.println();

        eri = new EriKisaki();
        eri.setNama("Kisaki Eri");
        eri.setJenisKelamin("p");
        eri.setUmur(38);
        eri.setKemampuan("Cerdas");
        eri.tampil();
        System.out.println();

        mitsuhiko = new MitsuhikoTsuburaya();
        mitsuhiko.setNama("Mitsuhiko Tsuburaya");
        mitsuhiko.setBerat(20);
        mitsuhiko.setUmur(7);
        mitsuhiko.setJenisKelamin("l");
        mitsuhiko.setKemampuan("Jenius");
        mitsuhiko.tampil();
        System.out.println();

        ai = new AiHaibara();
        ai.setNama("Ai Haibara");
        ai.setNamaAsli("Shiho Miyano");
        ai.setDewasa(true);
        ai.setUmur(7);
        ai.setJenisKelamin("p");
        ai.setKemampuan("Cerdas");
        ai2 = new AiHaibara();
        ai2.setUmur(17);
        ai.tampil();
        System.out.println("Umur Asli : " + ai2.getUmur());
        System.out.println();

        hiroshi = new HiroshiAgasa();
        hiroshi.setNama("Hiroshi Agasa");
        hiroshi.setNamaAlias(new String[]{"Profesor"});
        hiroshi.setTinggi(160);
        hiroshi.setUmur(52);
        hiroshi.setJenisKelamin("l");
        hiroshi.setKemampuan("Membuat Perangkat");
        hiroshi.tampil();
        System.out.println();

        conan = new ConanEdogawa();
        conan2 = new ConanEdogawa();
        conan.setNama("Conan Edogawa");
        conan.setNamaAsli("Kudō Shinichi");
        conan.setNamaAlias(new String[]{"Cool Kid", "Holmes' Apprentice", "KID Killer", "Silver Bullet", "Sleeping Kogoro's Bag Of Wisdom"});
        conan.setDewasa(true);
        conan.setBerat(18);
        conan.setTinggi(95);
        conan.setUmur(7);
        conan.setJenisKelamin("l");
        conan.setKemampuan("Mengingat");
        conan2.setUmur(17);
        conan2.setTinggi(174);
        conan.tampil();
        System.out.println("Umur Asli : " + conan2.getUmur());
        System.out.println("Tinggi Asli : "+ conan2.getTinggi());
        System.out.println();

        ayumi = new AyumiYoshida();
        ayumi.setNama("Ayumi Yoshida");
        ayumi.setBerat(15);
        ayumi.setTinggi(0);
        ayumi.setUmur(7);
        ayumi.setJenisKelamin("p");
        ayumi.tampil();
        System.out.println();

        genta = new GentaKojima();
        genta.setNama("Genta Kojima");
        genta.setBerat(40);
        genta.setTinggi(0);
        genta.setUmur(7);
        genta.setJenisKelamin("l");
        genta.tampil();
        System.out.println();

        ran = new RanMouri();
        ran.setNama("Mōri Ran");
        ran.setUmur(17);
        ran.setJenisKelamin("p");
        ran.setTinggi(160);
        ran.setBerat(52);
        ran.setKemampuan("Karate");
        ran.tampil();
        System.out.println();

        sonoko = new SonokoSuzuki();
        sonoko.setNama("Suzuki Sonoko");
        sonoko.setUmur(17);
        sonoko.setJenisKelamin("p");
        sonoko.tampil();
        System.out.println();

        heiji = new HeijiHattori();
        heiji.setNama("Hattori Heiji");
        heiji.setUmur(17);
        heiji.setBerat(61);
        heiji.setTinggi(177);
        heiji.setJenisKelamin("l");
        heiji.setKemampuan("kendo");
        heiji.tampil();
        System.out.println();

        kazuha = new KazuhaToyama();
        kazuha.setNama("Tōyama Kazuha");
        kazuha.setUmur(17);
        kazuha.setJenisKelamin("p");
        kazuha.setKemampuan("Aikido");
        kazuha.tampil();
        System.out.println();
    }
}
