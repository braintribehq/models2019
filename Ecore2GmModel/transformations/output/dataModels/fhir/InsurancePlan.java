/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type InsurancePlan of the Data Model fhir.
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
{@link period}, 
{@link ownedBy}, 
{@link administeredBy}, 
{@link coverageArea}, 
{@link contact}, 
{@link endpoint}, 
{@link network}, 
{@link coverage}, 
{@link plan}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getType},
{@link getPeriod},
{@link getOwnedBy},
{@link getAdministeredBy},
{@link getCoverageArea},
{@link getContact},
{@link getEndpoint},
{@link getNetwork},
{@link getCoverage},
{@link getPlan},
{@link setIdentifier},
{@link setType},
{@link setPeriod},
{@link setOwnedBy},
{@link setAdministeredBy},
{@link setCoverageArea},
{@link setContact},
{@link setEndpoint},
{@link setNetwork},
{@link setCoverage},
{@link setPlan},
 */

@Description("Details of a Health Insurance product/plan provided by an organization.If the element is present, it must have either a @value, an @id, or extensions")

public interface InsurancePlan extends GenericEntity, fhir.FhirDomainResource {

	EntityType<InsurancePlan> T = EntityTypes.T(InsurancePlan.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String type = "type";
	java.lang.String period = "period";
	java.lang.String ownedBy = "ownedBy";
	java.lang.String administeredBy = "administeredBy";
	java.lang.String coverageArea = "coverageArea";
	java.lang.String contact = "contact";
	java.lang.String endpoint = "endpoint";
	java.lang.String network = "network";
	java.lang.String coverage = "coverage";
	java.lang.String plan = "plan";

	@Description("Business identifiers assigned to this health insurance product which remain constant as the resource is updated and propagates from server to server.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("The kind of health insurance product.")
	
	java.util.List<fhir.CodeableConcept> getType();
	void setType(java.util.List<fhir.CodeableConcept> type);

	@Description("The period of time that the health insurance product is available.")
	@Mandatory
	fhir.Period getPeriod();
	void setPeriod(fhir.Period period);
	@Description("The entity that is providing  the health insurance product and underwriting the risk.  This is typically an insurance carriers, other third-party payers, or health plan sponsors comonly referred to as 'payers'.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getOwnedBy();
	void setOwnedBy(com.braintribe.model.generic.GenericEntity ownedBy);
	@Description("An organization which administer other services such as underwriting, customer service and/or claims processing on behalf of the health insurance product owner.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getAdministeredBy();
	void setAdministeredBy(com.braintribe.model.generic.GenericEntity administeredBy);
	@Description("The geographic region in which a health insurance product's benefits apply.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getCoverageArea();
	void setCoverageArea(java.util.List<com.braintribe.model.generic.GenericEntity> coverageArea);

	@Description("The contact for the health insurance product for a certain purpose.")
	
	java.util.List<fhir.InsurancePlanContact> getContact();
	void setContact(java.util.List<fhir.InsurancePlanContact> contact);

	@Description("The technical endpoints providing access to services operated for the health insurance product.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getEndpoint();
	void setEndpoint(java.util.List<com.braintribe.model.generic.GenericEntity> endpoint);

	@Description("Reference to the network included in the health insurance product.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getNetwork();
	void setNetwork(java.util.List<com.braintribe.model.generic.GenericEntity> network);

	@Description("Details about the coverage offered by the insurance product.")
	
	java.util.List<fhir.InsurancePlanCoverage> getCoverage();
	void setCoverage(java.util.List<fhir.InsurancePlanCoverage> coverage);

	@Description("Details about an insurance plan.")
	
	java.util.List<fhir.InsurancePlanPlan> getPlan();
	void setPlan(java.util.List<fhir.InsurancePlanPlan> plan);

}
