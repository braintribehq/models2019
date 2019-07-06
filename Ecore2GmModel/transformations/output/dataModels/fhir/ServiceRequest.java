/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ServiceRequest of the Data Model fhir.
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
{@link requisition}, 
{@link category}, 
{@link code}, 
{@link orderDetail}, 
{@link quantityQuantity}, 
{@link quantityRatio}, 
{@link quantityRange}, 
{@link subject}, 
{@link encounter}, 
{@link occurrencePeriod}, 
{@link occurrenceTiming}, 
{@link asNeededCodeableConcept}, 
{@link requester}, 
{@link performerType}, 
{@link performer}, 
{@link locationCode}, 
{@link locationReference}, 
{@link reasonCode}, 
{@link reasonReference}, 
{@link insurance}, 
{@link supportingInfo}, 
{@link specimen}, 
{@link bodySite}, 
{@link note}, 
{@link relevantHistory}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getBasedOn},
{@link getReplaces},
{@link getRequisition},
{@link getCategory},
{@link getCode},
{@link getOrderDetail},
{@link getQuantityQuantity},
{@link getQuantityRatio},
{@link getQuantityRange},
{@link getSubject},
{@link getEncounter},
{@link getOccurrencePeriod},
{@link getOccurrenceTiming},
{@link getAsNeededCodeableConcept},
{@link getRequester},
{@link getPerformerType},
{@link getPerformer},
{@link getLocationCode},
{@link getLocationReference},
{@link getReasonCode},
{@link getReasonReference},
{@link getInsurance},
{@link getSupportingInfo},
{@link getSpecimen},
{@link getBodySite},
{@link getNote},
{@link getRelevantHistory},
{@link setIdentifier},
{@link setBasedOn},
{@link setReplaces},
{@link setRequisition},
{@link setCategory},
{@link setCode},
{@link setOrderDetail},
{@link setQuantityQuantity},
{@link setQuantityRatio},
{@link setQuantityRange},
{@link setSubject},
{@link setEncounter},
{@link setOccurrencePeriod},
{@link setOccurrenceTiming},
{@link setAsNeededCodeableConcept},
{@link setRequester},
{@link setPerformerType},
{@link setPerformer},
{@link setLocationCode},
{@link setLocationReference},
{@link setReasonCode},
{@link setReasonReference},
{@link setInsurance},
{@link setSupportingInfo},
{@link setSpecimen},
{@link setBodySite},
{@link setNote},
{@link setRelevantHistory},
 */

@Description("A record of a request for service such as diagnostic investigations, treatments, or operations to be performed.If the element is present, it must have either a @value, an @id, or extensions")

public interface ServiceRequest extends GenericEntity, fhir.FhirDomainResource {

	EntityType<ServiceRequest> T = EntityTypes.T(ServiceRequest.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String basedOn = "basedOn";
	java.lang.String replaces = "replaces";
	java.lang.String requisition = "requisition";
	java.lang.String category = "category";
	java.lang.String code = "code";
	java.lang.String orderDetail = "orderDetail";
	java.lang.String quantityQuantity = "quantityQuantity";
	java.lang.String quantityRatio = "quantityRatio";
	java.lang.String quantityRange = "quantityRange";
	java.lang.String subject = "subject";
	java.lang.String encounter = "encounter";
	java.lang.String occurrencePeriod = "occurrencePeriod";
	java.lang.String occurrenceTiming = "occurrenceTiming";
	java.lang.String asNeededCodeableConcept = "asNeededCodeableConcept";
	java.lang.String requester = "requester";
	java.lang.String performerType = "performerType";
	java.lang.String performer = "performer";
	java.lang.String locationCode = "locationCode";
	java.lang.String locationReference = "locationReference";
	java.lang.String reasonCode = "reasonCode";
	java.lang.String reasonReference = "reasonReference";
	java.lang.String insurance = "insurance";
	java.lang.String supportingInfo = "supportingInfo";
	java.lang.String specimen = "specimen";
	java.lang.String bodySite = "bodySite";
	java.lang.String note = "note";
	java.lang.String relevantHistory = "relevantHistory";

	@Description("Identifiers assigned to this order instance by the orderer and/or the receiver and/or order fulfiller.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("Plan/proposal/order fulfilled by this request.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getBasedOn();
	void setBasedOn(java.util.List<com.braintribe.model.generic.GenericEntity> basedOn);

	@Description("The request takes the place of the referenced completed or terminated request(s).")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getReplaces();
	void setReplaces(java.util.List<com.braintribe.model.generic.GenericEntity> replaces);

	@Description("A shared identifier common to all service requests that were authorized more or less simultaneously by a single author, representing the composite or group identifier.")
	@Mandatory
	fhir.Identifier getRequisition();
	void setRequisition(fhir.Identifier requisition);
	@Description("A code that classifies the service for searching, sorting and display purposes (e.g. 'Surgical Procedure').")
	
	java.util.List<fhir.CodeableConcept> getCategory();
	void setCategory(java.util.List<fhir.CodeableConcept> category);

	@Description("A code that identifies a particular service (i.e., procedure, diagnostic investigation, or panel of investigations) that have been requested.")
	@Mandatory
	fhir.CodeableConcept getCode();
	void setCode(fhir.CodeableConcept code);
	@Description("Additional details and instructions about the how the services are to be delivered.   For example, and order for a urinary catheter may have an order detail for an external or indwelling catheter, or an order for a bandage may require additional instructions specifying how the bandage should be applied.")
	
	java.util.List<fhir.CodeableConcept> getOrderDetail();
	void setOrderDetail(java.util.List<fhir.CodeableConcept> orderDetail);

	@Description("")
	@Mandatory
	fhir.Quantity getQuantityQuantity();
	void setQuantityQuantity(fhir.Quantity quantityQuantity);
	@Description("")
	@Mandatory
	fhir.Ratio getQuantityRatio();
	void setQuantityRatio(fhir.Ratio quantityRatio);
	@Description("")
	@Mandatory
	fhir.Range getQuantityRange();
	void setQuantityRange(fhir.Range quantityRange);
	@Description("On whom or what the service is to be performed. This is usually a human patient, but can also be requested on animals, groups of humans or animals, devices such as dialysis machines, or even locations (typically for environmental scans).")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSubject();
	void setSubject(com.braintribe.model.generic.GenericEntity subject);
	@Description("An encounter that provides additional information about the healthcare context in which this request is made.")
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
	@Description("")
	@Mandatory
	fhir.CodeableConcept getAsNeededCodeableConcept();
	void setAsNeededCodeableConcept(fhir.CodeableConcept asNeededCodeableConcept);
	@Description("The individual who initiated the request and has responsibility for its activation.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getRequester();
	void setRequester(com.braintribe.model.generic.GenericEntity requester);
	@Description("Desired type of performer for doing the requested service.")
	@Mandatory
	fhir.CodeableConcept getPerformerType();
	void setPerformerType(fhir.CodeableConcept performerType);
	@Description("The desired performer for doing the requested service.  For example, the surgeon, dermatopathologist, endoscopist, etc.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getPerformer();
	void setPerformer(java.util.List<com.braintribe.model.generic.GenericEntity> performer);

	@Description("The preferred location(s) where the procedure should actually happen in coded or free text form. E.g. at home or nursing day care center.")
	
	java.util.List<fhir.CodeableConcept> getLocationCode();
	void setLocationCode(java.util.List<fhir.CodeableConcept> locationCode);

	@Description("A reference to the the preferred location(s) where the procedure should actually happen. E.g. at home or nursing day care center.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getLocationReference();
	void setLocationReference(java.util.List<com.braintribe.model.generic.GenericEntity> locationReference);

	@Description("An explanation or justification for why this service is being requested in coded or textual form.   This is often for billing purposes.  May relate to the resources referred to in `supportingInfo`.")
	
	java.util.List<fhir.CodeableConcept> getReasonCode();
	void setReasonCode(java.util.List<fhir.CodeableConcept> reasonCode);

	@Description("Indicates another resource that provides a justification for why this service is being requested.   May relate to the resources referred to in `supportingInfo`.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getReasonReference();
	void setReasonReference(java.util.List<com.braintribe.model.generic.GenericEntity> reasonReference);

	@Description("Insurance plans, coverage extensions, pre-authorizations and/or pre-determinations that may be needed for delivering the requested service.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getInsurance();
	void setInsurance(java.util.List<com.braintribe.model.generic.GenericEntity> insurance);

	@Description("Additional clinical information about the patient or specimen that may influence the services or their interpretations.     This information includes diagnosis, clinical findings and other observations.  In laboratory ordering these are typically referred to as 'ask at order entry questions (AOEs)'.  This includes observations explicitly requested by the producer (filler) to provide context or supporting information needed to complete the order. For example,  reporting the amount of inspired oxygen for blood gas measurements.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getSupportingInfo();
	void setSupportingInfo(java.util.List<com.braintribe.model.generic.GenericEntity> supportingInfo);

	@Description("One or more specimens that the laboratory procedure will use.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getSpecimen();
	void setSpecimen(java.util.List<com.braintribe.model.generic.GenericEntity> specimen);

	@Description("Anatomic location where the procedure should be performed. This is the target site.")
	
	java.util.List<fhir.CodeableConcept> getBodySite();
	void setBodySite(java.util.List<fhir.CodeableConcept> bodySite);

	@Description("Any other notes and comments made about the service request. For example, internal billing notes.")
	
	java.util.List<fhir.Annotation> getNote();
	void setNote(java.util.List<fhir.Annotation> note);

	@Description("Key events in the history of the request.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getRelevantHistory();
	void setRelevantHistory(java.util.List<com.braintribe.model.generic.GenericEntity> relevantHistory);

}
