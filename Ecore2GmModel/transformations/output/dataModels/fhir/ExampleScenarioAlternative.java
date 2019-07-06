/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ExampleScenarioAlternative of the Data Model fhir.
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
{@link step}, 

* It provides of then following operations (getters and setters)
{@link getStep},
{@link setStep},
 */

@Description("Example of workflow instance.")

public interface ExampleScenarioAlternative extends GenericEntity, fhir.BackboneElement {

	EntityType<ExampleScenarioAlternative> T = EntityTypes.T(ExampleScenarioAlternative.class);

	/* Constants for each property name. */
	java.lang.String step = "step";

	@Description("What happens in each alternative option.")
	
	java.util.List<fhir.ExampleScenarioStep> getStep();
	void setStep(java.util.List<fhir.ExampleScenarioStep> step);

}
