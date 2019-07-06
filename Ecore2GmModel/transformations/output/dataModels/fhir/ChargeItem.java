/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ChargeItem of the Data Model fhir.
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
{@link partOf}, 
{@link code}, 
{@link subject}, 
{@link context}, 
{@link occurrencePeriod}, 
{@link occurrenceTiming}, 
{@link performer}, 
{@link performingOrganization}, 
{@link requestingOrganization}, 
{@link costCenter}, 
{@link quantity}, 
{@link bodysite}, 
{@link priceOverride}, 
{@link enterer}, 
{@link reason}, 
{@link service}, 
{@link productReference}, 
{@link productCodeableConcept}, 
{@link account}, 
{@link note}, 
{@link supportingInformation}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getPartOf},
{@link getCode},
{@link getSubject},
{@link getContext},
{@link getOccurrencePeriod},
{@link getOccurrenceTiming},
{@link getPerformer},
{@link getPerformingOrganization},
{@link getRequestingOrganization},
{@link getCostCenter},
{@link getQuantity},
{@link getBodysite},
{@link getPriceOverride},
{@link getEnterer},
{@link getReason},
{@link getService},
{@link getProductReference},
{@link getProductCodeableConcept},
{@link getAccount},
{@link getNote},
{@link getSupportingInformation},
{@link setIdentifier},
{@link setPartOf},
{@link setCode},
{@link setSubject},
{@link setContext},
{@link setOccurrencePeriod},
{@link setOccurrenceTiming},
{@link setPerformer},
{@link setPerformingOrganization},
{@link setRequestingOrganization},
{@link setCostCenter},
{@link setQuantity},
{@link setBodysite},
{@link setPriceOverride},
{@link setEnterer},
{@link setReason},
{@link setService},
{@link setProductReference},
{@link setProductCodeableConcept},
{@link setAccount},
{@link setNote},
{@link setSupportingInformation},
 */

@Description("The resource ChargeItem describes the provision of healthcare provider products for a certain patient, therefore referring not only to the product, but containing in addition details of the provision, like date, time, amounts and participating organizations and persons. Main Usage of the ChargeItem is to enable the billing process and internal cost allocation.If the element is present, it must have either a @value, an @id, or extensions")

public interface ChargeItem extends GenericEntity, fhir.FhirDomainResource {

	EntityType<ChargeItem> T = EntityTypes.T(ChargeItem.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String partOf = "partOf";
	java.lang.String code = "code";
	java.lang.String subject = "subject";
	java.lang.String context = "context";
	java.lang.String occurrencePeriod = "occurrencePeriod";
	java.lang.String occurrenceTiming = "occurrenceTiming";
	java.lang.String performer = "performer";
	java.lang.String performingOrganization = "performingOrganization";
	java.lang.String requestingOrganization = "requestingOrganization";
	java.lang.String costCenter = "costCenter";
	java.lang.String quantity = "quantity";
	java.lang.String bodysite = "bodysite";
	java.lang.String priceOverride = "priceOverride";
	java.lang.String enterer = "enterer";
	java.lang.String reason = "reason";
	java.lang.String service = "service";
	java.lang.String productReference = "productReference";
	java.lang.String productCodeableConcept = "productCodeableConcept";
	java.lang.String account = "account";
	java.lang.String note = "note";
	java.lang.String supportingInformation = "supportingInformation";

	@Description("Identifiers assigned to this event performer or other systems.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("ChargeItems can be grouped to larger ChargeItems covering the whole set.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getPartOf();
	void setPartOf(java.util.List<com.braintribe.model.generic.GenericEntity> partOf);

	@Description("A code that identifies the charge, like a billing code.")
	@Mandatory
	fhir.CodeableConcept getCode();
	void setCode(fhir.CodeableConcept code);
	@Description("The individual or set of individuals the action is being or was performed on.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSubject();
	void setSubject(com.braintribe.model.generic.GenericEntity subject);
	@Description("The encounter or episode of care that establishes the context for this event.")
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
	@Description("Indicates who or what performed or participated in the charged service.")
	
	java.util.List<fhir.ChargeItemPerformer> getPerformer();
	void setPerformer(java.util.List<fhir.ChargeItemPerformer> performer);

	@Description("The organization requesting the service.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getPerformingOrganization();
	void setPerformingOrganization(com.braintribe.model.generic.GenericEntity performingOrganization);
	@Description("The organization performing the service.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getRequestingOrganization();
	void setRequestingOrganization(com.braintribe.model.generic.GenericEntity requestingOrganization);
	@Description("The financial cost center permits the tracking of charge attribution.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getCostCenter();
	void setCostCenter(com.braintribe.model.generic.GenericEntity costCenter);
	@Description("Quantity of which the charge item has been serviced.")
	@Mandatory
	fhir.Quantity getQuantity();
	void setQuantity(fhir.Quantity quantity);
	@Description("The anatomical location where the related service has been applied.")
	
	java.util.List<fhir.CodeableConcept> getBodysite();
	void setBodysite(java.util.List<fhir.CodeableConcept> bodysite);

	@Description("Total price of the charge overriding the list price associated with the code.")
	@Mandatory
	fhir.Money getPriceOverride();
	void setPriceOverride(fhir.Money priceOverride);
	@Description("The device, practitioner, etc. who entered the charge item.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getEnterer();
	void setEnterer(com.braintribe.model.generic.GenericEntity enterer);
	@Description("Describes why the event occurred in coded or textual form.")
	
	java.util.List<fhir.CodeableConcept> getReason();
	void setReason(java.util.List<fhir.CodeableConcept> reason);

	@Description("Indicated the rendered service that caused this charge.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getService();
	void setService(java.util.List<com.braintribe.model.generic.GenericEntity> service);

	@Description("")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getProductReference();
	void setProductReference(com.braintribe.model.generic.GenericEntity productReference);
	@Description("")
	@Mandatory
	fhir.CodeableConcept getProductCodeableConcept();
	void setProductCodeableConcept(fhir.CodeableConcept productCodeableConcept);
	@Description("Account into which this ChargeItems belongs.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getAccount();
	void setAccount(java.util.List<com.braintribe.model.generic.GenericEntity> account);

	@Description("Comments made about the event by the performer, subject or other participants.")
	
	java.util.List<fhir.Annotation> getNote();
	void setNote(java.util.List<fhir.Annotation> note);

	@Description("Further information supporting this charge.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getSupportingInformation();
	void setSupportingInformation(java.util.List<com.braintribe.model.generic.GenericEntity> supportingInformation);

}
