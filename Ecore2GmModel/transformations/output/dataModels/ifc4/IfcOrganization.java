/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcOrganization of the Data Model iai.
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
{@link Name}, 
{@link Description}, 
{@link Roles}, 
{@link Addresses}, 
{@link IsRelatedBy}, 
{@link Relates}, 
{@link Engages}, 

* It provides of then following operations (getters and setters)
{@link getIdentification},
{@link getName},
{@link getDescription},
{@link getRoles},
{@link getAddresses},
{@link getIsRelatedBy},
{@link getRelates},
{@link getEngages},
{@link setIdentification},
{@link setName},
{@link setDescription},
{@link setRoles},
{@link setAddresses},
{@link setIsRelatedBy},
{@link setRelates},
{@link setEngages},
 */

@Description("")

public interface IfcOrganization extends GenericEntity, ifc4.IfcActorSelect, ifc4.IfcObjectReferenceSelect, ifc4.IfcResourceObjectSelect {

	EntityType<IfcOrganization> T = EntityTypes.T(IfcOrganization.class);

	/* Constants for each property name. */
	java.lang.String Identification = "Identification";
	java.lang.String Name = "Name";
	java.lang.String Description = "Description";
	java.lang.String Roles = "Roles";
	java.lang.String Addresses = "Addresses";
	java.lang.String IsRelatedBy = "IsRelatedBy";
	java.lang.String Relates = "Relates";
	java.lang.String Engages = "Engages";

	@Description("")
	@Mandatory
	java.lang.String getIdentification();
	void setIdentification(java.lang.String Identification);
	@Description("")
	@Mandatory
	java.lang.String getName();
	void setName(java.lang.String Name);
	@Description("")
	@Mandatory
	java.lang.String getDescription();
	void setDescription(java.lang.String Description);
	@Description("")
	
	java.util.List<ifc4.IfcActorRole> getRoles();
	void setRoles(java.util.List<ifc4.IfcActorRole> Roles);

	@Description("")
	
	java.util.List<ifc4.IfcAddress> getAddresses();
	void setAddresses(java.util.List<ifc4.IfcAddress> Addresses);

	@Description("")
	
	java.util.List<ifc4.IfcOrganizationRelationship> getIsRelatedBy();
	void setIsRelatedBy(java.util.List<ifc4.IfcOrganizationRelationship> IsRelatedBy);

	@Description("")
	
	java.util.List<ifc4.IfcOrganizationRelationship> getRelates();
	void setRelates(java.util.List<ifc4.IfcOrganizationRelationship> Relates);

	@Description("")
	
	java.util.List<ifc4.IfcPersonAndOrganization> getEngages();
	void setEngages(java.util.List<ifc4.IfcPersonAndOrganization> Engages);

}
