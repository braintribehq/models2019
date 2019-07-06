/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ExplanationOfBenefitFinancial of the Data Model fhir.
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
{@link allowedMoney}, 
{@link usedMoney}, 

* It provides of then following operations (getters and setters)
{@link getType},
{@link getAllowedMoney},
{@link getUsedMoney},
{@link setType},
{@link setAllowedMoney},
{@link setUsedMoney},
 */

@Description("This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.")

public interface ExplanationOfBenefitFinancial extends GenericEntity, fhir.BackboneElement {

	EntityType<ExplanationOfBenefitFinancial> T = EntityTypes.T(ExplanationOfBenefitFinancial.class);

	/* Constants for each property name. */
	java.lang.String type = "type";
	java.lang.String allowedMoney = "allowedMoney";
	java.lang.String usedMoney = "usedMoney";

	@Description("Classification of benefit being provided.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("")
	@Mandatory
	fhir.Money getAllowedMoney();
	void setAllowedMoney(fhir.Money allowedMoney);
	@Description("")
	@Mandatory
	fhir.Money getUsedMoney();
	void setUsedMoney(fhir.Money usedMoney);
}
