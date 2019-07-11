/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcMaterialProfileWithOffsets of the Data Model iai.
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
{@link OffsetValues}, 
{@link OffsetValuesAsString}, 

* It provides of then following operations (getters and setters)
{@link getOffsetValues},
{@link getOffsetValuesAsString},
{@link setOffsetValues},
{@link setOffsetValuesAsString},
 */

@Description("")

public interface IfcMaterialProfileWithOffsets extends GenericEntity, ifc4.IfcMaterialProfile {

	EntityType<IfcMaterialProfileWithOffsets> T = EntityTypes.T(IfcMaterialProfileWithOffsets.class);

	/* Constants for each property name. */
	java.lang.String OffsetValues = "OffsetValues";
	java.lang.String OffsetValuesAsString = "OffsetValuesAsString";

	@Description("")
	
	java.util.List<java.lang.Double> getOffsetValues();
	void setOffsetValues(java.util.List<java.lang.Double> OffsetValues);

	@Description("")
	
	java.util.List<java.lang.String> getOffsetValuesAsString();
	void setOffsetValuesAsString(java.util.List<java.lang.String> OffsetValuesAsString);

}
