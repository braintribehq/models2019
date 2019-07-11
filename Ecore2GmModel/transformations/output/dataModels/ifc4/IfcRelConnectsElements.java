/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcRelConnectsElements of the Data Model iai.
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
{@link ConnectionGeometry}, 
{@link RelatingElement}, 
{@link RelatedElement}, 

* It provides of then following operations (getters and setters)
{@link getConnectionGeometry},
{@link getRelatingElement},
{@link getRelatedElement},
{@link setConnectionGeometry},
{@link setRelatingElement},
{@link setRelatedElement},
 */

@Description("")

public interface IfcRelConnectsElements extends GenericEntity, ifc4.IfcRelConnects {

	EntityType<IfcRelConnectsElements> T = EntityTypes.T(IfcRelConnectsElements.class);

	/* Constants for each property name. */
	java.lang.String ConnectionGeometry = "ConnectionGeometry";
	java.lang.String RelatingElement = "RelatingElement";
	java.lang.String RelatedElement = "RelatedElement";

	@Description("")
	@Mandatory
	ifc4.IfcConnectionGeometry getConnectionGeometry();
	void setConnectionGeometry(ifc4.IfcConnectionGeometry ConnectionGeometry);
	@Description("")
	@Mandatory
	ifc4.IfcElement getRelatingElement();
	void setRelatingElement(ifc4.IfcElement RelatingElement);
	@Description("")
	@Mandatory
	ifc4.IfcElement getRelatedElement();
	void setRelatedElement(ifc4.IfcElement RelatedElement);
}
