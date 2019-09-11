import java.util.*;
import java.lang.*;

/*

*/
public class Solute
	{
		//Instance variables
		private double r; // Percent recovery of solute [%]
		private double MWA; // Molecular weight [g/mol]
		
		//Constructors
		public Solute (double MWA)
			{
				this.MWA=MWA;	
			}
		public Solute (Solute source)
			{
				this.MWA=source.getMolecularWeightSolute();
			}
		//Accessors
		public double getMolecularWeightSolute()
			{
				return MWA;
			}
		//Mutators
		public void setMolecularWeightSolute(double MWA)
			{
				this.MWA=MWA;
			}
		//Instance Methods
		/*

		*/
		public double calculateBulkConcentrationGas()
			{
				double yAG; // Bulk concentration of A in gas phase [-]
				return yAG;
			}
		/*

		*/
		public double calculateBulkConcentrationLiquid()
			{
				double xAL; // Bulk concentration of A in liquid phase [-]
				return xAL;
			}	
		/*

		*/	
		public double calculateMassFlux()
			{
				double G; // Mass flux [kg/s.m2]
				return G;
			}				
	}