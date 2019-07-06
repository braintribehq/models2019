/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ContractAction of the Data Model fhir.
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
{@link type}, 
{@link subject}, 
{@link intent}, 
{@link status}, 
{@link context}, 
{@link occurrencePeriod}, 
{@link occurrenceTiming}, 
{@link requester}, 
{@link performerType}, 
{@link performerRole}, 
{@link performer}, 
{@link reasonCode}, 
{@link reasonReference}, 
{@link note}, 

* It provides of then following operations (getters and setters)
{@link getType},
{@link getSubject},
{@link getIntent},
{@link getStatus},
{@link getContext},
{@link getOccurrencePeriod},
{@link getOccurrenceTiming},
{@link getRequester},
{@link getPerformerType},
{@link getPerformerRole},
{@link getPerformer},
{@link getReasonCode},
{@link getReasonReference},
{@link getNote},
{@link setType},
{@link setSubject},
{@link setIntent},
{@link setStatus},
{@link setContext},
{@link setOccurrencePeriod},
{@link setOccurrenceTiming},
{@link setRequester},
{@link setPerformerType},
{@link setPerformerRole},
{@link setPerformer},
{@link setReasonCode},
{@link setReasonReference},
{@link setNote},
 */

@Description("Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement.")

public interface ContractAction extends GenericEntity, fhir.BackboneElement {

	EntityType<ContractAction> T = EntityTypes.T(ContractAction.class);

	/* Constants for each property name. */
	java.lang.String type = "type";
	java.lang.String subject = "subject";
	java.lang.String intent = "intent";
	java.lang.String status = "status";
	java.lang.String context = "context";
	java.lang.String occurrencePeriod = "occurrencePeriod";
	java.lang.String occurrenceTiming = "occurrenceTiming";
	java.lang.String requester = "requester";
	java.lang.String performerType = "performerType";
	java.lang.String performerRole = "performerRole";
	java.lang.String performer = "performer";
	java.lang.String reasonCode = "reasonCode";
	java.lang.String reasonReference = "reasonReference";
	java.lang.String note = "note";

	@Description("Activity or service obligation to be done or not done, performed or not performed, effectuated or not by this Contract term.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("Entity of the action.")
	
	java.util.List<fhir.ContractSubject> getSubject();
	void setSubject(java.util.List<fhir.ContractSubject> subject);

	@Description("Reason or purpose for the action stipulated by this Contract Provision.")
	@Mandatory
	fhir.CodeableConcept getIntent();
	void setIntent(fhir.CodeableConcept intent);
	@Description("Current state of the term action.")
	@Mandatory
	fhir.CodeableConcept getStatus();
	void setStatus(fhir.CodeableConcept status);
	@Description("Encounter or Episode with primary association to specified term activity.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getContext();
	void setContext(com.braintribe.model.generic.GenericEntity context);
	@Description("")
	@Mandatory
	fhir.Period getOccurrencePeriod();
	void setOccurrencePeriod(fhir.Period occurrencePeriod);
	@Description("")
	@Mandatory
	fhir.Timing getOccurrenceTiming();
	void setOccurrenceTiming(fhir.Timing occurrenceTiming);
	@Description("Who or what initiated the action and has responsibility for its activation.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getRequester();
	void setRequester(java.util.List<com.braintribe.model.generic.GenericEntity> requester);

	@Description("The type of individual that is desired or required to perform or not perform the action.")
	
	java.util.List<fhir.CodeableConcept> getPerformerType();
	void setPerformerType(java.util.List<fhir.CodeableConcept> performerType);

	@Description("The type of role or competency of an individual desired or required to perform or not perform the action.")
	@Mandatory
	fhir.CodeableConcept getPerformerRole();
	void setPerformerRole(fhir.CodeableConcept performerRole);
	@Description("Indicates who or what is being asked to perform (or not perform) the ction.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getPerformer();
	void setPerformer(com.braintribe.model.generic.GenericEntity performer);
	@Description("Rationale for the action to be performed or not performed. Describes why the action is permitted or prohibited.")
	
	java.util.List<fhir.CodeableConcept> getReasonCode();
	void setReasonCode(java.util.List<fhir.CodeableConcept> reasonCode);

	@Description("Indicates another resource whose existence justifies permitting or not permitting this action.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getReasonReference();
	void setReasonReference(java.util.List<com.braintribe.model.generic.GenericEntity> reasonReference);

	@Description("Comments made about the term action made by the requester, performer, subject or other participants.")
	
	java.util.List<fhir.Annotation> getNote();
	void setNote(java.util.List<fhir.Annotation> note);

}
