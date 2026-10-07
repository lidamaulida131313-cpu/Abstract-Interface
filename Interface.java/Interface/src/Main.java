public class Main {
    public static void main(String[] argv) {
        // Pengujian SegiEmpat
        SegiEmpat se = new SegiEmpat();
        se.lebar = 10;
        se.panjang = 10;
        se.hitungKeliling();
        se.hitungLuas();
        System.out.println("Luas sebelum diperbesar = " + se.luas);
        System.out.println("Keliling sebelum diperbesar = " + se.keliling);
        
        se.perbesar();
        se.hitungKeliling();
        se.hitungLuas();
        System.out.println("Luas setelah diperbesar = " + se.luas);
        System.out.println("Keliling setelah diperbesar = " + se.keliling);

        System.out.println("\n------------------------------------\n");

        // Pengujian Lingkaran
        Lingkaran l = new Lingkaran();
        l.jariJari = 7;
        l.hitungLuas();
        l.hitungKeliling();
        System.out.println("Luas Lingkaran awal = " + l.luas);
        System.out.println("Keliling Lingkaran awal = " + l.keliling);

        l.perbesar();
        l.hitungLuas();
        l.hitungKeliling();
        System.out.println("Luas Lingkaran setelah diperbesar = " + l.luas);
        System.out.println("Keliling Lingkaran setelah diperbesar = " + l.keliling);
        
        System.out.println("\n------------------------------------\n");

        // Pengujian SegiTigaSamaKaki
        SegiTigaSamaKaki stsk = new SegiTigaSamaKaki();
        stsk.alas = 6;
        stsk.tinggi = 8;
        stsk.hitungLuas();
        stsk.hitungKeliling();
        System.out.println("Luas STSK awal = " + stsk.luas);
        System.out.println("Keliling STSK awal = " + stsk.keliling);

        stsk.perkecil();
        stsk.hitungLuas();
        stsk.hitungKeliling();
        System.out.println("Luas STSK setelah diperkecil = " + stsk.luas);
        System.out.println("Keliling STSK setelah diperkecil = " + stsk.keliling);
    }
}