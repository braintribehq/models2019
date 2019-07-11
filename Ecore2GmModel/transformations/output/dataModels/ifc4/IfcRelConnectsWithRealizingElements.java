/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcRelConnectsWithRealizingElements of the Data Model iai.
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
{@link RealizingElements}, 
{@link ConnectionType}, 

* It provides of then following operations (getters and setters)
{@link getRealizingElements},
{@link getConnectionType},
{@link setRealizingElements},
{@link setConnectionType},
 */

@Description("")

public interface IfcRelConnectsWithRealizingElements extends GenericEntity, ifc4.IfcRelConnectsElements {

	EntityType<IfcRelConnectsWithRealizingElements> T = EntityTypes.T(IfcRelConnectsWithRealizingElements.class);

	/* Constants for each property name. */
	java.lang.String RealizingElements = "RealizingElements";
	java.lang.String ConnectionType = "ConnectionType";

	@Description("")
	
	java.util.List<ifc4.IfcElement> getRealizingElements();
	void setRealizingElements(java.util.List<ifc4.IfcElement> RealizingElements);

	@Description("")
	@Mandatory
	java.lang.String getConnectionType();
	void setConnectionType(java.lang.String ConnectionType);
}
