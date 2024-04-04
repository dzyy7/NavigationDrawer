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

public class MakananFavorit extends Fragment implements Adapter.ItemClickListener{
    RecyclerView RvmakFav;
    List<Model> listdata;
    Adapter adapter;
    public MakananFavorit() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.makanan_favorit, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        RvmakFav = view.findViewById(R.id.RvMakFav);
        listdata = new ArrayList<>();

        Model NasiTahuTelur = new Model();
        NasiTahuTelur.setName("Nasi Tahu Telur");
        NasiTahuTelur.setDesc("Tahu telur sajian yang memadukan telur dadar dengan tahu yang digoreng. Disajikan dengan irisan lontong dan tauge yang disiram saus kacang lezat. Hidangan ini sangat sederhana, namun lezat dan mengenyangkan");
        NasiTahuTelur.setImage("https://thehalalfoodblog.com/wp-content/uploads/2013/12/DSC03491.jpg");
        listdata.add(NasiTahuTelur);

        Model PecelLele = new Model();
        PecelLele.setName("Pecel Lele");
        PecelLele.setDesc("Terdiri dari ikan lele yang disajikan dengan sambal terasi tradisional, sering disajikan dengan tempe goreng dan/atau tahu dan nasi putih . Merupakan masakan khas Jawa yang banyak tersebar di kota-kota di Indonesia, khususnya di Pulau Jawa. Namun, pecel lele sering dikaitkan dengan kota Lamongan , sebelah barat Surabaya di Jawa Timur , karena mayoritas penjual pecel lele berasal dari kota ini. ");
        PecelLele.setImage("https://doyanresep.com/wp-content/uploads/2019/11/resep-pecel-lele.jpg");
        listdata.add(PecelLele);

        Model Pecel = new Model();
        Pecel.setName("Pecel");
        Pecel.setDesc("Pecel adalah salad tradisional Jawa dengan saus kacang ,biasanya dimakan dengan karbohidrat ( nasi , lontong atau ketupat ).");
        Pecel.setImage("https://3.bp.blogspot.com/-l9XIcybK9Rc/WKphvod0WRI/AAAAAAAAEDo/HhVl_WmaSQQIAxnsvv3LOzPG-5jEgw1mQCLcB/s1600/pecel.jpg");
        listdata.add(Pecel);

        Model NasiGoreng = new Model();
        NasiGoreng.setName("Nasi Goreng");
        NasiGoreng.setDesc("Nasi goreng merupakan sajian nasi yang digoreng dalam sebuah wajan atau penggorengan yang menghasilkan cita rasa berbeda karena dicampur dengan bumbu-bumbu seperti garam, bawang putih, bawang merah, merica, rempah-rempah tertentu dan kecap manis.");
        NasiGoreng.setImage("https://spicebreeze.com/wp-content/uploads/2018/03/Nasi-Goreng-form-sq.jpg");
        listdata.add(NasiGoreng);

        Model TempeGeprek = new Model();
        TempeGeprek.setName("Tempe Geprek");
        TempeGeprek.setDesc("Tempe Geprek adalah makanan yang terbuat dari tempe goreng yang digeprek. Sebelum kemunculannya, para penikmat kuliner Indonesia dihebohkan terlebih dahulu dengan wabah ayam geprek. Meski sama-sama digeprek, tapi soal citarasa tentu saja berbeda.");
        TempeGeprek.setImage("https://jagad.id/wp-content/uploads/2019/01/Resep-Geprek-Tempe-Sederhana-dan-Enak-Mudah.jpeg.webp");
        listdata.add(TempeGeprek);

        Model IndomieAceh = new Model();
        IndomieAceh.setName("Indomie Aceh");
        IndomieAceh.setDesc("Indomie Aceh adalah Indomie yang dibumbui dengan bumbu khas aceh. Termasuk di antaranya ada yang menggunakan daun ajaib sebagai penyedap");
        IndomieAceh.setImage("https://www.tokoindonesia.co.uk/wp-content/uploads/2020/08/Indomie-mie-goreng-aceh.png");
        listdata.add(IndomieAceh);

        RvmakFav.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new Adapter(listdata, getContext());
        RvmakFav.setAdapter(adapter);
        adapter.setClickListener(this);
    }

    @Override
    public void onItemClick(View view, int position) {

    }
}