
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        String namaMahasiswa;
        String nimMahasiswa;
        double nilaiWawancara;
        double nilaiMicroteaching;
        double nilaiTulis;
        double nilaiPraktek;
        double nilaiCoding;
        double nilaiAkhir;

        int menu2, banyakData1;
        char jawab;



        Scanner input = new Scanner(System.in);

        do {
            System.out.println("\n\t\tPendaftaran Asisten dan Admin Laboratorium\n");
            System.out.println("Pilih form :");
            System.out.println("1. Form Asisten Laboratorium");
            System.out.println("2. Form Admin Laboratorium");
            System.out.print("Pilih : ");


            try {
                menu2 = input.nextInt();
                if (menu2 <= 0) {
                    throw new InputMismatchException();
                } else if (menu2 > 2) {
                    throw new InputMismatchException();
                } else if (menu2 == 1) {
                    System.out.print("Banyak data : ");
                    banyakData1 = input.nextInt();

                    System.out.println("\n");
                    for (int i = 0; i < banyakData1; i++) {
                        System.out.println("Formulir ke- "+(i+1) );
                        System.out.print("Nama\t: ");
                        namaMahasiswa= input.next();
                        input = new Scanner(System.in);
                        System.out.print("NIM\t\t: ");
                        nimMahasiswa = input.next();
                        System.out.print("Nilai Tes Tertulis\t: ");
                        nilaiTulis = input.nextDouble();
                        System.out.print("Nilai Tes Coding\t: ");
                        nilaiCoding = input.nextDouble();
                        System.out.print("Nilai Tes Wawancara\t: ");
                        nilaiWawancara = input.nextDouble();
                        System.out.print("Nilai Tes Microteaching \t: ");
                        nilaiMicroteaching = input.nextDouble();
                        Seleksi proses1 = new Seleksi(nilaiTulis,nilaiCoding,nilaiWawancara,nilaiMicroteaching);

                        System.out.print("Nilai Akhir : ");
                        nilaiAkhir = proses1.HitungNilaiAslab();
                        System.out.println(nilaiAkhir);
                        proses1.hasil(nimMahasiswa);
                        System.out.println("\n");
                    }

                } else if (menu2 == 2) {

                System.out.print("Banyak data : ");
                banyakData1 = input.nextInt();

                System.out.println("\n");
                for (int i = 0; i < banyakData1; i++) {
                    System.out.println("Formulir ke- "+(i+1) );
                    System.out.print("Nama\t : ");
                    namaMahasiswa = input.next();
                    input = new Scanner(System.in);
                    System.out.print("NIM\t\t : ");
                    nimMahasiswa = input.next();
                    System.out.print("Nilai Tes Tertulis\t : ");
                    nilaiTulis = input.nextDouble();
                    System.out.print("Nilai Tes Coding\t : ");
                    nilaiCoding = input.nextDouble();
                    System.out.print("Nilai Tes Wawancara\t : ");
                    nilaiWawancara = input.nextDouble();
                    System.out.print("Nilai Tes Microteaching \t : ");
                    nilaiPraktek = input.nextDouble();

                    Seleksi proses2 = new Seleksi(nilaiTulis,nilaiCoding,nilaiWawancara,nilaiPraktek);

                    System.out.print("Nilai Akhir : ");
                    nilaiAkhir=proses2.HitungNilaiAdmin();
                    System.out.println(nilaiAkhir);
                    proses2.hasil(nimMahasiswa);
                    System.out.println("\n");
                }
            }
                System.out.println("\n");
                }

             catch (InputMismatchException inputMismatchException) {
                System.out.println("Pilih menu yang ada! ");
            }

            System.out.println("Kembali ke menu (y/n)?");
            jawab=input.next().charAt(0);
        } while (jawab!='n');

    }
}

