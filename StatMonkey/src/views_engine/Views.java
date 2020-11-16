package views_engine;

import java.util.ArrayList;

import gfx.View;
import views.BinaryAnalysisView;
import views.BinaryCDFView;
import views.BinaryPMFView;
import views.CombinationView;
import views.HomeView;
import views.PermutationView;
import views.PoissonCDFView;
import views.PoissonPDFprobView;
import views.SampleView;

public class Views {
	
	public static ArrayList<View> views;
	View home_view,
		 sample_view,
		 permutation_view,
		 combination_view,
		 binary_pmf_view,
		 binary_cdf_view,
		 binary_analysis_view,
		 poisson_pdf_view,
		 poisson_cdf_view;
	
	
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
		binary_pmf_view = new BinaryPMFView();
		binary_cdf_view = new BinaryCDFView();
		binary_analysis_view = new BinaryAnalysisView();
		poisson_pdf_view = new PoissonPDFprobView();
		poisson_cdf_view = new PoissonCDFView();
		
		views.add(home_view);
		views.add(sample_view);
		views.add(permutation_view);
		views.add(combination_view);
		views.add(binary_pmf_view);
		views.add(binary_cdf_view);
		views.add(binary_analysis_view);
		views.add(poisson_pdf_view);
		views.add(poisson_cdf_view);
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
