/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ExplanationOfBenefitSupportingInfo of the Data Model fhir.
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
{@link category}, 
{@link code}, 
{@link timingPeriod}, 
{@link valueQuantity}, 
{@link valueAttachment}, 
{@link valueReference}, 
{@link reason}, 

* It provides of then following operations (getters and setters)
{@link getCategory},
{@link getCode},
{@link getTimingPeriod},
{@link getValueQuantity},
{@link getValueAttachment},
{@link getValueReference},
{@link getReason},
{@link setCategory},
{@link setCode},
{@link setTimingPeriod},
{@link setValueQuantity},
{@link setValueAttachment},
{@link setValueReference},
{@link setReason},
 */

@Description("This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.")

public interface ExplanationOfBenefitSupportingInfo extends GenericEntity, fhir.BackboneElement {

	EntityType<ExplanationOfBenefitSupportingInfo> T = EntityTypes.T(ExplanationOfBenefitSupportingInfo.class);

	/* Constants for each property name. */
	java.lang.String category = "category";
	java.lang.String code = "code";
	java.lang.String timingPeriod = "timingPeriod";
	java.lang.String valueQuantity = "valueQuantity";
	java.lang.String valueAttachment = "valueAttachment";
	java.lang.String valueReference = "valueReference";
	java.lang.String reason = "reason";

	@Description("The general class of the information supplied: information; exception; accident, employment; onset, etc.")
	@Mandatory
	fhir.CodeableConcept getCategory();
	void setCategory(fhir.CodeableConcept category);
	@Description("System and code pertaining to the specific information regarding special conditions relating to the setting, treatment or patient  for which care is sought.")
	@Mandatory
	fhir.CodeableConcept getCode();
	void setCode(fhir.CodeableConcept code);
	@Description("")
	@Mandatory
	fhir.Period getTimingPeriod();
	void setTimingPeriod(fhir.Period timingPeriod);
	@Description("")
	@Mandatory
	fhir.Quantity getValueQuantity();
	void setValueQuantity(fhir.Quantity valueQuantity);
	@Description("")
	@Mandatory
	fhir.Attachment getValueAttachment();
	void setValueAttachment(fhir.Attachment valueAttachment);
	@Description("")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getValueReference();
	void setValueReference(com.braintribe.model.generic.GenericEntity valueReference);
	@Description("Provides the reason in the situation where a reason code is required in addition to the content.")
	@Mandatory
	fhir.Coding getReason();
	void setReason(fhir.Coding reason);
}
