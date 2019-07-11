/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcElementQuantity of the Data Model iai.
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
{@link MethodOfMeasurement}, 
{@link Quantities}, 

* It provides of then following operations (getters and setters)
{@link getMethodOfMeasurement},
{@link getQuantities},
{@link setMethodOfMeasurement},
{@link setQuantities},
 */

@Description("")

public interface IfcElementQuantity extends GenericEntity, ifc4.IfcQuantitySet {

	EntityType<IfcElementQuantity> T = EntityTypes.T(IfcElementQuantity.class);

	/* Constants for each property name. */
	java.lang.String MethodOfMeasurement = "MethodOfMeasurement";
	java.lang.String Quantities = "Quantities";

	@Description("")
	@Mandatory
	java.lang.String getMethodOfMeasurement();
	void setMethodOfMeasurement(java.lang.String MethodOfMeasurement);
	@Description("")
	
	java.util.List<ifc4.IfcPhysicalQuantity> getQuantities();
	void setQuantities(java.util.List<ifc4.IfcPhysicalQuantity> Quantities);

}
