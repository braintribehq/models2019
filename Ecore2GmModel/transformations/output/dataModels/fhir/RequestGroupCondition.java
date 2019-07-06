/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type RequestGroupCondition of the Data Model fhir.
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
{@link expression}, 

* It provides of then following operations (getters and setters)
{@link getExpression},
{@link setExpression},
 */

@Description("A group of related requests that can be used to capture intended activities that have inter-dependencies such as 'give this medication after that one'.")

public interface RequestGroupCondition extends GenericEntity, fhir.BackboneElement {

	EntityType<RequestGroupCondition> T = EntityTypes.T(RequestGroupCondition.class);

	/* Constants for each property name. */
	java.lang.String expression = "expression";

	@Description("An expression that returns true or false, indicating whether or not the condition is satisfied.")
	@Mandatory
	fhir.Expression getExpression();
	void setExpression(fhir.Expression expression);
}
