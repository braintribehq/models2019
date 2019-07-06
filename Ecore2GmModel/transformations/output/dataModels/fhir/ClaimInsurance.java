/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ClaimInsurance of the Data Model fhir.
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
{@link coverage}, 
{@link claimResponse}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getCoverage},
{@link getClaimResponse},
{@link setIdentifier},
{@link setCoverage},
{@link setClaimResponse},
 */

@Description("A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement.")

public interface ClaimInsurance extends GenericEntity, fhir.BackboneElement {

	EntityType<ClaimInsurance> T = EntityTypes.T(ClaimInsurance.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String coverage = "coverage";
	java.lang.String claimResponse = "claimResponse";

	@Description("The business identifier to be used when the claim is sent for adjudication against this insurance policy.")
	@Mandatory
	fhir.Identifier getIdentifier();
	void setIdentifier(fhir.Identifier identifier);
	@Description("Reference to the insurance card level information contained in the Coverage resource. The coverage issuing insurer will use these details to locate the patient's actual coverage within the insurer's information system.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getCoverage();
	void setCoverage(com.braintribe.model.generic.GenericEntity coverage);
	@Description("The result of the adjudication of the line items for the Coverage specified in this insurance.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getClaimResponse();
	void setClaimResponse(com.braintribe.model.generic.GenericEntity claimResponse);
}
