/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Flag of the Data Model fhir.
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
{@link category}, 
{@link code}, 
{@link subject}, 
{@link period}, 
{@link encounter}, 
{@link author}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getCategory},
{@link getCode},
{@link getSubject},
{@link getPeriod},
{@link getEncounter},
{@link getAuthor},
{@link setIdentifier},
{@link setCategory},
{@link setCode},
{@link setSubject},
{@link setPeriod},
{@link setEncounter},
{@link setAuthor},
 */

@Description("Prospective warnings of potential issues when providing care to the patient.If the element is present, it must have either a @value, an @id, or extensions")

public interface Flag extends GenericEntity, fhir.FhirDomainResource {

	EntityType<Flag> T = EntityTypes.T(Flag.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String category = "category";
	java.lang.String code = "code";
	java.lang.String subject = "subject";
	java.lang.String period = "period";
	java.lang.String encounter = "encounter";
	java.lang.String author = "author";

	@Description("Business identifiers assigned to this flag by the performer or other systems which remain constant as the resource is updated and propagates from server to server.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("Allows a flag to be divided into different categories like clinical, administrative etc. Intended to be used as a means of filtering which flags are displayed to particular user or in a given context.")
	
	java.util.List<fhir.CodeableConcept> getCategory();
	void setCategory(java.util.List<fhir.CodeableConcept> category);

	@Description("The coded value or textual component of the flag to display to the user.")
	@Mandatory
	fhir.CodeableConcept getCode();
	void setCode(fhir.CodeableConcept code);
	@Description("The patient, location, group, organization, or practitioner etc. this is about record this flag is associated with.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSubject();
	void setSubject(com.braintribe.model.generic.GenericEntity subject);
	@Description("The period of time from the activation of the flag to inactivation of the flag. If the flag is active, the end of the period should be unspecified.")
	@Mandatory
	fhir.Period getPeriod();
	void setPeriod(fhir.Period period);
	@Description("This alert is only relevant during the encounter.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getEncounter();
	void setEncounter(com.braintribe.model.generic.GenericEntity encounter);
	@Description("The person, organization or device that created the flag.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getAuthor();
	void setAuthor(com.braintribe.model.generic.GenericEntity author);
}
