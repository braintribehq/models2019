/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Coverage of the Data Model fhir.
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
{@link type}, 
{@link policyHolder}, 
{@link subscriber}, 
{@link beneficiary}, 
{@link relationship}, 
{@link period}, 
{@link payor}, 
{@link class_}, 
{@link costToBeneficiary}, 
{@link contract}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getType},
{@link getPolicyHolder},
{@link getSubscriber},
{@link getBeneficiary},
{@link getRelationship},
{@link getPeriod},
{@link getPayor},
{@link getClass_},
{@link getCostToBeneficiary},
{@link getContract},
{@link setIdentifier},
{@link setType},
{@link setPolicyHolder},
{@link setSubscriber},
{@link setBeneficiary},
{@link setRelationship},
{@link setPeriod},
{@link setPayor},
{@link setClass_},
{@link setCostToBeneficiary},
{@link setContract},
 */

@Description("Financial instrument which may be used to reimburse or pay for health care products and services. Includes both insurance and self-payment.If the element is present, it must have either a @value, an @id, or extensions")

public interface Coverage extends GenericEntity, fhir.FhirDomainResource {

	EntityType<Coverage> T = EntityTypes.T(Coverage.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String type = "type";
	java.lang.String policyHolder = "policyHolder";
	java.lang.String subscriber = "subscriber";
	java.lang.String beneficiary = "beneficiary";
	java.lang.String relationship = "relationship";
	java.lang.String period = "period";
	java.lang.String payor = "payor";
	java.lang.String class_ = "class_";
	java.lang.String costToBeneficiary = "costToBeneficiary";
	java.lang.String contract = "contract";

	@Description("A unique identifier assigned to this coverage.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("The type of coverage: social program, medical plan, accident coverage (workers compensation, auto), group health or payment by an individual or organization.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("The party who 'owns' the insurance policy.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getPolicyHolder();
	void setPolicyHolder(com.braintribe.model.generic.GenericEntity policyHolder);
	@Description("The party who has signed-up for or 'owns' the contractual relationship to the policy or to whom the benefit of the policy for services rendered to them or their family is due.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSubscriber();
	void setSubscriber(com.braintribe.model.generic.GenericEntity subscriber);
	@Description("The party who benefits from the insurance coverage; the patient when products and/or services are provided.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getBeneficiary();
	void setBeneficiary(com.braintribe.model.generic.GenericEntity beneficiary);
	@Description("The relationship of beneficiary (patient) to the subscriber.")
	@Mandatory
	fhir.CodeableConcept getRelationship();
	void setRelationship(fhir.CodeableConcept relationship);
	@Description("Time period during which the coverage is in force. A missing start date indicates the start date isn't known, a missing end date means the coverage is continuing to be in force.")
	@Mandatory
	fhir.Period getPeriod();
	void setPeriod(fhir.Period period);
	@Description("The program or plan underwriter or payor including both insurance and non-insurance agreements, such as patient-pay agreements.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getPayor();
	void setPayor(java.util.List<com.braintribe.model.generic.GenericEntity> payor);

	@Description("A suite of underwriter specific classifiers.")
	
	java.util.List<fhir.CoverageClass> getClass_();
	void setClass_(java.util.List<fhir.CoverageClass> class_);

	@Description("A suite of codes indicating the cost category and associated amount which have been detailed in the policy and may have been  included on the health card.")
	
	java.util.List<fhir.CoverageCostToBeneficiary> getCostToBeneficiary();
	void setCostToBeneficiary(java.util.List<fhir.CoverageCostToBeneficiary> costToBeneficiary);

	@Description("The policy(s) which constitute this insurance coverage.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getContract();
	void setContract(java.util.List<com.braintribe.model.generic.GenericEntity> contract);

}
