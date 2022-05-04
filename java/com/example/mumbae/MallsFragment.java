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
 * Use the {@link MallsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MallsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MallsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MallsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MallsFragment newInstance(String param1, String param2) {
        MallsFragment fragment = new MallsFragment();
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
        items.add(new Item("Infiniti Mall","Malad West"));
        items.add(new Item("CR2","Nariman Point"));
        items.add(new Item("Atria Mall","Worli"));
        items.add(new Item("Phoenix Market City","Kurla"));
        items.add(new Item("High Street Phoenix","Lower Parel"));
        items.add(new Item("Palladium Mall","Lower Parel"));
        items.add(new Item("R City Mall","Ghatkopar"));
        items.add(new Item("Viviana Mall","Thane"));
        items.add(new Item("Korum Mall","Thane"));
        items.add(new Item("Seawoods Grand Central","Seawoods, Navi Mumbai"));
        items.add(new Item("Inorbit Mall","Vashi/ Malad West"));
        items.add(new Item("Orchid City Centre Mall","Grant Road"));

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_malls, container, false);
        ListAdapter adapter = new ListAdapter(getActivity(),items);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}