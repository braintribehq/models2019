/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcLagTime of the Data Model iai.
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
{@link LagValue}, 
{@link DurationType}, 

* It provides of then following operations (getters and setters)
{@link getLagValue},
{@link getDurationType},
{@link setLagValue},
{@link setDurationType},
 */

@Description("")

public interface IfcLagTime extends GenericEntity, ifc4.IfcSchedulingTime {

	EntityType<IfcLagTime> T = EntityTypes.T(IfcLagTime.class);

	/* Constants for each property name. */
	java.lang.String LagValue = "LagValue";
	java.lang.String DurationType = "DurationType";

	@Description("")
	@Mandatory
	ifc4.IfcTimeOrRatioSelect getLagValue();
	void setLagValue(ifc4.IfcTimeOrRatioSelect LagValue);
	@Description("")
	@Mandatory
	ifc4.IfcTaskDurationEnum getDurationType();
	void setDurationType(ifc4.IfcTaskDurationEnum DurationType);
}
