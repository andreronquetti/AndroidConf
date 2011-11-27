package br.com.gonow.example.activity.strategy.impl;

import android.support.v4.app.Fragment;
import br.com.gonow.example.activity.MainActivity;
import br.com.gonow.example.activity.R;
import br.com.gonow.example.activity.strategy.MainStrategy;
import br.com.gonow.example.fragment.DetalhesFragment;
import br.com.gonow.example.fragment.TimesFragment;
import br.com.gonow.example.model.Time;

public class SmartStrategy extends GenericStrategy implements MainStrategy {

	public SmartStrategy(MainActivity activity) {
		super(activity);
	}

	@Override
	public boolean onBackPressed() {
		Fragment fragment = fragmentManager.findFragmentById(R.id.fragment);
		
		if (fragment != null && fragment instanceof DetalhesFragment) {
			while (fragment.getFragmentManager().popBackStackImmediate());
			fragmentManager.beginTransaction().remove(fragment).commit();
			fragmentManager.beginTransaction().replace(R.id.fragment, new TimesFragment()).commit();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void onItemClicked(Time time) {
		fragmentManager.beginTransaction().replace(R.id.fragment, new DetalhesFragment(time)).commit();
	}

	@Override
	public void init(TimesFragment timesFragment) {
	}

}
