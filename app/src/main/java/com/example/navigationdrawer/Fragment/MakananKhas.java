package com.example.navigationdrawer.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;

import com.example.navigationdrawer.Adapter;
import com.example.navigationdrawer.Model;
import com.example.navigationdrawer.R;

import java.util.ArrayList;
import java.util.List;

public class MakananKhas extends Fragment implements Adapter.ItemClickListener{
    RecyclerView Rvmak;
    List<Model> listdata;
    Adapter adapter;
    public MakananKhas() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.makanan_khas, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        Rvmak = view.findViewById(R.id.RvMak);
        listdata = new ArrayList<>();

        Model Petis = new Model();
        Petis.setName("Petis Kambing Runting");
        Petis.setDesc("Petis yang satu ini merupakan variasi masakan daging kambing yang hampir sama dengan gulai. Perbedaanya, petis kambing dicampur tepung beras dan rebusan daging.");
        Petis.setImage("https://www.libur.co/kulinery/wp-content/uploads/2022/03/Petis-Kambing-Runting.jpg");
        listdata.add(Petis);

        Model Gandul = new Model();
        Gandul.setName("Nasi Gandul");
        Gandul.setDesc("Nasi Gandul ini terdiri dari nasi putih, daging sapi, jeroan, lidah sapi, telur, bawang goreng, tempe, dan guyuran kuah yang santan yang memiliki rasa manis serta gurih. Sekilas rasa dari Nasi Gandul memang sering disebut manis, dan gurihnya mirip dengan gudeg. Namun memang Nasi Gandul ini cendrung kerasa gurih, dan tekstur dari daging sapi yang ada di Nasi Gandul ini juga lembut.");
        Gandul.setImage("https://i2.wp.com/resepkoki.id/wp-content/uploads/2018/09/Resep-Nasi-Gandul.jpg?fit=1280%2C1388&ssl=1");
        listdata.add(Gandul);

        Model SotoKemiri = new Model();
        SotoKemiri.setName("Soto Kemiri");
        SotoKemiri.setDesc("Dulu masyarakat Pati kebanyakan adalah orang kurang mampu sehingga mereka tidak bisa membeli daging atau ayam, maka rakyat pati membuat soto dengan kemiri (sebagai pengganti daging atau ayam)");
        SotoKemiri.setImage("https://1.bp.blogspot.com/-OaEyQ0p3xpo/XgJMT51Lj0I/AAAAAAAAcJE/SS-3DvgaXSYcMgeg5c8XMLlpN7ch22OhgCLcBGAsYHQ/s640/Soto%2BKemiri.jpg");
        listdata.add(SotoKemiri);

        Model Manyung = new Model();
        Manyung.setName("Mangut Ndasz Manyung");
        Manyung.setDesc("Nikmatnya Mangut Kepala Manyung menjadikan makanan khas Pati ini menjadi daftar incaran kuliner utama. Rasanya yang gurih dan sedap dipastikan membuat porsi makan anda bertambah. Mangut merupakan jenis lahan masakan berkuah yang menggunakan bahan utama santan. Rempahnya terdiri dari kemiri, tomat, cabai, dan kunyit yang menjadikan warnanya kuning.");
        Manyung.setImage("https://img-global.cpcdn.com/recipes/f3c7449213d511f9/680x482cq70/mangut-ndas-manyung-foto-resep-utama.jpg");
        listdata.add(Manyung);

        Model GetukLupis = new Model();
        GetukLupis.setName("Getuk Lupis");
        GetukLupis.setDesc("Getuk Lupis adalah jajanan khas Pati yang mudah ditemui di pasar tradisonal. Dari namanya jelas terlihat bahwa ada dua bahan utama untuk membuatnya, yakni gethuk dan lupis. Gethuk terbuat dari bahan utama berupa singkong yang dikukus dan kemudian dihaluskan. Sedangkan untuk Lupis dibuat dari bers ketan dan santan.");
        GetukLupis.setImage("https://s.kaskus.id/images/2018/12/04/8301162_20181204013015.jpeg");
        listdata.add(GetukLupis);

        Model SarangMadu = new Model();
        SarangMadu.setName("Sarang Madu");
        SarangMadu.setDesc("Sarang Madu ini terdiri dari tepung beras yang diolah dengan beras ketan, dan adonan yang sudah jadi itu akan digoreng. Setelah matang adonan itu akan diberi larutan gula jawa sehingga sekilas mirip dengan Sarang Madu.");
        SarangMadu.setImage("https://duniatanya.com/wp-content/uploads/2021/10/kue-sarang-madu-1.jpg");

        Model OporSaudah = new Model();
        OporSaudah.setName("Opor saudah");
        OporSaudah.setDesc("Opor Saudah ini memang terbilang unik, dan berbeda dari opor ayam lainnya. Jadi Opor Saudah ini memiliki potongan ayam yang besar, dan tidak sama dengan potongan ayam pada umumnya.");
        OporSaudah.setImage("https://www.gotravelly.com/blog/wp-content/uploads/2020/11/opor-saudah.jpg");
        listdata.add(OporSaudah);

        Model KeloMrico = new Model();
        KeloMrico.setName("Kelo Mrico");
        KeloMrico.setDesc("Kelo Mrico ini adalah sup asam yang sangat disukai warga Pati, dan Kelo Mrico saking populernya Kelo Mrico ini bisa kalian temukan diberbagai titik kawasan yang ada di Pati.");
        KeloMrico.setImage("https://www.gotravelly.com/blog/wp-content/uploads/2020/11/kelo-nrico.jpg");
        listdata.add(KeloMrico);

        Rvmak.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new Adapter(listdata, getContext());
        Rvmak.setAdapter(adapter);
        adapter.setClickListener(this);

    }
    @Override
    public void onItemClick(View view, int position) {

    }
}