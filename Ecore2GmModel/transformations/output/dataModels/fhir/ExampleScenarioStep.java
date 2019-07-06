/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ExampleScenarioStep of the Data Model fhir.
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
{@link process}, 
{@link operation}, 
{@link alternative}, 

* It provides of then following operations (getters and setters)
{@link getProcess},
{@link getOperation},
{@link getAlternative},
{@link setProcess},
{@link setOperation},
{@link setAlternative},
 */

@Description("Example of workflow instance.")

public interface ExampleScenarioStep extends GenericEntity, fhir.BackboneElement {

	EntityType<ExampleScenarioStep> T = EntityTypes.T(ExampleScenarioStep.class);

	/* Constants for each property name. */
	java.lang.String process = "process";
	java.lang.String operation = "operation";
	java.lang.String alternative = "alternative";

	@Description("Nested process.")
	
	java.util.List<fhir.ExampleScenarioProcess> getProcess();
	void setProcess(java.util.List<fhir.ExampleScenarioProcess> process);

	@Description("Each interaction or action.")
	@Mandatory
	fhir.ExampleScenarioOperation getOperation();
	void setOperation(fhir.ExampleScenarioOperation operation);
	@Description("Indicates an alternative step that can be taken instead of the operations on the base step in exceptional/atypical circumstances.")
	
	java.util.List<fhir.ExampleScenarioAlternative> getAlternative();
	void setAlternative(java.util.List<fhir.ExampleScenarioAlternative> alternative);

}
