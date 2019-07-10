/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Startclassifierbehavioraction of the Data Model uml.
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
{@link object}, 

* It provides of then following operations (getters and setters)
{@link getObject},
{@link setObject},
 */

@Description("A StartClassifierBehaviorAction is an Action that starts the classifierBehavior of the input object.<p>From package UML::Actions.</p>")

public interface Startclassifierbehavioraction extends GenericEntity, uml.Action {

	EntityType<Startclassifierbehavioraction> T = EntityTypes.T(Startclassifierbehavioraction.class);

	/* Constants for each property name. */
	java.lang.String object = "object";

	@Description("The InputPin that holds the object whose classifierBehavior is to be started.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Inputpin getObject();
	void setObject(uml.Inputpin object);
}
