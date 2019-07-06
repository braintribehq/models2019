/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type EncounterLocation of the Data Model fhir.
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
{@link location}, 
{@link physicalType}, 
{@link period}, 

* It provides of then following operations (getters and setters)
{@link getLocation},
{@link getPhysicalType},
{@link getPeriod},
{@link setLocation},
{@link setPhysicalType},
{@link setPeriod},
 */

@Description("An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.")

public interface EncounterLocation extends GenericEntity, fhir.BackboneElement {

	EntityType<EncounterLocation> T = EntityTypes.T(EncounterLocation.class);

	/* Constants for each property name. */
	java.lang.String location = "location";
	java.lang.String physicalType = "physicalType";
	java.lang.String period = "period";

	@Description("The location where the encounter takes place.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getLocation();
	void setLocation(com.braintribe.model.generic.GenericEntity location);
	@Description("This will be used to specify the required levels (bed/ward/room/etc.) desired to be recorded to simplify either messaging or query.")
	@Mandatory
	fhir.CodeableConcept getPhysicalType();
	void setPhysicalType(fhir.CodeableConcept physicalType);
	@Description("Time period during which the patient was present at the location.")
	@Mandatory
	fhir.Period getPeriod();
	void setPeriod(fhir.Period period);
}
