import java.util.*;
import java.lang.*;

/*

*/
public class RashingRings extends Packing
	{
		public static final int HEURISTIC_DIAMETER_FACTOR = 30;
		
		//Constructors
		public RashingRings (String material, double D_p, double F_p, double f_p, double Ch, double epsilon, double a)
			{
				super(material, D_p, F_p, f_p, Ch, epsilon, a);
			}
		public RashingRings (RashingRings source)
			{
				super(source);				
			}
			
		
		//Accessors

		//Mutators

		//Instance Methods
		
		public abstract RashingRings clone()
			{
				return new RashingRings(this);
			}
	}