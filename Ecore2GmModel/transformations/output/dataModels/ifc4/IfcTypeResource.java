/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcTypeResource of the Data Model iai.
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
{@link Identification}, 
{@link LongDescription}, 
{@link ResourceType}, 
{@link ResourceOf}, 

* It provides of then following operations (getters and setters)
{@link getIdentification},
{@link getLongDescription},
{@link getResourceType},
{@link getResourceOf},
{@link setIdentification},
{@link setLongDescription},
{@link setResourceType},
{@link setResourceOf},
 */

@Description("")

public interface IfcTypeResource extends GenericEntity, ifc4.IfcTypeObject, ifc4.IfcResourceSelect {

	EntityType<IfcTypeResource> T = EntityTypes.T(IfcTypeResource.class);

	/* Constants for each property name. */
	java.lang.String Identification = "Identification";
	java.lang.String LongDescription = "LongDescription";
	java.lang.String ResourceType = "ResourceType";
	java.lang.String ResourceOf = "ResourceOf";

	@Description("")
	@Mandatory
	java.lang.String getIdentification();
	void setIdentification(java.lang.String Identification);
	@Description("")
	@Mandatory
	java.lang.String getLongDescription();
	void setLongDescription(java.lang.String LongDescription);
	@Description("")
	@Mandatory
	java.lang.String getResourceType();
	void setResourceType(java.lang.String ResourceType);
	@Description("")
	
	java.util.List<ifc4.IfcRelAssignsToResource> getResourceOf();
	void setResourceOf(java.util.List<ifc4.IfcRelAssignsToResource> ResourceOf);

}
