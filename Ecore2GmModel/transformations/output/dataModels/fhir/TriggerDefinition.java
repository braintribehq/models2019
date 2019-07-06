/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type TriggerDefinition of the Data Model fhir.
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
{@link timingTiming}, 
{@link timingReference}, 
{@link data}, 
{@link condition}, 

* It provides of then following operations (getters and setters)
{@link getTimingTiming},
{@link getTimingReference},
{@link getData},
{@link getCondition},
{@link setTimingTiming},
{@link setTimingReference},
{@link setData},
{@link setCondition},
 */

@Description("A description of a triggering event. Triggering events can be named events, data events, or periodic, as determined by the type element.If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions")

public interface TriggerDefinition extends GenericEntity {

	EntityType<TriggerDefinition> T = EntityTypes.T(TriggerDefinition.class);

	/* Constants for each property name. */
	java.lang.String timingTiming = "timingTiming";
	java.lang.String timingReference = "timingReference";
	java.lang.String data = "data";
	java.lang.String condition = "condition";

	@Description("")
	@Mandatory
	fhir.Timing getTimingTiming();
	void setTimingTiming(fhir.Timing timingTiming);
	@Description("")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getTimingReference();
	void setTimingReference(com.braintribe.model.generic.GenericEntity timingReference);
	@Description("The triggering data of the event (if this is a data trigger). If more than one data is requirement is specified, then all the data requirements must be true.")
	
	java.util.List<fhir.DataRequirement> getData();
	void setData(java.util.List<fhir.DataRequirement> data);

	@Description("A boolean-valued expression that is evaluated in the context of the container of the trigger definition and returns whether or not the trigger fires.")
	@Mandatory
	fhir.Expression getCondition();
	void setCondition(fhir.Expression condition);
}
