/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type SpecimenDefinitionHandling of the Data Model fhir.
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
{@link temperatureQualifier}, 
{@link temperatureRange}, 
{@link maxDuration}, 

* It provides of then following operations (getters and setters)
{@link getTemperatureQualifier},
{@link getTemperatureRange},
{@link getMaxDuration},
{@link setTemperatureQualifier},
{@link setTemperatureRange},
{@link setMaxDuration},
 */

@Description("A kind of specimen with associated set of requirements.")

public interface SpecimenDefinitionHandling extends GenericEntity, fhir.BackboneElement {

	EntityType<SpecimenDefinitionHandling> T = EntityTypes.T(SpecimenDefinitionHandling.class);

	/* Constants for each property name. */
	java.lang.String temperatureQualifier = "temperatureQualifier";
	java.lang.String temperatureRange = "temperatureRange";
	java.lang.String maxDuration = "maxDuration";

	@Description("It qualifies the interval of temperature, which characterizes an occurrence of handling. Conditions that are not related to temperature may be handled in the instruction element.")
	@Mandatory
	fhir.CodeableConcept getTemperatureQualifier();
	void setTemperatureQualifier(fhir.CodeableConcept temperatureQualifier);
	@Description("The temperature interval for this set of handling instructions.")
	@Mandatory
	fhir.Range getTemperatureRange();
	void setTemperatureRange(fhir.Range temperatureRange);
	@Description("The maximum time interval of preservation of the specimen with these conditions.")
	@Mandatory
	fhir.Duration getMaxDuration();
	void setMaxDuration(fhir.Duration maxDuration);
}
