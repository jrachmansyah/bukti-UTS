package com.juan.mobil;

import java.util.ArrayList;

public class mobilData {
        private static String[] nama = {
        "Calya","Sienta","Avanza","Veloz","Venturer","Voxy",
        "Innova","Alphard","Vellfire","Camry"
};

        private static String[] keterangan = {
                "Calya adalah BEYOND EXTERIOR" +
                        "Compact MPV 7-seater dengan konsep desain yang stylish dan modern, semakin menambah kepuasan Anda dalam berkendara.",
                "Sienta adalah BEYOND EXTERIOR" +
                        "Dengan konsep modern, Active and Fun akan membuat siapapun ingin merasakan sensasi fun drive dengan Toyota All New Sienta.",
                "Avanza adalah BEYOND EXTERIOR" +
                        "NEW Radiator Grille Design with Chrome Garnish.",
                "Veloz adalah BEYOND EXTERIOR" +
                        "Tampil lebih sporty dan berkarakter, New Veloz menjadikan Anda pusat perhatian.",
                "Venturer adalah BEYOND EXTERIOR" +
                        "New elegantly bold additions to enhance the premium sporty look.",
                "Voxy adalah BEYOND EXTERIOR" +
                        "Fascinating In Every Way.",
                "Innova adalah BEYOND EXTERIOR" +
                        "The manifestation of premium, pleasure and performance in one driving experience.",
                "Alphard adalah BEYOND EXTERIOR" +
                        "Prestigious ride for those who love to be enveloped in comfort.",
                "Vellfire adalah BEYOND EXTERIOR" +
                        "New Vellfire lets you travel in comfort with enhanced support performance and arrive at your destination in top.",
                "Camry adalah BEYOND EXTERIOR" +
                        "All New Toyota Camry has crafted the next level of perfection. A fushion of refined quality and captivating appearance to give you an unrivalled driving."

        };

        private static int[] foto = {
                R.drawable.calya,R.drawable.sienta,R.drawable.avanza,R.drawable.veloz,R.drawable.venturer,
                R.drawable.voxy,R.drawable.innova,R.drawable.alphard,R.drawable.vellfire,R.drawable.camry
        };

        static ArrayList<mobilProduct> getListEco() {
            ArrayList<mobilProduct> list = new ArrayList<>();
            for (int position = 0; position < nama.length; position++) {
                mobilProduct ep = new mobilProduct();
                ep.setNamamobil(nama[position]);
                ep.setKeteranganmobil(keterangan[position]);
                ep.setFotomobil(foto[position]);
                list.add(ep);
            }
            return list;
        }
}

