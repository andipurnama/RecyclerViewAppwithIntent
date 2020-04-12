package com.example.myrecyclerviewtry4;

import java.util.ArrayList;

public class MahasiswaData {
    private static String[] mahasiswaNama = {
            "Andi Purnama",
            "Mega Restu Mirantika",
            "Wiwin Winarti",
            "Andika Sutejo Putro",
            "Putri Nurhafenda Harun",
            "Giri Baldy Stachbanny",
            "Kristina Hakim Mukti",
            "Iyan Santoso",
            "Deri Riyadi",
            "Ricky Hariya",
            "Yulianti",
            "Yogi Somantri",
            "Adi Nuryanto",
            "Aria Pratama"
    };

    private static String[] mahasiswaNim = {
            "311710003",
            "311710112",
            "311710465",
            "311710080",
            "311710092",
            "311710095",
            "311710150",
            "311710176",
            "311710234",
            "311710269",
            "311710291",
            "311710327",
            "311710343",
            "311710389"
    };

    private static String[] mahasiswaHp = {
            "0857-9493-2912",
            "0896-8857-1302",
            "0858-6009-6469",
            "0838-0695-8903",
            "0881-5386-873",
            "0838-1555-6905",
            "0895-0989-0262",
            "0858-9210-3011",
            "0815-8402-9821",
            "0896-3694-8401",
            "0813-5997-2755",
            "0896-2457-1869",
            "0822-9769-8688",
            "0877-8743-0459"
    };

    private static int[] mahasiswaImage = {
            R.drawable.andi_purnama,
            R.drawable.mega,
            R.drawable.wiwin,
            R.drawable.default_pic,
            R.drawable.default_pic,
            R.drawable.default_pic,
            R.drawable.default_pic,
            R.drawable.default_pic,
            R.drawable.default_pic,
            R.drawable.default_pic,
            R.drawable.default_pic,
            R.drawable.default_pic,
            R.drawable.default_pic,
            R.drawable.default_pic,
            R.drawable.default_pic
    };

    static ArrayList<Mahasiswa> getListData() {
        ArrayList<Mahasiswa> list = new ArrayList<>();
        for (int position =0; position < mahasiswaNama.length; position++) {
            Mahasiswa mahasiswa = new Mahasiswa();
            mahasiswa.setNama(mahasiswaNama[position]);
            mahasiswa.setNim(mahasiswaNim[position]);
            mahasiswa.setPhoto(mahasiswaImage[position]);
            mahasiswa.setNoHp(mahasiswaHp[position]);
            list.add(mahasiswa);
        }
        return list;
    }
}
