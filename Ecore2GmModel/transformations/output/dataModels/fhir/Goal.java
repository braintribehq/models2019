/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Goal of the Data Model fhir.
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
{@link achievementStatus}, 
{@link category}, 
{@link priority}, 
{@link description}, 
{@link subject}, 
{@link startCodeableConcept}, 
{@link target}, 
{@link expressedBy}, 
{@link addresses}, 
{@link note}, 
{@link outcomeCode}, 
{@link outcomeReference}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getAchievementStatus},
{@link getCategory},
{@link getPriority},
{@link getDescription},
{@link getSubject},
{@link getStartCodeableConcept},
{@link getTarget},
{@link getExpressedBy},
{@link getAddresses},
{@link getNote},
{@link getOutcomeCode},
{@link getOutcomeReference},
{@link setIdentifier},
{@link setAchievementStatus},
{@link setCategory},
{@link setPriority},
{@link setDescription},
{@link setSubject},
{@link setStartCodeableConcept},
{@link setTarget},
{@link setExpressedBy},
{@link setAddresses},
{@link setNote},
{@link setOutcomeCode},
{@link setOutcomeReference},
 */

@Description("Describes the intended objective(s) for a patient, group or organization care, for example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc.If the element is present, it must have either a @value, an @id, or extensions")

public interface Goal extends GenericEntity, fhir.FhirDomainResource {

	EntityType<Goal> T = EntityTypes.T(Goal.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String achievementStatus = "achievementStatus";
	java.lang.String category = "category";
	java.lang.String priority = "priority";
	java.lang.String description = "description";
	java.lang.String subject = "subject";
	java.lang.String startCodeableConcept = "startCodeableConcept";
	java.lang.String target = "target";
	java.lang.String expressedBy = "expressedBy";
	java.lang.String addresses = "addresses";
	java.lang.String note = "note";
	java.lang.String outcomeCode = "outcomeCode";
	java.lang.String outcomeReference = "outcomeReference";

	@Description("Business identifiers assigned to this goal by the performer or other systems which remain constant as the resource is updated and propagates from server to server.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("Describes the progression, or lack thereof, towards the goal against the target.")
	@Mandatory
	fhir.CodeableConcept getAchievementStatus();
	void setAchievementStatus(fhir.CodeableConcept achievementStatus);
	@Description("Indicates a category the goal falls within.")
	
	java.util.List<fhir.CodeableConcept> getCategory();
	void setCategory(java.util.List<fhir.CodeableConcept> category);

	@Description("Identifies the mutually agreed level of importance associated with reaching/sustaining the goal.")
	@Mandatory
	fhir.CodeableConcept getPriority();
	void setPriority(fhir.CodeableConcept priority);
	@Description("Human-readable and/or coded description of a specific desired objective of care, such as 'control blood pressure' or 'negotiate an obstacle course' or 'dance with child at wedding'.")
	@Mandatory
	fhir.CodeableConcept getDescription();
	void setDescription(fhir.CodeableConcept description);
	@Description("Identifies the patient, group or organization for whom the goal is being established.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSubject();
	void setSubject(com.braintribe.model.generic.GenericEntity subject);
	@Description("")
	@Mandatory
	fhir.CodeableConcept getStartCodeableConcept();
	void setStartCodeableConcept(fhir.CodeableConcept startCodeableConcept);
	@Description("Indicates what should be done by when.")
	
	java.util.List<fhir.GoalTarget> getTarget();
	void setTarget(java.util.List<fhir.GoalTarget> target);

	@Description("Indicates whose goal this is - patient goal, practitioner goal, etc.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getExpressedBy();
	void setExpressedBy(com.braintribe.model.generic.GenericEntity expressedBy);
	@Description("The identified conditions and other health record elements that are intended to be addressed by the goal.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getAddresses();
	void setAddresses(java.util.List<com.braintribe.model.generic.GenericEntity> addresses);

	@Description("Any comments related to the goal.")
	
	java.util.List<fhir.Annotation> getNote();
	void setNote(java.util.List<fhir.Annotation> note);

	@Description("Identifies the change (or lack of change) at the point when the status of the goal is assessed.")
	
	java.util.List<fhir.CodeableConcept> getOutcomeCode();
	void setOutcomeCode(java.util.List<fhir.CodeableConcept> outcomeCode);

	@Description("Details of what's changed (or not changed).")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getOutcomeReference();
	void setOutcomeReference(java.util.List<com.braintribe.model.generic.GenericEntity> outcomeReference);

}
