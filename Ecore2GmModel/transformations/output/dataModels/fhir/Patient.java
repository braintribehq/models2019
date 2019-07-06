/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Patient of the Data Model fhir.
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
{@link name}, 
{@link telecom}, 
{@link address}, 
{@link maritalStatus}, 
{@link photo}, 
{@link contact}, 
{@link communication}, 
{@link generalPractitioner}, 
{@link managingOrganization}, 
{@link link}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getName},
{@link getTelecom},
{@link getAddress},
{@link getMaritalStatus},
{@link getPhoto},
{@link getContact},
{@link getCommunication},
{@link getGeneralPractitioner},
{@link getManagingOrganization},
{@link getLink},
{@link setIdentifier},
{@link setName},
{@link setTelecom},
{@link setAddress},
{@link setMaritalStatus},
{@link setPhoto},
{@link setContact},
{@link setCommunication},
{@link setGeneralPractitioner},
{@link setManagingOrganization},
{@link setLink},
 */

@Description("Demographics and other administrative information about an individual or animal receiving care or other health-related services.If the element is present, it must have either a @value, an @id, or extensions")

public interface Patient extends GenericEntity, fhir.FhirDomainResource {

	EntityType<Patient> T = EntityTypes.T(Patient.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String name = "name";
	java.lang.String telecom = "telecom";
	java.lang.String address = "address";
	java.lang.String maritalStatus = "maritalStatus";
	java.lang.String photo = "photo";
	java.lang.String contact = "contact";
	java.lang.String communication = "communication";
	java.lang.String generalPractitioner = "generalPractitioner";
	java.lang.String managingOrganization = "managingOrganization";
	java.lang.String link = "link";

	@Description("An identifier for this patient.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("A name associated with the individual.")
	
	java.util.List<fhir.HumanName> getName();
	void setName(java.util.List<fhir.HumanName> name);

	@Description("A contact detail (e.g. a telephone number or an email address) by which the individual may be contacted.")
	
	java.util.List<fhir.ContactPoint> getTelecom();
	void setTelecom(java.util.List<fhir.ContactPoint> telecom);

	@Description("An address for the individual.")
	
	java.util.List<fhir.Address> getAddress();
	void setAddress(java.util.List<fhir.Address> address);

	@Description("This field contains a patient's most recent marital (civil) status.")
	@Mandatory
	fhir.CodeableConcept getMaritalStatus();
	void setMaritalStatus(fhir.CodeableConcept maritalStatus);
	@Description("Image of the patient.")
	
	java.util.List<fhir.Attachment> getPhoto();
	void setPhoto(java.util.List<fhir.Attachment> photo);

	@Description("A contact party (e.g. guardian, partner, friend) for the patient.")
	
	java.util.List<fhir.PatientContact> getContact();
	void setContact(java.util.List<fhir.PatientContact> contact);

	@Description("A language which may be used to communicate with the patient about his or her health.")
	
	java.util.List<fhir.PatientCommunication> getCommunication();
	void setCommunication(java.util.List<fhir.PatientCommunication> communication);

	@Description("Patient's nominated care provider.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getGeneralPractitioner();
	void setGeneralPractitioner(java.util.List<com.braintribe.model.generic.GenericEntity> generalPractitioner);

	@Description("Organization that is the custodian of the patient record.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getManagingOrganization();
	void setManagingOrganization(com.braintribe.model.generic.GenericEntity managingOrganization);
	@Description("Link to another patient resource that concerns the same actual patient.")
	
	java.util.List<fhir.PatientLink> getLink();
	void setLink(java.util.List<fhir.PatientLink> link);

}
