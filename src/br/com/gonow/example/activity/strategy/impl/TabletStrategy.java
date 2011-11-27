package br.com.gonow.example.activity.strategy.impl;

import br.com.gonow.example.activity.MainActivity;
import br.com.gonow.example.activity.R;
import br.com.gonow.example.activity.strategy.MainStrategy;
import br.com.gonow.example.fragment.DetalhesFragment;
import br.com.gonow.example.fragment.TimesFragment;
import br.com.gonow.example.model.Time;

public class TabletStrategy extends GenericStrategy implements MainStrategy {
	
	private DetalhesFragment detalhesFragment;

	public TabletStrategy(MainActivity activity) {
		super(activity);
	}

	@Override
	public boolean onBackPressed() {
		return false;
	}

	@Override
	public void onItemClicked(Time time) {
		detalhesFragment.updateFragment(time);
	}
	

	@Override
	public void init(TimesFragment timesFragment) {
		detalhesFragment = new DetalhesFragment(timesFragment.getTimes().get(0));
		activity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment_detail, detalhesFragment).commit();
	}

}
