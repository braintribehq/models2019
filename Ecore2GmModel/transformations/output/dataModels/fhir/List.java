/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type List of the Data Model fhir.
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
{@link code}, 
{@link subject}, 
{@link encounter}, 
{@link source}, 
{@link orderedBy}, 
{@link note}, 
{@link entry}, 
{@link emptyReason}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getCode},
{@link getSubject},
{@link getEncounter},
{@link getSource},
{@link getOrderedBy},
{@link getNote},
{@link getEntry},
{@link getEmptyReason},
{@link setIdentifier},
{@link setCode},
{@link setSubject},
{@link setEncounter},
{@link setSource},
{@link setOrderedBy},
{@link setNote},
{@link setEntry},
{@link setEmptyReason},
 */

@Description("A list is a curated collection of resources.If the element is present, it must have either a @value, an @id, or extensions")

public interface List extends GenericEntity, fhir.FhirDomainResource {

	EntityType<List> T = EntityTypes.T(List.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String code = "code";
	java.lang.String subject = "subject";
	java.lang.String encounter = "encounter";
	java.lang.String source = "source";
	java.lang.String orderedBy = "orderedBy";
	java.lang.String note = "note";
	java.lang.String entry = "entry";
	java.lang.String emptyReason = "emptyReason";

	@Description("Identifier for the List assigned for business purposes outside the context of FHIR.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("This code defines the purpose of the list - why it was created.")
	@Mandatory
	fhir.CodeableConcept getCode();
	void setCode(fhir.CodeableConcept code);
	@Description("The common subject (or patient) of the resources that are in the list if there is one.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSubject();
	void setSubject(com.braintribe.model.generic.GenericEntity subject);
	@Description("The encounter that is the context in which this list was created.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getEncounter();
	void setEncounter(com.braintribe.model.generic.GenericEntity encounter);
	@Description("The entity responsible for deciding what the contents of the list were. Where the list was created by a human, this is the same as the author of the list.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSource();
	void setSource(com.braintribe.model.generic.GenericEntity source);
	@Description("What order applies to the items in the list.")
	@Mandatory
	fhir.CodeableConcept getOrderedBy();
	void setOrderedBy(fhir.CodeableConcept orderedBy);
	@Description("Comments that apply to the overall list.")
	
	java.util.List<fhir.Annotation> getNote();
	void setNote(java.util.List<fhir.Annotation> note);

	@Description("Entries in this list.")
	
	java.util.List<fhir.ListEntry> getEntry();
	void setEntry(java.util.List<fhir.ListEntry> entry);

	@Description("If the list is empty, why the list is empty.")
	@Mandatory
	fhir.CodeableConcept getEmptyReason();
	void setEmptyReason(fhir.CodeableConcept emptyReason);
}
