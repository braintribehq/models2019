/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Testidentityaction of the Data Model uml.
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
{@link first}, 
{@link result}, 
{@link second}, 

* It provides of then following operations (getters and setters)
{@link getFirst},
{@link getResult},
{@link getSecond},
{@link setFirst},
{@link setResult},
{@link setSecond},
 */

@Description("A TestIdentityAction is an Action that tests if two values are identical objects.<p>From package UML::Actions.</p>")

public interface Testidentityaction extends GenericEntity, uml.Action {

	EntityType<Testidentityaction> T = EntityTypes.T(Testidentityaction.class);

	/* Constants for each property name. */
	java.lang.String first = "first";
	java.lang.String result = "result";
	java.lang.String second = "second";

	@Description("The InputPin on which the first input object is placed.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Inputpin getFirst();
	void setFirst(uml.Inputpin first);
	@Description("The OutputPin whose Boolean value indicates whether the two input objects are identical.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Outputpin getResult();
	void setResult(uml.Outputpin result);
	@Description("The OutputPin on which the second input object is placed.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Inputpin getSecond();
	void setSecond(uml.Inputpin second);
}
