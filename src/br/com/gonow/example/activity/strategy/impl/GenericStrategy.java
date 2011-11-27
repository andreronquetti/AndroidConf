package br.com.gonow.example.activity.strategy.impl;

import android.support.v4.app.FragmentManager;
import br.com.gonow.example.activity.MainActivity;

public abstract class GenericStrategy {
	
	protected MainActivity activity;
	
	protected FragmentManager fragmentManager;
	
	public GenericStrategy(MainActivity activity) {
		this.activity = activity;
		this.fragmentManager = activity.getSupportFragmentManager();
	}

}
