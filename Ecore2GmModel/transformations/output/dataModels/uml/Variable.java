/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Variable of the Data Model uml.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package uml;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link activityScope}, 
{@link scope}, 

* It provides of then following operations (getters and setters)
{@link getActivityScope},
{@link getScope},
{@link setActivityScope},
{@link setScope},
 */

@Description("A Variable is a ConnectableElement that may store values during the execution of an Activity. Reading and writing the values of a Variable provides an alternative means for passing data than the use of ObjectFlows. A Variable may be owned directly by an Activity, in which case it is accessible from anywhere within that activity, or it may be owned by a StructuredActivityNode, in which case it is only accessible within that node.<p>From package UML::Activities.</p>")

public interface Variable extends GenericEntity, uml.Connectableelement, uml.Multiplicityelement {

	EntityType<Variable> T = EntityTypes.T(Variable.class);

	/* Constants for each property name. */
	java.lang.String activityScope = "activityScope";
	java.lang.String scope = "scope";

	@Description("An Activity that owns the Variable.<p>From package UML::Activities.</p>")
	@Mandatory
	uml.Activity getActivityScope();
	void setActivityScope(uml.Activity activityScope);
	@Description("A StructuredActivityNode that owns the Variable.<p>From package UML::Activities.</p>")
	@Mandatory
	uml.Structuredactivitynode getScope();
	void setScope(uml.Structuredactivitynode scope);
}
