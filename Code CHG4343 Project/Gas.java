import java.util.*;
import java.lang.*;

/*

*/
public class Gas
	{
		//Instance variables
		private double v1; // Gas flow rate at inlet [kg.mol/h]
		private double T; // Temperature [degrees C]
		private double MWV; // Molecular weight [g/mol]
		private double muV; // Viscosity [Pa.s]
		private double rhoV; // Density [kg/m3]
		private double yA1; // Mole fraction in gas phase at inlet [-]
				
		//Constructors
		public Gas (double v1, double T, double muV, double rhoV, double MWV, double yA1, double r)
			{
				this.v1=v1;
				this.T=T:
				this.muV=muV;
				this.rhoV=rhoV;
				this.MWV=MWV;		
				this.yA1=yA1;
				this.r=r;
			}
		public Gas (Gas source)
			{
				this.v1=source.getGasFlowRateInlet();
				this.T=source.getTemperatureGas():
				this.muV=source.getViscosityGas();
				this.rhoV=source.getDensityGas();
				this.MWV=source.getMolecularWeightGas();
				this.yA1=source.getMoleFractionGasInlet();
				this.r=source.getPercentRecoverySolute();
			}
		
		//Accessors
		public double getGasFlowRateInlet()
			{
				return v1;
			}
		public double getTemperatureGas()
			{
				return T;
			}
		public double getMolecularWeightGas()
			{
				return MWV;
			}
		public double getViscosityGas()
			{
				return muV;
			}
		public double getDensityGas()
			{
				return rhoV;
			}
		public double getMoleFractionGasInlet()
			{
				return yA1;
			}
		public double getPercentRecoverySolute()
			{
				return r;
			}
		//Mutators
		public void setGasFlowRateInlet(double v1)
			{
				this.v1=v1;
			}
		public void setTemperatureGas(double T)
			{
				this.T=T;
			}
		public void setMolecularWeightGas(double MWV)
			{
				this.MWV=MWV;
			}
		public void setViscosityGas(double muV)
			{
				this.muV=muV;
			}
		public void setDensityGas(double rhoV)
			{
				this.rhoV=rhoV;
			}
		public void setMoleFractionGasInlet(double yA1)
			{
				this.yA1=yA1;
			}
		public void setPercentRecoverySolute(double r)
			{
				this.r=r;
			}
		//Instance Methods

		/*

		*/
		public double calculateVSoluteFree()
			{
				double v_solute_free; // Solute-free gas flow rate [kg.mol/h]
				v_solute_free= getGasFlowRateInlet() * (1- getMoleFractionGasInlet() );
				return v_solute_free;
			}
		/*

		*/
		public double calculateMassAGas()
			{
				double MassAGasOutlet;
				double MassAGasInlet;
				double MassAGasDiffused;
				MassAGasInlet = (getMoleFractionInlet() * calculateVSoluteFree() )/ (1- getMoleFractionInlet());
				MassAGasDiffused = MassAGasInlet * getPercentRecoverySolute();
				MassAGasOutlet= MassAGasInlet - MassAGasDiffused;
				return MassAGasOutlet;
			}
		/*

		*/			
		public double calculateSoluteMassVelocity()
			{
				double soluteMassVelocity;
				return soluteMassVelocity;
			}
		/*

		*/
		public double calculateSoluteFractionGasOutlet()
			{
				double yA2;
				yA2= calculateMassAGas()/ ( calculateMassAGas() + calculateVSoluteFree() );
				return yA2;
			}
		/*

		*/
		public double calculateGasFlowRateOutlet()
			{
				double v2; // Gas flow rate at outlet [kg.mol/h]
				return v2;
			}
		/*

		*/
		public double calculateConcentrationGasInterface()
			{
				double yiM; // Concentration of gas at interface [-]
				return yiM;
			}
		/*

		*/
		public double calculateMassFlux()
			{
				double G; // Mass flux [kg/s.m2] 
				return G;
			}	
	}