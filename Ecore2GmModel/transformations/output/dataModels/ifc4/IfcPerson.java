/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcPerson of the Data Model iai.
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
{@link FamilyName}, 
{@link GivenName}, 
{@link MiddleNames}, 
{@link PrefixTitles}, 
{@link SuffixTitles}, 
{@link Roles}, 
{@link Addresses}, 
{@link EngagedIn}, 

* It provides of then following operations (getters and setters)
{@link getIdentification},
{@link getFamilyName},
{@link getGivenName},
{@link getMiddleNames},
{@link getPrefixTitles},
{@link getSuffixTitles},
{@link getRoles},
{@link getAddresses},
{@link getEngagedIn},
{@link setIdentification},
{@link setFamilyName},
{@link setGivenName},
{@link setMiddleNames},
{@link setPrefixTitles},
{@link setSuffixTitles},
{@link setRoles},
{@link setAddresses},
{@link setEngagedIn},
 */

@Description("")

public interface IfcPerson extends GenericEntity, ifc4.IfcActorSelect, ifc4.IfcObjectReferenceSelect, ifc4.IfcResourceObjectSelect {

	EntityType<IfcPerson> T = EntityTypes.T(IfcPerson.class);

	/* Constants for each property name. */
	java.lang.String Identification = "Identification";
	java.lang.String FamilyName = "FamilyName";
	java.lang.String GivenName = "GivenName";
	java.lang.String MiddleNames = "MiddleNames";
	java.lang.String PrefixTitles = "PrefixTitles";
	java.lang.String SuffixTitles = "SuffixTitles";
	java.lang.String Roles = "Roles";
	java.lang.String Addresses = "Addresses";
	java.lang.String EngagedIn = "EngagedIn";

	@Description("")
	@Mandatory
	java.lang.String getIdentification();
	void setIdentification(java.lang.String Identification);
	@Description("")
	@Mandatory
	java.lang.String getFamilyName();
	void setFamilyName(java.lang.String FamilyName);
	@Description("")
	@Mandatory
	java.lang.String getGivenName();
	void setGivenName(java.lang.String GivenName);
	@Description("")
	
	java.util.List<java.lang.String> getMiddleNames();
	void setMiddleNames(java.util.List<java.lang.String> MiddleNames);

	@Description("")
	
	java.util.List<java.lang.String> getPrefixTitles();
	void setPrefixTitles(java.util.List<java.lang.String> PrefixTitles);

	@Description("")
	
	java.util.List<java.lang.String> getSuffixTitles();
	void setSuffixTitles(java.util.List<java.lang.String> SuffixTitles);

	@Description("")
	
	java.util.List<ifc4.IfcActorRole> getRoles();
	void setRoles(java.util.List<ifc4.IfcActorRole> Roles);

	@Description("")
	
	java.util.List<ifc4.IfcAddress> getAddresses();
	void setAddresses(java.util.List<ifc4.IfcAddress> Addresses);

	@Description("")
	
	java.util.List<ifc4.IfcPersonAndOrganization> getEngagedIn();
	void setEngagedIn(java.util.List<ifc4.IfcPersonAndOrganization> EngagedIn);

}
