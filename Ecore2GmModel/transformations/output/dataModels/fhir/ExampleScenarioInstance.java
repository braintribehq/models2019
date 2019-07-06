/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ExampleScenarioInstance of the Data Model fhir.
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
{@link version}, 
{@link containedInstance}, 

* It provides of then following operations (getters and setters)
{@link getVersion},
{@link getContainedInstance},
{@link setVersion},
{@link setContainedInstance},
 */

@Description("Example of workflow instance.")

public interface ExampleScenarioInstance extends GenericEntity, fhir.BackboneElement {

	EntityType<ExampleScenarioInstance> T = EntityTypes.T(ExampleScenarioInstance.class);

	/* Constants for each property name. */
	java.lang.String version = "version";
	java.lang.String containedInstance = "containedInstance";

	@Description("A specific version of the resource.")
	
	java.util.List<fhir.ExampleScenarioVersion> getVersion();
	void setVersion(java.util.List<fhir.ExampleScenarioVersion> version);

	@Description("Resources contained in the instance (e.g. the observations contained in a bundle).")
	
	java.util.List<fhir.ExampleScenarioContainedInstance> getContainedInstance();
	void setContainedInstance(java.util.List<fhir.ExampleScenarioContainedInstance> containedInstance);

}
