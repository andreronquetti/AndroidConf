package br.com.gonow.example.activity.wrapper;

import br.com.gonow.example.activity.MainActivity;
import br.com.gonow.example.activity.R;
import br.com.gonow.example.activity.strategy.MainStrategy;
import br.com.gonow.example.activity.strategy.impl.SmartStrategy;
import br.com.gonow.example.activity.strategy.impl.TabletStrategy;

public class StrategyWrapper {

	public static MainStrategy factory(MainActivity activity) {
		boolean eTablet = new Boolean(activity.getResources().getString(R.string.eTablet));
		
		if (eTablet) {
			return new TabletStrategy(activity);
		}
		
		return new SmartStrategy(activity);
	}
}
