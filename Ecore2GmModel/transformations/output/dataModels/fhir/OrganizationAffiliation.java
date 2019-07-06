/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type OrganizationAffiliation of the Data Model fhir.
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
{@link period}, 
{@link organization}, 
{@link participatingOrganization}, 
{@link network}, 
{@link code}, 
{@link specialty}, 
{@link location}, 
{@link healthcareService}, 
{@link telecom}, 
{@link endpoint}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getPeriod},
{@link getOrganization},
{@link getParticipatingOrganization},
{@link getNetwork},
{@link getCode},
{@link getSpecialty},
{@link getLocation},
{@link getHealthcareService},
{@link getTelecom},
{@link getEndpoint},
{@link setIdentifier},
{@link setPeriod},
{@link setOrganization},
{@link setParticipatingOrganization},
{@link setNetwork},
{@link setCode},
{@link setSpecialty},
{@link setLocation},
{@link setHealthcareService},
{@link setTelecom},
{@link setEndpoint},
 */

@Description("Defines an affiliation/assotiation/relationship between 2 distinct oganizations, that is not a part-of relationship/sub-division relationship.If the element is present, it must have either a @value, an @id, or extensions")

public interface OrganizationAffiliation extends GenericEntity, fhir.FhirDomainResource {

	EntityType<OrganizationAffiliation> T = EntityTypes.T(OrganizationAffiliation.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String period = "period";
	java.lang.String organization = "organization";
	java.lang.String participatingOrganization = "participatingOrganization";
	java.lang.String network = "network";
	java.lang.String code = "code";
	java.lang.String specialty = "specialty";
	java.lang.String location = "location";
	java.lang.String healthcareService = "healthcareService";
	java.lang.String telecom = "telecom";
	java.lang.String endpoint = "endpoint";

	@Description("Business identifiers that are specific to this role.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("The period during which the participatingOrganization is affiliated with the primary organization.")
	@Mandatory
	fhir.Period getPeriod();
	void setPeriod(fhir.Period period);
	@Description("Organization where the role is available (primary organization/has members).")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getOrganization();
	void setOrganization(com.braintribe.model.generic.GenericEntity organization);
	@Description("The Participating Organization provides/performs the role(s) defined by the code to the Primary Organization (e.g. providing services or is a member of).")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getParticipatingOrganization();
	void setParticipatingOrganization(com.braintribe.model.generic.GenericEntity participatingOrganization);
	@Description("Health insurance provider network in which the participatingOrganization provides the role's services (if defined) at the indicated locations (if defined).")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getNetwork();
	void setNetwork(java.util.List<com.braintribe.model.generic.GenericEntity> network);

	@Description("Definition of the role the participatingOrganization plays in the association.")
	
	java.util.List<fhir.CodeableConcept> getCode();
	void setCode(java.util.List<fhir.CodeableConcept> code);

	@Description("Specific specialty of the participatingOrganization in the context of the role.")
	
	java.util.List<fhir.CodeableConcept> getSpecialty();
	void setSpecialty(java.util.List<fhir.CodeableConcept> specialty);

	@Description("The location(s) at which the role occurs.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getLocation();
	void setLocation(java.util.List<com.braintribe.model.generic.GenericEntity> location);

	@Description("Healthcare services provided through the role.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getHealthcareService();
	void setHealthcareService(java.util.List<com.braintribe.model.generic.GenericEntity> healthcareService);

	@Description("Contact details at the participatingOrganization relevant to this Affiliation.")
	
	java.util.List<fhir.ContactPoint> getTelecom();
	void setTelecom(java.util.List<fhir.ContactPoint> telecom);

	@Description("Technical endpoints providing access to services operated for this role.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getEndpoint();
	void setEndpoint(java.util.List<com.braintribe.model.generic.GenericEntity> endpoint);

}
