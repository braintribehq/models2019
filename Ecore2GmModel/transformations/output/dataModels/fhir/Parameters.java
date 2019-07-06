/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Parameters of the Data Model fhir.
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
{@link parameter}, 

* It provides of then following operations (getters and setters)
{@link getParameter},
{@link setParameter},
 */

@Description("This resource is a non-persisted resource used to pass information into and back from an [operation](operations.html). It has no other use, and there is no RESTful endpoint associated with it.If the element is present, it must have either a @value, an @id, or extensions")

public interface Parameters extends GenericEntity, fhir.FhirResource {

	EntityType<Parameters> T = EntityTypes.T(Parameters.class);

	/* Constants for each property name. */
	java.lang.String parameter = "parameter";

	@Description("A parameter passed to or received from the operation.")
	
	java.util.List<fhir.ParametersParameter> getParameter();
	void setParameter(java.util.List<fhir.ParametersParameter> parameter);

}
