package com.example.mumbae;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FoodFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FoodFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FoodFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FoodFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FoodFragment newInstance(String param1, String param2) {
        FoodFragment fragment = new FoodFragment();
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
        items.add(new Item("Vada Pav","Mithibai College, Vile Parle",R.mipmap.ic_launcher));
        items.add(new Item("Misal Pav","Aaswad, Dadar West",R.mipmap.ic_launcher));
        items.add(new Item("Dabeli","Kapil Dabeli Centre, Goregaon West",R.mipmap.ic_launcher));
        items.add(new Item("Pav Bhaaji","Amar Juice Center, Vile Parle",R.mipmap.ic_launcher));
        items.add(new Item("Bhel Puri and Sev Puri","Any local stall",R.mipmap.ic_launcher));
        items.add(new Item("Pani Puri","Any local stall",R.mipmap.ic_launcher));
        items.add(new Item("Batata Vada","Any local stall",R.mipmap.ic_launcher));
        items.add(new Item("Ragda Patis","Any local stal",R.mipmap.ic_launcher));
        items.add(new Item("Akuri On Toast","Yazdani Bakery",R.mipmap.ic_launcher));
        items.add(new Item("Bombay Sandwich","Vasu’s Laxmi Balaji Snacks",R.mipmap.ic_launcher));
        items.add(new Item("Kanda Poha","Chaayos - Meri Wali Chai.",R.mipmap.ic_launcher));
        items.add(new Item("Frankie","Breadkraft, Lokhandwala",R.mipmap.ic_launcher));
        items.add(new Item("Falooda","Baadshah, Crawford Market",R.mipmap.ic_launcher));
        items.add(new Item("Keema Pav","Gulshan-e-Iran, Crawford Market",R.mipmap.ic_launcher));
        items.add(new Item("Mysore Masala Dosa","Cafe Madras, Matunga",R.mipmap.ic_launcher));
        items.add(new Item("Bun Maska","Mervan’s, Grant Road",R.mipmap.ic_launcher));




        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_food, container, false);

        ListAdapter adapter = new ListAdapter(getActivity(), items);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}