import java.util.*;
import java.lang.*;

/*

*/
public class Liquid
	{
		//Instance variables
		private double l2; // Liquid flow rate at inlet [kg.mol/h]
		private double T; // Temperature [degrees C]
		private double MWL; // Molecular weight [g/mol]
		private double muL; // Viscosity [Pa.s]
		private double rhoL; // Density [kg/m3]
		private double xA2; // Mole fraction in liquid phase at inlet [-]
		
		//Constructors
		public Liquid (double l2, double T, double muL, double rhoL, double MWL, double xA2)
			{			
				this.l2=l2;
				this.T=T;
				this.muL=muL;
				this.rhoL=rhoL;
				this.MWL=MWL;	
				this.xA2=zA2;
			}
		
		public Liquid (Liquid source)
			{	
				this.l2=source.getLiquidFlowRateInlet();
				this.T=source.getTemperatureLiquid();
				this.muL=source.getViscosityLiquid();
				this.rhoL=source.getDensityLiquid();
				this.MWL=source.getMolecularWeightLiquid();
				this.xA2=source.getMoleFractionLiquidInlet();
			}
		//Accessors
		public double getLiquidFlowRateInlet()
			{
				return l2;
			}
		public double getTemperatureLiquid()
			{
				return T;
			}
		public double getMolecularWeightLiquid()
			{
				return MWL;
			}
		public double getViscosityLiquid()
			{
				return muL;
			}
		public double getDensityLiquid()
			{
				return rhoL;
			}
		public double getMoleFractionLiquidInlet()
			{
				return xA2;
			}
		//Mutators
		public void setLiquidFlowRateInlet(double l2)
			{
				this.l2=l2;
			}
		public void setTemperatureLiquid(double T)
			{
				this.T=T;
			}
		public void setMolecularWeightLiquid(double MWL)
			{
				this.MWL=MWL;
			}
		public void setViscosityLiquid(double muL)
			{
				this.muL=muL;
			}
		public void setDensityLiquid(double rhoL)
			{
				this.rhoL=rhoL;
			}
		public void setMoleFractionLiquidInlet(double xA2)
			{
				this.xA2=xA2;
			}
		//Instance Methods
		/*

		*/
		public double calculateLSoluteFree()
			{
				double l_solute_free; //Solute-free gas flow rate [kg.mol/h]
				l_solute_free =  getLiquidFlowRateInlet()* (1 - getMoleFractionLiquidInlet() );
				return l_solute_free;
			}
		/*

		*/
		public double calculateLiquidFlowRateOutlet()
			{
				double l1; // Liquid flow rate at outlet [kg.mol/h]
				return l1;
			}
		/*

		*/
		public double calculateSoluteFractionLiquidOutlet()
			{
				double xA1; //Solute fraction in liquid at the outlet [-]
				return xA1;
			}
		/*

		*/
		public double calculateConcentrationLiquidInterface()
			{
				double xiM; // Concentration of liquid at interface (-) 
				return xiM;
			}
		/*

		*/
		public double calculateMassFlux()
			{
				double G; // Mass flux [kg/s.m2] 
				return G;
			}
	}