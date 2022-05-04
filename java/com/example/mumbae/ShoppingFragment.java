package com.example.mumbae;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.ListResourceBundle;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ShoppingFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ShoppingFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ShoppingFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ShoppingFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ShoppingFragment newInstance(String param1, String param2) {
        ShoppingFragment fragment = new ShoppingFragment();
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
        items.add(new Item("Colaba Causeway","Colaba"));
        items.add(new Item("Chor Bazaar","Grant Road"));
        items.add(new Item("Crawford Market","Fort Mumbai"));
        items.add(new Item("Fashion Street","Fort Mumbai"));
        items.add(new Item("Mangaldas Market","Kalbadevi"));
        items.add(new Item("Kala Ghoda Art Plaza Pavement Gallery","Fort Mumbai"));
        items.add(new Item("Book Street","Fort Mumbai"));
        items.add(new Item("Linking Road","Bandra West"));
        items.add(new Item("Dharavi Leather Market","Dharavi, Sion"));
        items.add(new Item("Hill Road","Bandra"));
        items.add(new Item("Natraj Market","Malad West"));
        items.add(new Item("Hindmata","Dadar"));
        items.add(new Item("Zaveri Bazaar","Bhuleshwar"));

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_shopping, container, false);
        ListAdapter adapter = new ListAdapter(getActivity(),items);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}