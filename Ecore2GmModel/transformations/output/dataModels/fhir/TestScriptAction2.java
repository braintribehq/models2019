/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type TestScriptAction2 of the Data Model fhir.
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
{@link operation}, 

* It provides of then following operations (getters and setters)
{@link getOperation},
{@link setOperation},
 */

@Description("A structured set of tests against a FHIR server or client implementation to determine compliance against the FHIR specification.")

public interface TestScriptAction2 extends GenericEntity, fhir.BackboneElement {

	EntityType<TestScriptAction2> T = EntityTypes.T(TestScriptAction2.class);

	/* Constants for each property name. */
	java.lang.String operation = "operation";

	@Description("An operation would involve a REST request to a server.")
	@Mandatory
	fhir.TestScriptOperation getOperation();
	void setOperation(fhir.TestScriptOperation operation);
}
