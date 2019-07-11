/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcDistributionPort of the Data Model iai.
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
{@link FlowDirection}, 
{@link PredefinedType}, 
{@link SystemType}, 

* It provides of then following operations (getters and setters)
{@link getFlowDirection},
{@link getPredefinedType},
{@link getSystemType},
{@link setFlowDirection},
{@link setPredefinedType},
{@link setSystemType},
 */

@Description("")

public interface IfcDistributionPort extends GenericEntity, ifc4.IfcPort {

	EntityType<IfcDistributionPort> T = EntityTypes.T(IfcDistributionPort.class);

	/* Constants for each property name. */
	java.lang.String FlowDirection = "FlowDirection";
	java.lang.String PredefinedType = "PredefinedType";
	java.lang.String SystemType = "SystemType";

	@Description("")
	@Mandatory
	ifc4.IfcFlowDirectionEnum getFlowDirection();
	void setFlowDirection(ifc4.IfcFlowDirectionEnum FlowDirection);
	@Description("")
	@Mandatory
	ifc4.IfcDistributionPortTypeEnum getPredefinedType();
	void setPredefinedType(ifc4.IfcDistributionPortTypeEnum PredefinedType);
	@Description("")
	@Mandatory
	ifc4.IfcDistributionSystemEnum getSystemType();
	void setSystemType(ifc4.IfcDistributionSystemEnum SystemType);
}
