/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Task of the Data Model fhir.
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
{@link groupIdentifier}, 
{@link partOf}, 
{@link statusReason}, 
{@link businessStatus}, 
{@link code}, 
{@link focus}, 
{@link for_}, 
{@link encounter}, 
{@link executionPeriod}, 
{@link requester}, 
{@link performerType}, 
{@link owner}, 
{@link location}, 
{@link reasonCode}, 
{@link reasonReference}, 
{@link insurance}, 
{@link note}, 
{@link relevantHistory}, 
{@link restriction}, 
{@link input}, 
{@link output}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getBasedOn},
{@link getGroupIdentifier},
{@link getPartOf},
{@link getStatusReason},
{@link getBusinessStatus},
{@link getCode},
{@link getFocus},
{@link getFor_},
{@link getEncounter},
{@link getExecutionPeriod},
{@link getRequester},
{@link getPerformerType},
{@link getOwner},
{@link getLocation},
{@link getReasonCode},
{@link getReasonReference},
{@link getInsurance},
{@link getNote},
{@link getRelevantHistory},
{@link getRestriction},
{@link getInput},
{@link getOutput},
{@link setIdentifier},
{@link setBasedOn},
{@link setGroupIdentifier},
{@link setPartOf},
{@link setStatusReason},
{@link setBusinessStatus},
{@link setCode},
{@link setFocus},
{@link setFor_},
{@link setEncounter},
{@link setExecutionPeriod},
{@link setRequester},
{@link setPerformerType},
{@link setOwner},
{@link setLocation},
{@link setReasonCode},
{@link setReasonReference},
{@link setInsurance},
{@link setNote},
{@link setRelevantHistory},
{@link setRestriction},
{@link setInput},
{@link setOutput},
 */

@Description("A task to be performed.If the element is present, it must have either a @value, an @id, or extensions")

public interface Task extends GenericEntity, fhir.FhirDomainResource {

	EntityType<Task> T = EntityTypes.T(Task.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String basedOn = "basedOn";
	java.lang.String groupIdentifier = "groupIdentifier";
	java.lang.String partOf = "partOf";
	java.lang.String statusReason = "statusReason";
	java.lang.String businessStatus = "businessStatus";
	java.lang.String code = "code";
	java.lang.String focus = "focus";
	java.lang.String for_ = "for_";
	java.lang.String encounter = "encounter";
	java.lang.String executionPeriod = "executionPeriod";
	java.lang.String requester = "requester";
	java.lang.String performerType = "performerType";
	java.lang.String owner = "owner";
	java.lang.String location = "location";
	java.lang.String reasonCode = "reasonCode";
	java.lang.String reasonReference = "reasonReference";
	java.lang.String insurance = "insurance";
	java.lang.String note = "note";
	java.lang.String relevantHistory = "relevantHistory";
	java.lang.String restriction = "restriction";
	java.lang.String input = "input";
	java.lang.String output = "output";

	@Description("The business identifier for this task.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("BasedOn refers to a higher-level authorization that triggered the creation of the task.  It references a 'request' resource such as a ServiceRequest, MedicationRequest, ServiceRequest, CarePlan, etc. which is distinct from the 'request' resource the task is seeking to fulfill.  This latter resource is referenced by FocusOn.  For example, based on a ServiceRequest (= BasedOn), a task is created to fulfill a procedureRequest ( = FocusOn ) to collect a specimen from a patient.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getBasedOn();
	void setBasedOn(java.util.List<com.braintribe.model.generic.GenericEntity> basedOn);

	@Description("An identifier that links together multiple tasks and other requests that were created in the same context.")
	@Mandatory
	fhir.Identifier getGroupIdentifier();
	void setGroupIdentifier(fhir.Identifier groupIdentifier);
	@Description("Task that this particular task is part of.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getPartOf();
	void setPartOf(java.util.List<com.braintribe.model.generic.GenericEntity> partOf);

	@Description("An explanation as to why this task is held, failed, was refused, etc.")
	@Mandatory
	fhir.CodeableConcept getStatusReason();
	void setStatusReason(fhir.CodeableConcept statusReason);
	@Description("Contains business-specific nuances of the business state.")
	@Mandatory
	fhir.CodeableConcept getBusinessStatus();
	void setBusinessStatus(fhir.CodeableConcept businessStatus);
	@Description("A name or code (or both) briefly describing what the task involves.")
	@Mandatory
	fhir.CodeableConcept getCode();
	void setCode(fhir.CodeableConcept code);
	@Description("The request being actioned or the resource being manipulated by this task.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getFocus();
	void setFocus(com.braintribe.model.generic.GenericEntity focus);
	@Description("The entity who benefits from the performance of the service specified in the task (e.g., the patient).")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getFor_();
	void setFor_(com.braintribe.model.generic.GenericEntity for_);
	@Description("The healthcare event  (e.g. a patient and healthcare provider interaction) during which this task was created.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getEncounter();
	void setEncounter(com.braintribe.model.generic.GenericEntity encounter);
	@Description("Identifies the time action was first taken against the task (start) and/or the time final action was taken against the task prior to marking it as completed (end).")
	@Mandatory
	fhir.Period getExecutionPeriod();
	void setExecutionPeriod(fhir.Period executionPeriod);
	@Description("The creator of the task.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getRequester();
	void setRequester(com.braintribe.model.generic.GenericEntity requester);
	@Description("The kind of participant that should perform the task.")
	
	java.util.List<fhir.CodeableConcept> getPerformerType();
	void setPerformerType(java.util.List<fhir.CodeableConcept> performerType);

	@Description("Individual organization or Device currently responsible for task execution.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getOwner();
	void setOwner(com.braintribe.model.generic.GenericEntity owner);
	@Description("Principal physical location where the this task is performed.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getLocation();
	void setLocation(com.braintribe.model.generic.GenericEntity location);
	@Description("A description or code indicating why this task needs to be performed.")
	@Mandatory
	fhir.CodeableConcept getReasonCode();
	void setReasonCode(fhir.CodeableConcept reasonCode);
	@Description("A resource reference indicating why this task needs to be performed.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getReasonReference();
	void setReasonReference(com.braintribe.model.generic.GenericEntity reasonReference);
	@Description("Insurance plans, coverage extensions, pre-authorizations and/or pre-determinations that may be relevant to the Task.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getInsurance();
	void setInsurance(java.util.List<com.braintribe.model.generic.GenericEntity> insurance);

	@Description("Free-text information captured about the task as it progresses.")
	
	java.util.List<fhir.Annotation> getNote();
	void setNote(java.util.List<fhir.Annotation> note);

	@Description("Links to Provenance records for past versions of this Task that identify key state transitions or updates that are likely to be relevant to a user looking at the current version of the task.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getRelevantHistory();
	void setRelevantHistory(java.util.List<com.braintribe.model.generic.GenericEntity> relevantHistory);

	@Description("If the Task.focus is a request resource and the task is seeking fulfillment (i.e. is asking for the request to be actioned), this element identifies any limitations on what parts of the referenced request should be actioned.")
	@Mandatory
	fhir.TaskRestriction getRestriction();
	void setRestriction(fhir.TaskRestriction restriction);
	@Description("Additional information that may be needed in the execution of the task.")
	
	java.util.List<fhir.TaskInput> getInput();
	void setInput(java.util.List<fhir.TaskInput> input);

	@Description("Outputs produced by the Task.")
	
	java.util.List<fhir.TaskOutput> getOutput();
	void setOutput(java.util.List<fhir.TaskOutput> output);

}
