/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type DeviceRequest of the Data Model fhir.
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
{@link priorRequest}, 
{@link groupIdentifier}, 
{@link codeReference}, 
{@link codeCodeableConcept}, 
{@link parameter}, 
{@link subject}, 
{@link encounter}, 
{@link occurrencePeriod}, 
{@link occurrenceTiming}, 
{@link requester}, 
{@link performerType}, 
{@link performer}, 
{@link reasonCode}, 
{@link reasonReference}, 
{@link insurance}, 
{@link supportingInfo}, 
{@link note}, 
{@link relevantHistory}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getBasedOn},
{@link getPriorRequest},
{@link getGroupIdentifier},
{@link getCodeReference},
{@link getCodeCodeableConcept},
{@link getParameter},
{@link getSubject},
{@link getEncounter},
{@link getOccurrencePeriod},
{@link getOccurrenceTiming},
{@link getRequester},
{@link getPerformerType},
{@link getPerformer},
{@link getReasonCode},
{@link getReasonReference},
{@link getInsurance},
{@link getSupportingInfo},
{@link getNote},
{@link getRelevantHistory},
{@link setIdentifier},
{@link setBasedOn},
{@link setPriorRequest},
{@link setGroupIdentifier},
{@link setCodeReference},
{@link setCodeCodeableConcept},
{@link setParameter},
{@link setSubject},
{@link setEncounter},
{@link setOccurrencePeriod},
{@link setOccurrenceTiming},
{@link setRequester},
{@link setPerformerType},
{@link setPerformer},
{@link setReasonCode},
{@link setReasonReference},
{@link setInsurance},
{@link setSupportingInfo},
{@link setNote},
{@link setRelevantHistory},
 */

@Description("Represents a request for a patient to employ a medical device. The device may be an implantable device, or an external assistive device, such as a walker.If the element is present, it must have either a @value, an @id, or extensions")

public interface DeviceRequest extends GenericEntity, fhir.FhirDomainResource {

	EntityType<DeviceRequest> T = EntityTypes.T(DeviceRequest.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String basedOn = "basedOn";
	java.lang.String priorRequest = "priorRequest";
	java.lang.String groupIdentifier = "groupIdentifier";
	java.lang.String codeReference = "codeReference";
	java.lang.String codeCodeableConcept = "codeCodeableConcept";
	java.lang.String parameter = "parameter";
	java.lang.String subject = "subject";
	java.lang.String encounter = "encounter";
	java.lang.String occurrencePeriod = "occurrencePeriod";
	java.lang.String occurrenceTiming = "occurrenceTiming";
	java.lang.String requester = "requester";
	java.lang.String performerType = "performerType";
	java.lang.String performer = "performer";
	java.lang.String reasonCode = "reasonCode";
	java.lang.String reasonReference = "reasonReference";
	java.lang.String insurance = "insurance";
	java.lang.String supportingInfo = "supportingInfo";
	java.lang.String note = "note";
	java.lang.String relevantHistory = "relevantHistory";

	@Description("Identifiers assigned to this order by the orderer or by the receiver.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("Plan/proposal/order fulfilled by this request.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getBasedOn();
	void setBasedOn(java.util.List<com.braintribe.model.generic.GenericEntity> basedOn);

	@Description("The request takes the place of the referenced completed or terminated request(s).")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getPriorRequest();
	void setPriorRequest(java.util.List<com.braintribe.model.generic.GenericEntity> priorRequest);

	@Description("Composite request this is part of.")
	@Mandatory
	fhir.Identifier getGroupIdentifier();
	void setGroupIdentifier(fhir.Identifier groupIdentifier);
	@Description("")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getCodeReference();
	void setCodeReference(com.braintribe.model.generic.GenericEntity codeReference);
	@Description("")
	@Mandatory
	fhir.CodeableConcept getCodeCodeableConcept();
	void setCodeCodeableConcept(fhir.CodeableConcept codeCodeableConcept);
	@Description("Specific parameters for the ordered item.  For example, the prism value for lenses.")
	
	java.util.List<fhir.DeviceRequestParameter> getParameter();
	void setParameter(java.util.List<fhir.DeviceRequestParameter> parameter);

	@Description("The patient who will use the device.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSubject();
	void setSubject(com.braintribe.model.generic.GenericEntity subject);
	@Description("An encounter that provides additional context in which this request is made.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getEncounter();
	void setEncounter(com.braintribe.model.generic.GenericEntity encounter);
	@Description("")
	@Mandatory
	fhir.Period getOccurrencePeriod();
	void setOccurrencePeriod(fhir.Period occurrencePeriod);
	@Description("")
	@Mandatory
	fhir.Timing getOccurrenceTiming();
	void setOccurrenceTiming(fhir.Timing occurrenceTiming);
	@Description("The individual who initiated the request and has responsibility for its activation.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getRequester();
	void setRequester(com.braintribe.model.generic.GenericEntity requester);
	@Description("Desired type of performer for doing the diagnostic testing.")
	@Mandatory
	fhir.CodeableConcept getPerformerType();
	void setPerformerType(fhir.CodeableConcept performerType);
	@Description("The desired performer for doing the diagnostic testing.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getPerformer();
	void setPerformer(com.braintribe.model.generic.GenericEntity performer);
	@Description("Reason or justification for the use of this device.")
	
	java.util.List<fhir.CodeableConcept> getReasonCode();
	void setReasonCode(java.util.List<fhir.CodeableConcept> reasonCode);

	@Description("Reason or justification for the use of this device.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getReasonReference();
	void setReasonReference(java.util.List<com.braintribe.model.generic.GenericEntity> reasonReference);

	@Description("Insurance plans, coverage extensions, pre-authorizations and/or pre-determinations that may be required for delivering the requested service.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getInsurance();
	void setInsurance(java.util.List<com.braintribe.model.generic.GenericEntity> insurance);

	@Description("Additional clinical information about the patient that may influence the request fulfilment.  For example, this may include where on the subject's body the device will be used (i.e. the target site).")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getSupportingInfo();
	void setSupportingInfo(java.util.List<com.braintribe.model.generic.GenericEntity> supportingInfo);

	@Description("Details about this request that were not represented at all or sufficiently in one of the attributes provided in a class. These may include for example a comment, an instruction, or a note associated with the statement.")
	
	java.util.List<fhir.Annotation> getNote();
	void setNote(java.util.List<fhir.Annotation> note);

	@Description("Key events in the history of the request.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getRelevantHistory();
	void setRelevantHistory(java.util.List<com.braintribe.model.generic.GenericEntity> relevantHistory);

}
