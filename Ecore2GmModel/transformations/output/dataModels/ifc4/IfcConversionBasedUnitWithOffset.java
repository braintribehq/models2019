/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcConversionBasedUnitWithOffset of the Data Model iai.
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
{@link ConversionOffset}, 
{@link ConversionOffsetAsString}, 

* It provides of then following operations (getters and setters)
{@link getConversionOffset},
{@link getConversionOffsetAsString},
{@link setConversionOffset},
{@link setConversionOffsetAsString},
 */

@Description("")

public interface IfcConversionBasedUnitWithOffset extends GenericEntity, ifc4.IfcConversionBasedUnit {

	EntityType<IfcConversionBasedUnitWithOffset> T = EntityTypes.T(IfcConversionBasedUnitWithOffset.class);

	/* Constants for each property name. */
	java.lang.String ConversionOffset = "ConversionOffset";
	java.lang.String ConversionOffsetAsString = "ConversionOffsetAsString";

	@Description("")
	@Mandatory
	java.lang.Double getConversionOffset();
	void setConversionOffset(java.lang.Double ConversionOffset);
	@Description("")
	@Mandatory
	java.lang.String getConversionOffsetAsString();
	void setConversionOffsetAsString(java.lang.String ConversionOffsetAsString);
}
