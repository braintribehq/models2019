/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcRelInterferesElements of the Data Model iai.
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
{@link RelatingElement}, 
{@link RelatedElement}, 
{@link InterferenceGeometry}, 
{@link InterferenceType}, 
{@link ImpliedOrder}, 

* It provides of then following operations (getters and setters)
{@link getRelatingElement},
{@link getRelatedElement},
{@link getInterferenceGeometry},
{@link getInterferenceType},
{@link getImpliedOrder},
{@link setRelatingElement},
{@link setRelatedElement},
{@link setInterferenceGeometry},
{@link setInterferenceType},
{@link setImpliedOrder},
 */

@Description("")

public interface IfcRelInterferesElements extends GenericEntity, ifc4.IfcRelConnects {

	EntityType<IfcRelInterferesElements> T = EntityTypes.T(IfcRelInterferesElements.class);

	/* Constants for each property name. */
	java.lang.String RelatingElement = "RelatingElement";
	java.lang.String RelatedElement = "RelatedElement";
	java.lang.String InterferenceGeometry = "InterferenceGeometry";
	java.lang.String InterferenceType = "InterferenceType";
	java.lang.String ImpliedOrder = "ImpliedOrder";

	@Description("")
	@Mandatory
	ifc4.IfcElement getRelatingElement();
	void setRelatingElement(ifc4.IfcElement RelatingElement);
	@Description("")
	@Mandatory
	ifc4.IfcElement getRelatedElement();
	void setRelatedElement(ifc4.IfcElement RelatedElement);
	@Description("")
	@Mandatory
	ifc4.IfcConnectionGeometry getInterferenceGeometry();
	void setInterferenceGeometry(ifc4.IfcConnectionGeometry InterferenceGeometry);
	@Description("")
	@Mandatory
	java.lang.String getInterferenceType();
	void setInterferenceType(java.lang.String InterferenceType);
	@Description("")
	@Mandatory
	java.lang.Boolean getImpliedOrder();
	void setImpliedOrder(java.lang.Boolean ImpliedOrder);
}
