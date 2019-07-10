/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Continuation of the Data Model uml.
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
{@link setting}, 

* It provides of then following operations (getters and setters)
{@link getSetting},
{@link setSetting},
 */

@Description("A Continuation is a syntactic way to define continuations of different branches of an alternative CombinedFragment. Continuations are intuitively similar to labels representing intermediate points in a flow of control.<p>From package UML::Interactions.</p>")

public interface Continuation extends GenericEntity, uml.Interactionfragment {

	EntityType<Continuation> T = EntityTypes.T(Continuation.class);

	/* Constants for each property name. */
	java.lang.String setting = "setting";

	@Description("True: when the Continuation is at the end of the enclosing InteractionFragment and False when it is in the beginning.<p>From package UML::Interactions.</p>")
	@Mandatory
	types.Boolean getSetting();
	void setSetting(types.Boolean setting);
}
