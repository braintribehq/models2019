/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Variableaction of the Data Model uml.
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
{@link variable}, 

* It provides of then following operations (getters and setters)
{@link getVariable},
{@link setVariable},
 */

@Description("VariableAction is an abstract class for Actions that operate on a specified Variable.<p>From package UML::Actions.</p>")
 
@Abstract 

public interface Variableaction extends GenericEntity, uml.Action {

	EntityType<Variableaction> T = EntityTypes.T(Variableaction.class);

	/* Constants for each property name. */
	java.lang.String variable = "variable";

	@Description("The Variable to be read or written.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Variable getVariable();
	void setVariable(uml.Variable variable);
}
