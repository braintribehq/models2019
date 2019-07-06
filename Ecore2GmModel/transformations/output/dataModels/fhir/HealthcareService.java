/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type HealthcareService of the Data Model fhir.
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
{@link providedBy}, 
{@link category}, 
{@link type}, 
{@link specialty}, 
{@link location}, 
{@link photo}, 
{@link telecom}, 
{@link coverageArea}, 
{@link serviceProvisionCode}, 
{@link eligibility}, 
{@link program}, 
{@link characteristic}, 
{@link communication}, 
{@link referralMethod}, 
{@link availableTime}, 
{@link notAvailable}, 
{@link endpoint}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getProvidedBy},
{@link getCategory},
{@link getType},
{@link getSpecialty},
{@link getLocation},
{@link getPhoto},
{@link getTelecom},
{@link getCoverageArea},
{@link getServiceProvisionCode},
{@link getEligibility},
{@link getProgram},
{@link getCharacteristic},
{@link getCommunication},
{@link getReferralMethod},
{@link getAvailableTime},
{@link getNotAvailable},
{@link getEndpoint},
{@link setIdentifier},
{@link setProvidedBy},
{@link setCategory},
{@link setType},
{@link setSpecialty},
{@link setLocation},
{@link setPhoto},
{@link setTelecom},
{@link setCoverageArea},
{@link setServiceProvisionCode},
{@link setEligibility},
{@link setProgram},
{@link setCharacteristic},
{@link setCommunication},
{@link setReferralMethod},
{@link setAvailableTime},
{@link setNotAvailable},
{@link setEndpoint},
 */

@Description("The details of a healthcare service available at a location.If the element is present, it must have either a @value, an @id, or extensions")

public interface HealthcareService extends GenericEntity, fhir.FhirDomainResource {

	EntityType<HealthcareService> T = EntityTypes.T(HealthcareService.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String providedBy = "providedBy";
	java.lang.String category = "category";
	java.lang.String type = "type";
	java.lang.String specialty = "specialty";
	java.lang.String location = "location";
	java.lang.String photo = "photo";
	java.lang.String telecom = "telecom";
	java.lang.String coverageArea = "coverageArea";
	java.lang.String serviceProvisionCode = "serviceProvisionCode";
	java.lang.String eligibility = "eligibility";
	java.lang.String program = "program";
	java.lang.String characteristic = "characteristic";
	java.lang.String communication = "communication";
	java.lang.String referralMethod = "referralMethod";
	java.lang.String availableTime = "availableTime";
	java.lang.String notAvailable = "notAvailable";
	java.lang.String endpoint = "endpoint";

	@Description("External identifiers for this item.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("The organization that provides this healthcare service.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getProvidedBy();
	void setProvidedBy(com.braintribe.model.generic.GenericEntity providedBy);
	@Description("Identifies the broad category of service being performed or delivered.")
	
	java.util.List<fhir.CodeableConcept> getCategory();
	void setCategory(java.util.List<fhir.CodeableConcept> category);

	@Description("The specific type of service that may be delivered or performed.")
	
	java.util.List<fhir.CodeableConcept> getType();
	void setType(java.util.List<fhir.CodeableConcept> type);

	@Description("Collection of specialties handled by the service site. This is more of a medical term.")
	
	java.util.List<fhir.CodeableConcept> getSpecialty();
	void setSpecialty(java.util.List<fhir.CodeableConcept> specialty);

	@Description("The location(s) where this healthcare service may be provided.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getLocation();
	void setLocation(java.util.List<com.braintribe.model.generic.GenericEntity> location);

	@Description("If there is a photo/symbol associated with this HealthcareService, it may be included here to facilitate quick identification of the service in a list.")
	@Mandatory
	fhir.Attachment getPhoto();
	void setPhoto(fhir.Attachment photo);
	@Description("List of contacts related to this specific healthcare service.")
	
	java.util.List<fhir.ContactPoint> getTelecom();
	void setTelecom(java.util.List<fhir.ContactPoint> telecom);

	@Description("The location(s) that this service is available to (not where the service is provided).")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getCoverageArea();
	void setCoverageArea(java.util.List<com.braintribe.model.generic.GenericEntity> coverageArea);

	@Description("The code(s) that detail the conditions under which the healthcare service is available/offered.")
	
	java.util.List<fhir.CodeableConcept> getServiceProvisionCode();
	void setServiceProvisionCode(java.util.List<fhir.CodeableConcept> serviceProvisionCode);

	@Description("Does this service have specific eligibility requirements that need to be met in order to use the service?")
	
	java.util.List<fhir.HealthcareServiceEligibility> getEligibility();
	void setEligibility(java.util.List<fhir.HealthcareServiceEligibility> eligibility);

	@Description("Programs that this service is applicable to.")
	
	java.util.List<fhir.CodeableConcept> getProgram();
	void setProgram(java.util.List<fhir.CodeableConcept> program);

	@Description("Collection of characteristics (attributes).")
	
	java.util.List<fhir.CodeableConcept> getCharacteristic();
	void setCharacteristic(java.util.List<fhir.CodeableConcept> characteristic);

	@Description("Some services are specifically made available in multiple languages, this property permits a directory to declare the languages this is offered in. Typically this is only provided where a service operates in communities with mixed languages used.")
	
	java.util.List<fhir.CodeableConcept> getCommunication();
	void setCommunication(java.util.List<fhir.CodeableConcept> communication);

	@Description("Ways that the service accepts referrals, if this is not provided then it is implied that no referral is required.")
	
	java.util.List<fhir.CodeableConcept> getReferralMethod();
	void setReferralMethod(java.util.List<fhir.CodeableConcept> referralMethod);

	@Description("A collection of times that the Service Site is available.")
	
	java.util.List<fhir.HealthcareServiceAvailableTime> getAvailableTime();
	void setAvailableTime(java.util.List<fhir.HealthcareServiceAvailableTime> availableTime);

	@Description("The HealthcareService is not available during this period of time due to the provided reason.")
	
	java.util.List<fhir.HealthcareServiceNotAvailable> getNotAvailable();
	void setNotAvailable(java.util.List<fhir.HealthcareServiceNotAvailable> notAvailable);

	@Description("Technical endpoints providing access to services operated for the specific healthcare services defined at this resource.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getEndpoint();
	void setEndpoint(java.util.List<com.braintribe.model.generic.GenericEntity> endpoint);

}
