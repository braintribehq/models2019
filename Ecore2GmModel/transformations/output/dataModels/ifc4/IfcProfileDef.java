/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcProfileDef of the Data Model iai.
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
{@link ProfileType}, 
{@link ProfileName}, 
{@link HasExternalReference}, 
{@link HasProperties}, 

* It provides of then following operations (getters and setters)
{@link getProfileType},
{@link getProfileName},
{@link getHasExternalReference},
{@link getHasProperties},
{@link setProfileType},
{@link setProfileName},
{@link setHasExternalReference},
{@link setHasProperties},
 */

@Description("")

public interface IfcProfileDef extends GenericEntity, ifc4.IfcResourceObjectSelect {

	EntityType<IfcProfileDef> T = EntityTypes.T(IfcProfileDef.class);

	/* Constants for each property name. */
	java.lang.String ProfileType = "ProfileType";
	java.lang.String ProfileName = "ProfileName";
	java.lang.String HasExternalReference = "HasExternalReference";
	java.lang.String HasProperties = "HasProperties";

	@Description("")
	@Mandatory
	ifc4.IfcProfileTypeEnum getProfileType();
	void setProfileType(ifc4.IfcProfileTypeEnum ProfileType);
	@Description("")
	@Mandatory
	java.lang.String getProfileName();
	void setProfileName(java.lang.String ProfileName);
	@Description("")
	
	java.util.List<ifc4.IfcExternalReferenceRelationship> getHasExternalReference();
	void setHasExternalReference(java.util.List<ifc4.IfcExternalReferenceRelationship> HasExternalReference);

	@Description("")
	
	java.util.List<ifc4.IfcProfileProperties> getHasProperties();
	void setHasProperties(java.util.List<ifc4.IfcProfileProperties> HasProperties);

}
