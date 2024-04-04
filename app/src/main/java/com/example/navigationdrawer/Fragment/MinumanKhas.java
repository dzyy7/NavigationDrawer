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

import com.example.navigationdrawer.Adapter;
import com.example.navigationdrawer.Model;
import com.example.navigationdrawer.R;

import java.util.ArrayList;
import java.util.List;

public class MinumanKhas extends Fragment implements Adapter.ItemClickListener{
    RecyclerView Rvmin;
    List<Model> listdata;
    Adapter adapter;
    public MinumanKhas() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.minuman_khas, container, false);
    }
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        Rvmin = view.findViewById(R.id.RvMin);
        listdata = new ArrayList<>();

        Model wedangcoro = new Model();
        wedangcoro.setName("Wedang Coro");
        wedangcoro.setDesc("wedang ini memiliki kemiripan rasa dengan minuman khas dari Betawi, Bir Pletok. Sekedar informasi saja, penamaan ini berasal dari dua suku kata. Kata “Wedang” merupakan minuman hangat. Sementara kata “coro” bermakna cara. Jika disimpulkan, ini menjadi sejenis minuman yang dinikmati dengan berbagai cara atau tahapan.");
        wedangcoro.setImage("https://assets.promediateknologi.id/crop/11x150:1499x1351/750x500/webp/photo/2021/08/21/3984881286.jpg");
        listdata.add(wedangcoro);

        Model wedangcemue = new Model();
        wedangcemue.setName("Wedang Cemue");
        wedangcemue.setDesc("Pati sebagai kota mina tani memang banyak memiliki kekayaan kuliner, satu diantaranya wedang cemue. Minuman penghangat tubuh ini, sudah sangat dikenal khalayak banyak sebagai minuman khas Pati. Berbeda dengan minuman khas di kota lain, wedang cemue selain memiliki rasa yang nikmat juga bermanfaat menyehatkan tubuh, diantaranya mengobati masuk angin, meningkatkan stamina tubuh, meredakan batuk dan masih banyak lagi.");
        wedangcemue.setImage("https://cdn.yummy.co.id/content-images/images/20221204/I5EYziVE21Q9u3qj9YlVV8WOjKjLwmHc-31363730313335303332d41d8cd98f00b204e9800998ecf8427e.jpg?x-oss-process=image/format,webp");
        listdata.add(wedangcemue);

        Model KopiJolong = new Model();
        KopiJolong.setName("Kopi Jolong");
        KopiJolong.setDesc("Kopi Jollong bila disangrai akan mengeluarkan aroma yang sangat khas dan sangat cocok untuk dijadikan bahan campuran kopi susu,kopi coklat,dan kopi santan.Dalam menyeduh kopi Jollong,sebaiknya menggunakan suhu diatas 90C karena hal tersebut dapat menambah keluarnya aroma khas kopi Jollong.");
        KopiJolong.setImage("https://cf.shopee.co.id/file/7e1c3f0977b9e6caf7ea5c1013cadd9d");
        listdata.add(KopiJolong);

        Rvmin.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new Adapter(listdata, getContext());
        Rvmin.setAdapter(adapter);
        adapter.setClickListener(this);
    }
    @Override
    public void onItemClick(View view, int position) {

    }
}