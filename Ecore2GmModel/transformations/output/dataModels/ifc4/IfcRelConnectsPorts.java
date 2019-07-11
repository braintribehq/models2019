/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcRelConnectsPorts of the Data Model iai.
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
{@link RelatingPort}, 
{@link RelatedPort}, 
{@link RealizingElement}, 

* It provides of then following operations (getters and setters)
{@link getRelatingPort},
{@link getRelatedPort},
{@link getRealizingElement},
{@link setRelatingPort},
{@link setRelatedPort},
{@link setRealizingElement},
 */

@Description("")

public interface IfcRelConnectsPorts extends GenericEntity, ifc4.IfcRelConnects {

	EntityType<IfcRelConnectsPorts> T = EntityTypes.T(IfcRelConnectsPorts.class);

	/* Constants for each property name. */
	java.lang.String RelatingPort = "RelatingPort";
	java.lang.String RelatedPort = "RelatedPort";
	java.lang.String RealizingElement = "RealizingElement";

	@Description("")
	@Mandatory
	ifc4.IfcPort getRelatingPort();
	void setRelatingPort(ifc4.IfcPort RelatingPort);
	@Description("")
	@Mandatory
	ifc4.IfcPort getRelatedPort();
	void setRelatedPort(ifc4.IfcPort RelatedPort);
	@Description("")
	@Mandatory
	ifc4.IfcElement getRealizingElement();
	void setRealizingElement(ifc4.IfcElement RealizingElement);
}
