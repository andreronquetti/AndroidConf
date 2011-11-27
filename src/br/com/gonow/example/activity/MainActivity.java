package br.com.gonow.example.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import br.com.gonow.example.activity.strategy.MainStrategy;
import br.com.gonow.example.activity.wrapper.StrategyWrapper;
import br.com.gonow.example.fragment.TimesFragment;
import br.com.gonow.example.model.Time;

public class MainActivity extends FragmentActivity  implements OnItemClickListener {
	
	private MainStrategy strategy;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        strategy = StrategyWrapper.factory(this);

        TimesFragment timesFragment = new TimesFragment();
        
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment, timesFragment).commit();
        strategy.init(timesFragment);
    }

	@Override
	public void onItemClick(AdapterView<?> adapter, View view, int position, long arg3) {
		Time time = (Time) adapter.getItemAtPosition(position);
		strategy.onItemClicked(time);
	}
	
	@Override
	public void onBackPressed() {
		boolean back = strategy.onBackPressed();
		
		if (!back) {
			super.onBackPressed();
		}
	}
	
}