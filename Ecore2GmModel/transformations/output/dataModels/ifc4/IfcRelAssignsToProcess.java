/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcRelAssignsToProcess of the Data Model iai.
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
{@link RelatingProcess}, 
{@link QuantityInProcess}, 

* It provides of then following operations (getters and setters)
{@link getRelatingProcess},
{@link getQuantityInProcess},
{@link setRelatingProcess},
{@link setQuantityInProcess},
 */

@Description("")

public interface IfcRelAssignsToProcess extends GenericEntity, ifc4.IfcRelAssigns {

	EntityType<IfcRelAssignsToProcess> T = EntityTypes.T(IfcRelAssignsToProcess.class);

	/* Constants for each property name. */
	java.lang.String RelatingProcess = "RelatingProcess";
	java.lang.String QuantityInProcess = "QuantityInProcess";

	@Description("")
	@Mandatory
	ifc4.IfcProcessSelect getRelatingProcess();
	void setRelatingProcess(ifc4.IfcProcessSelect RelatingProcess);
	@Description("")
	@Mandatory
	ifc4.IfcMeasureWithUnit getQuantityInProcess();
	void setQuantityInProcess(ifc4.IfcMeasureWithUnit QuantityInProcess);
}
