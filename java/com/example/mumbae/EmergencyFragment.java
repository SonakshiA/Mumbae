package com.example.mumbae;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link EmergencyFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EmergencyFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public EmergencyFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment EmergencyFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static EmergencyFragment newInstance(String param1, String param2) {
        EmergencyFragment fragment = new EmergencyFragment();
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


        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_emergency, container, false);

        TextView bloodBank = (TextView) rootView.findViewById(R.id.blood_bank);
        bloodBank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bloodBankIntent = new Intent(getActivity(),BloodBankContact.class);
                startActivity(bloodBankIntent);
            }
        });

        TextView womenHelpline = (TextView) rootView.findViewById(R.id.women_helpline);
        womenHelpline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  womenHelplineIntent = new Intent(getActivity(),WomenHelpline.class);
                startActivity(womenHelplineIntent);
            }
        });

        TextView oxygenCentres = (TextView) rootView.findViewById(R.id.oxygen_centres);
        oxygenCentres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent oxygenCentreIntent = new Intent(getActivity(),OxygenCentreContact.class);
                startActivity(oxygenCentreIntent);
            }
        });

        TextView ambulanceServices = (TextView) rootView.findViewById(R.id.ambulance_services);
        ambulanceServices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ambulanceServiceIntent = new Intent(getActivity(),AmbulanceService.class);
                startActivity(ambulanceServiceIntent);
            }
        });

        TextView fireDepartment = (TextView) rootView.findViewById(R.id.fire_deptt);
        fireDepartment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fireDepartmentIntent = new Intent(getActivity(),FireDepartment.class);
                startActivity(fireDepartmentIntent);
            }
        });

        TextView policeDepartment = (TextView) rootView.findViewById(R.id.police_deptt);
        policeDepartment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent policeDepartmentIntent = new Intent(getActivity(),PoliceDepartment.class);
                startActivity(policeDepartmentIntent);
            }
        });
        return rootView;
    }
}