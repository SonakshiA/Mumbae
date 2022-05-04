package com.example.mumbae;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link EateriesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EateriesFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public EateriesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment EateriesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static EateriesFragment newInstance(String param1, String param2) {
        EateriesFragment fragment = new EateriesFragment();
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
        //ArrayList<Item> items = new ArrayList<>();


        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_eateries, container, false);
        //ListAdapter adapter = new ListAdapter(getActivity(),items);
        //ListView listView = (ListView) rootView.findViewById(R.id.list);
        //listView.setAdapter(adapter);

        TextView maharashtrian = (TextView) rootView.findViewById(R.id.maharastrian);  // Fragments do not working like Activity, rootView to be assigned so as to use findViewById()
        maharashtrian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent maharashtrianIntent = new Intent(getActivity(),MaharashtrianFood.class);
                startActivity(maharashtrianIntent);
            }
        });

        TextView northIndian = (TextView) rootView.findViewById(R.id.northIndian);
        northIndian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent northIndianIntent = new Intent(getActivity(),NorthIndianFood.class);
                startActivity(northIndianIntent);
            }
        });

        TextView southIndian = (TextView) rootView.findViewById(R.id.southIndian);
        southIndian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent southIndianIntent = new Intent(getActivity(),SouthIndianFood.class);
                startActivity(southIndianIntent);
            }
        });

        TextView parsi = (TextView) rootView.findViewById(R.id.parsi);
        parsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent parsiIntent = new Intent(getActivity(),ParsiFood.class);
                startActivity(parsiIntent);
            }
        });

        TextView italian = (TextView) rootView.findViewById(R.id.italian);
        italian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent italianIntent = new Intent(getActivity(),ItalianFood.class);
                startActivity(italianIntent);
            }
        });

        TextView chinese = (TextView) rootView.findViewById(R.id.chinese);
        chinese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chineseIntent = new Intent(getActivity(),ChineseFood.class);
                startActivity(chineseIntent);
            }
        });

        TextView japanese = (TextView) rootView.findViewById(R.id.japanese);
        japanese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent japaneseIntent = new Intent(getActivity(),JapaneseFood.class);
                startActivity(japaneseIntent);
            }
        });

        TextView dessert = (TextView) rootView.findViewById(R.id.dessert);
        dessert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dessertIntent = new Intent(getActivity(),Dessert.class);
                startActivity(dessertIntent);
            }
        });
        return rootView;
    }
}