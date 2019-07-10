/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Reception of the Data Model uml.
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
{@link signal}, 

* It provides of then following operations (getters and setters)
{@link getSignal},
{@link setSignal},
 */

@Description("A Reception is a declaration stating that a Classifier is prepared to react to the receipt of a Signal.<p>From package UML::SimpleClassifiers.</p>")

public interface Reception extends GenericEntity, uml.Behavioralfeature {

	EntityType<Reception> T = EntityTypes.T(Reception.class);

	/* Constants for each property name. */
	java.lang.String signal = "signal";

	@Description("The Signal that this Reception handles.<p>From package UML::SimpleClassifiers.</p>")
	@Mandatory
	uml.Signal getSignal();
	void setSignal(uml.Signal signal);
}
