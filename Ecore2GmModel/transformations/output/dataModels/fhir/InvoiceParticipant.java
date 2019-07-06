/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type InvoiceParticipant of the Data Model fhir.
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
{@link role}, 
{@link actor}, 

* It provides of then following operations (getters and setters)
{@link getRole},
{@link getActor},
{@link setRole},
{@link setActor},
 */

@Description("Invoice containing collected ChargeItems from an Account with calculated individual and total price for Billing purpose.")

public interface InvoiceParticipant extends GenericEntity, fhir.BackboneElement {

	EntityType<InvoiceParticipant> T = EntityTypes.T(InvoiceParticipant.class);

	/* Constants for each property name. */
	java.lang.String role = "role";
	java.lang.String actor = "actor";

	@Description("Describes the type of involvement (e.g. transcriptionist, creator etc.). If the invoice has been created automatically, the Participant may be a billing engine or another kind of device.")
	@Mandatory
	fhir.CodeableConcept getRole();
	void setRole(fhir.CodeableConcept role);
	@Description("The device, practitioner, etc. who performed or participated in the service.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getActor();
	void setActor(com.braintribe.model.generic.GenericEntity actor);
}
