/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type RelatedPerson of the Data Model fhir.
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
{@link patient}, 
{@link relationship}, 
{@link name}, 
{@link telecom}, 
{@link address}, 
{@link photo}, 
{@link period}, 
{@link communication}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getPatient},
{@link getRelationship},
{@link getName},
{@link getTelecom},
{@link getAddress},
{@link getPhoto},
{@link getPeriod},
{@link getCommunication},
{@link setIdentifier},
{@link setPatient},
{@link setRelationship},
{@link setName},
{@link setTelecom},
{@link setAddress},
{@link setPhoto},
{@link setPeriod},
{@link setCommunication},
 */

@Description("Information about a person that is involved in the care for a patient, but who is not the target of healthcare, nor has a formal responsibility in the care process.If the element is present, it must have either a @value, an @id, or extensions")

public interface RelatedPerson extends GenericEntity, fhir.FhirDomainResource {

	EntityType<RelatedPerson> T = EntityTypes.T(RelatedPerson.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String patient = "patient";
	java.lang.String relationship = "relationship";
	java.lang.String name = "name";
	java.lang.String telecom = "telecom";
	java.lang.String address = "address";
	java.lang.String photo = "photo";
	java.lang.String period = "period";
	java.lang.String communication = "communication";

	@Description("Identifier for a person within a particular scope.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("The patient this person is related to.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getPatient();
	void setPatient(com.braintribe.model.generic.GenericEntity patient);
	@Description("The nature of the relationship between a patient and the related person.")
	
	java.util.List<fhir.CodeableConcept> getRelationship();
	void setRelationship(java.util.List<fhir.CodeableConcept> relationship);

	@Description("A name associated with the person.")
	
	java.util.List<fhir.HumanName> getName();
	void setName(java.util.List<fhir.HumanName> name);

	@Description("A contact detail for the person, e.g. a telephone number or an email address.")
	
	java.util.List<fhir.ContactPoint> getTelecom();
	void setTelecom(java.util.List<fhir.ContactPoint> telecom);

	@Description("Address where the related person can be contacted or visited.")
	
	java.util.List<fhir.Address> getAddress();
	void setAddress(java.util.List<fhir.Address> address);

	@Description("Image of the person.")
	
	java.util.List<fhir.Attachment> getPhoto();
	void setPhoto(java.util.List<fhir.Attachment> photo);

	@Description("The period of time during which this relationship is or was active. If there are no dates defined, then the interval is unknown.")
	@Mandatory
	fhir.Period getPeriod();
	void setPeriod(fhir.Period period);
	@Description("A language which may be used to communicate with about the patient's health.")
	
	java.util.List<fhir.RelatedPersonCommunication> getCommunication();
	void setCommunication(java.util.List<fhir.RelatedPersonCommunication> communication);

}
