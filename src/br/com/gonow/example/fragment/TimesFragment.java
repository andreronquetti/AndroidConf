package br.com.gonow.example.fragment;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import br.com.gonow.example.activity.MainActivity;
import br.com.gonow.example.activity.R;
import br.com.gonow.example.model.Time;

public class TimesFragment extends Fragment {
	
	private ArrayList<Time> times;
	
	public TimesFragment() {
		super();
		createListTime();
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View layout = inflater.inflate(R.layout.fragment_times, container, false);
		ListView listView = (ListView) layout.findViewById(android.R.id.list);
		listView.setAdapter(new ArrayAdapter<Time>(getActivity(), R.layout.time, android.R.id.text1 , times));
		listView.setOnItemClickListener((MainActivity) getActivity());
		
		return layout;
	}
	
	private void createListTime() {
		times = new ArrayList<Time>();
		times.add(new Time("Corinthians", R.drawable.corinthians));
		times.add(new Time("Palmeiras", R.drawable.palmeiras));
		times.add(new Time("Santos", R.drawable.santos));
		times.add(new Time("São Paulo", R.drawable.saopaulo));
	}
	
	public ArrayList<Time> getTimes() {
		return times;
	}
}
