package edu.rice.cs.hpc.traceviewer.main;

import org.eclipse.swt.graphics.Color;

import edu.rice.cs.hpc.traceviewer.data.db.BaseDataVisualization;

public class DetailDataVisualization
	extends BaseDataVisualization {

	final public int sample_counts;
	
	public DetailDataVisualization(int x_start, int x_end, int depth, Color color, int sample_counts) 
	{
		super(x_start, x_end, depth, color);
		this.sample_counts = sample_counts;
	}
	
	/*
	 * (non-Javadoc)
	 * @see edu.rice.cs.hpc.traceviewer.data.db.BaseDataVisualization#toString()
	 */
	public String toString() {
		return super.toString() + " s: " + sample_counts;
	}
}
