/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Practitioner of the Data Model fhir.
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
{@link photo}, 
{@link qualification}, 
{@link communication}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getName},
{@link getTelecom},
{@link getAddress},
{@link getPhoto},
{@link getQualification},
{@link getCommunication},
{@link setIdentifier},
{@link setName},
{@link setTelecom},
{@link setAddress},
{@link setPhoto},
{@link setQualification},
{@link setCommunication},
 */

@Description("A person who is directly or indirectly involved in the provisioning of healthcare.If the element is present, it must have either a @value, an @id, or extensions")

public interface Practitioner extends GenericEntity, fhir.FhirDomainResource {

	EntityType<Practitioner> T = EntityTypes.T(Practitioner.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String name = "name";
	java.lang.String telecom = "telecom";
	java.lang.String address = "address";
	java.lang.String photo = "photo";
	java.lang.String qualification = "qualification";
	java.lang.String communication = "communication";

	@Description("An identifier that applies to this person in this role.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("The name(s) associated with the practitioner.")
	
	java.util.List<fhir.HumanName> getName();
	void setName(java.util.List<fhir.HumanName> name);

	@Description("A contact detail for the practitioner, e.g. a telephone number or an email address.")
	
	java.util.List<fhir.ContactPoint> getTelecom();
	void setTelecom(java.util.List<fhir.ContactPoint> telecom);

	@Description("Address(es) of the practitioner that are not role specific (typically home address). Work addresses are not typically entered in this property as they are usually role dependent.")
	
	java.util.List<fhir.Address> getAddress();
	void setAddress(java.util.List<fhir.Address> address);

	@Description("Image of the person.")
	
	java.util.List<fhir.Attachment> getPhoto();
	void setPhoto(java.util.List<fhir.Attachment> photo);

	@Description("The official certifications, training, and licenses that authorize or otherwise pertain to the provision of care by the practitioner.  For example, a medical license issued by a medical board authorizing the practitioner to practice medicine within a certian locality.")
	
	java.util.List<fhir.PractitionerQualification> getQualification();
	void setQualification(java.util.List<fhir.PractitionerQualification> qualification);

	@Description("A language the practitioner can use in patient communication.")
	
	java.util.List<fhir.CodeableConcept> getCommunication();
	void setCommunication(java.util.List<fhir.CodeableConcept> communication);

}
