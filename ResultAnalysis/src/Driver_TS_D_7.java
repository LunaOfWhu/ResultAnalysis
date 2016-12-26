

import tsafe_jpf.AssumptionException;
import tsafe_jpf.data.FlightTrack;
import tsafe_jpf.data.Trajectory;
import tsafe_jpf.engine.TrajectorySynthesizer;

/**
 * Driver for TS_D_1 property.
 * 
 * @author Pietro Braione
 *
 */
public class Driver_TS_D_7 {
	private double doubleNum = 0.0;
	
	public void TS_D_7(double val1,double val2) {

		if(val1+val2==0.0){
			System.out.println("val1 equals zero");
		}
		
		if(val2>0.0){
			System.out.println("val2 greater than zero");
		}
		
	
	}

	public static void main(String[] args) {
		Driver_TS_D_7 num = new Driver_TS_D_7();
		num.TS_D_7(1.0,2.0);
		System.out.print("ONE IS DONE");
	}
}
