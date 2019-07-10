/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Pin of the Data Model uml.
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
{@link isControl}, 

* It provides of then following operations (getters and setters)
{@link getIsControl},
{@link setIsControl},
 */

@Description("A Pin is an ObjectNode and MultiplicityElement that provides input values to an Action or accepts output values from an Action.<p>From package UML::Actions.</p>")
 
@Abstract 

public interface Pin extends GenericEntity, uml.Objectnode, uml.Multiplicityelement {

	EntityType<Pin> T = EntityTypes.T(Pin.class);

	/* Constants for each property name. */
	java.lang.String isControl = "isControl";

	@Description("Indicates whether the Pin provides data to the Action or just controls how the Action executes.<p>From package UML::Actions.</p>")
	@Mandatory
	types.Boolean getIsControl();
	void setIsControl(types.Boolean isControl);
}
