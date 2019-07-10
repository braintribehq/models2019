/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Linkaction of the Data Model uml.
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
{@link endData}, 
{@link inputValue}, 

* It provides of then following operations (getters and setters)
{@link getEndData},
{@link getInputValue},
{@link setEndData},
{@link setInputValue},
 */

@Description("LinkAction is an abstract class for all Actions that identify the links to be acted on using LinkEndData.<p>From package UML::Actions.</p>")
 
@Abstract 

public interface Linkaction extends GenericEntity, uml.Action {

	EntityType<Linkaction> T = EntityTypes.T(Linkaction.class);

	/* Constants for each property name. */
	java.lang.String endData = "endData";
	java.lang.String inputValue = "inputValue";

	@Description("The LinkEndData identifying the values on the ends of the links acting on by this LinkAction.<p>From package UML::Actions.</p>")
	
	java.util.List<uml.Linkenddata> getEndData();
	void setEndData(java.util.List<uml.Linkenddata> endData);

	@Description("InputPins used by the LinkEndData of the LinkAction.<p>From package UML::Actions.</p>")
	
	java.util.List<uml.Inputpin> getInputValue();
	void setInputValue(java.util.List<uml.Inputpin> inputValue);

}
