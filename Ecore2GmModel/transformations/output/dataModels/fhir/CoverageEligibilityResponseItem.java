/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type CoverageEligibilityResponseItem of the Data Model fhir.
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
{@link productOrService}, 
{@link modifier}, 
{@link provider}, 
{@link network}, 
{@link unit}, 
{@link term}, 
{@link benefit}, 
{@link authorizationSupporting}, 

* It provides of then following operations (getters and setters)
{@link getCategory},
{@link getProductOrService},
{@link getModifier},
{@link getProvider},
{@link getNetwork},
{@link getUnit},
{@link getTerm},
{@link getBenefit},
{@link getAuthorizationSupporting},
{@link setCategory},
{@link setProductOrService},
{@link setModifier},
{@link setProvider},
{@link setNetwork},
{@link setUnit},
{@link setTerm},
{@link setBenefit},
{@link setAuthorizationSupporting},
 */

@Description("This resource provides eligibility and plan details from the processing of an CoverageEligibilityRequest resource.")

public interface CoverageEligibilityResponseItem extends GenericEntity, fhir.BackboneElement {

	EntityType<CoverageEligibilityResponseItem> T = EntityTypes.T(CoverageEligibilityResponseItem.class);

	/* Constants for each property name. */
	java.lang.String category = "category";
	java.lang.String productOrService = "productOrService";
	java.lang.String modifier = "modifier";
	java.lang.String provider = "provider";
	java.lang.String network = "network";
	java.lang.String unit = "unit";
	java.lang.String term = "term";
	java.lang.String benefit = "benefit";
	java.lang.String authorizationSupporting = "authorizationSupporting";

	@Description("Code to identify the general type of benefits under which products and services are provided.")
	@Mandatory
	fhir.CodeableConcept getCategory();
	void setCategory(fhir.CodeableConcept category);
	@Description("This contains the product, service, drug or other billing code for the item.")
	@Mandatory
	fhir.CodeableConcept getProductOrService();
	void setProductOrService(fhir.CodeableConcept productOrService);
	@Description("Item typification or modifiers codes to convey additional context for the product or service.")
	
	java.util.List<fhir.CodeableConcept> getModifier();
	void setModifier(java.util.List<fhir.CodeableConcept> modifier);

	@Description("The practitioner who is eligible for the provision of the product or service.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getProvider();
	void setProvider(com.braintribe.model.generic.GenericEntity provider);
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
	@Description("Benefits used to date.")
	
	java.util.List<fhir.CoverageEligibilityResponseBenefit> getBenefit();
	void setBenefit(java.util.List<fhir.CoverageEligibilityResponseBenefit> benefit);

	@Description("Codes or comments regarding information or actions associated with the preauthorization.")
	
	java.util.List<fhir.CodeableConcept> getAuthorizationSupporting();
	void setAuthorizationSupporting(java.util.List<fhir.CodeableConcept> authorizationSupporting);

}
