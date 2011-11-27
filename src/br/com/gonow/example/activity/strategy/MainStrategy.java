package br.com.gonow.example.activity.strategy;

import br.com.gonow.example.fragment.TimesFragment;
import br.com.gonow.example.model.Time;

public interface MainStrategy {
	
	void init(TimesFragment timesFragment);
	
	boolean onBackPressed();
	
	void onItemClicked(Time time);
	
}
