package me.mydev.menumakanan;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rec_Makanan;
    private ArrayList <Kuliner> listMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rec_Makanan = findViewById(R.id.rec_Makanan);
        initData();

        // memanggil class KulinerAdapter agar menu muncul
        rec_Makanan.setAdapter(new KulinerAdapter(listMakanan));
        rec_Makanan.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initData() {
        this.listMakanan = new ArrayList<>();
        listMakanan.add(new Kuliner("Mie Setan",
                "Rp. 9.500",
                "Mie Setan dengan bumbu khas, campuran cabe, dikasi sedikit kecap, beserta pangsit. Memiliki level kepedasan 1-5",
                R.drawable.setan));

        listMakanan.add(new Kuliner("Mie Iblis",
                "Rp. 9.500",
                "Mie Setan dengan bumbu khas, campuran cabe, beserta pangsit. Memiliki level kepedasan 1-5",
                R.drawable.iblis));

        listMakanan.add(new Kuliner("Mie Goreng Korea",
                "Rp. 20.000",
                "Gabungan antara 2 mie instan goreng dengan bumbu khas yang sangat pedas dengan campuran daging cincang",
                R.drawable.miekorea));
        listMakanan.add(new Kuliner("Magelangan",
                "Rp. 14.500",
                "Nasi goreng pedas yang dicampur dengan mie kuning, kemudian dikasi potongan daun bawang, ayam, sawi, dan telur",
                R.drawable.magelangan));
        listMakanan.add(new Kuliner("Mie Nyemek",
                "Rp. 12.500",
                "dengan bumbu kuah turun temurun, potongan ayam, sawi, dan potongan cabe",
                R.drawable.nyemek));
        listMakanan.add(new Kuliner("Mie Goreng Rendang",
                "Rp. 15.000",
                "Dengan bumbu rendang andalan dipadukan dengan potongan sosis, bakso, dan sayuran",
                R.drawable.mierendang));
    }


}