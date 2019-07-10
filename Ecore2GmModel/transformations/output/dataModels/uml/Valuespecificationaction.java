/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Valuespecificationaction of the Data Model uml.
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
{@link result}, 
{@link value}, 

* It provides of then following operations (getters and setters)
{@link getResult},
{@link getValue},
{@link setResult},
{@link setValue},
 */

@Description("A ValueSpecificationAction is an Action that evaluates a ValueSpecification and provides a result.<p>From package UML::Actions.</p>")

public interface Valuespecificationaction extends GenericEntity, uml.Action {

	EntityType<Valuespecificationaction> T = EntityTypes.T(Valuespecificationaction.class);

	/* Constants for each property name. */
	java.lang.String result = "result";
	java.lang.String value = "value";

	@Description("The OutputPin on which the result value is placed.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Outputpin getResult();
	void setResult(uml.Outputpin result);
	@Description("The ValueSpecification to be evaluated.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Valuespecification getValue();
	void setValue(uml.Valuespecification value);
}
