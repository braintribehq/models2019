/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type InsurancePlanCoverage of the Data Model fhir.
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
{@link network}, 
{@link benefit}, 

* It provides of then following operations (getters and setters)
{@link getType},
{@link getNetwork},
{@link getBenefit},
{@link setType},
{@link setNetwork},
{@link setBenefit},
 */

@Description("Details of a Health Insurance product/plan provided by an organization.")

public interface InsurancePlanCoverage extends GenericEntity, fhir.BackboneElement {

	EntityType<InsurancePlanCoverage> T = EntityTypes.T(InsurancePlanCoverage.class);

	/* Constants for each property name. */
	java.lang.String type = "type";
	java.lang.String network = "network";
	java.lang.String benefit = "benefit";

	@Description("Type of coverage  (Medical; Dental; Mental Health; Substance Abuse; Vision; Drug; Short Term; Long Term Care; Hospice; Home Health).")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("Reference to the network that providing the type of coverage.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getNetwork();
	void setNetwork(java.util.List<com.braintribe.model.generic.GenericEntity> network);

	@Description("Specific benefits under this type of coverage.")
	
	java.util.List<fhir.InsurancePlanBenefit> getBenefit();
	void setBenefit(java.util.List<fhir.InsurancePlanBenefit> benefit);

}
