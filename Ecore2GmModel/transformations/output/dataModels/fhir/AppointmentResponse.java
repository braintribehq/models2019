/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type AppointmentResponse of the Data Model fhir.
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
{@link appointment}, 
{@link participantType}, 
{@link actor}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getAppointment},
{@link getParticipantType},
{@link getActor},
{@link setIdentifier},
{@link setAppointment},
{@link setParticipantType},
{@link setActor},
 */

@Description("A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or rejection.If the element is present, it must have either a @value, an @id, or extensions")

public interface AppointmentResponse extends GenericEntity, fhir.FhirDomainResource {

	EntityType<AppointmentResponse> T = EntityTypes.T(AppointmentResponse.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String appointment = "appointment";
	java.lang.String participantType = "participantType";
	java.lang.String actor = "actor";

	@Description("This records identifiers associated with this appointment response concern that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("Appointment that this response is replying to.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getAppointment();
	void setAppointment(com.braintribe.model.generic.GenericEntity appointment);
	@Description("Role of participant in the appointment.")
	
	java.util.List<fhir.CodeableConcept> getParticipantType();
	void setParticipantType(java.util.List<fhir.CodeableConcept> participantType);

	@Description("A Person, Location, HealthcareService, or Device that is participating in the appointment.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getActor();
	void setActor(com.braintribe.model.generic.GenericEntity actor);
}
