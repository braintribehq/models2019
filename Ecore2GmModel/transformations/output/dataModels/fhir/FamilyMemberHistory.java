/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type FamilyMemberHistory of the Data Model fhir.
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
{@link dataAbsentReason}, 
{@link patient}, 
{@link relationship}, 
{@link sex}, 
{@link bornPeriod}, 
{@link ageAge}, 
{@link ageRange}, 
{@link deceasedAge}, 
{@link deceasedRange}, 
{@link reasonCode}, 
{@link reasonReference}, 
{@link note}, 
{@link condition}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getDataAbsentReason},
{@link getPatient},
{@link getRelationship},
{@link getSex},
{@link getBornPeriod},
{@link getAgeAge},
{@link getAgeRange},
{@link getDeceasedAge},
{@link getDeceasedRange},
{@link getReasonCode},
{@link getReasonReference},
{@link getNote},
{@link getCondition},
{@link setIdentifier},
{@link setDataAbsentReason},
{@link setPatient},
{@link setRelationship},
{@link setSex},
{@link setBornPeriod},
{@link setAgeAge},
{@link setAgeRange},
{@link setDeceasedAge},
{@link setDeceasedRange},
{@link setReasonCode},
{@link setReasonReference},
{@link setNote},
{@link setCondition},
 */

@Description("Significant health conditions for a person related to the patient relevant in the context of care for the patient.If the element is present, it must have either a @value, an @id, or extensions")

public interface FamilyMemberHistory extends GenericEntity, fhir.FhirDomainResource {

	EntityType<FamilyMemberHistory> T = EntityTypes.T(FamilyMemberHistory.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String dataAbsentReason = "dataAbsentReason";
	java.lang.String patient = "patient";
	java.lang.String relationship = "relationship";
	java.lang.String sex = "sex";
	java.lang.String bornPeriod = "bornPeriod";
	java.lang.String ageAge = "ageAge";
	java.lang.String ageRange = "ageRange";
	java.lang.String deceasedAge = "deceasedAge";
	java.lang.String deceasedRange = "deceasedRange";
	java.lang.String reasonCode = "reasonCode";
	java.lang.String reasonReference = "reasonReference";
	java.lang.String note = "note";
	java.lang.String condition = "condition";

	@Description("Business identifiers assigned to this family member history by the performer or other systems which remain constant as the resource is updated and propagates from server to server.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("Describes why the family member's history is not available.")
	@Mandatory
	fhir.CodeableConcept getDataAbsentReason();
	void setDataAbsentReason(fhir.CodeableConcept dataAbsentReason);
	@Description("The person who this history concerns.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getPatient();
	void setPatient(com.braintribe.model.generic.GenericEntity patient);
	@Description("The type of relationship this person has to the patient (father, mother, brother etc.).")
	@Mandatory
	fhir.CodeableConcept getRelationship();
	void setRelationship(fhir.CodeableConcept relationship);
	@Description("The birth sex of the family member.")
	@Mandatory
	fhir.CodeableConcept getSex();
	void setSex(fhir.CodeableConcept sex);
	@Description("")
	@Mandatory
	fhir.Period getBornPeriod();
	void setBornPeriod(fhir.Period bornPeriod);
	@Description("")
	@Mandatory
	fhir.Age getAgeAge();
	void setAgeAge(fhir.Age ageAge);
	@Description("")
	@Mandatory
	fhir.Range getAgeRange();
	void setAgeRange(fhir.Range ageRange);
	@Description("")
	@Mandatory
	fhir.Age getDeceasedAge();
	void setDeceasedAge(fhir.Age deceasedAge);
	@Description("")
	@Mandatory
	fhir.Range getDeceasedRange();
	void setDeceasedRange(fhir.Range deceasedRange);
	@Description("Describes why the family member history occurred in coded or textual form.")
	
	java.util.List<fhir.CodeableConcept> getReasonCode();
	void setReasonCode(java.util.List<fhir.CodeableConcept> reasonCode);

	@Description("Indicates a Condition, Observation, AllergyIntolerance, or QuestionnaireResponse that justifies this family member history event.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getReasonReference();
	void setReasonReference(java.util.List<com.braintribe.model.generic.GenericEntity> reasonReference);

	@Description("This property allows a non condition-specific note to the made about the related person. Ideally, the note would be in the condition property, but this is not always possible.")
	
	java.util.List<fhir.Annotation> getNote();
	void setNote(java.util.List<fhir.Annotation> note);

	@Description("The significant Conditions (or condition) that the family member had. This is a repeating section to allow a system to represent more than one condition per resource, though there is nothing stopping multiple resources - one per condition.")
	
	java.util.List<fhir.FamilyMemberHistoryCondition> getCondition();
	void setCondition(java.util.List<fhir.FamilyMemberHistoryCondition> condition);

}
