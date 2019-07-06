/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Organization of the Data Model fhir.
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
{@link identifier}, 
{@link type}, 
{@link telecom}, 
{@link address}, 
{@link partOf}, 
{@link contact}, 
{@link endpoint}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getType},
{@link getTelecom},
{@link getAddress},
{@link getPartOf},
{@link getContact},
{@link getEndpoint},
{@link setIdentifier},
{@link setType},
{@link setTelecom},
{@link setAddress},
{@link setPartOf},
{@link setContact},
{@link setEndpoint},
 */

@Description("A formally or informally recognized grouping of people or organizations formed for the purpose of achieving some form of collective action.  Includes companies, institutions, corporations, departments, community groups, healthcare practice groups, payer/insurer, etc.If the element is present, it must have either a @value, an @id, or extensions")

public interface Organization extends GenericEntity, fhir.FhirDomainResource {

	EntityType<Organization> T = EntityTypes.T(Organization.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String type = "type";
	java.lang.String telecom = "telecom";
	java.lang.String address = "address";
	java.lang.String partOf = "partOf";
	java.lang.String contact = "contact";
	java.lang.String endpoint = "endpoint";

	@Description("Identifier for the organization that is used to identify the organization across multiple disparate systems.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("The kind(s) of organization that this is.")
	
	java.util.List<fhir.CodeableConcept> getType();
	void setType(java.util.List<fhir.CodeableConcept> type);

	@Description("A contact detail for the organization.")
	
	java.util.List<fhir.ContactPoint> getTelecom();
	void setTelecom(java.util.List<fhir.ContactPoint> telecom);

	@Description("An address for the organization.")
	
	java.util.List<fhir.Address> getAddress();
	void setAddress(java.util.List<fhir.Address> address);

	@Description("The organization of which this organization forms a part.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getPartOf();
	void setPartOf(com.braintribe.model.generic.GenericEntity partOf);
	@Description("Contact for the organization for a certain purpose.")
	
	java.util.List<fhir.OrganizationContact> getContact();
	void setContact(java.util.List<fhir.OrganizationContact> contact);

	@Description("Technical endpoints providing access to services operated for the organization.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getEndpoint();
	void setEndpoint(java.util.List<com.braintribe.model.generic.GenericEntity> endpoint);

}
