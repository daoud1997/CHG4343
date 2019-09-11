import java.util.*;
import java.lang.*;

/*

*/
public class AbsorptionSystem
	{
		//Instance variables
		private Liquid liquid;
		private Gas gas;
		private Solute solute;
		private double D_AB_V; // Diffusion coefficient of A in B in gas phase [m2/s]
		private double D_AB_L; // Diffusion coefficient of A in B in liquid phase [m2/s]

		//Constructors
		public AbsorptionSystem (Liquid liquid, Gas gas, Solute solute, double D_AB_V, double D_AB_L)
			{
				this.liquid = new Liquid (liquid);
				this.gas= new Gas (gas);
				this.source = new Solute (solute);
				this.D_AB_V=D_AB_V;
				this.D_AB_L=D_AB_L;
			}
		public AbsorptionSystem (AbsorptionSystem source)
			{
				this.liquid = new Liquid (source.liquid);
				this.gas= new Gas (source.gas);
				this.solute= new Solute (source.solute);
				this.D_AB_V=source.D_AB_V;
				this.D_AB_L=source.D_AB_L;
			}
		
		//Accessors
		public Liquid getLiquid ()
			{
				return liquid;
			}
		public Gas getGas()
			{
				return gas;
			}
		public Solute getSolute()
			{
				return solute;
			}
		public double getDiffusionCoefficientGas()
			{
				return D_AB_V;
			}
		public double getDiffusionCoefficientLiquid()
			{
				return D_AB_L;
			}
		//Mutators
		public void setLiquid (Liquid liquid)
			{
				this.liquid = new Liquid (liquid);
			}
		public void setGas(Gas gas)
			{
				this.gas = new Gas (gas);
			}
		public void setSolute(Solute solute)
			{
				this.solute = new Solute (solute);
			}
		public void setDiffusionCoefficientGas(double D_AB_V)
			{
				this.D_AB_V=D_AB_V;
			}
		public void setDiffusionCoefficientLiquid(double D_AB_L)
			{
				this.D_AB_L=D_AB_L;
			}
		//Instance Methods
		/*

		*/
		public double calculateSchmidtGas()
			{
				double N_Sc_V; // Schmidt number for the gas phase [-]
				N_Sc_V = gas.getViscosityGas() / ( gas.getDensityGas() * D_AB_V);
				return N_Sc_V;
			}
		/*

		*/
		public double calculateSchmidtLiquid()
			{
				double N_Sc_L; // Schmidt number for the liquid phase [-]
				N_Sc_L = liquid.getViscosityLiquid() / (liquid.getViscosityLiquid() * D_AB_L);
				return N_Sc_L;
			}
	}