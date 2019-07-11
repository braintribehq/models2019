/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcActorRole of the Data Model iai.
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
{@link Role}, 
{@link UserDefinedRole}, 
{@link Description}, 
{@link HasExternalReference}, 

* It provides of then following operations (getters and setters)
{@link getRole},
{@link getUserDefinedRole},
{@link getDescription},
{@link getHasExternalReference},
{@link setRole},
{@link setUserDefinedRole},
{@link setDescription},
{@link setHasExternalReference},
 */

@Description("")

public interface IfcActorRole extends GenericEntity, ifc4.IfcResourceObjectSelect {

	EntityType<IfcActorRole> T = EntityTypes.T(IfcActorRole.class);

	/* Constants for each property name. */
	java.lang.String Role = "Role";
	java.lang.String UserDefinedRole = "UserDefinedRole";
	java.lang.String Description = "Description";
	java.lang.String HasExternalReference = "HasExternalReference";

	@Description("")
	@Mandatory
	ifc4.IfcRoleEnum getRole();
	void setRole(ifc4.IfcRoleEnum Role);
	@Description("")
	@Mandatory
	java.lang.String getUserDefinedRole();
	void setUserDefinedRole(java.lang.String UserDefinedRole);
	@Description("")
	@Mandatory
	java.lang.String getDescription();
	void setDescription(java.lang.String Description);
	@Description("")
	
	java.util.List<ifc4.IfcExternalReferenceRelationship> getHasExternalReference();
	void setHasExternalReference(java.util.List<ifc4.IfcExternalReferenceRelationship> HasExternalReference);

}
