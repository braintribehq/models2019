/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcAddress of the Data Model iai.
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
{@link Purpose}, 
{@link Description}, 
{@link UserDefinedPurpose}, 
{@link OfPerson}, 
{@link OfOrganization}, 

* It provides of then following operations (getters and setters)
{@link getPurpose},
{@link getDescription},
{@link getUserDefinedPurpose},
{@link getOfPerson},
{@link getOfOrganization},
{@link setPurpose},
{@link setDescription},
{@link setUserDefinedPurpose},
{@link setOfPerson},
{@link setOfOrganization},
 */

@Description("")

public interface IfcAddress extends GenericEntity, ifc4.IfcObjectReferenceSelect {

	EntityType<IfcAddress> T = EntityTypes.T(IfcAddress.class);

	/* Constants for each property name. */
	java.lang.String Purpose = "Purpose";
	java.lang.String Description = "Description";
	java.lang.String UserDefinedPurpose = "UserDefinedPurpose";
	java.lang.String OfPerson = "OfPerson";
	java.lang.String OfOrganization = "OfOrganization";

	@Description("")
	@Mandatory
	ifc4.IfcAddressTypeEnum getPurpose();
	void setPurpose(ifc4.IfcAddressTypeEnum Purpose);
	@Description("")
	@Mandatory
	java.lang.String getDescription();
	void setDescription(java.lang.String Description);
	@Description("")
	@Mandatory
	java.lang.String getUserDefinedPurpose();
	void setUserDefinedPurpose(java.lang.String UserDefinedPurpose);
	@Description("")
	
	java.util.List<ifc4.IfcPerson> getOfPerson();
	void setOfPerson(java.util.List<ifc4.IfcPerson> OfPerson);

	@Description("")
	
	java.util.List<ifc4.IfcOrganization> getOfOrganization();
	void setOfOrganization(java.util.List<ifc4.IfcOrganization> OfOrganization);

}
