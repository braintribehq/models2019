/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcRelFlowControlElements of the Data Model iai.
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
{@link RelatedControlElements}, 
{@link RelatingFlowElement}, 

* It provides of then following operations (getters and setters)
{@link getRelatedControlElements},
{@link getRelatingFlowElement},
{@link setRelatedControlElements},
{@link setRelatingFlowElement},
 */

@Description("")

public interface IfcRelFlowControlElements extends GenericEntity, ifc4.IfcRelConnects {

	EntityType<IfcRelFlowControlElements> T = EntityTypes.T(IfcRelFlowControlElements.class);

	/* Constants for each property name. */
	java.lang.String RelatedControlElements = "RelatedControlElements";
	java.lang.String RelatingFlowElement = "RelatingFlowElement";

	@Description("")
	
	java.util.List<ifc4.IfcDistributionControlElement> getRelatedControlElements();
	void setRelatedControlElements(java.util.List<ifc4.IfcDistributionControlElement> RelatedControlElements);

	@Description("")
	@Mandatory
	ifc4.IfcDistributionFlowElement getRelatingFlowElement();
	void setRelatingFlowElement(ifc4.IfcDistributionFlowElement RelatingFlowElement);
}
