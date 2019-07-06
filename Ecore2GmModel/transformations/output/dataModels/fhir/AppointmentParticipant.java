/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type AppointmentParticipant of the Data Model fhir.
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
{@link actor}, 
{@link period}, 

* It provides of then following operations (getters and setters)
{@link getType},
{@link getActor},
{@link getPeriod},
{@link setType},
{@link setActor},
{@link setPeriod},
 */

@Description("A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s).")

public interface AppointmentParticipant extends GenericEntity, fhir.BackboneElement {

	EntityType<AppointmentParticipant> T = EntityTypes.T(AppointmentParticipant.class);

	/* Constants for each property name. */
	java.lang.String type = "type";
	java.lang.String actor = "actor";
	java.lang.String period = "period";

	@Description("Role of participant in the appointment.")
	
	java.util.List<fhir.CodeableConcept> getType();
	void setType(java.util.List<fhir.CodeableConcept> type);

	@Description("A Person, Location/HealthcareService or Device that is participating in the appointment.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getActor();
	void setActor(com.braintribe.model.generic.GenericEntity actor);
	@Description("Participation period of the actor.")
	@Mandatory
	fhir.Period getPeriod();
	void setPeriod(fhir.Period period);
}
