package br.com.gonow.example.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import br.com.gonow.example.activity.R;
import br.com.gonow.example.model.Time;

public class DetalhesFragment extends Fragment {
	
	private Time time;
	
	public DetalhesFragment(Time time) {
		super();
		this.time = time;
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View layout = inflater.inflate(R.layout.fragment_detalhes, container, false);
		
		init(layout);
		
		return layout;
	}

	private void init(View layout) {
		ImageView imageView = (ImageView) layout.findViewById(android.R.id.icon);
		imageView.setImageDrawable(getResources().getDrawable(time.getPicture()));
		
		TextView textView = (TextView) layout.findViewById(android.R.id.text1);
		textView.setText(time.getNome());
	}
	
	public void updateFragment(Time time) {
		setTime(time);
		init(this.getView());
	}
	
	public void setTime(Time time) {
		this.time = time;
	}
	
}
