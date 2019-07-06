/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type InsurancePlanPlan of the Data Model fhir.
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
{@link coverageArea}, 
{@link network}, 
{@link generalCost}, 
{@link specificCost}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getType},
{@link getCoverageArea},
{@link getNetwork},
{@link getGeneralCost},
{@link getSpecificCost},
{@link setIdentifier},
{@link setType},
{@link setCoverageArea},
{@link setNetwork},
{@link setGeneralCost},
{@link setSpecificCost},
 */

@Description("Details of a Health Insurance product/plan provided by an organization.")

public interface InsurancePlanPlan extends GenericEntity, fhir.BackboneElement {

	EntityType<InsurancePlanPlan> T = EntityTypes.T(InsurancePlanPlan.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String type = "type";
	java.lang.String coverageArea = "coverageArea";
	java.lang.String network = "network";
	java.lang.String generalCost = "generalCost";
	java.lang.String specificCost = "specificCost";

	@Description("Business identifiers assigned to this health insurance plan which remain constant as the resource is updated and propagates from server to server.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("Type of plan. For example, 'Platinum' or 'High Deductable'.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("The geographic region in which a health insurance plan's benefits apply.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getCoverageArea();
	void setCoverageArea(java.util.List<com.braintribe.model.generic.GenericEntity> coverageArea);

	@Description("Reference to the network that providing the type of coverage.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getNetwork();
	void setNetwork(java.util.List<com.braintribe.model.generic.GenericEntity> network);

	@Description("Overall costs associated with the plan.")
	
	java.util.List<fhir.InsurancePlanGeneralCost> getGeneralCost();
	void setGeneralCost(java.util.List<fhir.InsurancePlanGeneralCost> generalCost);

	@Description("Costs associated with the coverage provided by the product.")
	
	java.util.List<fhir.InsurancePlanSpecificCost> getSpecificCost();
	void setSpecificCost(java.util.List<fhir.InsurancePlanSpecificCost> specificCost);

}
