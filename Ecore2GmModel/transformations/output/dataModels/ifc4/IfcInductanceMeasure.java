/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcInductanceMeasure of the Data Model iai.
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
{@link wrappedValue}, 
{@link wrappedValueAsString}, 

* It provides of then following operations (getters and setters)
{@link getWrappedValue},
{@link getWrappedValueAsString},
{@link setWrappedValue},
{@link setWrappedValueAsString},
 */

@Description("")

public interface IfcInductanceMeasure extends GenericEntity, ifc4.IfcDerivedMeasureValue {

	EntityType<IfcInductanceMeasure> T = EntityTypes.T(IfcInductanceMeasure.class);

	/* Constants for each property name. */
	java.lang.String wrappedValue = "wrappedValue";
	java.lang.String wrappedValueAsString = "wrappedValueAsString";

	@Description("")
	@Mandatory
	java.lang.Double getWrappedValue();
	void setWrappedValue(java.lang.Double wrappedValue);
	@Description("")
	@Mandatory
	java.lang.String getWrappedValueAsString();
	void setWrappedValueAsString(java.lang.String wrappedValueAsString);
}
