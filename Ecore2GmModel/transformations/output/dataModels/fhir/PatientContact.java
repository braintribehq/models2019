/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type PatientContact of the Data Model fhir.
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
{@link relationship}, 
{@link name}, 
{@link telecom}, 
{@link address}, 
{@link organization}, 
{@link period}, 

* It provides of then following operations (getters and setters)
{@link getRelationship},
{@link getName},
{@link getTelecom},
{@link getAddress},
{@link getOrganization},
{@link getPeriod},
{@link setRelationship},
{@link setName},
{@link setTelecom},
{@link setAddress},
{@link setOrganization},
{@link setPeriod},
 */

@Description("Demographics and other administrative information about an individual or animal receiving care or other health-related services.")

public interface PatientContact extends GenericEntity, fhir.BackboneElement {

	EntityType<PatientContact> T = EntityTypes.T(PatientContact.class);

	/* Constants for each property name. */
	java.lang.String relationship = "relationship";
	java.lang.String name = "name";
	java.lang.String telecom = "telecom";
	java.lang.String address = "address";
	java.lang.String organization = "organization";
	java.lang.String period = "period";

	@Description("The nature of the relationship between the patient and the contact person.")
	
	java.util.List<fhir.CodeableConcept> getRelationship();
	void setRelationship(java.util.List<fhir.CodeableConcept> relationship);

	@Description("A name associated with the contact person.")
	@Mandatory
	fhir.HumanName getName();
	void setName(fhir.HumanName name);
	@Description("A contact detail for the person, e.g. a telephone number or an email address.")
	
	java.util.List<fhir.ContactPoint> getTelecom();
	void setTelecom(java.util.List<fhir.ContactPoint> telecom);

	@Description("Address for the contact person.")
	@Mandatory
	fhir.Address getAddress();
	void setAddress(fhir.Address address);
	@Description("Organization on behalf of which the contact is acting or for which the contact is working.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getOrganization();
	void setOrganization(com.braintribe.model.generic.GenericEntity organization);
	@Description("The period during which this contact person or organization is valid to be contacted relating to this patient.")
	@Mandatory
	fhir.Period getPeriod();
	void setPeriod(fhir.Period period);
}
