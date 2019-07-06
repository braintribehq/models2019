/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ExplanationOfBenefitBenefitBalance of the Data Model fhir.
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
{@link network}, 
{@link unit}, 
{@link term}, 
{@link financial}, 

* It provides of then following operations (getters and setters)
{@link getCategory},
{@link getNetwork},
{@link getUnit},
{@link getTerm},
{@link getFinancial},
{@link setCategory},
{@link setNetwork},
{@link setUnit},
{@link setTerm},
{@link setFinancial},
 */

@Description("This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.")

public interface ExplanationOfBenefitBenefitBalance extends GenericEntity, fhir.BackboneElement {

	EntityType<ExplanationOfBenefitBenefitBalance> T = EntityTypes.T(ExplanationOfBenefitBenefitBalance.class);

	/* Constants for each property name. */
	java.lang.String category = "category";
	java.lang.String network = "network";
	java.lang.String unit = "unit";
	java.lang.String term = "term";
	java.lang.String financial = "financial";

	@Description("Code to identify the general type of benefits under which products and services are provided.")
	@Mandatory
	fhir.CodeableConcept getCategory();
	void setCategory(fhir.CodeableConcept category);
	@Description("Is a flag to indicate whether the benefits refer to in-network providers or out-of-network providers.")
	@Mandatory
	fhir.CodeableConcept getNetwork();
	void setNetwork(fhir.CodeableConcept network);
	@Description("Indicates if the benefits apply to an individual or to the family.")
	@Mandatory
	fhir.CodeableConcept getUnit();
	void setUnit(fhir.CodeableConcept unit);
	@Description("The term or period of the values such as 'maximum lifetime benefit' or 'maximum annual visits'.")
	@Mandatory
	fhir.CodeableConcept getTerm();
	void setTerm(fhir.CodeableConcept term);
	@Description("Benefits Used to date.")
	
	java.util.List<fhir.ExplanationOfBenefitFinancial> getFinancial();
	void setFinancial(java.util.List<fhir.ExplanationOfBenefitFinancial> financial);

}
