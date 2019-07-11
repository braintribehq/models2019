/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcPort of the Data Model iai.
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
{@link ContainedIn}, 
{@link ConnectedFrom}, 
{@link ConnectedTo}, 

* It provides of then following operations (getters and setters)
{@link getContainedIn},
{@link getConnectedFrom},
{@link getConnectedTo},
{@link setContainedIn},
{@link setConnectedFrom},
{@link setConnectedTo},
 */

@Description("")

public interface IfcPort extends GenericEntity, ifc4.IfcProduct {

	EntityType<IfcPort> T = EntityTypes.T(IfcPort.class);

	/* Constants for each property name. */
	java.lang.String ContainedIn = "ContainedIn";
	java.lang.String ConnectedFrom = "ConnectedFrom";
	java.lang.String ConnectedTo = "ConnectedTo";

	@Description("")
	@Mandatory
	java.util.List<ifc4.IfcRelConnectsPortToElement> getContainedIn();
	void setContainedIn(java.util.List<ifc4.IfcRelConnectsPortToElement> ContainedIn);

	@Description("")
	@Mandatory
	java.util.List<ifc4.IfcRelConnectsPorts> getConnectedFrom();
	void setConnectedFrom(java.util.List<ifc4.IfcRelConnectsPorts> ConnectedFrom);

	@Description("")
	@Mandatory
	java.util.List<ifc4.IfcRelConnectsPorts> getConnectedTo();
	void setConnectedTo(java.util.List<ifc4.IfcRelConnectsPorts> ConnectedTo);

}
