/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type TestReportTeardown of the Data Model fhir.
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

@Description("A summary of information based on the results of executing a TestScript.")

public interface TestReportTeardown extends GenericEntity, fhir.BackboneElement {

	EntityType<TestReportTeardown> T = EntityTypes.T(TestReportTeardown.class);

	/* Constants for each property name. */
	java.lang.String action = "action";

	@Description("The teardown action will only contain an operation.")
	
	java.util.List<fhir.TestReportAction2> getAction();
	void setAction(java.util.List<fhir.TestReportAction2> action);

}
