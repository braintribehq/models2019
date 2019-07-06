/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type EncounterParticipant of the Data Model fhir.
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
{@link period}, 
{@link individual}, 

* It provides of then following operations (getters and setters)
{@link getType},
{@link getPeriod},
{@link getIndividual},
{@link setType},
{@link setPeriod},
{@link setIndividual},
 */

@Description("An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.")

public interface EncounterParticipant extends GenericEntity, fhir.BackboneElement {

	EntityType<EncounterParticipant> T = EntityTypes.T(EncounterParticipant.class);

	/* Constants for each property name. */
	java.lang.String type = "type";
	java.lang.String period = "period";
	java.lang.String individual = "individual";

	@Description("Role of participant in encounter.")
	
	java.util.List<fhir.CodeableConcept> getType();
	void setType(java.util.List<fhir.CodeableConcept> type);

	@Description("The period of time that the specified participant participated in the encounter. These can overlap or be sub-sets of the overall encounter's period.")
	@Mandatory
	fhir.Period getPeriod();
	void setPeriod(fhir.Period period);
	@Description("Persons involved in the encounter other than the patient.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getIndividual();
	void setIndividual(com.braintribe.model.generic.GenericEntity individual);
}
