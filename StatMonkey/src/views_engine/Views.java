package views_engine;

import java.util.ArrayList;

import gfx.View;
import views.CombinationView;
import views.HomeView;
import views.PermutationView;
import views.SampleView;

public class Views {
	
	public static ArrayList<View> views;
	View home_view,
		 sample_view,
		 permutation_view,
		 combination_view;
	
	
	public Views() 
	{
		views = new ArrayList<View>();
		this.init_views();
		this.init_views_buttons();
	}
	
	public void init_views() 
	{
		home_view = new HomeView();
		sample_view = new SampleView();
		permutation_view = new PermutationView();
		combination_view = new CombinationView();
		
		views.add(home_view);
		views.add(sample_view);
		views.add(permutation_view);
		views.add(combination_view);
	}
	
	public void init_views_buttons() 
	{
		for(View view : views)
		{
			view.init_buttons();
		}
	}
	
	public static View get_view_with_id(VIEW_ID id) 
	{
		for(View view : views) 
		{
			if(view.view_id == id) 
			{
				return view;
			}
		}
		return null;
	}

}
