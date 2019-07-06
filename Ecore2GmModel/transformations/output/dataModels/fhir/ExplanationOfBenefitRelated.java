/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ExplanationOfBenefitRelated of the Data Model fhir.
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
{@link claim}, 
{@link relationship}, 
{@link reference}, 

* It provides of then following operations (getters and setters)
{@link getClaim},
{@link getRelationship},
{@link getReference},
{@link setClaim},
{@link setRelationship},
{@link setReference},
 */

@Description("This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.")

public interface ExplanationOfBenefitRelated extends GenericEntity, fhir.BackboneElement {

	EntityType<ExplanationOfBenefitRelated> T = EntityTypes.T(ExplanationOfBenefitRelated.class);

	/* Constants for each property name. */
	java.lang.String claim = "claim";
	java.lang.String relationship = "relationship";
	java.lang.String reference = "reference";

	@Description("Reference to a related claim.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getClaim();
	void setClaim(com.braintribe.model.generic.GenericEntity claim);
	@Description("A code to convey how the claims are related.")
	@Mandatory
	fhir.CodeableConcept getRelationship();
	void setRelationship(fhir.CodeableConcept relationship);
	@Description("An alternate organizational reference to the case or file to which this particular claim pertains.")
	@Mandatory
	fhir.Identifier getReference();
	void setReference(fhir.Identifier reference);
}
