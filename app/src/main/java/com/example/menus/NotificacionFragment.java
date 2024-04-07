package com.example.menus;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;


public class NotificacionFragment extends Fragment {

    TextView select;
    Spinner planetas;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_notificacion, container, false);

        select = view.findViewById(R.id.seleccion);
        planetas = view.findViewById(R.id.planetas_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(requireContext(),R.array.planetas_array, android.R.layout.simple_spinner_item);

        planetas.setAdapter(adapter);
        return view;
    }
}