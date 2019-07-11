/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcDimensionalExponents of the Data Model iai.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package ifc4;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link LengthExponent}, 
{@link MassExponent}, 
{@link TimeExponent}, 
{@link ElectricCurrentExponent}, 
{@link ThermodynamicTemperatureExponent}, 
{@link AmountOfSubstanceExponent}, 
{@link LuminousIntensityExponent}, 

* It provides of then following operations (getters and setters)
{@link getLengthExponent},
{@link getMassExponent},
{@link getTimeExponent},
{@link getElectricCurrentExponent},
{@link getThermodynamicTemperatureExponent},
{@link getAmountOfSubstanceExponent},
{@link getLuminousIntensityExponent},
{@link setLengthExponent},
{@link setMassExponent},
{@link setTimeExponent},
{@link setElectricCurrentExponent},
{@link setThermodynamicTemperatureExponent},
{@link setAmountOfSubstanceExponent},
{@link setLuminousIntensityExponent},
 */

@Description("")

public interface IfcDimensionalExponents extends GenericEntity {

	EntityType<IfcDimensionalExponents> T = EntityTypes.T(IfcDimensionalExponents.class);

	/* Constants for each property name. */
	java.lang.String LengthExponent = "LengthExponent";
	java.lang.String MassExponent = "MassExponent";
	java.lang.String TimeExponent = "TimeExponent";
	java.lang.String ElectricCurrentExponent = "ElectricCurrentExponent";
	java.lang.String ThermodynamicTemperatureExponent = "ThermodynamicTemperatureExponent";
	java.lang.String AmountOfSubstanceExponent = "AmountOfSubstanceExponent";
	java.lang.String LuminousIntensityExponent = "LuminousIntensityExponent";

	@Description("")
	@Mandatory
	java.lang.Long getLengthExponent();
	void setLengthExponent(java.lang.Long LengthExponent);
	@Description("")
	@Mandatory
	java.lang.Long getMassExponent();
	void setMassExponent(java.lang.Long MassExponent);
	@Description("")
	@Mandatory
	java.lang.Long getTimeExponent();
	void setTimeExponent(java.lang.Long TimeExponent);
	@Description("")
	@Mandatory
	java.lang.Long getElectricCurrentExponent();
	void setElectricCurrentExponent(java.lang.Long ElectricCurrentExponent);
	@Description("")
	@Mandatory
	java.lang.Long getThermodynamicTemperatureExponent();
	void setThermodynamicTemperatureExponent(java.lang.Long ThermodynamicTemperatureExponent);
	@Description("")
	@Mandatory
	java.lang.Long getAmountOfSubstanceExponent();
	void setAmountOfSubstanceExponent(java.lang.Long AmountOfSubstanceExponent);
	@Description("")
	@Mandatory
	java.lang.Long getLuminousIntensityExponent();
	void setLuminousIntensityExponent(java.lang.Long LuminousIntensityExponent);
}
