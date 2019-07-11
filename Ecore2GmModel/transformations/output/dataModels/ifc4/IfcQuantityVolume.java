/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcQuantityVolume of the Data Model iai.
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
{@link VolumeValue}, 
{@link VolumeValueAsString}, 
{@link Formula}, 

* It provides of then following operations (getters and setters)
{@link getVolumeValue},
{@link getVolumeValueAsString},
{@link getFormula},
{@link setVolumeValue},
{@link setVolumeValueAsString},
{@link setFormula},
 */

@Description("")

public interface IfcQuantityVolume extends GenericEntity, ifc4.IfcPhysicalSimpleQuantity {

	EntityType<IfcQuantityVolume> T = EntityTypes.T(IfcQuantityVolume.class);

	/* Constants for each property name. */
	java.lang.String VolumeValue = "VolumeValue";
	java.lang.String VolumeValueAsString = "VolumeValueAsString";
	java.lang.String Formula = "Formula";

	@Description("")
	@Mandatory
	java.lang.Double getVolumeValue();
	void setVolumeValue(java.lang.Double VolumeValue);
	@Description("")
	@Mandatory
	java.lang.String getVolumeValueAsString();
	void setVolumeValueAsString(java.lang.String VolumeValueAsString);
	@Description("")
	@Mandatory
	java.lang.String getFormula();
	void setFormula(java.lang.String Formula);
}
