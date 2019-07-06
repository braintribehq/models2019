/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type CarePlan of the Data Model fhir.
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
{@link basedOn}, 
{@link replaces}, 
{@link partOf}, 
{@link category}, 
{@link subject}, 
{@link encounter}, 
{@link period}, 
{@link author}, 
{@link contributor}, 
{@link careTeam}, 
{@link addresses}, 
{@link supportingInfo}, 
{@link goal}, 
{@link activity}, 
{@link note}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getBasedOn},
{@link getReplaces},
{@link getPartOf},
{@link getCategory},
{@link getSubject},
{@link getEncounter},
{@link getPeriod},
{@link getAuthor},
{@link getContributor},
{@link getCareTeam},
{@link getAddresses},
{@link getSupportingInfo},
{@link getGoal},
{@link getActivity},
{@link getNote},
{@link setIdentifier},
{@link setBasedOn},
{@link setReplaces},
{@link setPartOf},
{@link setCategory},
{@link setSubject},
{@link setEncounter},
{@link setPeriod},
{@link setAuthor},
{@link setContributor},
{@link setCareTeam},
{@link setAddresses},
{@link setSupportingInfo},
{@link setGoal},
{@link setActivity},
{@link setNote},
 */

@Description("Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions.If the element is present, it must have either a @value, an @id, or extensions")

public interface CarePlan extends GenericEntity, fhir.FhirDomainResource {

	EntityType<CarePlan> T = EntityTypes.T(CarePlan.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String basedOn = "basedOn";
	java.lang.String replaces = "replaces";
	java.lang.String partOf = "partOf";
	java.lang.String category = "category";
	java.lang.String subject = "subject";
	java.lang.String encounter = "encounter";
	java.lang.String period = "period";
	java.lang.String author = "author";
	java.lang.String contributor = "contributor";
	java.lang.String careTeam = "careTeam";
	java.lang.String addresses = "addresses";
	java.lang.String supportingInfo = "supportingInfo";
	java.lang.String goal = "goal";
	java.lang.String activity = "activity";
	java.lang.String note = "note";

	@Description("Business identifiers assigned to this care plan by the performer or other systems which remain constant as the resource is updated and propagates from server to server.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("A care plan that is fulfilled in whole or in part by this care plan.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getBasedOn();
	void setBasedOn(java.util.List<com.braintribe.model.generic.GenericEntity> basedOn);

	@Description("Completed or terminated care plan whose function is taken by this new care plan.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getReplaces();
	void setReplaces(java.util.List<com.braintribe.model.generic.GenericEntity> replaces);

	@Description("A larger care plan of which this particular care plan is a component or step.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getPartOf();
	void setPartOf(java.util.List<com.braintribe.model.generic.GenericEntity> partOf);

	@Description("Identifies what 'kind' of plan this is to support differentiation between multiple co-existing plans; e.g. 'Home health', 'psychiatric', 'asthma', 'disease management', 'wellness plan', etc.")
	
	java.util.List<fhir.CodeableConcept> getCategory();
	void setCategory(java.util.List<fhir.CodeableConcept> category);

	@Description("Identifies the patient or group whose intended care is described by the plan.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSubject();
	void setSubject(com.braintribe.model.generic.GenericEntity subject);
	@Description("The Encounter during which this CarePlan was created or to which the creation of this record is tightly associated.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getEncounter();
	void setEncounter(com.braintribe.model.generic.GenericEntity encounter);
	@Description("Indicates when the plan did (or is intended to) come into effect and end.")
	@Mandatory
	fhir.Period getPeriod();
	void setPeriod(fhir.Period period);
	@Description("When populated, the author is responsible for the care plan.  The care plan is attributed to the author.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getAuthor();
	void setAuthor(com.braintribe.model.generic.GenericEntity author);
	@Description("Identifies the individual(s) or organization who provided the contents of the care plan.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getContributor();
	void setContributor(java.util.List<com.braintribe.model.generic.GenericEntity> contributor);

	@Description("Identifies all people and organizations who are expected to be involved in the care envisioned by this plan.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getCareTeam();
	void setCareTeam(java.util.List<com.braintribe.model.generic.GenericEntity> careTeam);

	@Description("Identifies the conditions/problems/concerns/diagnoses/etc. whose management and/or mitigation are handled by this plan.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getAddresses();
	void setAddresses(java.util.List<com.braintribe.model.generic.GenericEntity> addresses);

	@Description("Identifies portions of the patient's record that specifically influenced the formation of the plan.  These might include comorbidities, recent procedures, limitations, recent assessments, etc.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getSupportingInfo();
	void setSupportingInfo(java.util.List<com.braintribe.model.generic.GenericEntity> supportingInfo);

	@Description("Describes the intended objective(s) of carrying out the care plan.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getGoal();
	void setGoal(java.util.List<com.braintribe.model.generic.GenericEntity> goal);

	@Description("Identifies a planned action to occur as part of the plan.  For example, a medication to be used, lab tests to perform, self-monitoring, education, etc.")
	
	java.util.List<fhir.CarePlanActivity> getActivity();
	void setActivity(java.util.List<fhir.CarePlanActivity> activity);

	@Description("General notes about the care plan not covered elsewhere.")
	
	java.util.List<fhir.Annotation> getNote();
	void setNote(java.util.List<fhir.Annotation> note);

}
