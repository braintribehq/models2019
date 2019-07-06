/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type TestScriptOperation of the Data Model fhir.
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
{@link type}, 
{@link requestHeader}, 

* It provides of then following operations (getters and setters)
{@link getType},
{@link getRequestHeader},
{@link setType},
{@link setRequestHeader},
 */

@Description("A structured set of tests against a FHIR server or client implementation to determine compliance against the FHIR specification.")

public interface TestScriptOperation extends GenericEntity, fhir.BackboneElement {

	EntityType<TestScriptOperation> T = EntityTypes.T(TestScriptOperation.class);

	/* Constants for each property name. */
	java.lang.String type = "type";
	java.lang.String requestHeader = "requestHeader";

	@Description("Server interaction or operation type.")
	@Mandatory
	fhir.Coding getType();
	void setType(fhir.Coding type);
	@Description("Header elements would be used to set HTTP headers.")
	
	java.util.List<fhir.TestScriptRequestHeader> getRequestHeader();
	void setRequestHeader(java.util.List<fhir.TestScriptRequestHeader> requestHeader);

}
