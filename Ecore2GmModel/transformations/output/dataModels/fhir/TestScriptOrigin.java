/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type TestScriptOrigin of the Data Model fhir.
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
{@link profile}, 

* It provides of then following operations (getters and setters)
{@link getProfile},
{@link setProfile},
 */

@Description("A structured set of tests against a FHIR server or client implementation to determine compliance against the FHIR specification.")

public interface TestScriptOrigin extends GenericEntity, fhir.BackboneElement {

	EntityType<TestScriptOrigin> T = EntityTypes.T(TestScriptOrigin.class);

	/* Constants for each property name. */
	java.lang.String profile = "profile";

	@Description("The type of origin profile the test system supports.")
	@Mandatory
	fhir.Coding getProfile();
	void setProfile(fhir.Coding profile);
}
