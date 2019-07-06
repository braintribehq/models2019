/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type TestScriptSetup of the Data Model fhir.
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
{@link action}, 

* It provides of then following operations (getters and setters)
{@link getAction},
{@link setAction},
 */

@Description("A structured set of tests against a FHIR server or client implementation to determine compliance against the FHIR specification.")

public interface TestScriptSetup extends GenericEntity, fhir.BackboneElement {

	EntityType<TestScriptSetup> T = EntityTypes.T(TestScriptSetup.class);

	/* Constants for each property name. */
	java.lang.String action = "action";

	@Description("Action would contain either an operation or an assertion.")
	
	java.util.List<fhir.TestScriptAction> getAction();
	void setAction(java.util.List<fhir.TestScriptAction> action);

}
