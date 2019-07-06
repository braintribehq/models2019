/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type FamilyMemberHistoryCondition of the Data Model fhir.
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
{@link code}, 
{@link outcome}, 
{@link onsetAge}, 
{@link onsetRange}, 
{@link onsetPeriod}, 
{@link note}, 

* It provides of then following operations (getters and setters)
{@link getCode},
{@link getOutcome},
{@link getOnsetAge},
{@link getOnsetRange},
{@link getOnsetPeriod},
{@link getNote},
{@link setCode},
{@link setOutcome},
{@link setOnsetAge},
{@link setOnsetRange},
{@link setOnsetPeriod},
{@link setNote},
 */

@Description("Significant health conditions for a person related to the patient relevant in the context of care for the patient.")

public interface FamilyMemberHistoryCondition extends GenericEntity, fhir.BackboneElement {

	EntityType<FamilyMemberHistoryCondition> T = EntityTypes.T(FamilyMemberHistoryCondition.class);

	/* Constants for each property name. */
	java.lang.String code = "code";
	java.lang.String outcome = "outcome";
	java.lang.String onsetAge = "onsetAge";
	java.lang.String onsetRange = "onsetRange";
	java.lang.String onsetPeriod = "onsetPeriod";
	java.lang.String note = "note";

	@Description("The actual condition specified. Could be a coded condition (like MI or Diabetes) or a less specific string like 'cancer' depending on how much is known about the condition and the capabilities of the creating system.")
	@Mandatory
	fhir.CodeableConcept getCode();
	void setCode(fhir.CodeableConcept code);
	@Description("Indicates what happened following the condition.  If the condition resulted in death, deceased date is captured on the relation.")
	@Mandatory
	fhir.CodeableConcept getOutcome();
	void setOutcome(fhir.CodeableConcept outcome);
	@Description("")
	@Mandatory
	fhir.Age getOnsetAge();
	void setOnsetAge(fhir.Age onsetAge);
	@Description("")
	@Mandatory
	fhir.Range getOnsetRange();
	void setOnsetRange(fhir.Range onsetRange);
	@Description("")
	@Mandatory
	fhir.Period getOnsetPeriod();
	void setOnsetPeriod(fhir.Period onsetPeriod);
	@Description("An area where general notes can be placed about this specific condition.")
	
	java.util.List<fhir.Annotation> getNote();
	void setNote(java.util.List<fhir.Annotation> note);

}
