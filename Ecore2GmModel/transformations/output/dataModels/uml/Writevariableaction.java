/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Writevariableaction of the Data Model uml.
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
{@link value}, 

* It provides of then following operations (getters and setters)
{@link getValue},
{@link setValue},
 */

@Description("WriteVariableAction is an abstract class for VariableActions that change Variable values.<p>From package UML::Actions.</p>")
 
@Abstract 

public interface Writevariableaction extends GenericEntity, uml.Variableaction {

	EntityType<Writevariableaction> T = EntityTypes.T(Writevariableaction.class);

	/* Constants for each property name. */
	java.lang.String value = "value";

	@Description("The InputPin that gives the value to be added or removed from the Variable.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Inputpin getValue();
	void setValue(uml.Inputpin value);
}
