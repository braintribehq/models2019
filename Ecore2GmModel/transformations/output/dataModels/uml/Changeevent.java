/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Changeevent of the Data Model uml.
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
{@link changeExpression}, 

* It provides of then following operations (getters and setters)
{@link getChangeExpression},
{@link setChangeExpression},
 */

@Description("A ChangeEvent models a change in the system configuration that makes a condition true.<p>From package UML::CommonBehavior.</p>")

public interface Changeevent extends GenericEntity, uml.Event {

	EntityType<Changeevent> T = EntityTypes.T(Changeevent.class);

	/* Constants for each property name. */
	java.lang.String changeExpression = "changeExpression";

	@Description("A Boolean-valued ValueSpecification that will result in a ChangeEvent whenever its value changes from false to true.<p>From package UML::CommonBehavior.</p>")
	@Mandatory
	uml.Valuespecification getChangeExpression();
	void setChangeExpression(uml.Valuespecification changeExpression);
}
