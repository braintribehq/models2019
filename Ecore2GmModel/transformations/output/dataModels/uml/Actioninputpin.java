/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Actioninputpin of the Data Model uml.
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
{@link fromAction}, 

* It provides of then following operations (getters and setters)
{@link getFromAction},
{@link setFromAction},
 */

@Description("An ActionInputPin is a kind of InputPin that executes an Action to determine the values to input to another Action.<p>From package UML::Actions.</p>")

public interface Actioninputpin extends GenericEntity, uml.Inputpin {

	EntityType<Actioninputpin> T = EntityTypes.T(Actioninputpin.class);

	/* Constants for each property name. */
	java.lang.String fromAction = "fromAction";

	@Description("The Action used to provide the values of the ActionInputPin.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Action getFromAction();
	void setFromAction(uml.Action fromAction);
}
