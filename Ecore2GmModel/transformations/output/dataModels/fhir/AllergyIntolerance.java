/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type AllergyIntolerance of the Data Model fhir.
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
{@link clinicalStatus}, 
{@link verificationStatus}, 
{@link code}, 
{@link patient}, 
{@link encounter}, 
{@link onsetAge}, 
{@link onsetPeriod}, 
{@link onsetRange}, 
{@link recorder}, 
{@link asserter}, 
{@link note}, 
{@link reaction}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getClinicalStatus},
{@link getVerificationStatus},
{@link getCode},
{@link getPatient},
{@link getEncounter},
{@link getOnsetAge},
{@link getOnsetPeriod},
{@link getOnsetRange},
{@link getRecorder},
{@link getAsserter},
{@link getNote},
{@link getReaction},
{@link setIdentifier},
{@link setClinicalStatus},
{@link setVerificationStatus},
{@link setCode},
{@link setPatient},
{@link setEncounter},
{@link setOnsetAge},
{@link setOnsetPeriod},
{@link setOnsetRange},
{@link setRecorder},
{@link setAsserter},
{@link setNote},
{@link setReaction},
 */

@Description("Risk of harmful or undesirable, physiological response which is unique to an individual and associated with exposure to a substance.If the element is present, it must have either a @value, an @id, or extensions")

public interface AllergyIntolerance extends GenericEntity, fhir.FhirDomainResource {

	EntityType<AllergyIntolerance> T = EntityTypes.T(AllergyIntolerance.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String clinicalStatus = "clinicalStatus";
	java.lang.String verificationStatus = "verificationStatus";
	java.lang.String code = "code";
	java.lang.String patient = "patient";
	java.lang.String encounter = "encounter";
	java.lang.String onsetAge = "onsetAge";
	java.lang.String onsetPeriod = "onsetPeriod";
	java.lang.String onsetRange = "onsetRange";
	java.lang.String recorder = "recorder";
	java.lang.String asserter = "asserter";
	java.lang.String note = "note";
	java.lang.String reaction = "reaction";

	@Description("Business identifiers assigned to this AllergyIntolerance by the performer or other systems which remain constant as the resource is updated and propagates from server to server.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("The clinical status of the allergy or intolerance.")
	@Mandatory
	fhir.CodeableConcept getClinicalStatus();
	void setClinicalStatus(fhir.CodeableConcept clinicalStatus);
	@Description("Assertion about certainty associated with the propensity, or potential risk, of a reaction to the identified substance (including pharmaceutical product).")
	@Mandatory
	fhir.CodeableConcept getVerificationStatus();
	void setVerificationStatus(fhir.CodeableConcept verificationStatus);
	@Description("Code for an allergy or intolerance statement (either a positive or a negated/excluded statement).  This may be a code for a substance or pharmaceutical product that is considered to be responsible for the adverse reaction risk (e.g., 'Latex'), an allergy or intolerance condition (e.g., 'Latex allergy'), or a negated/excluded code for a specific substance or class (e.g., 'No latex allergy') or a general or categorical negated statement (e.g.,  'No known allergy', 'No known drug allergies').  Note: the substance for a specific reaction may be different from the substance identified as the cause of the risk, but it must be consistent with it. For instance, it may be a more specific substance (e.g. a brand medication) or a composite product that includes the identified substance. It must be clinically safe to only process the 'code' and ignore the 'reaction.substance'.  If a receiving system is unable to confirm that AllergyIntolerance.reaction.substance falls within the semantic scope of AllergyIntolerance.code, then the receiving system should ignore AllergyIntolerance.reaction.substance.")
	@Mandatory
	fhir.CodeableConcept getCode();
	void setCode(fhir.CodeableConcept code);
	@Description("The patient who has the allergy or intolerance.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getPatient();
	void setPatient(com.braintribe.model.generic.GenericEntity patient);
	@Description("The encounter when the allergy or intolerance was asserted.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getEncounter();
	void setEncounter(com.braintribe.model.generic.GenericEntity encounter);
	@Description("")
	@Mandatory
	fhir.Age getOnsetAge();
	void setOnsetAge(fhir.Age onsetAge);
	@Description("")
	@Mandatory
	fhir.Period getOnsetPeriod();
	void setOnsetPeriod(fhir.Period onsetPeriod);
	@Description("")
	@Mandatory
	fhir.Range getOnsetRange();
	void setOnsetRange(fhir.Range onsetRange);
	@Description("Individual who recorded the record and takes responsibility for its content.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getRecorder();
	void setRecorder(com.braintribe.model.generic.GenericEntity recorder);
	@Description("The source of the information about the allergy that is recorded.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getAsserter();
	void setAsserter(com.braintribe.model.generic.GenericEntity asserter);
	@Description("Additional narrative about the propensity for the Adverse Reaction, not captured in other fields.")
	
	java.util.List<fhir.Annotation> getNote();
	void setNote(java.util.List<fhir.Annotation> note);

	@Description("Details about each adverse reaction event linked to exposure to the identified substance.")
	
	java.util.List<fhir.AllergyIntoleranceReaction> getReaction();
	void setReaction(java.util.List<fhir.AllergyIntoleranceReaction> reaction);

}
