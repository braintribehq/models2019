/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type TimingRepeat of the Data Model fhir.
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
{@link boundsDuration}, 
{@link boundsRange}, 
{@link boundsPeriod}, 

* It provides of then following operations (getters and setters)
{@link getBoundsDuration},
{@link getBoundsRange},
{@link getBoundsPeriod},
{@link setBoundsDuration},
{@link setBoundsRange},
{@link setBoundsPeriod},
 */

@Description("Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions")

public interface TimingRepeat extends GenericEntity, fhir.BackboneElement {

	EntityType<TimingRepeat> T = EntityTypes.T(TimingRepeat.class);

	/* Constants for each property name. */
	java.lang.String boundsDuration = "boundsDuration";
	java.lang.String boundsRange = "boundsRange";
	java.lang.String boundsPeriod = "boundsPeriod";

	@Description("")
	@Mandatory
	fhir.Duration getBoundsDuration();
	void setBoundsDuration(fhir.Duration boundsDuration);
	@Description("")
	@Mandatory
	fhir.Range getBoundsRange();
	void setBoundsRange(fhir.Range boundsRange);
	@Description("")
	@Mandatory
	fhir.Period getBoundsPeriod();
	void setBoundsPeriod(fhir.Period boundsPeriod);
}
