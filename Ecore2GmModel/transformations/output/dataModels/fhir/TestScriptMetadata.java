/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type TestScriptMetadata of the Data Model fhir.
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
{@link link}, 
{@link capability}, 

* It provides of then following operations (getters and setters)
{@link getLink},
{@link getCapability},
{@link setLink},
{@link setCapability},
 */

@Description("A structured set of tests against a FHIR server or client implementation to determine compliance against the FHIR specification.")

public interface TestScriptMetadata extends GenericEntity, fhir.BackboneElement {

	EntityType<TestScriptMetadata> T = EntityTypes.T(TestScriptMetadata.class);

	/* Constants for each property name. */
	java.lang.String link = "link";
	java.lang.String capability = "capability";

	@Description("A link to the FHIR specification that this test is covering.")
	
	java.util.List<fhir.TestScriptLink> getLink();
	void setLink(java.util.List<fhir.TestScriptLink> link);

	@Description("Capabilities that must exist and are assumed to function correctly on the FHIR server being tested.")
	
	java.util.List<fhir.TestScriptCapability> getCapability();
	void setCapability(java.util.List<fhir.TestScriptCapability> capability);

}
