/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ClaimCareTeam of the Data Model fhir.
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
{@link provider}, 
{@link role}, 
{@link qualification}, 

* It provides of then following operations (getters and setters)
{@link getProvider},
{@link getRole},
{@link getQualification},
{@link setProvider},
{@link setRole},
{@link setQualification},
 */

@Description("A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement.")

public interface ClaimCareTeam extends GenericEntity, fhir.BackboneElement {

	EntityType<ClaimCareTeam> T = EntityTypes.T(ClaimCareTeam.class);

	/* Constants for each property name. */
	java.lang.String provider = "provider";
	java.lang.String role = "role";
	java.lang.String qualification = "qualification";

	@Description("Member of the team who provided the product or service.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getProvider();
	void setProvider(com.braintribe.model.generic.GenericEntity provider);
	@Description("The lead, assisting or supervising practitioner and their discipline if a multidisciplinary team.")
	@Mandatory
	fhir.CodeableConcept getRole();
	void setRole(fhir.CodeableConcept role);
	@Description("The qualification of the practitioner which is applicable for this service.")
	@Mandatory
	fhir.CodeableConcept getQualification();
	void setQualification(fhir.CodeableConcept qualification);
}
