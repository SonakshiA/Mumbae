package com.example.mumbae;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PlacesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PlacesFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public PlacesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PlacesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PlacesFragment newInstance(String param1, String param2) {
        PlacesFragment fragment = new PlacesFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Gateway of India","Fort Mumbai",R.mipmap.ic_launcher));
        items.add(new Item("Marine Drive","Fort Mumbai",R.mipmap.ic_launcher));
        items.add(new Item("Juhu Beach","Juhu",R.mipmap.ic_launcher));
        items.add(new Item("Film City","Western Suburbs",R.mipmap.ic_launcher));
        items.add(new Item("Hanging Gardens","Western Suburbs",R.mipmap.ic_launcher));
        items.add(new Item("Prince of Wales Museum","Fort Mumbai",R.mipmap.ic_launcher));
        items.add(new Item("Mumbai Zoo","South Mumbai",R.mipmap.ic_launcher));
        items.add(new Item("Adlabs Imagica","Mumbai-Pune Highway",R.mipmap.ic_launcher));
        items.add(new Item("Smaaash!","South Mumbai",R.mipmap.ic_launcher));
        items.add(new Item("KidZania","Ghatkopar West",R.mipmap.ic_launcher));
        items.add(new Item("Phoenix MarketCity","Kurla",R.mipmap.ic_launcher));
        items.add(new Item("Infiniti Mall","Andheri West",R.mipmap.ic_launcher));
        items.add(new Item("Snow World","Kurla",R.mipmap.ic_launcher));
        items.add(new Item("Sanjay Gandhi National Park","Western Suburbs",R.mipmap.ic_launcher));
        items.add(new Item("Haji Ali Dargah","South Mumbai",R.mipmap.ic_launcher));
        items.add(new Item("Siddhivinayak Temple","South Mumbai",R.mipmap.ic_launcher));
        items.add(new Item("Kamala Nehru Park","South Mumbai",R.mipmap.ic_launcher));
        items.add(new Item("National Gallery of Modern Art","Fort Mumbai",R.mipmap.ic_launcher));
        items.add(new Item("Jehangir Art Gallery","Fort Mumbai",R.mipmap.ic_launcher));
        items.add(new Item("Mount Mary Church","Bandra",R.mipmap.ic_launcher));
        items.add(new Item("Jama Masjid","Bandra",R.mipmap.ic_launcher));
        items.add(new Item("Madh Island","Western Suburbs",R.mipmap.ic_launcher));
        items.add(new Item("Versova Beach","Andheri",R.mipmap.ic_launcher));
        items.add(new Item("Marve Beach","Western Suburbs",R.mipmap.ic_launcher));
        items.add(new Item("Aksa Beach","Western Suburbs",R.mipmap.ic_launcher));


        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_places, container, false);
        ListAdapter adapter = new ListAdapter(getActivity(), items);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}