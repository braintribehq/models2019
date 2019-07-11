/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcPropertyReferenceValue of the Data Model iai.
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
{@link UsageName}, 
{@link PropertyReference}, 

* It provides of then following operations (getters and setters)
{@link getUsageName},
{@link getPropertyReference},
{@link setUsageName},
{@link setPropertyReference},
 */

@Description("")

public interface IfcPropertyReferenceValue extends GenericEntity, ifc4.IfcSimpleProperty {

	EntityType<IfcPropertyReferenceValue> T = EntityTypes.T(IfcPropertyReferenceValue.class);

	/* Constants for each property name. */
	java.lang.String UsageName = "UsageName";
	java.lang.String PropertyReference = "PropertyReference";

	@Description("")
	@Mandatory
	java.lang.String getUsageName();
	void setUsageName(java.lang.String UsageName);
	@Description("")
	@Mandatory
	ifc4.IfcObjectReferenceSelect getPropertyReference();
	void setPropertyReference(ifc4.IfcObjectReferenceSelect PropertyReference);
}
