/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ExampleScenarioOperation of the Data Model fhir.
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
{@link request}, 
{@link response}, 

* It provides of then following operations (getters and setters)
{@link getRequest},
{@link getResponse},
{@link setRequest},
{@link setResponse},
 */

@Description("Example of workflow instance.")

public interface ExampleScenarioOperation extends GenericEntity, fhir.BackboneElement {

	EntityType<ExampleScenarioOperation> T = EntityTypes.T(ExampleScenarioOperation.class);

	/* Constants for each property name. */
	java.lang.String request = "request";
	java.lang.String response = "response";

	@Description("Each resource instance used by the initiator.")
	@Mandatory
	fhir.ExampleScenarioContainedInstance getRequest();
	void setRequest(fhir.ExampleScenarioContainedInstance request);
	@Description("Each resource instance used by the responder.")
	@Mandatory
	fhir.ExampleScenarioContainedInstance getResponse();
	void setResponse(fhir.ExampleScenarioContainedInstance response);
}
