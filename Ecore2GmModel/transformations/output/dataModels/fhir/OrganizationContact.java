/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type OrganizationContact of the Data Model fhir.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package fhir;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link purpose}, 
{@link name}, 
{@link telecom}, 
{@link address}, 

* It provides of then following operations (getters and setters)
{@link getPurpose},
{@link getName},
{@link getTelecom},
{@link getAddress},
{@link setPurpose},
{@link setName},
{@link setTelecom},
{@link setAddress},
 */

@Description("A formally or informally recognized grouping of people or organizations formed for the purpose of achieving some form of collective action.  Includes companies, institutions, corporations, departments, community groups, healthcare practice groups, payer/insurer, etc.")

public interface OrganizationContact extends GenericEntity, fhir.BackboneElement {

	EntityType<OrganizationContact> T = EntityTypes.T(OrganizationContact.class);

	/* Constants for each property name. */
	java.lang.String purpose = "purpose";
	java.lang.String name = "name";
	java.lang.String telecom = "telecom";
	java.lang.String address = "address";

	@Description("Indicates a purpose for which the contact can be reached.")
	@Mandatory
	fhir.CodeableConcept getPurpose();
	void setPurpose(fhir.CodeableConcept purpose);
	@Description("A name associated with the contact.")
	@Mandatory
	fhir.HumanName getName();
	void setName(fhir.HumanName name);
	@Description("A contact detail (e.g. a telephone number or an email address) by which the party may be contacted.")
	
	java.util.List<fhir.ContactPoint> getTelecom();
	void setTelecom(java.util.List<fhir.ContactPoint> telecom);

	@Description("Visiting or postal addresses for the contact.")
	@Mandatory
	fhir.Address getAddress();
	void setAddress(fhir.Address address);
}
