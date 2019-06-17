package androi.edu.plazi.view.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import androi.edu.plazi.Adapter.PictureAdapterRecyclerView;
import androi.edu.plazi.R;
import androi.edu.plazi.model.Picture;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {


    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        showToolbar("",false,view);

        RecyclerView picturesRecycler = (RecyclerView) view.findViewById(R.id.pictureProfileRecycler);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        picturesRecycler.setLayoutManager(linearLayoutManager);

        PictureAdapterRecyclerView pictureAdapterRecyclerView =
                new PictureAdapterRecyclerView(buidPictures(), R.layout.cardviewfoto,getActivity());
        picturesRecycler.setAdapter(pictureAdapterRecyclerView);

        return view;

    }

    public ArrayList<Picture> buidPictures(){
        ArrayList<Picture> pictures = new ArrayList<>();
        pictures.add(new Picture("https://ep01.epimg.net/elpais/imagenes/2019/03/14/paco_nadal/1552547205_448982_1552584608_noticia_normal_recorte1.jpg","ELIAS MERLO ALVITES","4 dias","3 Me Gusta"));
        pictures.add(new Picture("https://okdiario.com/img/2017/06/19/maravillas-naturales-del-mundo-2-990x556.jpg","MEDALLY RENGIFO MARROQUIN","4 dias","20 Me Gusta"));
        pictures.add(new Picture("https://okdiario.com/img/2017/06/19/maravillas-naturales-del-mundo-3-990x556.jpg","DANIEL MERLO ALVITES","4 dias","13 Me Gusta"));
        return pictures;
    }

    public void showToolbar(String titulo, boolean upBoton, View view) {
        Toolbar toolbar1 = (Toolbar) view.findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar1);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(titulo);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(upBoton);
    }
}
