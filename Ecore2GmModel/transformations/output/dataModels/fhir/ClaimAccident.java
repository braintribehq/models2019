/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ClaimAccident of the Data Model fhir.
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
{@link locationAddress}, 
{@link locationReference}, 

* It provides of then following operations (getters and setters)
{@link getType},
{@link getLocationAddress},
{@link getLocationReference},
{@link setType},
{@link setLocationAddress},
{@link setLocationReference},
 */

@Description("A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement.")

public interface ClaimAccident extends GenericEntity, fhir.BackboneElement {

	EntityType<ClaimAccident> T = EntityTypes.T(ClaimAccident.class);

	/* Constants for each property name. */
	java.lang.String type = "type";
	java.lang.String locationAddress = "locationAddress";
	java.lang.String locationReference = "locationReference";

	@Description("The type or context of the accident event for the purposes of selection of potential insurance coverages and determination of coordination between insurers.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("")
	@Mandatory
	fhir.Address getLocationAddress();
	void setLocationAddress(fhir.Address locationAddress);
	@Description("")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getLocationReference();
	void setLocationReference(com.braintribe.model.generic.GenericEntity locationReference);
}
