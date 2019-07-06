/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type PractitionerRole of the Data Model fhir.
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
{@link practitioner}, 
{@link organization}, 
{@link code}, 
{@link specialty}, 
{@link location}, 
{@link healthcareService}, 
{@link telecom}, 
{@link availableTime}, 
{@link notAvailable}, 
{@link endpoint}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getPeriod},
{@link getPractitioner},
{@link getOrganization},
{@link getCode},
{@link getSpecialty},
{@link getLocation},
{@link getHealthcareService},
{@link getTelecom},
{@link getAvailableTime},
{@link getNotAvailable},
{@link getEndpoint},
{@link setIdentifier},
{@link setPeriod},
{@link setPractitioner},
{@link setOrganization},
{@link setCode},
{@link setSpecialty},
{@link setLocation},
{@link setHealthcareService},
{@link setTelecom},
{@link setAvailableTime},
{@link setNotAvailable},
{@link setEndpoint},
 */

@Description("A specific set of Roles/Locations/specialties/services that a practitioner may perform at an organization for a period of time.If the element is present, it must have either a @value, an @id, or extensions")

public interface PractitionerRole extends GenericEntity, fhir.FhirDomainResource {

	EntityType<PractitionerRole> T = EntityTypes.T(PractitionerRole.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String period = "period";
	java.lang.String practitioner = "practitioner";
	java.lang.String organization = "organization";
	java.lang.String code = "code";
	java.lang.String specialty = "specialty";
	java.lang.String location = "location";
	java.lang.String healthcareService = "healthcareService";
	java.lang.String telecom = "telecom";
	java.lang.String availableTime = "availableTime";
	java.lang.String notAvailable = "notAvailable";
	java.lang.String endpoint = "endpoint";

	@Description("Business Identifiers that are specific to a role/location.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("The period during which the person is authorized to act as a practitioner in these role(s) for the organization.")
	@Mandatory
	fhir.Period getPeriod();
	void setPeriod(fhir.Period period);
	@Description("Practitioner that is able to provide the defined services for the organization.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getPractitioner();
	void setPractitioner(com.braintribe.model.generic.GenericEntity practitioner);
	@Description("The organization where the Practitioner performs the roles associated.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getOrganization();
	void setOrganization(com.braintribe.model.generic.GenericEntity organization);
	@Description("Roles which this practitioner is authorized to perform for the organization.")
	
	java.util.List<fhir.CodeableConcept> getCode();
	void setCode(java.util.List<fhir.CodeableConcept> code);

	@Description("Specific specialty of the practitioner.")
	
	java.util.List<fhir.CodeableConcept> getSpecialty();
	void setSpecialty(java.util.List<fhir.CodeableConcept> specialty);

	@Description("The location(s) at which this practitioner provides care.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getLocation();
	void setLocation(java.util.List<com.braintribe.model.generic.GenericEntity> location);

	@Description("The list of healthcare services that this worker provides for this role's Organization/Location(s).")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getHealthcareService();
	void setHealthcareService(java.util.List<com.braintribe.model.generic.GenericEntity> healthcareService);

	@Description("Contact details that are specific to the role/location/service.")
	
	java.util.List<fhir.ContactPoint> getTelecom();
	void setTelecom(java.util.List<fhir.ContactPoint> telecom);

	@Description("A collection of times the practitioner is available or performing this role at the location and/or healthcareservice.")
	
	java.util.List<fhir.PractitionerRoleAvailableTime> getAvailableTime();
	void setAvailableTime(java.util.List<fhir.PractitionerRoleAvailableTime> availableTime);

	@Description("The practitioner is not available or performing this role during this period of time due to the provided reason.")
	
	java.util.List<fhir.PractitionerRoleNotAvailable> getNotAvailable();
	void setNotAvailable(java.util.List<fhir.PractitionerRoleNotAvailable> notAvailable);

	@Description("Technical endpoints providing access to services operated for the practitioner with this role.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getEndpoint();
	void setEndpoint(java.util.List<com.braintribe.model.generic.GenericEntity> endpoint);

}
